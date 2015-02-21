package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;

// the purpose of this class is to
// - link each ClassDecl to the ClassDecl for its superclass (via
//   its 'superLink'
// - link each ClassDecl to each of its subclasses (via the
//   'subclasses' instance variable
// - ensure that there are no cycles in the inheritance hierarchy
// - ensure that no class has 'String' or 'RunMain' as its superclass
public class Sem2Visitor extends ASTvisitor {
	
	Hashtable<String,ClassDecl> globalSymTab;
	ErrorMsg errorMsg;
	
	public Sem2Visitor(Hashtable<String,ClassDecl> globalSymTb, ErrorMsg e) {
		errorMsg = e;
		initInstanceVars(globalSymTb);
	}

	private void initInstanceVars(Hashtable<String,ClassDecl> globalTab) {
		globalSymTab = globalTab;
	}
	
    public Object visitProgram(Program program) {
        //ensure no class has a super class of string or RunMain
        for (ClassDecl classDecl : program.classDecls) {
            if (classDecl.superName.equals("String") || classDecl.superName.equals("RunMain")) {
                this.errorMsg.error(
                        classDecl.pos, 
                        "Class Declaration Extends " + classDecl.superName + ": " + classDecl
                );
            }
        }
        
        //ensure no class is part of a cycle
        int numberOfClasses = program.classDecls.size();
        ClassDecl cycleDetectedClass = null;
        
        for (ClassDecl classDecl : program.classDecls) {
            ClassDecl superClass = classDecl.superLink;
            for (int numClassesVisited = 1;superClass != null && numClassesVisited <= numberOfClasses;numClassesVisited++) {
                if (superClass.name.equals(classDecl.name)) {
                    //cycle detected
                    cycleDetectedClass = classDecl;
                    break;
                }
                superClass = classDecl.superLink;
            }
            if (cycleDetectedClass != null) {
                break;
            }
        }
        
        if (cycleDetectedClass != null) {
            this.errorMsg.error(
                    cycleDetectedClass.pos,
                    "Class Declaration Cycle detected: " + cycleDetectedClass.name
            );
        }
        
        return super.visitProgram(program);
    }
    
    public Object visitClassDecl(ClassDecl classDecl) {
        //look up super class in GST
        if (!this.globalSymTab.containsKey(classDecl.superName)) {
            //if not there report an undefined class name error
            this.errorMsg.error(classDecl.pos, "Undefined Class Name Error: " + classDecl.superName);
        }
        else {
            //if there, set super class link in current class
            //add current class to list of subclasses in super class
            classDecl.superLink = this.globalSymTab.get(classDecl.superName);
            classDecl.superLink.subclasses.add(classDecl);
        }
        
        return null;
    }
}


