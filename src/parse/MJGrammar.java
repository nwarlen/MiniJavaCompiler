package parse;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;

public class MJGrammar
		implements wrangLR.runtime.MessageObject, wrangLR.runtime.FilePosObject {
	
	public static final boolean FILTER_GRAMMAR = true;
	
	// constructor
	public MJGrammar(ErrorMsg em) {
		errorMsg = em;
		topObject = null;
	}
	
	// error message object
	private ErrorMsg errorMsg;
	
	// object returned by the parse
	private Program topObject;

	// method for printing error message
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	// method for printing warning message
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	// method for converting file position to line/character
	// position
	public String filePosString(int pos) {
		return errorMsg.lineAndChar(pos);
	}
	
	// method to register a newline
	public void registerNewline(int pos) {
		errorMsg.newline(pos-1);
	}

	// returns the object produced by the parse
	public Program parseResult() {
		return topObject;
	}
	
	//===============================================================
	// start symbol
	//===============================================================

	//: <start> ::= ws* <program> =>
	public void topLevel(Program obj) {
		topObject = obj;
	}
	
	//================================================================
	//top-level program constructs
	//================================================================

	//: <program> ::= # <class decl>+ =>
	public Program createProgram(int pos, List<ClassDecl> vec) {
		return new Program(pos, new ClassDeclList(vec));
	}

	//: <class decl> ::= `class # ID `{ <decl in class>* `} =>
	public ClassDecl createClassDecl(int pos, String name, List<Decl> vec) {
		return new ClassDecl(pos, name, "Object", new DeclList(vec));
	}

	//: <decl in class> ::= <method decl> => pass
	//: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
	public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts) {
		return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
				new StatementList(stmts));
	}
	

	//: <type> ::= # `int =>
	public Type intType(int pos) {
		return new IntegerType(pos);
	}
	//: <type> ::= # `boolean =>
	public Type booleanType(int pos) {
		return new BooleanType(pos);
	}
	//: <type> ::= # ID =>
	public Type identifierType(int pos, String name) {
		return new IdentifierType(pos, name);
	}
	//: <type> ::= # <type> <empty bracket pair> =>
	public Type newArrayType(int pos, Type t, Object dummy) {
		return new ArrayType(pos, t);
	}

	//: <empty bracket pair> ::= `[ `] => null

	//================================================================
	//statement-level program constructs
	//================================================================

	//: <stmt> ::= # `break `; => 
	public Statement newBreak(int pos) {
		return new Break(pos);
	}
	
	//: <stmt> ::= # `; =>
	public Statement newEmptyBlock(int pos) {
		return new Block(pos, new StatementList());
	}

	//: <stmt> ::= # `{ <stmt>* `} =>
	public Statement newBlock(int pos, List<Statement> sl) {
		return new Block(pos, new StatementList(sl));
	}
	
	//: <stmt> ::= <assign> `; => pass
	
	//: <stmt> ::= <if> => pass
	//: <stmt> ::= <while> => pass
	//: <stmt> ::= # <callExp> `; =>
	public Statement newCallStatement(int pos, Exp exp1) {
		return new ExpStatement(pos, exp1);
	}
	
	//===================== if =====================================
	//: <if> ::= # `if `( <exp> `) <stmt> `else <stmt> =>
	public Statement newIfAndElseStatement(int pos, Exp exp1, Statement stmt1, Statement stmt2) {
		return new If(pos,exp1,stmt1,stmt2);
	}
	
	//: <if> ::= # `if `( <exp> `) <stmt> !`else =>
	public Statement newIfStatement(int pos, Exp exp1, Statement stmt1) {
		return new If(pos,exp1,stmt1,new Block(pos, new StatementList()));
	}
	
	//==================== while =====================================
	
	//: <while> ::= # `while `( <exp> `) <stmt> =>
	public Statement newWhileStatement(int pos, Exp exp1, Statement stmt1) {
		return new While(pos,exp1,stmt1);
	}
	
	//==================== for =======================================
	//: <stmt> ::= <for> => pass
	
	//: <forHelper1> ::= # <type> ID `= <exp> =>
	public Statement newVarDeclForLoop(int pos, Type t, String id, Exp exp1) {
		return new LocalVarDecl(pos,t,id,exp1);
	}
	//: <forHelper1> ::= <assign> => 
	public Statement newAssignForLoop(Statement assignStmt) {
		return assignStmt;
	}
	//: <forHelper1> ::= # <callExp> =>
	public Statement newCallExpressionStatementForLoop(int pos, Exp callExp) {
		return new ExpStatement(pos, callExp);
	}
	
	//: <forHelper2> ::= <assign> => Statement newAssignForLoop(Statement)
	//: <forHelper2> ::= # <callExp> => Statement newCallExpressionStatementForLoop(int,Exp)
	
	//: <for> ::= # `for `( <forHelper1>? `; <exp>? `; <forHelper2>? `) <stmt> =>
	public Statement newForLoop(int pos, Statement stmt1, Exp exp1, Statement stmt2, Statement stmt3) {
		//adapted from Slideset 8. (8.12)
		StatementList whileBlockList = new StatementList();
		whileBlockList.add(stmt3);
		whileBlockList.add(stmt2);

		Block whileBlock = new Block(pos, whileBlockList);
		
		While forToWhileConvert = new While(pos,exp1,whileBlock);

		StatementList list = new StatementList();
		list.add(stmt1);
		list.add(forToWhileConvert);

		return new Block(pos,list);
	}
	//: <stmt> ::= <local var decl> `; => pass

	//: <assign> ::= <exp> # `= <exp> =>
	public Statement assign(Exp lhs, int pos, Exp rhs) {
		return new Assign(pos, lhs, rhs);
	}
	
	//: <assign> ::= # `++ ID =>
	public Statement incrementBefore(int pos, String id) {
		IdentifierExp exp = new IdentifierExp(pos,id);
		IntegerLiteral intLit = new IntegerLiteral(pos,1);
		
		Plus addOne = new Plus(pos,intLit,exp);
		
		return new Assign(pos,exp,addOne);
	}
	
	//: <assign> ::= # `-- ID =>
	public Statement decrementBefore(int pos, String id) {
		IdentifierExp exp = new IdentifierExp(pos,id);
		IntegerLiteral intLit = new IntegerLiteral(pos,1);
		
		Minus subOne = new Minus(pos,exp,intLit);
		
		return new Assign(pos,exp,subOne);
	}
	
	//: <assign> ::= # ID `++ =>
	public Statement incrementAfter(int pos, String id) {
		IdentifierExp exp = new IdentifierExp(pos,id);
		IntegerLiteral intLit = new IntegerLiteral(pos,1);
		
		Plus addOne = new Plus(pos,intLit,exp);
		
		return new Assign(pos,exp,addOne);
	}
	
	//: <assign> ::= # ID `-- =>
	public Statement decrementAfter(int pos, String id) {
		IdentifierExp exp = new IdentifierExp(pos,id);
		IntegerLiteral intLit = new IntegerLiteral(pos,1);
		
		Minus subOne = new Minus(pos,exp,intLit);
		
		return new Assign(pos,exp,subOne);
	}

	//: <local var decl> ::= <type> # ID `= <exp> =>
	public Statement localVarDecl(Type t, int pos, String name, Exp init) {
		return new LocalVarDecl(pos, t, name, init);
	}

	//================================================================
	//expressions
	//================================================================

	//=============   exp    ===================================
	//: <exp> ::= <exp> # `|| <exp2> =>
	public Exp newOr(Exp exp1, int pos, Exp exp2) {
		return new Or(pos,exp1,exp2);
	}
	
	//: <exp> ::= <exp2> => pass

	//=============   exp2   ===================================
	
	//: <exp2> ::= <exp2> # `&& <exp3> =>
	public Exp newAnd(Exp exp1, int pos, Exp exp2) {
		return new And(pos,exp1,exp2);
	}
	
	//: <exp2> ::= <exp3> => pass

	//=============   exp3   ===================================
	
	//: <exp3> ::= <exp3> # `!= <exp4> =>
	public Exp newNotEqual(Exp exp1, int pos, Exp exp2) {
		// a != b  -> !(a == b)
		return new Not(pos, new Equals(pos,exp1,exp2));
	}

	//: <exp3> ::= <exp3> # `== <exp4> =>
	public Exp newEqual(Exp exp1, int pos, Exp exp2) {
		return new Equals(pos,exp1,exp2);
	}
	
	//: <exp3> ::= <exp4> => pass

	//=============   exp4   ===================================
	
	//: <exp4> ::= <exp4> # `< <exp5> =>
	public Exp newLessThan(Exp exp1, int pos, Exp exp2) {
		return new LessThan(pos,exp1,exp2);
	}
	
	//: <exp4> ::= <exp4> # `> <exp5> =>
	public Exp newGreaterThan(Exp exp1, int pos, Exp exp2) {
		return new GreaterThan(pos,exp1,exp2);
	}
	
	//: <exp4> ::= <exp4> # `<= <exp5> =>
	public Exp newLessThanOrEqual(Exp exp1, int pos, Exp exp2) {
		// a <= b  -> (!(a>b))
		return new Not(pos, new GreaterThan(pos,exp1,exp2));
	}
	
	//: <exp4> ::= <exp4> # `>= <exp5> =>
	public Exp newGreaterThanOrEqual(Exp exp1, int pos, Exp exp2) {
		// a >= b  -> (!(a<b))
		return new Not(pos, new LessThan(pos,exp1,exp2));
	}
	
	//: <exp4> ::= <exp4> # `instanceof ID =>
	public Exp newInstanceOf(Exp exp1, int pos, String id) {
		return new InstanceOf(pos,exp1,new IdentifierType(pos,id));
	}
	
	//: <exp4> ::= <exp5> => pass

	//=============   exp5   ===================================
	
	//: <exp5> ::= <exp5> # `+ <exp6> =>
	public Exp newPlus(Exp e1, int pos, Exp e2) {
		return new Plus(pos, e1, e2);
	}
	
	//: <exp5> ::= <exp5> # `- <exp6> =>
	public Exp newMinus(Exp exp1, int pos, Exp exp2) {
		return new Minus(pos,exp1,exp2);
	}
	//: <exp5> ::= <exp6> => pass

	//=============   exp6   ===================================
	
	//: <exp6> ::= <exp6> # `* <exp7> =>
	public Exp newTimes(Exp e1, int pos, Exp e2) {
		return new Times(pos, e1, e2);
	}
	
	//: <exp6> ::= <exp6> # `/ <exp7> =>
	public Exp newDivide(Exp exp1, int pos, Exp exp2) {
		return new Divide(pos,exp1,exp2);
	}
	
	//: <exp6> ::= <exp6> # `% <exp7> =>
	public Exp newModulus(Exp exp1, int pos, Exp exp2) {
		return new Remainder(pos,exp1,exp2);
	}
	
	//: <exp6> ::= <exp7> => pass

	//=============   exp7   ===================================
	
	//: <exp7> ::= <cast exp> => pass
	//: <exp7> ::= <unary exp> => pass

	//: <cast exp> ::= # `( <type> `) <cast exp> =>
	public Exp newCast(int pos, Type t, Exp e) {
		return new Cast(pos, t, e);
	}
	//: <cast exp> ::= # `( <type> `) <exp8> => Exp newCast(int, Type, Exp)

	//: <unary exp> ::= # `- <unary exp> =>
	public Exp newUnaryMinus(int pos, Exp e) {
		return new Minus(pos, new IntegerLiteral(pos, 0), e);
	}
	
	//: <unary exp> ::= # `+ <unary exp> =>
	public Exp newUnaryPlus(int pos, Exp exp1) {
		return new Plus(pos,new IntegerLiteral(pos, 0), exp1);
	}
	
	//: <unary exp> ::= # `! <unary exp> =>
	public Exp newUnaryNot(int pos, Exp exp1) {
		return new Not(pos, exp1);
	}
	
	//: <unary exp> ::= <exp8> => pass

	
	//=============   exp8   ===================================
	
	//: <exp8> ::= # ID  =>
	public Exp newIdentfierExp(int pos, String name) {
		return new IdentifierExp(pos, name);
	}
	
	//: <exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `] =>
	public Exp newArrayLookup(Exp e1, int pos, Exp e2) {
		return new ArrayLookup(pos, e1, e2);
	}
	
	//: <exp8> ::= # INTLIT =>
	public Exp newIntegerLiteral(int pos, int n) {
		return new IntegerLiteral(pos, n);
	}
	
	//: <exp8> ::= # STRINGLIT =>
	public Exp newStringLiteral(int pos, String s) {
		return new StringLiteral(pos, s);
	}
	
	//: <exp8> ::= # CHARLIT =>
	public Exp newCharacterLiteral(int pos, int character) {
		return new IntegerLiteral(pos,character);
	}
	
	//: <exp8> ::= # `false =>
	public Exp newFalse(int pos) {
		return new False(pos);
	}
	
	//: <exp8> ::= # `true =>
	public Exp newTrue(int pos) {
		return new True(pos);
	}
	
	//: <exp8> ::= # `null =>
	public Exp newNullValue(int pos) {
		return new Null(pos);
	}
	
	//: <exp8> ::= # `this =>
	public Exp newThis(int pos) {
		return new This(pos);
	}
	
	//: <exp8> ::= # <exp8> `. ID =>
	public Exp newInstanceVariableAccess(int pos, Exp exp, String name) {
		return new InstVarAccess(pos, exp, name);
	}
	
	//: <exp8> ::= # `new ID `( `) =>
	public Exp newCreation(int pos, String id) {
		IdentifierType t = new IdentifierType(pos, id);
		
		return new NewObject(pos,t);
	}
	
	//: <exp8> ::= <callExp> => pass
	
	
	//===============   callExp   ====================================
	
	//: <callExp> ::= # <exp8> `. ID `( <expList>? `) =>
	public Exp newCallExp(int pos, Exp exp1 ,String id, ExpList expList1) {
		return new Call(pos, exp1, id, expList1);
	}
	
	//: <callExp> ::= # ID `( <expList>? `) =>
	public Exp newCallWithOptionalArgs(int pos, String id, ExpList expList1) {
		return new Call(pos,new This(pos), id, expList1);
	}
	
	//: <callExp> ::= # `super `. ID `( <expList>? `) =>
	public Exp newSuperCallWithOptionalArgs(int pos, String id, ExpList expList1) {
		return new Call(pos, new Super(pos), id, expList1);
	}
	
	//================   expList   =====================================
	
	//: <expList> ::= <exp> =>
	public ExpList newExpList(Exp exp1) {
		ExpList expressionList = new ExpList();
		expressionList.add(exp1);
		
		return expressionList;
	}
	
	//: <expList> ::= <exp> `, <expList> =>
	public ExpList addToExpressionList(Exp exp1, ExpList expList1) {
		expList1.add(exp1);
		
		return expList1;
	}
	

	//================================================================
	// Lexical grammar for filtered language begins here: DO NOT MODIFY
	// ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR ENTIRE
	// LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR (defined
	// near the top of this file) to false.
	//================================================================

	//: letter ::= {"a".."z" "A".."Z"} => pass
	//: letter128 ::= {225..250 193..218} =>
	public char sub128(char orig) {
		return (char)(orig-128);
	}
	//: digit ::= {"0".."9"} => pass
	//: digit128 ::= {176..185} => char sub128(char)
	//: any ::= {0..127} => pass
	//: any128 ::= {128..255} => char sub128(char)
	//: ws ::= " "
	//: ws ::= {10} registerNewline
	//: registerNewline ::= # => void registerNewline(int)
	//: `boolean ::= "#bo" ws*
	//: `class ::= "#cl" ws*
	//: `extends ::= "#ex" ws*
	//: `void ::= "#vo" ws*
	//: `int ::= "#it" ws*
	//: `while ::= "#wh" ws*
	//: `if ::= '#+' ws*
	//: `else ::= "#el" ws*
	//: `for ::= "#fo" ws*
	//: `break ::= "#br" ws*
	//: `this ::= "#th" ws*
	//: `false ::= '#fa' ws*
	//: `true ::= "#tr" ws*
	//: `super ::= "#su" ws*
	//: `null ::= "#nu" ws*
	//: `return ::= "#re" ws*
	//: `instanceof ::= "#in" ws*
	//: `new ::= "#ne" ws*
	//: `abstract ::= "#ab" ws*
	//: `assert ::= "#as" ws*
	//: `byte ::= "#by" ws*
	//: `case ::= "#ce" ws*
	//: `catch ::= "#ca" ws*
	//: `char ::= "#ch" ws*
	//: `const ::= "#ct" ws*
	//: `continue ::= "#co" ws*
	//: `default ::= "#de" ws*
	//: `do ::= "#-" ws*
	//: `double ::= "#do" ws*
	//: `enum ::= "#en" ws*
	//: `final ::= "#fi" ws*
	//: `finally ::= "#fy" ws*
	//: `float ::= "#fl" ws*
	//: `goto ::= "#go" ws*
	//: `implements ::= "#is" ws*
	//: `import ::= "#im" ws*
	//: `interface ::= "#ie" ws*
	//: `long ::= "#lo" ws*
	//: `native ::= "#na" ws*
	//: `package ::= "#pa" ws*
	//: `private ::= "#pr" ws*
	//: `protected ::= "#pd" ws*
	//: `public ::= "#pu" ws*
	//: `short ::= "#sh" ws*
	//: `static ::= '#sc' ws*
	//: `strictfp ::= "#st" ws*
	//: `switch ::= "#sw" ws*
	//: `synchronized ::= "#sy" ws*
	//: `throw ::= "#tw" ws*
	//: `throws ::= "#ts" ws*
	//: `transient ::= "#tt" ws*
	//: `try ::= "#ty" ws*
	//: `volatile ::= "#ve" ws*
	
	//: `! ::=  "!" ws* => void
	//: `!= ::=  "@!" ws* => void
	//: `% ::= "%" ws* => void
	//: `&& ::= "@&" ws* => void
	//: `* ::= "*" ws* => void
	//: `( ::= "(" ws* => void
	//: `) ::= ")" ws* => void
	//: `{ ::= "{" ws* => void
	//: `} ::= "}" ws* => void
	//: `- ::= "-" ws* => void
	//: `+ ::= "+" ws* => void
	//: `= ::= "=" ws* => void
	//: `== ::= "@=" ws* => void
	//: `[ ::= "[" ws* => void
	//: `] ::= "]" ws* => void
	//: `|| ::= "@|" ws* => void
	//: `< ::= "<" ws* => void
	//: `<= ::= "@<" ws* => void
	//: `, ::= "," ws* => void
	//: `> ::= ">"  !'=' ws* => void
	//: `>= ::= "@>" ws* => void
	//: `: ::= ":" ws* => void
	//: `. ::= "." ws* => void
	//: `; ::= ";" ws* => void
	//: `++ ::= "@+" ws* => void
	//: `-- ::= "@-" ws* => void
	//: `/ ::= "/" ws* => void

	
	//: ID ::= letter128 ws* => text
	//: ID ::= letter idChar* idChar128 ws* => text
	
	//: INTLIT ::= {"1".."9"} digit* digit128 ws* => 
	public int convertToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last);
	}
	//: INTLIT ::= digit128 ws* => 
	public int convertToInt(char c) {
		return Integer.parseInt(""+c);
	}
	//: INTLIT ::= "0" hexDigit* hexDigit128 ws* => 
	public int convert16ToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last, 16);
	}
	//: STRINGLIT ::= '@"' ws* =>
	public String emptyString(char x, char xx) {
		return "";
	}
	//: STRINGLIT ::= '"' any* any128 ws* =>
	public String string(char x, List<Character> mid, char last) {
		return ""+mid+last;
	}
	//: CHARLIT ::= "'" any ws* =>
	public int charVal(char x, char val) {
		return val;
	}
	
	//: idChar ::= letter => pass
	//: idChar ::= digit => pass
	//: idChar ::= "_" => pass
	//: idChar128 ::= letter128 => pass
	//: idChar128 ::= digit128 => pass
	//: idChar128 ::= {223} => 
	public char underscore(char x) {
		return '_';
	}
	//: hexDigit ::= {"0".."9" "a".."z" "A".."Z"} => pass
	//: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}

