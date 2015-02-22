package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;
// The purpose of this class is to:
// - link each variable reference to its corresponding VarDecl
//   (via its 'link' instance variable)
//   - undefined variable names are reported
// - link each type reference to its corresponding ClassDecl
//   - undefined type names are reported
// - link each Break expression to its enclosing While
//   statement
//   - a break that is not inside any while loop is reported
// - report conflicting local variable names (including formal
//   parameter names)
// - ensure that no instance variable has the name 'length'
public class Sem3Visitor extends ASTvisitor {
	
	Hashtable<String, ClassDecl> globalSymTab;
	ClassDecl currentClass;
	Hashtable<String, VarDecl> localSymTab;
	ErrorMsg errorMsg;
	Stack<While> loopStack;
	LocalVarDecl currentLocalDecl;
	
	public Sem3Visitor(Hashtable globalSymTb, ErrorMsg e) {
		errorMsg = e;
		initInstanceVars(globalSymTb);
	}

	private void initInstanceVars(Hashtable<String,ClassDecl> globalTab) {
		loopStack = new Stack<While>();
		globalSymTab = globalTab;
		localSymTab = new Hashtable<String,VarDecl>();
		currentClass = null;
		currentLocalDecl = null;
	}
    
    public Object visitClassDecl(ClassDecl classDecl) {
        this.currentClass = classDecl;
        return super.visitClassDecl(classDecl);
    }
    
    public Object visitMethodDecl(MethodDecl methodDecl) {
        this.localSymTab = new Hashtable<String, VarDecl>();
        return super.visitMethodDecl(methodDecl);
    }
    
    public Object visitLocalVarDecl(LocalVarDecl localVarDecl) {
        this.currentLocalDecl = localVarDecl;
        
        Object returnObj = super.visitLocalVarDecl(localVarDecl);
        
        if (this.localSymTab.containsKey(localVarDecl.name)) {
            this.errorMsg.error(localVarDecl.pos, "Duplicate name error: " + localVarDecl.name);
        }
        else {
            this.localSymTab.put(localVarDecl.name, localVarDecl);
        }
        
        this.currentLocalDecl = null;
        return returnObj;
    }
    
    public Object visitFormalDecl(FormalDecl formalDecl) {
        Object returnObj = super.visitFormalDecl(formalDecl);

        if (this.localSymTab.containsKey(formalDecl.name)) {
            this.errorMsg.error(formalDecl.pos, "Duplicate name error: " + formalDecl.name);
        }
        else {
            this.localSymTab.put(formalDecl.name, formalDecl);
        }
        
        return returnObj;
    }
    
    public Object visitInstVarDecl(InstVarDecl instVarDecl) {
        if (instVarDecl.name.equals("length")) {
            this.errorMsg.error(instVarDecl.pos, "Instance variable name cannot be length: " + instVarDecl.name);
            return null;
        }
        return super.visitInstVarDecl(instVarDecl);
    }
    
    public Object visitBlock(Block block) {
        Object returnObj = super.visitBlock(block);

        for (Statement stmt : block.stmts) {
            //if the stmt is a vardecl remove it from localsym table
            if (stmt instanceof VarDecl) {
                VarDecl decl = (VarDecl)stmt;
                this.localSymTab.remove(decl.name);
            }
        }
        
        return returnObj;
    }
    
    public Object visitIdentifierExp(IdentifierExp identifierExp) {
        if (identifierExp.name.equals(currentLocalDecl.name)) {
            this.errorMsg.error(identifierExp.pos, "Invalid Variable declaration: " + identifierExp.name);
        }
        if (this.localSymTab.containsKey(identifierExp.name)) {
            identifierExp.link = this.localSymTab.get(identifierExp.name);
        }
        else {
            ClassDecl currClass = this.currentClass;
            
            while (currClass != null) {
                if (currClass.instVarTable.containsKey(identifierExp.name)) {
                    identifierExp.link = this.currentClass.instVarTable.get(identifierExp.name);
                    break;
                }
                currClass = currClass.superLink;
            }
            if (currClass == null) {
                this.errorMsg.error(identifierExp.pos, "Undefined Name Error: " + identifierExp.name);
            }
        }
         return null;
    }
    
    public Object visitIdentifierType(IdentifierType identifierType) {
        if (this.globalSymTab.containsKey(identifierType.name)) {
            identifierType.link = globalSymTab.get(identifierType.name);
        }
        else {
            this.errorMsg.error(identifierType.pos, "Undefined name error: " + identifierType.name);
        }
        return null;
    }
    
    public Object visitWhile(While loop) {
        this.loopStack.push(loop);
        Object returnObj = super.visitWhile(loop);
        this.loopStack.pop();
        
        return returnObj;
    }
    
    public Object visitBreak(Break break1) {
        //if loopstack is empty report "break statement outside loop" error
        if (loopStack.empty()) {
            this.errorMsg.error(break1.pos, "Break statement outside loop");
        }
        else {
            break1.loopLink = this.loopStack.peek();
        }
        
        return null;
    }
}

	
