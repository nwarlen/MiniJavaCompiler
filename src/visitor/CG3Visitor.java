package visitor;

import syntaxtree.*;

import errorMsg.*;
import java.io.*;

public class CG3Visitor extends ASTvisitor {


	// the purpose here is to annotate things with their offsets:
	// - formal parameters, with respect to the (callee) frame
	// - local variables, with respect to the frame
	// - instance variables, with respect to their slot in the object
	// - methods, with respect to their slot in the v-table
	// - while statements, with respect to the stack-size at the time
	//   of loop-exit
	
	// IO stream to which we will emit code
	CodeStream code;

	// current stack height
	int stackHeight;
	
	// error-message object
	ErrorMsg errorMsg;
	
	public CG3Visitor(ErrorMsg e, PrintStream out) {
		initInstanceVars(e, out);
	}
	
	private void initInstanceVars(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		code = new CodeStream(out, errorMsg);
		stackHeight = 0;
	}
    
    public Object visitIntegerLiteral(IntegerLiteral integerLiteral) {
        this.code.emit(integerLiteral, "subu $sp, $sp, 8");
        this.stackHeight+=8;
        
        this.code.emit(integerLiteral, "sw $s5, 4($sp)");
        this.code.emit(integerLiteral, "li $t0, " + integerLiteral.val);
        this.code.emit(integerLiteral, "sw $t0, ($sp)");
        
        return null;
    }
	
    public Object visitNull(Null n) {
        this.code.emit(n, "subu $sp, $sp, 4");
        this.stackHeight +=4;
        
        this.code.emit(n, "sw $zero, ($sp)");
        
        return null;
    }
    
    public Object visitTrue(True t) {
        this.code.emit(t, "subu $sp, $sp, 4");
        this.stackHeight+=4;
        
        this.code.emit(t, "li $t0, 1");
        this.code.emit(t, "sw $t0, ($sp)");
        
        return null;
    }
    
    public Object visitFalse(False f) {
        this.code.emit(f, "subu $sp, $sp, 4");
        this.stackHeight+=4;
        
        this.code.emit(f, "sw $zero, ($sp)");
        
        return null;
    }
    
    public Object visitStringLiteral(StringLiteral stringLiteral) {
        this.code.emit(stringLiteral, "subu $sp, $sp, 4");
        this.stackHeight+=4;
        
        this.code.emit(stringLiteral, "la $t0, strLit_" + stringLiteral.uniqueCgRep.uniqueId);
        this.code.emit(stringLiteral, "sw $t0, ($sp)");
        
        return null;
    }
    
    public Object visitThis(This t) {
        this.code.emit(t, "subu $sp, $sp, 4");
        this.stackHeight+=4;
        
        this.code.emit(t, "sw $s2, ($sp)");
        
        return null;
    }

    public Object visitSuper(Super s) {
        this.code.emit(s, "subu $sp, $sp, 4");
        this.stackHeight+=4;

        this.code.emit(s, "sw $s2, ($sp)");

        return null;
    }
    
    public Object visitPlus(Plus plus) {
        //gen code for left and right sub exps
        plus.left.accept(this);
        plus.right.accept(this);
        
        this.code.emit(plus, "lw $t0, ($sp)");
        this.code.emit(plus, "lw $t1, 8($sp)");
        this.code.emit(plus, "addu $t0, $t0, $t1");
        
        this.code.emit(plus, "addu $sp, $sp, 8");
        this.stackHeight-=8;
        
        this.code.emit(plus, "sw $t0, ($sp)");

        return null;
    }
    
    public Object visitMinus(Minus minus) {
        //gen code for left and right sub exps
        minus.left.accept(this);
        minus.right.accept(this);

        this.code.emit(minus, "lw $t0, ($sp)");
        this.code.emit(minus, "lw $t1, 8($sp)");
        
        //TODO: Check this!
        this.code.emit(minus, "subu $t0, $t1, $t0");

        this.code.emit(minus, "addu $sp, $sp, 8");
        this.stackHeight-=8;

        this.code.emit(minus, "sw $t0, ($sp)");

        return null;
    }
    
    public Object visitLocalVarDecl(LocalVarDecl localVarDecl) {
        localVarDecl.initExp.accept(this);
        localVarDecl.offset = -this.stackHeight;
        return null;
    }
    
    //PARTIALLY IMPLEMENT THE FOLLOWING
    
    public Object visitNewObject(NewObject newObject) {
        //You can just push a null pointer(0) onto the stack, as the object is never accessed.
        
        //TODO: Check this
        this.code.emit(newObject, "subu $sp, $sp, 4");
        this.stackHeight+=4;
        
        this.code.emit(newObject, "sw $zero, ($sp)");
        
        return null;
    }
    
    @SuppressWarnings("StatementWithEmptyBody")
    public Object visitCall(Call call) {
        int currentStackHeight = this.stackHeight;
        
        call.obj.accept(this);
        
        call.parms.accept(this);
        
        if (call.methodLink.pos < 0) {
            this.code.emit(call, "jal " + call.methName);
        }
        else {
            this.code.emit(call, "jal fcn_" + call.methodLink.uniqueId + "_" + call.methName);
        }
        
        //if void type -> 0
        //if bool/obj  -> 4
        //if int type  -> 8

        if (call.type instanceof IntegerType) {
            currentStackHeight+=8;
        }
        else if (call.type instanceof VoidType) {
            //add 0 to current stack height
        }
        else {
            currentStackHeight+=4;
        }
        
        this.stackHeight = currentStackHeight;
        return null;
    }
    
    public Object visitIdentifierExp(IdentifierExp identifierExp) {
        if (identifierExp.link instanceof LocalVarDecl) {
            int stackDepth = this.stackHeight + identifierExp.link.offset;
            this.code.emit(identifierExp, "lw $t0, " + stackDepth + "($sp)");
            
            if (identifierExp.type instanceof IntegerType) {
                this.code.emit(identifierExp, "subu $sp, $sp, 8");
                this.stackHeight+=8;
                this.code.emit(identifierExp, "sw $s5, 4($sp)");
                this.code.emit(identifierExp, "sw $t0, ($sp)");
            }
            else {
                this.code.emit(identifierExp, "subu $sp, $sp, 4");
                this.stackHeight+=4;
                this.code.emit(identifierExp, "sw $t0, ($sp)");
            }
        }
        return null;
    }
    
    public Object visitProgram(Program program) {
        this.code.emit(program, ".text");
        this.code.emit(program, ".globl main");
        this.code.emit(program, "main:");
        this.code.emit(program, "jal vm_init");
        this.stackHeight = 0;
        program.mainStatement.accept(this);        
        this.code.emit(program, "li $v0, 10");
        this.code.emit(program, "syscall");
        
        this.code.emit(program, "CLASS_String:");
        this.code.emit(program, "CLASS_Object:");
        
        program.classDecls.accept(this);
        
        //flush code stream
        this.code.flush();
        
        return null;
    }
    
    public Object visitMethodDeclVoid(MethodDeclVoid methodDeclVoid) {
        this.code.emit(methodDeclVoid, ".globl fcn_" + methodDeclVoid.uniqueId + "_" + methodDeclVoid.name);
        this.code.emit(methodDeclVoid, "fcn_" + methodDeclVoid.uniqueId + "_" + methodDeclVoid.name + ":");
        this.code.emit(methodDeclVoid, "subu $sp, $sp, 8");
        this.code.emit(methodDeclVoid, "sw $ra, 4($sp)");
        this.code.emit(methodDeclVoid, "sw $s2, ($sp)");
        
        this.stackHeight = 4;
        int stackTopRelative = 4 + methodDeclVoid.thisPtrOffset;
        this.code.emit(methodDeclVoid, "lw $s2, " + stackTopRelative + "($sp)");
        
        methodDeclVoid.stmts.accept(this);

        int offsetSavedReturn = this.stackHeight;
        int offsetSavedThis = stackHeight - 4;
        
        this.code.emit(methodDeclVoid, "lw $ra, " + offsetSavedReturn + "($sp)");
        this.code.emit(methodDeclVoid, "lw $s2, " + offsetSavedThis + "($sp)");
        
        
        //compute amount to pop stack
//        three words (this>pointer, return address, old this pointer), plus
//        space for any local variables that were created.
        int amountToPop = 12;
        for (VarDecl vd : methodDeclVoid.formals) {
            if (vd.type instanceof IntegerType) {
                amountToPop+=8;
            }
            else{
                amountToPop+=4;
            }
        }
        
        this.code.emit(methodDeclVoid, "addu $sp, $sp, " + amountToPop);
        this.code.emit(methodDeclVoid, "jr $ra");
        
        
        return null;
    }
    
    
}


	
