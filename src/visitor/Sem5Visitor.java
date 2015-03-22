package visitor;

import com.sun.org.apache.xpath.internal.operations.Bool;
import syntaxtree.*;
import errorMsg.*;

// The purpose of this class it detect and report unreachable code,
// according to Java's rules.
public class Sem5Visitor extends ASTvisitor {
	
	ConstEvalVisitor conEval;
	ErrorMsg errorMsg;
	boolean sawBreak;
	
	public Sem5Visitor(ErrorMsg e) {
		initInstanceVars(e);
	}

	private void initInstanceVars(ErrorMsg e) {
		errorMsg = e;
		conEval = new ConstEvalVisitor();
		sawBreak = false;
	}
    
    public Boolean visitAstNode(AstNode astNode) {
        return Boolean.FALSE;
    }
    
    public Boolean visitProgram(Program program) {
        visitClassDeclList(program.classDecls);
        return Boolean.FALSE;
    }
    
    public Boolean visitClassDecl(ClassDecl classDecl) {
        for (MethodDecl methodDecl : classDecl.methodTable.values()) {
            visitMethodDecl(methodDecl);
        }
        return Boolean.FALSE;
    }
    
    public Boolean visitBlock(Block block) {
        return visitStatementList(block.stmts);
        
    }
    
    public Boolean visitBreak(Break breakStatement) {
        this.sawBreak = true;
        return Boolean.TRUE;
    }
    
    //TODO: Read Email and check implementation
    public Boolean visitStatementList(StatementList statementList) {
        if (statementList.size() == 0) {
            return Boolean.FALSE;
        }
        
        for(int i=0; i<statementList.size();i++) {
            if (i != (statementList.size() - 1)) {
                //if visiting the statement returns true report error
                Statement stmt = statementList.get(i);
                if (visitStatement(stmt).equals(Boolean.TRUE)) {
                    this.errorMsg.error(stmt.pos, "Error: Unreachable Code Detected");
                }
            }
        }
        
        return (Boolean)visitStatement(statementList.get(statementList.size() -1));
    }
    
    public Boolean visitMethodDeclVoid(MethodDeclVoid methodDeclVoid) {
        this.sawBreak = false;
        
        visitStatementList(methodDeclVoid.stmts);
        
        return Boolean.FALSE;
    }
}
	
