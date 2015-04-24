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
    
    public Object visitProgram(Program program) {
        this.code.emit(program, ".data");

        ClassDecl cd = program.classDecls.elementAt(0);
        ClassDecl superClass = cd.superLink;

        while (superClass != null) {
            cd = superClass;
            superClass = cd.superLink;
        }

        cd.accept(this);

        this.code.flush();
        return null;
    }

    public Object visitClassDecl(ClassDecl classDecl) {
        this.currentMethodTable = new Vector<String>(this.superclassMethodTables.peek());

        this.currentMethodOffset = 1 + numMethods(classDecl.superLink);

        int numDataInstVarsInSuperClass;
        int numObjInstVarsInSuperClass;

        ClassDecl superClass = classDecl.superLink;
        if (superClass == null) {
            numDataInstVarsInSuperClass = 0;
            numObjInstVarsInSuperClass = 0;
        }
        else {
            numDataInstVarsInSuperClass = superClass.numDataInstVars;
            numObjInstVarsInSuperClass = superClass.numObjInstVars;
        }
        this.currentDataInstVarOffset = -16 - 4*(numDataInstVarsInSuperClass);
        this.currentObjInstVarOffset = 4 * (numObjInstVarsInSuperClass);

        Object rtnObj = super.visitClassDecl(classDecl);

        classDecl.numDataInstVars = (-16-this.currentDataInstVarOffset)/4;
        classDecl.numObjInstVars = this.currentObjInstVarOffset/4;

        this.code.emit(classDecl, "CLASS_" + classDecl.name + ":");
        if (superClass == null) {
            this.code.emit(classDecl, ".word 0");
        }
        else {
            this.code.emit(classDecl, ".word CLASS_" + superClass.name);
        }

        for (String meth : this.currentMethodTable) {
            if (meth != null) {
                this.code.emit(classDecl, ".word " + meth);
            }
        }

        this.superclassMethodTables.push(this.currentMethodTable);

        classDecl.subclasses.accept(this);

        this.superclassMethodTables.pop();

        this.code.emit(classDecl, "CLASS_END_" + classDecl.name + ":");

        return rtnObj;
    }
    
    public Object visitMethodDecl(MethodDecl methodDecl) {
        int numWordsForFormals = wordsOnStackFrame(methodDecl.formals);
        methodDecl.thisPtrOffset = 4 * (1 + numWordsForFormals);
        
        this.currentFormalVarOffset = methodDecl.thisPtrOffset;
        
        Object rtnObj = super.visitMethodDecl(methodDecl);
        
        if (methodDecl.superMethod != null) {
            methodDecl.vtableOffset = methodDecl.superMethod.vtableOffset;
        }
        else {
            methodDecl.vtableOffset = this.currentMethodOffset;
            this.currentMethodOffset++;
        }
        
        if (methodDecl.pos < 0) {
            this.registerMethodInTable(methodDecl, methodDecl.name);
        }
        else {
            this.registerMethodInTable(methodDecl, "fcn_" + methodDecl.uniqueId + "_" + methodDecl.name);
        }
        
        return rtnObj;
    }
    
    public Object visitInstVarDecl(InstVarDecl instVarDecl) {
        Object rtnObj = super.visitInstVarDecl(instVarDecl);
        
        if (this.isDataType(instVarDecl.type)) {
            instVarDecl.offset = this.currentDataInstVarOffset;
            this.currentDataInstVarOffset -= 4;
        }
        else if (this.isObjectType(instVarDecl.type)) {
            instVarDecl.offset = this.currentObjInstVarOffset;
            this.currentObjInstVarOffset += 4;
        }
        
        return rtnObj;
    }
    
    public Object visitFormalDecl(FormalDecl formalDecl) {
        Object rtnObj = super.visitFormalDecl(formalDecl);
        
        this.currentFormalVarOffset -= this.wordsOnStackFrame(formalDecl.type);
        
        formalDecl.offset = this.currentFormalVarOffset;
        
        return rtnObj;
    }
    
    //HELPER METHODS
    public int numMethods(ClassDecl cd) {
        ArrayList<String> meths = new ArrayList<String>();
        if (cd != null) {
            meths = new ArrayList<String>(cd.methodTable.keySet());


            ClassDecl superClass = cd.superLink;

            while (superClass != null) {
                for (String s : superClass.methodTable.keySet()) {
                    if (!meths.contains(s)) {
                        meths.add(s);
                    }
                }
                superClass = superClass.superLink;
            }

        }
        return meths.size();
    }
    
    public void registerMethodInTable(MethodDecl md, String label) {
        if (md.vtableOffset > this.currentMethodTable.size()) {
            this.currentMethodTable.setSize(md.vtableOffset);
        }
        this.currentMethodTable.add(md.vtableOffset, label);
    }
    
    public int wordsOnStackFrame(VarDeclList vdl) {
        int numWordsOnStack = 0;
        for (VarDecl vd : vdl) {
            numWordsOnStack += wordsOnStackFrame(vd.type);
        }
        return numWordsOnStack;
    }
    
    public int wordsOnStackFrame(Type t) {
        if (t instanceof IntegerType) {
            return 2;
        }
        else if (t instanceof VoidType) {
            return 0;
        }
        else {
            return 1;
        }
    }
    
    public boolean isDataType(Type t) {
        return (t instanceof IntegerType || t instanceof BooleanType);
    }
    
    public boolean isObjectType(Type t) {
        return !(isDataType(t) || t instanceof VoidType);
    }
}
	
