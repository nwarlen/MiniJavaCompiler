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
        this.stackHeight-=8;
        
        this.code.emit(integerLiteral, "sw $s5, 4($sp)");
        this.code.emit(integerLiteral, "li $t0, " + integerLiteral.val);
        this.code.emit(integerLiteral, "sw $t0, ($sp)");
        
        return null;
    }
	
    public Object visitNull(Null n) {
        this.code.emit(n, "subu $sp, $sp, 4");
        this.stackHeight-=4;
        
        this.code.emit(n, "sw $zero, ($sp)");
        
        return null;
    }
    
    public Object visitTrue(True t) {
        this.code.emit(t, "subu $sp, $sp, 4");
        this.stackHeight-=4;
        
        this.code.emit(t, "li $t0, 1");
        this.code.emit(t, "sw $t0, ($sp)");
        
        return null;
    }
    
    public Object visitFalse(False f) {
        this.code.emit(f, "subu $sp, $sp, 4");
        this.stackHeight-=4;
        
        this.code.emit(f, "sw $zero, ($sp)");
        
        return null;
    }
    
    public Object visitStringLiteral(StringLiteral stringLiteral) {
        this.code.emit(stringLiteral, "subu $sp, $sp, 4");
        this.stackHeight-=4;
        
        this.code.emit(stringLiteral, "la $t0, strLit_" + stringLiteral.uniqueCgRep.uniqueId);
        this.code.emit(stringLiteral, "sw $t0, ($sp)");
        
        return null;
    }
    
    public Object visitThis(This t) {
        this.code.emit(t, "subu $sp, $sp, 4");
        this.stackHeight-=4;
        
        this.code.emit(t, "sw $s2, ($sp)");
        
        return null;
    }

    public Object visitSuper(Super s) {
        this.code.emit(s, "subu $sp, $sp, 4");
        this.stackHeight-=4;

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
        this.stackHeight+=8;
        
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
        this.stackHeight+=8;

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
        this.stackHeight-=4;
        
        this.code.emit(newObject, "sw $zero, $sp");
        
        return null;
    }
    
    public Object visitCall(Call call) {
        int currentStackHeight = this.stackHeight;
        
        call.obj.accept(this);
        
        for(Exp exp : call.parms) {
            exp.accept(this);
        }
        
        if (call.pos < 0) {
            this.code.emit(call, "jal " + call.methName);
        }
        else {
            this.code.emit(call, "jal fcn_" + call.uniqueId + "_" + call.methName);
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
        //TODO: Implement
        return null;
    }
    
    
}


	
