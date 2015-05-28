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
        this.code.emit(localVarDecl, "lw $zero, ($sp)");
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
        instanceOf.exp.accept(this);
        //TODO: Check this!!!
        this.code.emit(instanceOf, "la $t0, CLASS_" + instanceOf.checkType.toString2());
        this.code.emit(instanceOf, "la $t0, CLASS_END_" + instanceOf.checkType.toString2());
        this.code.emit(instanceOf, "jal instanceOf");
        return null;
    }

    public Object visitCast(Cast cast) {
        cast.exp.accept(this);

        this.code.emit(cast, "la $t0, CLASS_" + cast.castType.toString2());
        this.code.emit(cast, "la $t1, CLASS_END_" + cast.castType.toString2());
        this.code.emit(cast, "jal checkCast");

        return null;
    }
    
    public Object visitNewObject(NewObject newObject) {
        int numObjInstVars = newObject.objType.link.numObjInstVars;
        int numDataInstVars = newObject.objType.link.numDataInstVars + 1;

        this.code.emit(newObject, "li $s6, " + numDataInstVars);
        this.code.emit(newObject, "li $s7, " + numObjInstVars);
        this.code.emit(newObject, "jal newObject");
        this.stackHeight += 4;
        this.code.emit(newObject, "la $t0, CLASS_" + newObject.objType.link.name);
        this.code.emit(newObject, "sw $t0,-12($s7)");

        return null;
    }
    
    public Object visitNewArray(NewArray newArray) {
        newArray.sizeExp.accept(this);

        this.code.emit(newArray, "lw $s7, ($sp)");
        this.code.emit(newArray, "addu $sp, $sp, 8");
        this.stackHeight -= 8;
        
        if (newArray.objType instanceof IntegerType || newArray.objType instanceof BooleanType) {
            this.code.emit(newArray, "li $s6, -1");
        }
        else {
            this.code.emit(newArray, "li $s6, 0");
        }

        this.code.emit(newArray, "jal newObject");
        this.stackHeight += 4;

        return null;
    }
    
    @SuppressWarnings("StatementWithEmptyBody")
    public Object visitCall(Call call) {
        int currentStackHeight = this.stackHeight;
        call.obj.accept(this);
        call.parms.accept(this);
        
        if (call.obj instanceof Super) {
            if (call.methodLink.pos < 0) {
                this.code.emit(call, "jal " + call.methName);
            } else {
                this.code.emit(call, "jal fcn_" + call.methodLink.uniqueId + "_" + call.methName);
            }
        }
        else {
            int mmm = call.methodLink.thisPtrOffset - 4;
            int nnn = call.methodLink.vtableOffset * 4;

            this.code.emit(call, "lw $t0, " + mmm + "($sp)");
            this.code.emit(call, "beq $t0, $zero, nullPtrException");
            this.code.emit(call, "lw $t0, -12($t0)");
            this.code.emit(call, "lw $t0, " + nnn + "($t0)");
            this.code.emit(call, "jalr $t0");
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
    
    @SuppressWarnings("StatementWithEmptyBody")
    public Object visitExpStatement(ExpStatement expStatement) {
        expStatement.exp.accept(this);
        
        if (expStatement.exp.type instanceof IntegerType) {
            this.code.emit(expStatement, "addu $sp, $sp, 8");
            this.stackHeight -= 8;
        }
        else if (expStatement.exp.type instanceof VoidType) {
            //do nothing
        }
        else {
            this.code.emit(expStatement, "addu $sp, $sp, 4");
            this.stackHeight -= 4;
        }
        return null;
    }
    
    public Object visitBlock(Block block) {
        int currStackheight = this.stackHeight;
        
        block.stmts.accept(this);
        
        if (this.stackHeight != currStackheight) {
            int diff = this.stackHeight - currStackheight;
            this.code.emit(block, "addu $sp, $sp, " + diff);
        }

        this.stackHeight = currStackheight;
        return null;
    }
    
    public Object visitIf(If ifStmt) {
        ifStmt.exp.accept(this);
        this.code.emit(ifStmt, "lw $t0, ($sp)");
        this.code.emit(ifStmt, "addu $sp, $sp, 4");
        this.stackHeight -= 4;
        this.code.emit(ifStmt, "beq $t0, $zero, if_else_" + ifStmt.uniqueId);
        ifStmt.trueStmt.accept(this);
        this.code.emit(ifStmt, "j if_done_" + ifStmt.uniqueId);
        this.code.emit(ifStmt, "if_else_" + ifStmt.uniqueId + ":");
        ifStmt.falseStmt.accept(this);
        this.code.emit(ifStmt, "if_done_" + ifStmt.uniqueId + ":");
        
        return null;
    }
    
    public Object visitWhile(While w) {
        w.stackHeight = this.stackHeight;
        this.code.emit(w, "j while_enter_" + w.uniqueId);
        this.code.emit(w, "while_top_" + w.uniqueId + ":");
        w.body.accept(this);
        this.code.emit(w, "while_enter_" + w.uniqueId + ":");
        w.exp.accept(this);
        this.code.emit(w, "lw $t0, ($sp)");
        this.code.emit(w, "addu $sp, $sp, 4");
        this.stackHeight -= 4;
        this.code.emit(w, "bne $t0, $zero, while_top_" + w.uniqueId);
        this.code.emit(w, "while_exit_" + w.uniqueId + ":");

        return null;
    }
    
    public Object visitBreak(Break b) {
        int diff = this.stackHeight - b.breakLink.stackHeight;
        
        if (diff != 0) {
            this.code.emit(b, "addu $sp, $sp, " + diff);
            //TODO: Check This!!!
            this.code.emit(b, "j while_exit_" + b.breakLink.uniqueId);
        }
        
        return null;
    }

    public Object visitAssign(Assign assign) {

        if (assign.lhs instanceof IdentifierExp) {
            this.visitAssignIdentifierExp(assign);
        }
        else if (assign.lhs instanceof InstVarAccess) {
            this.visitAssignInstVarAccess(assign);
        }
        else if (assign.lhs instanceof ArrayLookup) {
            this.visitAssignArrayLookup(assign);
        }
        return null;
    }

    public void visitAssignIdentifierExp(Assign assign) {
        assign.rhs.accept(this);
        this.code.emit(assign, "lw $t0, ($sp)");
        if (((IdentifierExp)assign.lhs).link instanceof InstVarDecl) {
            int offset = ((IdentifierExp)assign.lhs).link.offset;
            this.code.emit(assign, "sw $t0, " + offset + "($s2)");
        }
        else {
            int offset = ((IdentifierExp) assign.lhs).link.offset + this.stackHeight;
            this.code.emit(assign, "sw $t0, " + offset + "($sp)");
        }

        if (((IdentifierExp) assign.lhs).type instanceof IntegerType) {
            this.code.emit(assign, "addu $sp, $sp, 8");
            this.stackHeight -= 8;
        }
        else {
            this.code.emit(assign, "addu $sp, $sp, 4");
            this.stackHeight -= 4;
        }
    }

    public void visitAssignInstVarAccess(Assign assign) {
        ((InstVarAccess)assign.lhs).exp.accept(this);
        assign.rhs.accept(this);

        this.code.emit(assign, "lw $t0, ($sp)");

        int sss = 4;
        if (assign.lhs.type instanceof IntegerType) {
            sss = 8;
        }

        this.code.emit(assign, "lw $t1, " + sss + "($sp)");

        this.code.emit(assign, "beq $t1, $zero, nullPtrException");

        int offset = ((InstVarAccess) assign.lhs).varDec.offset;

        this.code.emit(assign, "sw $t0, " + offset + "($t1)");

        if (((InstVarAccess) assign.lhs).exp.type instanceof IntegerType) {
            this.code.emit(assign, "addu $sp, $sp, 12");
            this.stackHeight -= 12;
        }
        else {
            this.code.emit(assign, "addu $sp, $sp, 8");
            this.stackHeight -= 8;
        }
    }

    public void visitAssignArrayLookup(Assign assign) {
        ArrayLookup arrayLookup = ((ArrayLookup)assign.lhs);

        arrayLookup.arrExp.accept(this);
        arrayLookup.idxExp.accept(this);
        assign.rhs.accept(this);

        this.code.emit(assign, "lw $t0, ($sp)");
        int amountToAdd = 0;
        if (assign.rhs.type instanceof IntegerType) {
            amountToAdd = 4;
        }
        int num = 12 + amountToAdd;
        this.code.emit(assign, "lw $t1, " + num + "($sp)");
        this.code.emit(assign, "beq $t1, $zero, nullPtrException");
        num = 4 + amountToAdd;
        this.code.emit(assign, "lw $t2, " + num + "($sp)");
        this.code.emit(assign, "lw $t3, -4($t1)");
        this.code.emit(assign, "bgeu $t2, $t3, arrayIndexOutOfBounds");
        this.code.emit(assign, "sll $t2, $t2, 2");
        this.code.emit(assign, "addu $t2, $t2, $t1");
        this.code.emit(assign, "sw $t0, ($t2)");
        num = 16 + amountToAdd;
        this.code.emit(assign, "addu $sp, $sp, " + num);
        this.stackHeight -= num;
    }
    
    
    
    public Object visitIdentifierExp(IdentifierExp identifierExp) {
        if (identifierExp.link instanceof InstVarDecl) {
            int offset = identifierExp.link.offset;
            this.code.emit(identifierExp, "lw $t0, " + offset + "($s2)");
        }
        else {
            int stackDepth = this.stackHeight + identifierExp.link.offset;
            this.code.emit(identifierExp, "lw $t0, " + stackDepth + "($sp)");
        }

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
        //TODO: CHECK THIS!!!
        int amountToPop = this.stackHeight + 4 + 4;
        
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
    
    public Object visitMethodDeclNonVoid(MethodDeclNonVoid methodDeclNonVoid) {
        this.code.emit(methodDeclNonVoid, ".globl fcn_" + methodDeclNonVoid.uniqueId + "_" + methodDeclNonVoid.name);
        this.code.emit(methodDeclNonVoid, "fcn_" + methodDeclNonVoid.uniqueId + "_" + methodDeclNonVoid.name + ":");
        this.code.emit(methodDeclNonVoid, "subu $sp, $sp, 8");
        this.code.emit(methodDeclNonVoid, "sw $ra, 4($sp)");
        this.code.emit(methodDeclNonVoid, "sw $s2, ($sp)");
        this.stackHeight = 4;
        
        int stackTopRelative = 4 + methodDeclNonVoid.thisPtrOffset;
        this.code.emit(methodDeclNonVoid, "lw $s2, " + stackTopRelative + "($sp)");
        
        methodDeclNonVoid.stmts.accept(this);
        methodDeclNonVoid.rtnExp.accept(this);
        
        int savedReturnAddress = this.stackHeight;
        int savedThisPtr = this.stackHeight - 4;

        this.code.emit(methodDeclNonVoid, "lw $ra, " + savedReturnAddress + "($sp)");
        this.code.emit(methodDeclNonVoid, "lw $s2, " + savedThisPtr + "($sp)");
        
        int formalsSpace =0;
        for (VarDecl vd : methodDeclNonVoid.formals) {
            if (vd.type instanceof IntegerType) {
                formalsSpace+=8;
            }
            else{
                formalsSpace+=4;
            }
        }
        
        this.code.emit(methodDeclNonVoid, "lw $t0, ($sp)");
        this.code.emit(methodDeclNonVoid, "sw $t0, " + (stackHeight+formalsSpace) + "($sp)");
        int rtnValSpace = 4;
        if (methodDeclNonVoid.rtnType instanceof IntegerType) {
            this.code.emit(methodDeclNonVoid, "sw $s5, " + (stackHeight+formalsSpace+4) + "($sp)");
            rtnValSpace = 8;
        }

        int amountToPop = this.stackHeight + 4 + formalsSpace + 4 - rtnValSpace;
        this.code.emit(methodDeclNonVoid, "addu $sp, $sp, " + amountToPop);
        this.code.emit(methodDeclNonVoid, "jr $ra");

        return null;
    }
}
