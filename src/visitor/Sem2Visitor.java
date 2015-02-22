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
        Object returnObj = super.visitProgram(program);
        
        for(ClassDecl classDecl : program.classDecls) {
            if (classDecl.superName.equals("String") || classDecl.superName.equals("RunMain") ) {
                this.errorMsg.error(classDecl.pos, "Class extension disallowed: " + classDecl.superName);
            }
        }
        
        for (ClassDecl classDecl : program.classDecls) {
            if (findCycle(classDecl, program.classDecls.size()) != null) {
                this.errorMsg.error(classDecl.pos, "Class Cycle Detected: " + classDecl);
            }
        }
        
        return returnObj;
    }

    //helper function to find a cycle
    //Adapted from Dr. Vegdahl's Slides (11.5)
    private ClassDecl findCycle(ClassDecl classDecl, int numberOfClasses) {
        ClassDecl superClass = classDecl.superLink;
        
        //follow super link path until
        //  a cycle is found
        //  we have run through all the classes
        //  -- OR -- we finish the superlink chain
        for(int index = 1; index <= numberOfClasses;index++) {
            if (classDecl == superClass) {
                return classDecl.superLink;
            }
            

            if (superClass == null) {
                break;
            }
            superClass = superClass.superLink;
        }
        
        return null;
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


