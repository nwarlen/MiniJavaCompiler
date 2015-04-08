package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
import java.io.*;
import java.awt.Point;

//the purpose here is to annotate things with their offsets:
// - formal parameters, with respect to the (callee) frame
// - instance variables, with respect to their slot in the object
// - methods, with respect to their slot in the v-table
public class CG1Visitor extends ASTvisitor {
	
	// IO stream to which we will emit code
	CodeStream code;
	
	// v-table offset of next method we encounter
	int currentMethodOffset;
	
	// offset in object of next "object" instance variable we encounter
	int currentObjInstVarOffset;
	
	// offset in object of next "data" instance variable we encounter
	int currentDataInstVarOffset;
	
	// stack-offset of next formal parameter we encounter
	int currentFormalVarOffset;
	
	// stack method tables for current class and all superclasses
	Stack<Vector<String>> superclassMethodTables;
	
	// current method table
	Vector<String> currentMethodTable;
	
	// error-message object
	ErrorMsg errorMsg;
	
	public CG1Visitor(ErrorMsg e, PrintStream out) {
		initInstanceVars(e, out);
	}
	
	private void initInstanceVars(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		currentMethodOffset = 0;
		currentObjInstVarOffset = 0;
		currentDataInstVarOffset = 0;
		code = new CodeStream(out, e);
		superclassMethodTables = new Stack<Vector<String>>();
		superclassMethodTables.addElement(new Vector<String>());
	}
    
//    public Object visitProgram(Program program) {
//        this.code.emit(program, ".data");
//
//        ClassDecl cd = program.classDecls.elementAt(0);
//        ClassDecl superClass = cd.superLink;
//
//        while (superClass != null) {
//            cd = superClass;
//            superClass = cd.superLink;
//        }
//
//        cd.accept(this);
//
//        this.code.flush();
//        return null;
//    }
//
//    public Object visitClassDecl(ClassDecl classDecl) {
//        this.currentMethodTable = new Vector<String>(this.superclassMethodTables.peek());
//
//        //TODO: currentMethodOffset = 1 + #methods in superClass
//
//        int numDataInstVarsInSuperClass;
//        int numObjInstVarsInSuperClass;
//
//        ClassDecl superClass = classDecl.superLink;
//        if (superClass == null) {
//            numDataInstVarsInSuperClass = 0;
//            numObjInstVarsInSuperClass = 0;
//        }
//        else {
//            numDataInstVarsInSuperClass = superClass.numDataInstVars;
//            numObjInstVarsInSuperClass = superClass.numObjInstVars;
//        }
//        this.currentDataInstVarOffset = -16 - 4*(numDataInstVarsInSuperClass);
//        this.currentObjInstVarOffset = 4 * (numObjInstVarsInSuperClass);
//
//        Object rtnObj = super.visitClassDecl(classDecl);
//
//        classDecl.numDataInstVars = (-16-this.currentDataInstVarOffset)/4;
//        classDecl.numObjInstVars = this.currentObjInstVarOffset/4;
//
//        this.code.emit(classDecl, "CLASS_" + classDecl.name + ":");
//        if (superClass == null) {
//            this.code.emit(classDecl, ".word 0");
//        }
//        else {
//            this.code.emit(classDecl, ".word CLASS_" + superClass.name);
//        }
//
//        for (String meth : this.currentMethodTable) {
//            this.code.emit(classDecl, ".word " + meth);
//        }
//
//        this.superclassMethodTables.push(this.currentMethodTable);
//
//        classDecl.subclasses.accept(this);
//
//        this.superclassMethodTables.pop();
//
//        this.code.emit(classDecl, "CLASS_END_" + classDecl.name + ":");
//
//        return rtnObj;
//    }
	

}
	
