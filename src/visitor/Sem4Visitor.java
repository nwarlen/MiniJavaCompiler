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
    
    
}
	
