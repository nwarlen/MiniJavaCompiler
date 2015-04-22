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
        this.stackHeight += 4;

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
        this.stackHeight -= 8;
        
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
    
    public Object visitTimes(Times times) {
        times.left.accept(this);
        times.right.accept(this);
        
        this.code.emit(times, "lw $t0, ($sp)");
        this.code.emit(times, "lw $t1, 8($sp)");
        this.code.emit(times, "mult $t0, $t1");
        this.code.emit(times, "mflo $t0");
        this.code.emit(times, "addu $sp, $sp, 8");
        this.stackHeight -= 8;
        this.code.emit(times, "sw $t0, ($sp)");
        
        return null;
    }
    
    public Object visitDivide(Divide divide) {
        divide.left.accept(this);
        divide.right.accept(this);
        
        this.code.emit(divide, "jal divide");
        this.stackHeight += 8;
        
        return null;
    }
    
    public Object visitRemainder(Remainder remainder) {
        remainder.left.accept(this);
        remainder.right.accept(this);
        
        this.code.emit(remainder, "jal remainder");
        this.stackHeight += 8;
        
        return null;
    }
    
    public Object visitEquals(Equals equals) {
        equals.left.accept(this);
        equals.right.accept(this);
        
        if (equals.left.type instanceof IntegerType) {
            this.code.emit(equals, "lw $t0, ($sp)");
            this.code.emit(equals, "lw $t1, 8($sp)");
            
            this.code.emit(equals, "seq $t0, $t0, $t1");
            this.code.emit(equals, "addu $sp, $sp, 12");
            this.stackHeight -= 12;
            
            this.code.emit(equals, "sw $t0, ($sp)");
        }
        else {
            this.code.emit(equals, "lw $t0, ($sp)");
            this.code.emit(equals, "lw $t1, 4($sp)");
            this.code.emit(equals, "seq $t0, $t0, $t1");
            this.code.emit(equals, "addu $sp, $sp, 4");
            this.stackHeight -= 4;
            
            this.code.emit(equals, "sw $t0, ($sp)");
        }
        
        return null;
    }
    
    public Object visitGreaterThan(GreaterThan greaterThan) {
        greaterThan.left.accept(this);
        greaterThan.right.accept(this);

        this.code.emit(greaterThan, "lw $t0, ($sp)");
        this.code.emit(greaterThan, "lw $t1, 8($sp)");
        this.code.emit(greaterThan, "sgt $t0, $t1, $t0");
        this.code.emit(greaterThan, "addu $sp, $sp, 12");
        this.stackHeight -= 12;
        this.code.emit(greaterThan, "sw $t0, ($sp)");
        
        return null;
    }

    public Object visitLessThan(LessThan lessThan) {
        lessThan.left.accept(this);
        lessThan.right.accept(this);

        this.code.emit(lessThan, "lw $t0, ($sp)");
        this.code.emit(lessThan, "lw $t1, 8($sp)");
        this.code.emit(lessThan, "slt $t0, $t1, $t0");
        this.code.emit(lessThan, "addu $sp, $sp, 12");
        this.stackHeight -= 12;
        this.code.emit(lessThan, "sw $t0, ($sp)");

        return null;
    }
    
    public Object visitLocalVarDecl(LocalVarDecl localVarDecl) {
        localVarDecl.initExp.accept(this);
        localVarDecl.offset = -this.stackHeight;
        return null;
    }

    public Object visitNot(Not not) {
        not.exp.accept(this);
        
        this.code.emit(not, "lw $t0, ($sp)");
        this.code.emit(not, "xor $t0, $t0, 1");
        this.code.emit(not, "sw $t0, ($sp)");
        
        return null;
    }
    
    public Object visitAnd(And and) {
        and.left.accept(this);
        this.code.emit(and, "lw $t0, ($sp)");
        this.code.emit(and, "beq $t0, $zero, skip_" + and.uniqueId);
        this.code.emit(and, "addu $sp, $sp, 4");
        this.stackHeight -= 4;
        and.right.accept(this);
        this.code.emit(and, "skip_" + and.uniqueId + ":");
        return null;
    }
    
    public Object visitOr(Or or) {
        or.left.accept(this);
        this.code.emit(or, "lw $t0, ($sp)");
        //TODO: Check This!!!
        this.code.emit(or, "bne $t0, $zero, skip_" + or.uniqueId);
        this.code.emit(or, "addu $sp, $sp, 4");
        this.stackHeight -= 4;
        or.right.accept(this);
        this.code.emit(or, "skip_" + or.uniqueId + ":");
        return null;
    }
    
    public Object visitArrayLength(ArrayLength arrayLength) {
        arrayLength.exp.accept(this);
        
        this.code.emit(arrayLength, "lw $t0, ($sp)");
        this.code.emit(arrayLength, "beq $t0, $zero, nullPtrException");
        this.code.emit(arrayLength, "lw $t0, -4($t0)");
        this.code.emit(arrayLength, "sw $s5, ($sp)");
        this.code.emit(arrayLength, "subu $sp, $sp, 4");
        this.stackHeight += 4;
        this.code.emit(arrayLength, "sw $t0, ($sp)");
        
        return null;
    }
    
    public Object visitArrayLookup(ArrayLookup arrayLookup) {
        arrayLookup.arrExp.accept(this);
        arrayLookup.idxExp.accept(this);
        
        this.code.emit(arrayLookup, "lw $t0, 8($sp)");
        this.code.emit(arrayLookup, "beq $t0, $zero, nullPtrException");
        this.code.emit(arrayLookup, "lw $t1, -4($t0)");
        this.code.emit(arrayLookup, "lw $t2, ($sp)");
        this.code.emit(arrayLookup, "bgeu $t2, $t1, arrayIndexOutOfBounds");
        this.code.emit(arrayLookup, "sll $t2, $t2, 2");
        this.code.emit(arrayLookup, "addu $t2, $t2, $t0");
        this.code.emit(arrayLookup, "lw $t0, ($t2)");

        //if array contains int
        if (arrayLookup.arrExp.type instanceof IntegerType) {
            this.code.emit(arrayLookup, "sw $t0, 4($sp)");
            this.code.emit(arrayLookup, "sw $s5, 8($sp)");
            this.code.emit(arrayLookup, "addu $sp, $sp, 4");
            this.stackHeight -= 4;
        }
        else {
            this.code.emit(arrayLookup, "sw $t0, 8($sp)");
            this.code.emit(arrayLookup, "addu $sp, $sp, 8");
            this.stackHeight -= 8;
        }
        
        return null;
    }
    
    public Object visitInstVarAccess(InstVarAccess instVarAccess) {
        instVarAccess.exp.accept(this);
        int offset = instVarAccess.varDec.offset;
        
        this.code.emit(instVarAccess, "lw $t0, ($sp)");
        this.code.emit(instVarAccess, "beq $t0, $zero, nullPtrException");
        this.code.emit(instVarAccess, "lw $t0, " + offset + "($t0)");
        
        if (instVarAccess.varDec.type instanceof IntegerType) {
            this.code.emit(instVarAccess, "subu $sp, $sp, 4");
            this.code.emit(instVarAccess, "sw $s5, 4($sp)");
            this.code.emit(instVarAccess, "sw $t0, ($sp)");
            this.stackHeight += 4;
        }
        else {
            this.code.emit(instVarAccess, "sw $t0, ($sp)");
        }

        return null;
    }
    
    public Object visitInstanceOf(InstanceOf instanceOf) {
//        ❏ generate code for the subexpression
//        la $t0,CLASS_Abc
//        la $t1,CLASS_END_Abc
//        jal instanceOf
        return null;
    }
    
    //PARTIALLY IMPLEMENT THE FOLLOWING
    
    //TODO: Fully implement
    public Object visitNewObject(NewObject newObject) {
        //You can just push a null pointer(0) onto the stack, as the object is never accessed.
        
        //TODO: Check this
        this.code.emit(newObject, "subu $sp, $sp, 4");
        this.stackHeight+=4;
        
        this.code.emit(newObject, "sw $zero, ($sp)");
        
        return null;
    }
    
    @SuppressWarnings("StatementWithEmptyBody")
    //TODO: Fully Implement
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
        
        //if int type  -> 8
        if (call.type instanceof IntegerType) {
            currentStackHeight+=8;
        }
        //if void type -> 0
        else if (call.type instanceof VoidType) {
            //add 0 to current stack height
        }
        //if bool/obj  -> 4
        else {
            currentStackHeight+=4;
        }
        
        this.stackHeight = currentStackHeight;
        return null;
    }

    public Object visitIdentifierExp(IdentifierExp identifierExp) {
        if (identifierExp.link instanceof InstVarDecl) {
            int offset = identifierExp.link.offset;
            this.code.emit(identifierExp, "lw $t0, " + offset + "($s2)");
        }
        else if (identifierExp.link instanceof LocalVarDecl || identifierExp.link instanceof FormalDecl) {
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
    
    //TODO: Fully implement
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
    
    //TODO: Fully implement
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
        //three words (this>pointer, return address, old this pointer), plus
        //space for any local variables that were created.
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
