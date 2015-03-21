package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
// The purpose of this class is to do type-checking and related
// actions.  These include:
// - evaluate the type for each expression, filling in the 'type'
//   link for each
// - ensure that each expression follows MiniJava's type rules (e.g.,
//   that the arguments to '*' are both integer, the argument to
//   '.length' is an array, etc.)
// - ensure that each method-call follows Java's type rules:
//   - there exists a method for the given class (or a superclass)
//     for the receiver's object type
//   - the method has the correct number of parameters
//   - the types of each actual parameter is compatible with that
//     of its corresponding formal parameter
// - ensure that for each instance variable access (e.g., abc.foo),
//   there is an instance variable defined for the given class (or
//   in a superclass
//   - sets the 'varDec' link in the InstVarAccess to refer to the
//     method
// - ensure that the RHS expression in each assignment statement is
//   type-compatible with its corresponding LHS
//   - also checks that the LHS an lvalue
// - ensure that if a method with a given name is defined in both
//   a subclass and a superclass, that they have the same parameters
//   (with identical types) and the same return type
// - ensure that the declared return-type of a method is compatible
//   with its "return" expression
// - ensuring that the type of the control expression for an if- or
//   while-statement is boolean
public class Sem4Visitor extends ASTvisitor {

	ClassDecl currentClass;
	IdentifierType currentClassType;
	IdentifierType currentSuperclassType;
	ErrorMsg errorMsg;
	Hashtable<String,ClassDecl> globalSymTab;

	BooleanType theBoolType;
	IntegerType theIntType;
	NullType theNullType;
	VoidType theVoidType;
	IdentifierType theStringType;

	public Sem4Visitor(Hashtable<String,ClassDecl> globalSymTb, ErrorMsg e) {
		globalSymTab = globalSymTb;
		errorMsg = e;
		initInstanceVars();
	}

	private void initInstanceVars() {
		currentClass = null;

		theBoolType = new BooleanType(-1);
		theIntType = new IntegerType(-1);
		theNullType = new NullType(-1);
		theVoidType = new VoidType(-1);
		if (globalSymTab != null) {
			theStringType = new IdentifierType(-1, "String");
			theStringType.link = globalSymTab.get("String");
		}
	}

    //Recommended Helper Methods
    private boolean matchTypesExact(Type have, Type need, int pos) {
        if (have == null || need == null) return false;

        if (have.equals(need)) {
            //types equal
            return true;
        }

        if (pos >= 0) {
            this.errorMsg.error(
                    pos,
                    "Incompatible types: Have -> " + have.toString2() + " Need -> " + need.toString2()
            );
        }

        return false;
    }

    private boolean matchTypesAssign(Type src, Type target, int pos) {
        //if either is null return false
        if (src == null || target == null) {
            return false;
        }

        //else if either is void type print incompatible error and return false
        else if (src instanceof VoidType || target instanceof VoidType) {
            if (pos >= 0) {
                this.errorMsg.error(pos, "Incompatible Types");
            }
            return false;
        }

        //else if types are equal return true
        else if (src.equals(target)) {
            return true;
        }

        //if source is null type return true if :
            // target is identifier type
            // or target is array type
        if (src instanceof NullType) {
            if (target instanceof IdentifierType || target instanceof ArrayType) {
                return true;
            }
        }

        //if source is array type and target is identifier type with name Object, return true
        if (src instanceof ArrayType && target instanceof IdentifierType) {
            if (((IdentifierType) target).name.equals("Object")) {
                return true;
            }
        }

        //if source is identifier type return true if: 
            //target is a super class
        if (src instanceof IdentifierType) {
            ClassDecl classLink = ((IdentifierType)src).link;
            AstNode[] targetLinks = target.links();
            AstNode targetLink;

            if (targetLinks != null) {
                if (targetLinks.length > 0 ) {
                    targetLink = targetLinks[0];
                    String targetClassName = targetLink.getClass().getName();

                    while (classLink != null) {
                        if (classLink.name.equals(targetClassName)) {
                            //target is a super class, return true
                            return true;
                        }

                        classLink = classLink.superLink;
                    }
                }
            }
        }

        //else print incompatible error if pos is > 0
        //return false
        if (pos >= 0) {
            this.errorMsg.error(pos, "Incompatible Types");
        }
        return false;
    }

    private boolean matchTypesEqCompare(Type t1, Type t2, int pos) {
        //if either type is null return false
        if (t1 == null || t2 == null) {
            return false;
        }

        //otherwise invoke matchTypesAssign twice, once with t1 first and once with t2 first use a neg position
        //if either returns true, return true
        if (matchTypesAssign(t1,t2,(-pos)) || matchTypesAssign(t2,t1,(-pos))) {
            return true;
        }

        //else print incompatible error (if pos >= 0) and return false
        if (pos >= 0) {
            this.errorMsg.error(pos, "Incompatible Types");
        }
        return false;
    }

    private InstVarDecl instVarLookup(String name, ClassDecl classDecl, int pos, String msg) {
        if (classDecl.instVarTable.containsKey(name)) {
            return classDecl.instVarTable.get(name);
        }

        ClassDecl currentClass = classDecl.superLink;
        while (currentClass != null) {
            if (currentClass.instVarTable.containsKey(name)) {
                return currentClass.instVarTable.get(name);
            }

            currentClass = currentClass.superLink;
        }

        this.errorMsg.error(pos, msg);
        return null;
    }

    private InstVarDecl instVarLookup(String name, Type t, int pos, String msg) {
        if (t == null) {
            return null;
        } else if (!(t instanceof IdentifierType)) {
            this.errorMsg.error(pos, msg);
            return null;
        } else {
            return instVarLookup(name, ((IdentifierType) t).link, pos, msg);
        }
    }

    private MethodDecl methodLookup(String name, ClassDecl classDecl, int pos, String msg) {
        if (classDecl.methodTable.containsKey(name)) {
            return classDecl.methodTable.get(name);
        }

        ClassDecl currentClass = classDecl.superLink;
        while (currentClass != null) {
            if (currentClass.methodTable.containsKey(name)) {
                return currentClass.methodTable.get(name);
            }

            currentClass = currentClass.superLink;
        }

        this.errorMsg.error(pos, msg);
        return null;
    }

    private MethodDecl methodLookup(String name, Type t, int pos, String msg) {
        if (t == null) {
            return null;
        } else if (!(t instanceof IdentifierType)) {
            this.errorMsg.error(pos, msg);
            return null;
        } else {
            return methodLookup(name, ((IdentifierType) t).link, pos, msg);
        }
    }

    private Type returnTypeFor(MethodDecl methodDecl) {
        if (methodDecl instanceof MethodDeclVoid) {
            return new VoidType(((MethodDeclVoid) methodDecl).pos);
        }

        return ((MethodDeclNonVoid)methodDecl).rtnType;
    }

    public Object visitIntegerLiteral(IntegerLiteral integerLiteral) {
        Object returnObj = super.visitIntegerLiteral(integerLiteral);
        integerLiteral.type = this.theIntType;
        return returnObj;
    }

    public Object visitNull(Null nullExp) {
        Object returnObj = super.visitNull(nullExp);
        nullExp.type = this.theNullType;
        return returnObj;
    }

    public Object visitStringLiteral(StringLiteral stringLiteral) {
        Object returnObject = super.visitStringLiteral(stringLiteral);
        stringLiteral.type = this.theStringType;
        return returnObject;
    }

    public Object visitTrue(True trueExp) {
        Object returnObject = super.visitTrue(trueExp);
        trueExp.type = this.theBoolType;
        return returnObject;
    }

    public Object visitFalse(False falseExp) {
        Object returnObject = super.visitFalse(falseExp);
        falseExp.type = this.theBoolType;
        return returnObject;
    }

    public Object visitIdentifierExp(IdentifierExp identifierExp) {
        Object returnObject = super.visitIdentifierExp(identifierExp);
        identifierExp.type = identifierExp.link.type;
        return returnObject;
    }

    public Object visitThis(This thisExp) {
        Object returnObject = super.visitThis(thisExp);
        thisExp.type = this.currentClassType;
        return returnObject;
    }

    public Object visitSuper(Super superExp) {
        Object returnObject = super.visitSuper(superExp);
        superExp.type = currentSuperclassType;
        return returnObject;
    }

    //---------------- Binary Expressions ---------------------------------

    public Object visitPlus(Plus plus) {
        Object returnObject = super.visitPlus(plus);
        checkBinaryExp(plus, 0);
        return returnObject;
    }

    public Object visitMinus(Minus minus) {
        Object returnObject = super.visitMinus(minus);
        checkBinaryExp(minus, 0);
        return returnObject;
    }

    public Object visitTimes(Times times) {
        Object returnObject = super.visitTimes(times);
        checkBinaryExp(times, 0);
        return returnObject;
    }

    public Object visitDivide(Divide divide) {
        Object returnObject = super.visitDivide(divide);
        checkBinaryExp(divide, 0);
        return returnObject;
    }

    public Object visitRemainder(Remainder remainder) {
        Object returnObject = super.visitRemainder(remainder);
        checkBinaryExp(remainder, 0);
        return returnObject;
    }

    public Object visitGreaterThan(GreaterThan greaterThan) {
        Object returnObject = super.visitGreaterThan(greaterThan);
        checkBinaryExp(greaterThan, 1);
        return returnObject;
    }

    public Object visitLessThan(LessThan lessThan) {
        Object returnObject = super.visitLessThan(lessThan);
        checkBinaryExp(lessThan, 1);
        return returnObject;
    }

    private void checkBinaryExp(BinExp binExp, int flag) {
        if (matchTypesExact(binExp.left.type,this.theIntType,binExp.pos) &&
                matchTypesExact(binExp.right.type, this.theIntType, binExp.pos)) {
            switch (flag) {
                case 0: //intType flag
                    binExp.type = this.theIntType;
                    break;
                case 1: //boolType flag
                    binExp.type = this.theBoolType;
                    break;
                default:
                    break;
            }
        }
        else {
            binExp.type = null;
        }
    }

    //---------------- End Binary Expressions ---------------------------------

    //---------------- Equality and Conditions --------------------------------

    public Object visitEquals(Equals equals) {
        Object returnObject = super.visitEquals(equals);
        if (matchTypesEqCompare(equals.left.type, equals.right.type, equals.pos)) {
            equals.type = this.theBoolType;
        }
        else {
            this.errorMsg.error(equals.pos, "Inconsistent Types");
            equals.type = null;
        }
        return returnObject;
    }

    public Object visitNot(Not not) {
        Object returnObject = super.visitNot(not);
        if (matchTypesExact(not.type,this.theBoolType,not.pos)) {
            not.type = this.theBoolType;
        }
        else {
            this.errorMsg.error(not.pos, "Invalid Type. Expression must be boolean type");
            not.type = null;
        }
        return returnObject;
    }

    public Object visitAnd(And and) {
        Object returnObject = super.visitAnd(and);
        if (matchTypesExact(and.left.type, this.theBoolType, -20) &&
                matchTypesExact(and.right.type, this.theBoolType, -20)) {

            and.type = this.theBoolType;
        }
        else {
            this.errorMsg.error(and.pos, "Invalid Types. Both operands must be boolean type");
            and.type = null;
        }
        return returnObject;
    }

    public Object visitOr(Or or) {
        Object returnObject = super.visitOr(or);
        if (matchTypesExact(or.left.type, this.theBoolType, or.pos) &&
                matchTypesExact(or.right.type, this.theBoolType, or.pos)) {

            or.type = this.theBoolType;
        }
        else {
            this.errorMsg.error(or.pos, "Invalid Types. Both operands must be boolean type");
            or.type = null;
        }
        return returnObject;
    }

    public Object visitArrayLength(ArrayLength arrayLength) {
        Object returnObject = super.visitArrayLength(arrayLength);
        if (arrayLength.exp != null && arrayLength.exp.type instanceof ArrayType) {
            arrayLength.type = this.theIntType;
        }
        else {
            this.errorMsg.error(arrayLength.pos, "Invalid Type. Expression must be array");
            arrayLength.type = null;
        }
        return returnObject;
    }

    public Object visitArrayLookup(ArrayLookup arrayLookup) {
        Object returnObject = super.visitArrayLookup(arrayLookup);

        boolean b = matchTypesExact(arrayLookup.idxExp.type, this.theIntType, arrayLookup.pos);
        b = b && (arrayLookup.arrExp != null && arrayLookup.arrExp.type instanceof ArrayType);

        if (b) {
            arrayLookup.type = arrayLookup.arrExp.type;
        }
        else {
            this.errorMsg.error(arrayLookup.pos, "Invalid Type. Expression must be int type and array must be array type");
            arrayLookup.type = null;
        }
        return returnObject;
    }

    public Object visitInstVarAccess(InstVarAccess instVarAccess) {
        Object returnObject = super.visitInstVarAccess(instVarAccess);

        if (instVarAccess.exp.type == null) {
            return returnObject;
        }

        InstVarDecl instVarDecl = instVarLookup(
                instVarAccess.varName,
                instVarAccess.exp.type,
                instVarAccess.pos,
                "Error: Instance Variable " + instVarAccess.varName + " not found"
        );

        if (instVarDecl != null) {
            instVarAccess.varDec = instVarDecl;
            instVarAccess.type = instVarDecl.type;
        }

        return returnObject;
    }

    public Object visitCast(Cast cast) {
        Object returnObject = super.visitCast(cast);

        Type expType = cast.exp.type;
        Type castType = cast.castType;

        if (matchTypesAssign(expType, castType, -20) || matchTypesAssign(castType, expType, -20)) {
            cast.type = castType;
        }
        else {
            this.errorMsg.error(cast.pos, "Incompatible types used for cast");
            cast.type = null;
        }

        return returnObject;
    }

    public Object visitInstanceOf(InstanceOf instanceOf) {
        Object returnObject = super.visitInstanceOf(instanceOf);

        Type expType = instanceOf.exp.type;
        Type checkType = instanceOf.checkType;

        if (matchTypesAssign(expType, checkType, -20) || matchTypesAssign(checkType, expType, -20)) {
            instanceOf.type = this.theBoolType;
        }
        else {
            this.errorMsg.error(instanceOf.pos, "Incompatible types used for instanceof");
            instanceOf.type = null;
        }
        return returnObject;
    }

    public Object visitNewObject(NewObject newObject) {
        Object returnObject = super.visitNewObject(newObject);

        newObject.type = newObject.objType;

        return returnObject;
    }

    public Object visitNewArray(NewArray newArray) {
        Object returnObject = super.visitNewArray(newArray);

        if (matchTypesExact(newArray.sizeExp.type, this.theIntType, newArray.pos)) {
            newArray.type = newArray.objType;
        }
        else {
            newArray.type = null;
        }
        return returnObject;
    }

    public Object visitCall(Call call) {
        Object returnObject = super.visitCall(call);

        if (call.obj.type == null) {
            return returnObject;
        }

        MethodDecl methodDecl = methodLookup(
                call.methName,
                call.obj.type,
                call.pos,
                "Error: Method " + call.methName + " not found"
        );

        if (methodDecl != null) {
            int numParams = call.parms.size();
            int methodNumParams = methodDecl.formals.size();

            if (numParams == methodNumParams) {
                boolean compatibleParams = true;
                for (int i = 0; i < numParams; i++) {
                    VarDecl methodParam = methodDecl.formals.get(i);
                    Exp param = call.parms.get(i);

                    if (!matchTypesAssign(param.type, methodParam.type, -20)) {
                        compatibleParams = false;
                        break;
                    }
                }

                if (compatibleParams) {
                    if(methodDecl instanceof MethodDeclNonVoid) {
                        call.type = ((MethodDeclNonVoid)methodDecl).rtnType;
                    }
                    else {
                        call.type = new VoidType(call.pos);
                    }
                }
                else {
                    this.errorMsg.error(call.pos, "Parameter Type Mismatch");
                    call.type = null;
                }
            }
            else {
                this.errorMsg.error(call.pos, "Incorrect Number of Parameters");
                call.type = null;
            }
        }

        return returnObject;
    }

    public Object visitAssign(Assign assign) {
        Object returnObject = super.visitAssign(assign);

        //check lhs is an l value (idExp, ArrayLookup, or InstVarAccess)
        if (assign.lhs instanceof IdentifierExp || assign.lhs instanceof ArrayLookup || assign.lhs instanceof InstVarAccess) {
            Type rightHandType = assign.rhs.type;
            Type leftHandType = assign.lhs.type;

            if (!matchTypesAssign(leftHandType, rightHandType, -20)) {
                this.errorMsg.error(assign.pos, "Incompatible types. Attempting to assign " + leftHandType.toString2() + " to " + rightHandType.toString2());
            }
        }
        else {
            this.errorMsg.error(assign.pos, "Incorrect Type. Left Hand Side incompatible");
        }
        return returnObject;
    }

    public Object visitLocalVarDecl(LocalVarDecl localVarDecl) {
        Object returnObject = super.visitLocalVarDecl(localVarDecl);
        Exp initExp = localVarDecl.initExp;

        if (!matchTypesAssign(initExp.type, localVarDecl.type, -20)) {
            this.errorMsg.error(localVarDecl.pos, "Incorrect type for variable declaration");
        }

        return returnObject;
    }

    public Object visitIf(If ifStatement) {
        Object returnObject = super.visitIf(ifStatement);

        if (!matchTypesExact(ifStatement.exp.type, this.theBoolType, -20)) {
            this.errorMsg.error(ifStatement.pos, "Incorrect type: Expression must be boolean");
        }
        return returnObject;
    }

    public Object visitWhile(While whileStatement) {
        Object returnObject = super.visitWhile(whileStatement);

        if(!matchTypesExact(whileStatement.exp.type, this.theBoolType, -20)) {
            this.errorMsg.error(whileStatement.pos, "Incorrect type: Expression must be boolean");
        }
        return returnObject;
    }
}
	
