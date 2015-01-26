package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 172; }
public int getNttSym() { return 173; }
private String[] symNameTable = {
"$$start",
"start",
"ws*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"ID",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"\"c\"",
"\"l\"",
"\"a\"",
"\"s\"",
"idChar",
"reserved",
"\"e\"",
"\"b\"",
"\"o\"",
"\"n\"",
"\"r\"",
"\"k\"",
"\"x\"",
"\"t\"",
"\"d\"",
"\"f\"",
"\"i\"",
"\"w\"",
"\"u\"",
"\"p\"",
"\"h\"",
"\"v\"",
"\"y\"",
"\"m\"",
"\"g\"",
"\"z\"",
"\"!\"",
"\"=\"",
"\"%\"",
"\"&\"",
"\"(\"",
"\")\"",
"\"*\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\"/\"",
"\";\"",
"\"<\"",
"\">\"",
"\"[\"",
"\"]\"",
"\"{\"",
"\"}\"",
"\"|\"",
"intLit2",
"\"0\"",
"digit++",
"letter",
"digit",
"\"_\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"{\"1\"..\"9\"}",
"printableChar",
"{\"#\"..\"$\" \":\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
"\" \"",
"\"\\\"",
"\"\'\"",
"\'\"\'",
"ws",
"9",
"eol",
"singleLineComment",
"multiLineComment",
"10",
"13",
"idChar**",
"$$1",
"validStringCharacter**",
"$$2",
"validStringCharacter",
"printableChar**",
"multiLineCommentStart",
"multiLineCommentEnd",
"commentSymbol",
"commentContent",
"commentContent**",
"commentContent*",
"validStringCharacter*",
"idChar*",
"printableChar*",
"token*",
"digit+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 174;}
private static final int MIN_REDUCTION = 1574;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
0x80000000|522, // match move
0x80000000|995, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1
102,637, // "d"
  }
,
{ // state 2
  }
,
{ // state 3
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+154, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+154, // $
MIN_REDUCTION+154, // $NT
  }
,
{ // state 4
0x80000000|1367, // match move
0x80000000|100, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 5
0x80000000|766, // match move
0x80000000|292, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 6
2,1273, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 7
0x80000000|1384, // match move
0x80000000|836, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 8
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+283, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+283, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 9
2,284, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 10
-1, // $$start
-1, // start
403, // ws*
-1, // $$0
MIN_REDUCTION+250, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+250, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 11
98,989, // "r"
  }
,
{ // state 12
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+275, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+275, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 13
173,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 14
2,156, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 15
0x80000000|586, // match move
0x80000000|956, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 16
0x80000000|980, // match move
0x80000000|1426, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 17
90,1568, // "a"
  }
,
{ // state 18
99,1224, // "k"
  }
,
{ // state 19
0x80000000|821, // match move
0x80000000|1486, // no-match move
0x80000000|1139, // NT-test-match state for digit
  }
,
{ // state 20
0x80000000|2, // match move
0x80000000|1319, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 21
98,379, // "r"
  }
,
{ // state 22
0x80000000|976, // match move
0x80000000|1346, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 23
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 25
0x80000000|6, // match move
0x80000000|810, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 26
2,1345, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 27
0x80000000|229, // match move
0x80000000|772, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 28
88,751, // "c"
  }
,
{ // state 29
0x80000000|320, // match move
0x80000000|651, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 30
101,58, // "t"
  }
,
{ // state 31
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 33
0x80000000|2, // match move
0x80000000|758, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 34
0x80000000|1124, // match move
0x80000000|1272, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 35
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 36
-1, // $$start
-1, // start
964, // ws*
-1, // $$0
MIN_REDUCTION+278, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
-1, // `=
-1, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
MIN_REDUCTION+278, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+278, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 37
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 38
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+297, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+297, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 39
2,859, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 40
2,928, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 41
101,251, // "t"
  }
,
{ // state 42
173,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 43
173,MIN_REDUCTION+153, // $NT
  }
,
{ // state 44
0x80000000|953, // match move
0x80000000|1258, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 45
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 46
0x80000000|1452, // match move
0x80000000|1269, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 47
0x80000000|1116, // match move
0x80000000|725, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 48
0x80000000|533, // match move
0x80000000|1481, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 49
173,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 50
0x80000000|498, // match move
0x80000000|1394, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 51
2,370, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 52
2,206, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 53
0x80000000|2, // match move
0x80000000|426, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 54
0x80000000|1300, // match move
0x80000000|597, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 55
-1, // $$start
-1, // start
1177, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+137, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+137, // "k"
MIN_REDUCTION+137, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+137, // "u"
1398, // "p"
MIN_REDUCTION+137, // "h"
1282, // "v"
MIN_REDUCTION+137, // "y"
MIN_REDUCTION+137, // "m"
1030, // "g"
MIN_REDUCTION+137, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+137, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+137, // {"A".."Z" "j" "q"}
MIN_REDUCTION+137, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 56
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 58
103,458, // "f"
  }
,
{ // state 59
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 61
173,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 63
173,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 64
-1, // $$start
-1, // start
44, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+143, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+143, // "k"
MIN_REDUCTION+143, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+143, // "u"
1398, // "p"
MIN_REDUCTION+143, // "h"
1282, // "v"
MIN_REDUCTION+143, // "y"
MIN_REDUCTION+143, // "m"
1030, // "g"
MIN_REDUCTION+143, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+143, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+143, // {"A".."Z" "j" "q"}
MIN_REDUCTION+143, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 65
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 66
0x80000000|9, // match move
0x80000000|1410, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 67
2,763, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 69
2,1105, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 70
0x80000000|2, // match move
0x80000000|1386, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 71
173,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 72
0x80000000|333, // match move
0x80000000|3, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 73
173,MIN_REDUCTION+183, // $NT
  }
,
{ // state 74
0x80000000|1266, // match move
0x80000000|1118, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 75
0x80000000|481, // match move
0x80000000|978, // no-match move
0x80000000|897, // NT-test-match state for printableChar
  }
,
{ // state 76
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 77
101,289, // "t"
  }
,
{ // state 78
0x80000000|1350, // match move
0x80000000|165, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 79
2,588, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 81
101,70, // "t"
  }
,
{ // state 82
173,MIN_REDUCTION+213, // $NT
  }
,
{ // state 83
2,655, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 84
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 85
2,633, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 86
97,1115, // "n"
  }
,
{ // state 87
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 88
106,1043, // "u"
  }
,
{ // state 89
2,436, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 92
2,433, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 93
0x80000000|361, // match move
0x80000000|712, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 94
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 95
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 96
0x80000000|411, // match move
0x80000000|1009, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 97
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 98
0x80000000|1136, // match move
0x80000000|1219, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 99
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 100
-1, // $$start
-1, // start
854, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+158, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+158, // "k"
MIN_REDUCTION+158, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+158, // "u"
1398, // "p"
MIN_REDUCTION+158, // "h"
1282, // "v"
MIN_REDUCTION+158, // "y"
MIN_REDUCTION+158, // "m"
1030, // "g"
MIN_REDUCTION+158, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+158, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+158, // {"A".."Z" "j" "q"}
MIN_REDUCTION+158, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 101
0x80000000|2, // match move
0x80000000|886, // no-match move
0x80000000|389, // NT-test-match state for commentSymbol
  }
,
{ // state 102
-1, // $$start
-1, // start
370, // ws*
-1, // $$0
MIN_REDUCTION+284, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+284, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 103
173,MIN_REDUCTION+305, // $NT
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 104
0x80000000|1018, // match move
0x80000000|514, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 105
98,81, // "r"
  }
,
{ // state 106
0x80000000|817, // match move
0x80000000|66, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 107
0x80000000|2, // match move
0x80000000|1249, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 108
173,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 109
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 110
173,MIN_REDUCTION+243, // $NT
  }
,
{ // state 111
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 112
2,1309, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 113
2,433, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 114
97,1479, // "n"
  }
,
{ // state 115
4,1159, // token
58,800, // `!
59,1553, // `!=
60,746, // `%
61,1217, // `&&
62,542, // `*
63,91, // `(
64,23, // `)
65,881, // `{
66,1366, // `}
67,1554, // `-
68,579, // `+
69,861, // `=
70,1070, // `==
71,972, // `[
72,802, // `]
73,445, // `||
74,615, // `<
75,351, // `<=
76,1252, // `,
77,186, // `>
78,532, // `>=
79,57, // `.
80,926, // `;
81,62, // `++
82,1500, // `--
84,919, // ID
85,541, // INTLIT
86,207, // STRINGLIT
87,1441, // CHARLIT
120,25, // "*"
134,642, // intLit2
136,264, // digit++
137,338, // letter
138,624, // digit
171,118, // digit+
  }
,
{ // state 116
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 117
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 118
0x80000000|1245, // match move
0x80000000|759, // no-match move
0x80000000|1139, // NT-test-match state for digit
  }
,
{ // state 119
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 120
-1, // $$start
-1, // start
438, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+89, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+89, // "k"
MIN_REDUCTION+89, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+89, // "u"
1398, // "p"
MIN_REDUCTION+89, // "h"
1282, // "v"
MIN_REDUCTION+89, // "y"
MIN_REDUCTION+89, // "m"
1030, // "g"
MIN_REDUCTION+89, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+89, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+89, // {"A".."Z" "j" "q"}
MIN_REDUCTION+89, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 121
89,1066, // "l"
  }
,
{ // state 122
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 123
0x80000000|152, // match move
0x80000000|690, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 124
173,MIN_REDUCTION+120, // $NT
  }
,
{ // state 125
-1, // $$start
-1, // start
1493, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+230, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+230, // "k"
MIN_REDUCTION+230, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+230, // "u"
1398, // "p"
MIN_REDUCTION+230, // "h"
1282, // "v"
MIN_REDUCTION+230, // "y"
MIN_REDUCTION+230, // "m"
1030, // "g"
MIN_REDUCTION+230, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+230, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+230, // {"A".."Z" "j" "q"}
MIN_REDUCTION+230, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 126
0x80000000|2, // match move
0x80000000|1444, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 127
-1, // $$start
-1, // start
418, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+92, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+92, // "k"
MIN_REDUCTION+92, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+92, // "u"
1398, // "p"
MIN_REDUCTION+92, // "h"
1282, // "v"
MIN_REDUCTION+92, // "y"
MIN_REDUCTION+92, // "m"
1030, // "g"
MIN_REDUCTION+92, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+92, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+92, // {"A".."Z" "j" "q"}
MIN_REDUCTION+92, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 128
0x80000000|1059, // match move
0x80000000|538, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 129
173,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 130
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 131
94,1470, // "e"
  }
,
{ // state 132
96,653, // "o"
98,184, // "r"
110,1416, // "y"
  }
,
{ // state 133
2,1230, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
155,950, // idChar**
156,1463, // $$1
161,994, // multiLineCommentStart
168,716, // idChar*
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 134
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+281, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+281, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 135
0x80000000|1064, // match move
0x80000000|1317, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 136
94,488, // "e"
  }
,
{ // state 137
101,126, // "t"
  }
,
{ // state 138
101,679, // "t"
  }
,
{ // state 139
0x80000000|94, // match move
0x80000000|695, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 140
0x80000000|830, // match move
0x80000000|986, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 141
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 142
0x80000000|1457, // match move
0x80000000|784, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 143
0x80000000|67, // match move
0x80000000|1143, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 144
0x80000000|1567, // match move
0x80000000|457, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 145
0x80000000|1322, // match move
0x80000000|1520, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 146
96,607, // "o"
  }
,
{ // state 147
173,MIN_REDUCTION+174, // $NT
  }
,
{ // state 148
90,303, // "a"
  }
,
{ // state 149
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 151
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+255, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+255, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 152
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 154
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 155
0x80000000|167, // match move
0x80000000|453, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 156
0x80000000|1389, // match move
0x80000000|1321, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 157
0x80000000|891, // match move
0x80000000|496, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 158
173,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 159
0x80000000|1527, // match move
0x80000000|72, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 160
0x80000000|2, // match move
0x80000000|985, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 161
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+202, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+202, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+202, // $
MIN_REDUCTION+202, // $NT
  }
,
{ // state 162
0x80000000|245, // match move
0x80000000|1514, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 163
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 164
173,MIN_REDUCTION+240, // $NT
  }
,
{ // state 165
-1, // $$start
-1, // start
191, // ws*
-1, // $$0
MIN_REDUCTION+264, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+264, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 166
0x80000000|627, // match move
0x80000000|1400, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 167
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 168
0x80000000|2, // match move
0x80000000|831, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 169
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+151, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+151, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+151, // $
MIN_REDUCTION+151, // $NT
  }
,
{ // state 170
2,1505, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 171
0x80000000|1150, // match move
0x80000000|1316, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 172
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 173
101,553, // "t"
  }
,
{ // state 174
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 175
-1, // $$start
-1, // start
697, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+113, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+113, // "k"
MIN_REDUCTION+113, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+113, // "u"
1398, // "p"
MIN_REDUCTION+113, // "h"
1282, // "v"
MIN_REDUCTION+113, // "y"
MIN_REDUCTION+113, // "m"
1030, // "g"
MIN_REDUCTION+113, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+113, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+113, // {"A".."Z" "j" "q"}
MIN_REDUCTION+113, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 176
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+190, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+190, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+190, // $
MIN_REDUCTION+190, // $NT
  }
,
{ // state 177
0x80000000|2, // match move
0x80000000|1498, // no-match move
// T-test match for {'"' "\"}:
145,
147,
  }
,
{ // state 178
0x80000000|1442, // match move
0x80000000|1373, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 179
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 180
173,MIN_REDUCTION+308, // $NT
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 181
99,483, // "k"
  }
,
{ // state 182
0x80000000|1089, // match move
0x80000000|512, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 183
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+175, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+175, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+175, // $
MIN_REDUCTION+175, // $NT
  }
,
{ // state 184
94,1502, // "e"
  }
,
{ // state 185
0x80000000|815, // match move
0x80000000|1285, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 186
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 187
-1, // $$start
-1, // start
833, // ws*
-1, // $$0
MIN_REDUCTION+358, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+358, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+358, // $
-1, // $NT
  }
,
{ // state 188
2,171, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 189
2,588, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 190
0x80000000|1044, // match move
0x80000000|64, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 191
0x80000000|1417, // match move
0x80000000|304, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 192
0x80000000|1351, // match move
0x80000000|867, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 193
91,1342, // "s"
  }
,
{ // state 194
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 196
0x80000000|783, // match move
0x80000000|1069, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 197
104,1075, // "i"
  }
,
{ // state 198
2,1157, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 199
0x80000000|95, // match move
0x80000000|805, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 200
0x80000000|449, // match move
0x80000000|127, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 201
2,7, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 203
2,566, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 204
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 205
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+169, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+169, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+169, // $
MIN_REDUCTION+169, // $NT
  }
,
{ // state 206
0x80000000|355, // match move
0x80000000|1357, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 207
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 208
0x80000000|2, // match move
0x80000000|1547, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 209
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 210
95,860, // "b"
  }
,
{ // state 211
0x80000000|1134, // match move
0x80000000|1543, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 212
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 213
150,345, // eol
153,325, // {10}
154,257, // {13}
  }
,
{ // state 214
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 216
0x80000000|2, // match move
0x80000000|1325, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 217
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 218
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 219
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+157, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+157, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+157, // $
MIN_REDUCTION+157, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 220
2,417, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 221
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 222
0x80000000|605, // match move
0x80000000|1161, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 223
0x80000000|1172, // match move
0x80000000|935, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 224
173,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 225
173,MIN_REDUCTION+304, // $NT
  }
,
{ // state 226
89,773, // "l"
  }
,
{ // state 227
2,576, // ws*
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 228
98,1343, // "r"
104,917, // "i"
  }
,
{ // state 229
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 230
0x80000000|775, // match move
0x80000000|1353, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 231
173,MIN_REDUCTION+309, // $NT
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 234
1,520, // start
2,275, // ws*
3,1056, // $$0
4,1031, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
88,900, // "c"
89,1420, // "l"
90,1428, // "a"
91,378, // "s"
94,1212, // "e"
95,132, // "b"
97,863, // "n"
98,606, // "r"
101,480, // "t"
102,631, // "d"
103,1569, // "f"
104,731, // "i"
105,737, // "w"
107,1398, // "p"
109,1282, // "v"
112,1030, // "g"
170,742, // token*
172,MIN_REDUCTION+1, // $
  }
,
{ // state 235
173,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 236
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+259, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+259, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 237
0x80000000|1225, // match move
0x80000000|1095, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 238
88,822, // "c"
89,822, // "l"
90,822, // "a"
91,822, // "s"
92,1363, // idChar
94,822, // "e"
95,822, // "b"
96,822, // "o"
97,822, // "n"
98,822, // "r"
99,822, // "k"
100,822, // "x"
101,822, // "t"
102,822, // "d"
103,822, // "f"
104,822, // "i"
105,822, // "w"
106,822, // "u"
107,822, // "p"
108,822, // "h"
109,822, // "v"
110,822, // "y"
111,822, // "m"
112,822, // "g"
113,822, // "z"
135,883, // "0"
137,178, // letter
138,430, // digit
139,1368, // "_"
140,822, // {"A".."Z" "j" "q"}
141,883, // {"1".."9"}
155,950, // idChar**
168,716, // idChar*
  }
,
{ // state 239
0x80000000|2, // match move
0x80000000|316, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 240
173,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 241
-1, // $$start
-1, // start
1345, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+215, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+215, // "k"
MIN_REDUCTION+215, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+215, // "u"
1398, // "p"
MIN_REDUCTION+215, // "h"
1282, // "v"
MIN_REDUCTION+215, // "y"
MIN_REDUCTION+215, // "m"
1030, // "g"
MIN_REDUCTION+215, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+215, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+215, // {"A".."Z" "j" "q"}
MIN_REDUCTION+215, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 242
0x80000000|233, // match move
0x80000000|38, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 243
173,MIN_REDUCTION+207, // $NT
  }
,
{ // state 244
104,1301, // "i"
  }
,
{ // state 245
123,516, // "-"
  }
,
{ // state 246
0x80000000|459, // match move
0x80000000|479, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 247
173,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 248
0x80000000|332, // match move
0x80000000|254, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 249
101,1169, // "t"
  }
,
{ // state 250
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 251
91,1311, // "s"
  }
,
{ // state 252
0x80000000|1154, // match move
0x80000000|478, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 253
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 254
-1, // $$start
-1, // start
1387, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+200, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+200, // "k"
MIN_REDUCTION+200, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+200, // "u"
1398, // "p"
MIN_REDUCTION+200, // "h"
1282, // "v"
MIN_REDUCTION+200, // "y"
MIN_REDUCTION+200, // "m"
1030, // "g"
MIN_REDUCTION+200, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+200, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+200, // {"A".."Z" "j" "q"}
MIN_REDUCTION+200, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 255
139,MIN_REDUCTION+303, // "_"
155,MIN_REDUCTION+303, // idChar**
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 256
97,1111, // "n"
  }
,
{ // state 257
0x80000000|1555, // match move
0x80000000|334, // no-match move
// T-test match for 10:
153,
  }
,
{ // state 258
0x80000000|525, // match move
0x80000000|820, // no-match move
0x80000000|295, // NT-test-match state for validStringCharacter
  }
,
{ // state 259
0x80000000|1209, // match move
0x80000000|413, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 260
104,1077, // "i"
108,244, // "h"
  }
,
{ // state 261
0x80000000|1222, // match move
0x80000000|1550, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 262
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 263
173,MIN_REDUCTION+216, // $NT
  }
,
{ // state 264
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 265
101,33, // "t"
  }
,
{ // state 266
106,1247, // "u"
  }
,
{ // state 267
2,34, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 268
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+223, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+223, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+223, // $
MIN_REDUCTION+223, // $NT
  }
,
{ // state 269
2,313, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 270
0x80000000|2, // match move
0x80000000|50, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 271
173,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 272
0x80000000|907, // match move
0x80000000|10, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 273
2,576, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 274
101,443, // "t"
  }
,
{ // state 275
0x80000000|270, // match move
0x80000000|1076, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 276
0x80000000|676, // match move
0x80000000|563, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 277
0x80000000|112, // match move
0x80000000|1355, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 278
0x80000000|1068, // match move
0x80000000|852, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 279
0x80000000|2, // match move
0x80000000|1112, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 280
0x80000000|37, // match move
0x80000000|1541, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 281
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+115, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+115, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+115, // $
MIN_REDUCTION+115, // $NT
  }
,
{ // state 282
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 283
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+139, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+139, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+139, // $
MIN_REDUCTION+139, // $NT
  }
,
{ // state 284
0x80000000|1234, // match move
0x80000000|734, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 285
0x80000000|873, // match move
0x80000000|780, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 286
0x80000000|381, // match move
0x80000000|1538, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 287
0x80000000|745, // match move
0x80000000|80, // no-match move
0x80000000|1139, // NT-test-match state for digit
  }
,
{ // state 288
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 289
94,901, // "e"
  }
,
{ // state 290
103,472, // "f"
  }
,
{ // state 291
0x80000000|583, // match move
0x80000000|1472, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 292
0x80000000|729, // match move
0x80000000|1308, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 293
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 295
0x80000000|2, // match move
0x80000000|527, // no-match move
// T-test match for {'"' "\"}:
145,
147,
  }
,
{ // state 296
173,MIN_REDUCTION+171, // $NT
  }
,
{ // state 297
173,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 298
0x80000000|1167, // match move
0x80000000|877, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 299
2,157, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 300
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 301
0x80000000|1137, // match move
0x80000000|1434, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 302
0x80000000|234, // match move
0x80000000|940, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 303
97,1265, // "n"
  }
,
{ // state 304
0x80000000|589, // match move
0x80000000|1292, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 305
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 306
-1, // $$start
-1, // start
27, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+203, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+203, // "k"
MIN_REDUCTION+203, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+203, // "u"
1398, // "p"
MIN_REDUCTION+203, // "h"
1282, // "v"
MIN_REDUCTION+203, // "y"
MIN_REDUCTION+203, // "m"
1030, // "g"
MIN_REDUCTION+203, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+203, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+203, // {"A".."Z" "j" "q"}
MIN_REDUCTION+203, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 307
0x80000000|273, // match move
0x80000000|1534, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 308
96,114, // "o"
  }
,
{ // state 309
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 310
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+319, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+319, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+319, // $
-1, // $NT
  }
,
{ // state 311
0x80000000|747, // match move
0x80000000|365, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 312
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 313
0x80000000|717, // match move
0x80000000|223, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 314
0x80000000|529, // match move
0x80000000|1256, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 315
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 316
0x80000000|846, // match move
0x80000000|1114, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 317
173,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 318
173,MIN_REDUCTION+210, // $NT
  }
,
{ // state 319
-1, // $$start
-1, // start
1273, // ws*
-1, // $$0
MIN_REDUCTION+260, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+260, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 320
2,964, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 321
-1, // $$start
-1, // start
576, // ws*
-1, // $$0
MIN_REDUCTION+248, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
-1, // `=
-1, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
MIN_REDUCTION+248, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+248, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 322
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 323
101,925, // "t"
  }
,
{ // state 324
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+118, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 325
173,MIN_REDUCTION+310, // $NT
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 326
111,482, // "m"
  }
,
{ // state 327
0x80000000|1242, // match move
0x80000000|1197, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 328
5,1088, // `boolean
6,944, // `class
7,1013, // `extends
8,1003, // `void
9,475, // `int
10,678, // `while
11,1035, // `if
12,733, // `else
13,825, // `for
14,1413, // `break
15,878, // `this
16,420, // `false
17,841, // `true
18,1414, // `super
19,596, // `null
20,1033, // `return
21,1549, // `instanceof
22,124, // `new
23,427, // `abstract
24,795, // `assert
25,43, // `byte
26,1223, // `case
27,1459, // `catch
28,341, // `char
29,474, // `const
30,1240, // `continue
31,296, // `default
32,147, // `do
33,724, // `double
34,610, // `enum
35,73, // `final
36,685, // `finally
37,385, // `float
38,1419, // `goto
39,454, // `implements
40,573, // `import
41,394, // `interface
42,882, // `long
43,243, // `native
44,318, // `package
45,82, // `private
46,263, // `protected
47,406, // `public
48,1508, // `short
49,1117, // `static
50,1542, // `strictfp
51,1378, // `switch
52,930, // `synchronized
53,634, // `throw
54,1415, // `throws
55,164, // `transient
56,110, // `try
57,1318, // `volatile
88,900, // "c"
89,1420, // "l"
90,1428, // "a"
91,378, // "s"
94,1212, // "e"
95,132, // "b"
97,863, // "n"
98,606, // "r"
101,480, // "t"
102,631, // "d"
103,1569, // "f"
104,731, // "i"
105,737, // "w"
107,1398, // "p"
109,1282, // "v"
112,1030, // "g"
  }
,
{ // state 329
0x80000000|1352, // match move
0x80000000|1512, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 330
0x80000000|797, // match move
0x80000000|756, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 331
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 332
2,1387, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 333
173,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 334
173,MIN_REDUCTION+312, // $NT
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 336
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 337
108,998, // "h"
  }
,
{ // state 338
0x80000000|238, // match move
0x80000000|535, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 339
2,1309, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 340
0x80000000|85, // match move
0x80000000|703, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 341
173,MIN_REDUCTION+162, // $NT
  }
,
{ // state 342
0x80000000|993, // match move
0x80000000|1237, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 343
2,818, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 344
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+130, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+130, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+130, // $
MIN_REDUCTION+130, // $NT
  }
,
{ // state 345
173,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 346
0x80000000|71, // match move
0x80000000|996, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 347
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+214, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+214, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+214, // $
MIN_REDUCTION+214, // $NT
  }
,
{ // state 348
90,1296, // "a"
  }
,
{ // state 349
0x80000000|799, // match move
0x80000000|1551, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 350
2,1023, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 352
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 353
94,208, // "e"
  }
,
{ // state 354
2,833, // ws*
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 355
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 356
0x80000000|149, // match move
0x80000000|1162, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 357
0x80000000|689, // match move
0x80000000|965, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 358
0x80000000|868, // match move
0x80000000|78, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 359
105,770, // "w"
  }
,
{ // state 360
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 361
173,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 362
0x80000000|322, // match move
0x80000000|616, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 363
-1, // $$start
-1, // start
7, // ws*
-1, // $$0
MIN_REDUCTION+252, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+252, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 364
0x80000000|2, // match move
0x80000000|1484, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 365
0x80000000|1544, // match move
0x80000000|169, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 366
91,1516, // "s"
  }
,
{ // state 367
2,622, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 368
112,1488, // "g"
  }
,
{ // state 369
0x80000000|1422, // match move
0x80000000|211, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 370
0x80000000|571, // match move
0x80000000|1156, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 371
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 372
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 373
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 374
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 375
173,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 376
0x80000000|668, // match move
0x80000000|268, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 377
0x80000000|621, // match move
0x80000000|913, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 378
101,1189, // "t"
105,693, // "w"
106,1261, // "u"
108,1503, // "h"
110,1108, // "y"
  }
,
{ // state 379
97,1305, // "n"
  }
,
{ // state 380
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 381
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 382
88,181, // "c"
  }
,
{ // state 383
0x80000000|2, // match move
0x80000000|54, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 384
0x80000000|154, // match move
0x80000000|1021, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 385
173,MIN_REDUCTION+189, // $NT
  }
,
{ // state 386
0x80000000|1393, // match move
0x80000000|1155, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 387
2,964, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 388
0x80000000|599, // match move
0x80000000|74, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 389
120,497, // "*"
125,1176, // "/"
161,781, // multiLineCommentStart
162,548, // multiLineCommentEnd
  }
,
{ // state 390
109,572, // "v"
  }
,
{ // state 391
4,1159, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
  }
,
{ // state 392
146,567, // "'"
  }
,
{ // state 393
0x80000000|905, // match move
0x80000000|401, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 394
173,MIN_REDUCTION+201, // $NT
  }
,
{ // state 395
89,137, // "l"
  }
,
{ // state 396
0x80000000|889, // match move
0x80000000|893, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 397
2,1526, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 398
91,526, // "s"
  }
,
{ // state 399
2,1120, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 400
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 401
0x80000000|224, // match move
0x80000000|281, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 402
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+184, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+184, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+184, // $
MIN_REDUCTION+184, // $NT
  }
,
{ // state 403
0x80000000|648, // match move
0x80000000|580, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 404
120,139, // "*"
125,75, // "/"
  }
,
{ // state 405
-1, // $$start
-1, // start
330, // ws*
-1, // $$0
MIN_REDUCTION+256, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+256, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 406
173,MIN_REDUCTION+126, // $NT
  }
,
{ // state 407
0x80000000|189, // match move
0x80000000|1390, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 408
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 409
-1, // $$start
-1, // start
34, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+242, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+242, // "k"
MIN_REDUCTION+242, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+242, // "u"
1398, // "p"
MIN_REDUCTION+242, // "h"
1282, // "v"
MIN_REDUCTION+242, // "y"
MIN_REDUCTION+242, // "m"
1030, // "g"
MIN_REDUCTION+242, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+242, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+242, // {"A".."Z" "j" "q"}
MIN_REDUCTION+242, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 410
0x80000000|1499, // match move
0x80000000|1174, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 411
2,782, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 412
0x80000000|391, // match move
0x80000000|564, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 413
0x80000000|1194, // match move
0x80000000|509, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 414
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 415
3,1203, // $$0
4,1031, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
170,742, // token*
  }
,
{ // state 416
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 417
0x80000000|1170, // match move
0x80000000|683, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 418
0x80000000|1347, // match move
0x80000000|1506, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 419
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 420
173,MIN_REDUCTION+105, // $NT
  }
,
{ // state 421
0x80000000|2, // match move
0x80000000|1306, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 422
0x80000000|468, // match move
0x80000000|310, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 423
-1, // $$start
-1, // start
973, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+155, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+155, // "k"
MIN_REDUCTION+155, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+155, // "u"
1398, // "p"
MIN_REDUCTION+155, // "h"
1282, // "v"
MIN_REDUCTION+155, // "y"
MIN_REDUCTION+155, // "m"
1030, // "g"
MIN_REDUCTION+155, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+155, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+155, // {"A".."Z" "j" "q"}
MIN_REDUCTION+155, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 424
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 425
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+97, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+97, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+97, // $
MIN_REDUCTION+97, // $NT
  }
,
{ // state 426
0x80000000|1377, // match move
0x80000000|1522, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 427
173,MIN_REDUCTION+147, // $NT
  }
,
{ // state 428
0x80000000|1053, // match move
0x80000000|1259, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 429
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 430
0x80000000|916, // match move
0x80000000|1446, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 431
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 432
0x80000000|352, // match move
0x80000000|128, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 433
0x80000000|1330, // match move
0x80000000|1448, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 434
0x80000000|517, // match move
0x80000000|982, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 435
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 436
0x80000000|879, // match move
0x80000000|691, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 437
0x80000000|1264, // match move
0x80000000|490, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 438
0x80000000|1408, // match move
0x80000000|441, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 439
-1, // $$start
-1, // start
1505, // ws*
-1, // $$0
MIN_REDUCTION+298, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+298, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 440
121,1140, // "+"
  }
,
{ // state 441
0x80000000|435, // match move
0x80000000|570, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 442
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 443
94,1087, // "e"
  }
,
{ // state 444
173,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 445
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 446
0x80000000|68, // match move
0x80000000|1185, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 447
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 448
91,1339, // "s"
  }
,
{ // state 449
2,418, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 450
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+100, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+100, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+100, // $
MIN_REDUCTION+100, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 451
2,7, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 452
0x80000000|1047, // match move
0x80000000|1200, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 453
0x80000000|204, // match move
0x80000000|1478, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 454
173,MIN_REDUCTION+195, // $NT
  }
,
{ // state 455
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 456
91,503, // "s"
101,1235, // "t"
  }
,
{ // state 457
-1, // $$start
-1, // start
975, // ws*
-1, // $$0
MIN_REDUCTION+318, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+318, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
338, // letter
-1, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
MIN_REDUCTION+318, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+318, // $
-1, // $NT
  }
,
{ // state 458
107,853, // "p"
  }
,
{ // state 459
2,504, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 460
94,1504, // "e"
  }
,
{ // state 461
173,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 462
2,1515, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 463
0x80000000|203, // match move
0x80000000|1277, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 464
1,520, // start
2,275, // ws*
3,1056, // $$0
4,1031, // token
58,800, // `!
59,1553, // `!=
60,746, // `%
61,1217, // `&&
63,91, // `(
64,23, // `)
65,881, // `{
66,1366, // `}
67,1554, // `-
68,579, // `+
69,861, // `=
70,1070, // `==
71,972, // `[
72,802, // `]
73,445, // `||
74,615, // `<
75,351, // `<=
76,1252, // `,
77,186, // `>
78,532, // `>=
79,57, // `.
80,926, // `;
81,62, // `++
82,1500, // `--
83,232, // `/
84,919, // ID
85,541, // INTLIT
86,207, // STRINGLIT
87,1441, // CHARLIT
135,1523, // "0"
137,338, // letter
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
170,742, // token*
  }
,
{ // state 465
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 466
2,7, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 467
0x80000000|1323, // match move
0x80000000|1334, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 468
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 469
2,384, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 470
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 471
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 472
90,1344, // "a"
  }
,
{ // state 473
173,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 474
173,MIN_REDUCTION+165, // $NT
  }
,
{ // state 475
173,MIN_REDUCTION+117, // $NT
  }
,
{ // state 476
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 478
0x80000000|1509, // match move
0x80000000|1208, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 479
-1, // $$start
-1, // start
504, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
955, // "e"
132, // "b"
MIN_REDUCTION+116, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+116, // "k"
MIN_REDUCTION+116, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+116, // "u"
1398, // "p"
MIN_REDUCTION+116, // "h"
1282, // "v"
MIN_REDUCTION+116, // "y"
MIN_REDUCTION+116, // "m"
1030, // "g"
MIN_REDUCTION+116, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+116, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+116, // {"A".."Z" "j" "q"}
MIN_REDUCTION+116, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 480
98,843, // "r"
108,228, // "h"
  }
,
{ // state 481
88,672, // "c"
89,672, // "l"
90,672, // "a"
91,672, // "s"
94,672, // "e"
95,672, // "b"
96,672, // "o"
97,672, // "n"
98,672, // "r"
99,672, // "k"
100,672, // "x"
101,672, // "t"
102,672, // "d"
103,672, // "f"
104,672, // "i"
105,672, // "w"
106,672, // "u"
107,672, // "p"
108,672, // "h"
109,672, // "v"
110,672, // "y"
111,672, // "m"
112,672, // "g"
113,672, // "z"
114,672, // "!"
115,672, // "="
116,672, // "%"
117,672, // "&"
118,672, // "("
119,672, // ")"
120,672, // "*"
121,672, // "+"
122,672, // ","
123,672, // "-"
124,672, // "."
125,672, // "/"
126,672, // ";"
127,672, // "<"
128,672, // ">"
129,672, // "["
130,672, // "]"
131,672, // "{"
132,672, // "}"
133,672, // "|"
135,672, // "0"
139,672, // "_"
140,672, // {"A".."Z" "j" "q"}
141,672, // {"1".."9"}
142,560, // printableChar
143,672, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,672, // " "
145,672, // "\"
146,672, // "'"
147,672, // '"'
160,213, // printableChar**
169,1246, // printableChar*
  }
,
{ // state 482
94,1490, // "e"
  }
,
{ // state 483
90,368, // "a"
  }
,
{ // state 484
0x80000000|507, // match move
0x80000000|1295, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 485
0x80000000|739, // match move
0x80000000|212, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 486
2,417, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 487
108,646, // "h"
  }
,
{ // state 488
90,86, // "a"
  }
,
{ // state 489
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 490
0x80000000|1166, // match move
0x80000000|714, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 491
98,107, // "r"
  }
,
{ // state 492
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 493
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 494
0x80000000|1045, // match move
0x80000000|1028, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 495
-1, // $$start
-1, // start
566, // ws*
-1, // $$0
MIN_REDUCTION+292, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+292, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 496
0x80000000|1233, // match move
0x80000000|1123, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 497
125,297, // "/"
  }
,
{ // state 498
3,1203, // $$0
4,1031, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
170,742, // token*
  }
,
{ // state 499
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+196, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+196, // $
MIN_REDUCTION+196, // $NT
  }
,
{ // state 500
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 501
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 502
173,MIN_REDUCTION+300, // $NT
  }
,
{ // state 503
101,216, // "t"
  }
,
{ // state 504
0x80000000|305, // match move
0x80000000|393, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 505
173,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 506
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+148, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+148, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+148, // $
MIN_REDUCTION+148, // $NT
  }
,
{ // state 507
2,452, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 508
0x80000000|473, // match move
0x80000000|499, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 509
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+217, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+217, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+217, // $
MIN_REDUCTION+217, // $NT
  }
,
{ // state 510
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 511
2,912, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 512
0x80000000|851, // match move
0x80000000|658, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 513
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 514
0x80000000|235, // match move
0x80000000|709, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 515
0x80000000|1146, // match move
0x80000000|1090, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 516
0x80000000|511, // match move
0x80000000|252, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 517
2,1216, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 518
104,1015, // "i"
  }
,
{ // state 519
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 520
172,MIN_REDUCTION+0, // $
  }
,
{ // state 521
0x80000000|1435, // match move
0x80000000|1002, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 522
0x80000000|2, // match move
0x80000000|1304, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 523
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 524
2,1273, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 525
0x80000000|2, // match move
0x80000000|832, // no-match move
// T-test match for {'"' "\"}:
145,
147,
  }
,
{ // state 526
94,554, // "e"
  }
,
{ // state 527
88,103, // "c"
89,103, // "l"
90,103, // "a"
91,103, // "s"
94,103, // "e"
95,103, // "b"
96,103, // "o"
97,103, // "n"
98,103, // "r"
99,103, // "k"
100,103, // "x"
101,103, // "t"
102,103, // "d"
103,103, // "f"
104,103, // "i"
105,103, // "w"
106,103, // "u"
107,103, // "p"
108,103, // "h"
109,103, // "v"
110,103, // "y"
111,103, // "m"
112,103, // "g"
113,103, // "z"
114,103, // "!"
115,103, // "="
116,103, // "%"
117,103, // "&"
118,103, // "("
119,103, // ")"
120,103, // "*"
121,103, // "+"
122,103, // ","
123,103, // "-"
124,103, // "."
125,103, // "/"
126,103, // ";"
127,103, // "<"
128,103, // ">"
129,103, // "["
130,103, // "]"
131,103, // "{"
132,103, // "}"
133,103, // "|"
135,103, // "0"
139,103, // "_"
140,103, // {"A".."Z" "j" "q"}
141,103, // {"1".."9"}
142,1184, // printableChar
143,103, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,103, // " "
145,103, // "\"
146,103, // "'"
147,103, // '"'
  }
,
{ // state 528
0x80000000|1188, // match move
0x80000000|702, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 529
2,1505, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 530
90,1164, // "a"
  }
,
{ // state 531
2,155, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 532
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 533
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 534
0x80000000|887, // match move
0x80000000|1074, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 535
0x80000000|133, // match move
0x80000000|1439, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 536
-1, // $$start
-1, // start
1157, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+152, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+152, // "k"
MIN_REDUCTION+152, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+152, // "u"
1398, // "p"
MIN_REDUCTION+152, // "h"
1282, // "v"
MIN_REDUCTION+152, // "y"
MIN_REDUCTION+152, // "m"
1030, // "g"
MIN_REDUCTION+152, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+152, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+152, // {"A".."Z" "j" "q"}
MIN_REDUCTION+152, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 537
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 538
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+124, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+124, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+124, // $
MIN_REDUCTION+124, // $NT
  }
,
{ // state 539
-1, // $$start
-1, // start
1526, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+245, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+245, // "k"
MIN_REDUCTION+245, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+245, // "u"
1398, // "p"
MIN_REDUCTION+245, // "h"
1282, // "v"
MIN_REDUCTION+245, // "y"
MIN_REDUCTION+245, // "m"
1030, // "g"
MIN_REDUCTION+245, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+245, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+245, // {"A".."Z" "j" "q"}
MIN_REDUCTION+245, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 540
-1, // $$start
-1, // start
16, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+122, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+122, // "k"
MIN_REDUCTION+122, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+122, // "u"
1398, // "p"
MIN_REDUCTION+122, // "h"
1282, // "v"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
1030, // "g"
MIN_REDUCTION+122, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+122, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+122, // {"A".."Z" "j" "q"}
MIN_REDUCTION+122, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 541
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 542
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 543
0x80000000|462, // match move
0x80000000|1004, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 544
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 545
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 546
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 547
2,566, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 548
173,MIN_REDUCTION+331, // $NT
  }
,
{ // state 549
2,715, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 550
90,1228, // "a"
  }
,
{ // state 551
0x80000000|415, // match move
0x80000000|840, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 552
0x80000000|1020, // match move
0x80000000|425, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 553
106,21, // "u"
  }
,
{ // state 554
98,1032, // "r"
  }
,
{ // state 555
0x80000000|399, // match move
0x80000000|1518, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 556
173,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 557
0x80000000|97, // match move
0x80000000|1327, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 558
0x80000000|1213, // match move
0x80000000|665, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 559
0x80000000|471, // match move
0x80000000|123, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 560
0x80000000|662, // match move
0x80000000|1406, // no-match move
0x80000000|897, // NT-test-match state for printableChar
  }
,
{ // state 561
2,313, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 562
0x80000000|1380, // match move
0x80000000|196, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 563
-1, // $$start
-1, // start
433, // ws*
-1, // $$0
MIN_REDUCTION+320, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+320, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+320, // $
-1, // $NT
  }
,
{ // state 564
4,1159, // token
58,800, // `!
59,1553, // `!=
60,746, // `%
61,1217, // `&&
63,91, // `(
64,23, // `)
65,881, // `{
66,1366, // `}
67,1554, // `-
68,579, // `+
69,861, // `=
70,1070, // `==
71,972, // `[
72,802, // `]
73,445, // `||
74,615, // `<
75,351, // `<=
76,1252, // `,
77,186, // `>
78,532, // `>=
79,57, // `.
80,926, // `;
81,62, // `++
82,1500, // `--
83,232, // `/
84,919, // ID
85,541, // INTLIT
86,207, // STRINGLIT
87,1441, // CHARLIT
135,1523, // "0"
137,338, // letter
  }
,
{ // state 565
0x80000000|849, // match move
0x80000000|827, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 566
0x80000000|84, // match move
0x80000000|534, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 567
0x80000000|1421, // match move
0x80000000|185, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 568
0x80000000|52, // match move
0x80000000|619, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 569
2,330, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 570
0x80000000|1198, // match move
0x80000000|778, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 571
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 572
94,1566, // "e"
  }
,
{ // state 573
173,MIN_REDUCTION+198, // $NT
  }
,
{ // state 574
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 575
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 576
0x80000000|117, // match move
0x80000000|369, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 577
0x80000000|1437, // match move
0x80000000|568, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 578
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 579
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 580
0x80000000|1011, // match move
0x80000000|192, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 581
113,1226, // "z"
  }
,
{ // state 582
0x80000000|804, // match move
0x80000000|120, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 583
2,1489, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 584
0x80000000|727, // match move
0x80000000|115, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 585
97,1289, // "n"
  }
,
{ // state 586
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 587
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 588
0x80000000|373, // match move
0x80000000|1370, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 589
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 590
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 591
89,990, // "l"
104,623, // "i"
  }
,
{ // state 592
2,975, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 593
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 594
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 595
115,1453, // "="
  }
,
{ // state 596
173,MIN_REDUCTION+123, // $NT
  }
,
{ // state 597
-1, // $$start
-1, // start
1054, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+185, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+185, // "k"
MIN_REDUCTION+185, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+185, // "u"
1398, // "p"
MIN_REDUCTION+185, // "h"
1282, // "v"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
1030, // "g"
MIN_REDUCTION+185, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+185, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+185, // {"A".."Z" "j" "q"}
MIN_REDUCTION+185, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 598
173,MIN_REDUCTION+311, // $NT
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 599
2,833, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 600
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 601
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 602
164,1036, // commentContent
  }
,
{ // state 603
97,1207, // "n"
  }
,
{ // state 604
173,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 605
115,922, // "="
  }
,
{ // state 606
94,173, // "e"
  }
,
{ // state 607
90,265, // "a"
  }
,
{ // state 608
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 609
0x80000000|1537, // match move
0x80000000|301, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 610
173,MIN_REDUCTION+180, // $NT
  }
,
{ // state 611
0x80000000|404, // match move
0x80000000|1251, // no-match move
// T-test match for {"*" "/"}:
120,
125,
  }
,
{ // state 612
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 613
0x80000000|1397, // match move
0x80000000|102, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 614
1,520, // start
2,275, // ws*
3,1056, // $$0
4,1031, // token
58,800, // `!
59,1553, // `!=
60,746, // `%
61,1217, // `&&
62,542, // `*
63,91, // `(
64,23, // `)
65,881, // `{
66,1366, // `}
67,1554, // `-
68,579, // `+
69,861, // `=
70,1070, // `==
71,972, // `[
72,802, // `]
73,445, // `||
74,615, // `<
75,351, // `<=
76,1252, // `,
77,186, // `>
78,532, // `>=
79,57, // `.
80,926, // `;
81,62, // `++
82,1500, // `--
84,919, // ID
85,541, // INTLIT
86,207, // STRINGLIT
87,1441, // CHARLIT
120,25, // "*"
134,642, // intLit2
136,264, // digit++
137,338, // letter
138,624, // digit
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
170,742, // token*
171,118, // digit+
  }
,
{ // state 615
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 616
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+317, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+317, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+317, // $
-1, // $NT
  }
,
{ // state 617
1,520, // start
2,275, // ws*
3,1056, // $$0
4,1031, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
170,742, // token*
  }
,
{ // state 618
-1, // $$start
-1, // start
663, // ws*
-1, // $$0
MIN_REDUCTION+280, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+280, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 619
-1, // $$start
-1, // start
206, // ws*
-1, // $$0
MIN_REDUCTION+262, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
-1, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
-1, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+262, // "*"
MIN_REDUCTION+262, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 620
2,182, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 621
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 622
0x80000000|282, // match move
0x80000000|1545, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 623
102,239, // "d"
  }
,
{ // state 624
0x80000000|476, // match move
0x80000000|253, // no-match move
0x80000000|1139, // NT-test-match state for digit
  }
,
{ // state 625
0x80000000|682, // match move
0x80000000|754, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 626
0x80000000|158, // match move
0x80000000|1293, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 627
4,1159, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
88,900, // "c"
89,1420, // "l"
90,1428, // "a"
91,378, // "s"
94,1212, // "e"
95,132, // "b"
97,863, // "n"
98,606, // "r"
101,480, // "t"
102,631, // "d"
103,1569, // "f"
104,731, // "i"
105,737, // "w"
107,1398, // "p"
109,1282, // "v"
112,1030, // "g"
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 628
2,981, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 629
94,326, // "e"
  }
,
{ // state 630
88,719, // "c"
89,719, // "l"
90,719, // "a"
91,719, // "s"
94,719, // "e"
95,719, // "b"
96,719, // "o"
97,719, // "n"
98,719, // "r"
99,719, // "k"
100,719, // "x"
101,719, // "t"
102,719, // "d"
103,719, // "f"
104,719, // "i"
105,719, // "w"
106,719, // "u"
107,719, // "p"
108,719, // "h"
109,719, // "v"
110,719, // "y"
111,719, // "m"
112,719, // "g"
113,719, // "z"
114,719, // "!"
115,719, // "="
116,719, // "%"
117,719, // "&"
118,719, // "("
119,719, // ")"
120,719, // "*"
121,719, // "+"
122,719, // ","
123,719, // "-"
124,719, // "."
125,719, // "/"
126,719, // ";"
127,719, // "<"
128,719, // ">"
129,719, // "["
130,719, // "]"
131,719, // "{"
132,719, // "}"
133,719, // "|"
135,719, // "0"
139,719, // "_"
140,719, // {"A".."Z" "j" "q"}
141,719, // {"1".."9"}
142,485, // printableChar
143,719, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,719, // " "
145,719, // "\"
146,719, // "'"
147,719, // '"'
150,261, // eol
153,142, // {10}
154,1085, // {13}
164,1036, // commentContent
  }
,
{ // state 631
94,290, // "e"
96,968, // "o"
  }
,
{ // state 632
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 633
0x80000000|1229, // match move
0x80000000|1232, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 634
173,MIN_REDUCTION+234, // $NT
  }
,
{ // state 635
-1, // $$start
-1, // start
1561, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+125, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+125, // "k"
MIN_REDUCTION+125, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+125, // "u"
1398, // "p"
MIN_REDUCTION+125, // "h"
1282, // "v"
MIN_REDUCTION+125, // "y"
MIN_REDUCTION+125, // "m"
1030, // "g"
MIN_REDUCTION+125, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+125, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+125, // {"A".."Z" "j" "q"}
MIN_REDUCTION+125, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 636
0x80000000|967, // match move
0x80000000|1144, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 637
0x80000000|2, // match move
0x80000000|979, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 638
0x80000000|1287, // match move
0x80000000|812, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 639
0x80000000|2, // match move
0x80000000|1049, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 640
-1, // $$start
-1, // start
622, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+128, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+128, // "k"
MIN_REDUCTION+128, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+128, // "u"
1398, // "p"
MIN_REDUCTION+128, // "h"
1282, // "v"
MIN_REDUCTION+128, // "y"
MIN_REDUCTION+128, // "m"
1030, // "g"
MIN_REDUCTION+128, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+128, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+128, // {"A".."Z" "j" "q"}
MIN_REDUCTION+128, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 641
2,576, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 642
0x80000000|113, // match move
0x80000000|1183, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 643
88,822, // "c"
89,822, // "l"
90,822, // "a"
91,822, // "s"
92,957, // idChar
94,822, // "e"
95,822, // "b"
96,822, // "o"
97,822, // "n"
98,822, // "r"
99,822, // "k"
100,822, // "x"
101,822, // "t"
102,822, // "d"
103,822, // "f"
104,822, // "i"
105,822, // "w"
106,822, // "u"
107,822, // "p"
108,822, // "h"
109,822, // "v"
110,822, // "y"
111,822, // "m"
112,822, // "g"
113,822, // "z"
135,883, // "0"
137,178, // letter
138,430, // digit
139,1368, // "_"
140,822, // {"A".."Z" "j" "q"}
141,883, // {"1".."9"}
  }
,
{ // state 644
91,1324, // "s"
  }
,
{ // state 645
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 646
0x80000000|2, // match move
0x80000000|1362, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 647
2,27, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 648
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 649
101,839, // "t"
  }
,
{ // state 650
0x80000000|961, // match move
0x80000000|974, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 651
0x80000000|387, // match move
0x80000000|36, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 652
0x80000000|315, // match move
0x80000000|356, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 653
96,1445, // "o"
  }
,
{ // state 654
173,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 655
0x80000000|1163, // match move
0x80000000|5, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 656
0x80000000|794, // match move
0x80000000|1409, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 657
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 658
0x80000000|505, // match move
0x80000000|183, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 659
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+145, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+145, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+145, // $
MIN_REDUCTION+145, // $NT
  }
,
{ // state 660
0x80000000|1019, // match move
0x80000000|450, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 661
-1, // $$start
-1, // start
715, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+188, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+188, // "k"
MIN_REDUCTION+188, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+188, // "u"
1398, // "p"
MIN_REDUCTION+188, // "h"
1282, // "v"
MIN_REDUCTION+188, // "y"
MIN_REDUCTION+188, // "m"
1030, // "g"
MIN_REDUCTION+188, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+188, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+188, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 662
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 663
0x80000000|1220, // match move
0x80000000|1412, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 664
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 665
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+238, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 666
2,1273, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 667
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+244, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+244, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+244, // $
MIN_REDUCTION+244, // $NT
  }
,
{ // state 668
173,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 669
88,1275, // "c"
89,1275, // "l"
90,1275, // "a"
91,1275, // "s"
94,1275, // "e"
95,1275, // "b"
96,1275, // "o"
97,1275, // "n"
98,1275, // "r"
99,1275, // "k"
100,1275, // "x"
101,1275, // "t"
102,1275, // "d"
103,1275, // "f"
104,1275, // "i"
105,1275, // "w"
106,1275, // "u"
107,1275, // "p"
108,1275, // "h"
109,1275, // "v"
110,1275, // "y"
111,1275, // "m"
112,1275, // "g"
113,1275, // "z"
135,225, // "0"
137,502, // letter
138,793, // digit
139,723, // "_"
140,1275, // {"A".."Z" "j" "q"}
141,225, // {"1".."9"}
  }
,
{ // state 670
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+241, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+241, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+241, // $
MIN_REDUCTION+241, // $NT
  }
,
{ // state 671
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+285, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+285, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 672
0x80000000|172, // match move
0x80000000|1395, // no-match move
0x80000000|897, // NT-test-match state for printableChar
  }
,
{ // state 673
-1, // $$start
-1, // start
1105, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+218, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+218, // "k"
MIN_REDUCTION+218, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+218, // "u"
1398, // "p"
MIN_REDUCTION+218, // "h"
1282, // "v"
MIN_REDUCTION+218, // "y"
MIN_REDUCTION+218, // "m"
1030, // "g"
MIN_REDUCTION+218, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+218, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+218, // {"A".."Z" "j" "q"}
MIN_REDUCTION+218, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 674
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 675
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 676
2,433, // ws*
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 677
0x80000000|317, // match move
0x80000000|324, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 678
173,MIN_REDUCTION+144, // $NT
  }
,
{ // state 679
96,1424, // "o"
  }
,
{ // state 680
120,139, // "*"
125,75, // "/"
  }
,
{ // state 681
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+166, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+166, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+166, // $
MIN_REDUCTION+166, // $NT
  }
,
{ // state 682
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 683
0x80000000|1196, // match move
0x80000000|921, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 684
0x80000000|1133, // match move
0x80000000|931, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 685
173,MIN_REDUCTION+186, // $NT
  }
,
{ // state 686
-1, // $$start
-1, // start
-1, // ws*
1203, // $$0
1031, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
-1, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
742, // token*
118, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 687
0x80000000|855, // match move
0x80000000|1302, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 688
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 689
2,798, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 690
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+357, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+357, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+357, // $
-1, // $NT
  }
,
{ // state 691
0x80000000|65, // match move
0x80000000|298, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 692
120,497, // "*"
162,129, // multiLineCommentEnd
  }
,
{ // state 693
104,1077, // "i"
  }
,
{ // state 694
97,987, // "n"
  }
,
{ // state 695
120,MIN_REDUCTION+328, // "*"
162,MIN_REDUCTION+328, // multiLineCommentEnd
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 696
0x80000000|1291, // match move
0x80000000|1274, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 697
0x80000000|700, // match move
0x80000000|1374, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 698
0x80000000|2, // match move
0x80000000|1333, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 699
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+127, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+127, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+127, // $
MIN_REDUCTION+127, // $NT
  }
,
{ // state 700
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 701
88,103, // "c"
89,103, // "l"
90,103, // "a"
91,103, // "s"
94,103, // "e"
95,103, // "b"
96,103, // "o"
97,103, // "n"
98,103, // "r"
99,103, // "k"
100,103, // "x"
101,103, // "t"
102,103, // "d"
103,103, // "f"
104,103, // "i"
105,103, // "w"
106,103, // "u"
107,103, // "p"
108,103, // "h"
109,103, // "v"
110,103, // "y"
111,103, // "m"
112,103, // "g"
113,103, // "z"
114,103, // "!"
115,103, // "="
116,103, // "%"
117,103, // "&"
118,103, // "("
119,103, // ")"
120,103, // "*"
121,103, // "+"
122,103, // ","
123,103, // "-"
124,103, // "."
125,103, // "/"
126,103, // ";"
127,103, // "<"
128,103, // ">"
129,103, // "["
130,103, // "]"
131,103, // "{"
132,103, // "}"
133,103, // "|"
135,103, // "0"
139,103, // "_"
140,103, // {"A".."Z" "j" "q"}
141,103, // {"1".."9"}
142,392, // printableChar
143,103, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,103, // " "
145,103, // "\"
146,103, // "'"
147,103, // '"'
  }
,
{ // state 702
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+91, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+91, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+91, // $
MIN_REDUCTION+91, // $NT
  }
,
{ // state 703
-1, // $$start
-1, // start
633, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+98, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+98, // "k"
MIN_REDUCTION+98, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+98, // "u"
1398, // "p"
MIN_REDUCTION+98, // "h"
1282, // "v"
MIN_REDUCTION+98, // "y"
MIN_REDUCTION+98, // "m"
1030, // "g"
MIN_REDUCTION+98, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+98, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+98, // {"A".."Z" "j" "q"}
MIN_REDUCTION+98, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 704
2,1320, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 705
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 706
2,156, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 707
0x80000000|419, // match move
0x80000000|362, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 708
173,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 709
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+205, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+205, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+205, // $
MIN_REDUCTION+205, // $NT
  }
,
{ // state 710
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+199, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+199, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+199, // $
MIN_REDUCTION+199, // $NT
  }
,
{ // state 711
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 712
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+208, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+208, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+208, // $
MIN_REDUCTION+208, // $NT
  }
,
{ // state 713
173,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 714
0x80000000|343, // match move
0x80000000|1239, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 715
0x80000000|209, // match move
0x80000000|1250, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 716
0x80000000|643, // match move
0x80000000|90, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 717
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 718
0x80000000|42, // match move
0x80000000|176, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 719
0x80000000|1391, // match move
0x80000000|675, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 720
-1, // $$start
-1, // start
1320, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
47, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+233, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+233, // "k"
MIN_REDUCTION+233, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+233, // "u"
1398, // "p"
MIN_REDUCTION+233, // "h"
1282, // "v"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
1030, // "g"
MIN_REDUCTION+233, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+233, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+233, // {"A".."Z" "j" "q"}
MIN_REDUCTION+233, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 721
2,403, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 722
0x80000000|26, // match move
0x80000000|241, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 723
173,MIN_REDUCTION+302, // $NT
  }
,
{ // state 724
173,MIN_REDUCTION+177, // $NT
  }
,
{ // state 725
0x80000000|89, // match move
0x80000000|1563, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 726
0x80000000|741, // match move
0x80000000|577, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 727
4,1159, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
  }
,
{ // state 728
0x80000000|2, // match move
0x80000000|1251, // no-match move
// T-test match for {"*" "/"}:
120,
125,
  }
,
{ // state 729
173,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 730
0x80000000|862, // match move
0x80000000|923, // no-match move
0x80000000|389, // NT-test-match state for commentSymbol
  }
,
{ // state 731
97,960, // "n"
103,1010, // "f"
111,954, // "m"
  }
,
{ // state 732
91,803, // "s"
101,28, // "t"
  }
,
{ // state 733
173,MIN_REDUCTION+93, // $NT
  }
,
{ // state 734
0x80000000|489, // match move
0x80000000|1149, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 735
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+295, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+295, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 736
0x80000000|226, // match move
0x80000000|1202, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 737
108,244, // "h"
  }
,
{ // state 738
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 739
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 740
0x80000000|1392, // match move
0x80000000|1433, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 741
2,206, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 742
0x80000000|1411, // match move
0x80000000|1354, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 743
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 744
94,421, // "e"
  }
,
{ // state 745
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 746
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 747
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 748
91,249, // "s"
  }
,
{ // state 749
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 750
133,314, // "|"
  }
,
{ // state 751
108,1314, // "h"
  }
,
{ // state 752
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 753
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 754
0x80000000|1340, // match move
0x80000000|48, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 755
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 756
0x80000000|1175, // match move
0x80000000|1113, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 757
90,256, // "a"
104,1075, // "i"
106,353, // "u"
110,698, // "y"
  }
,
{ // state 758
0x80000000|549, // match move
0x80000000|661, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 759
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 760
3,1203, // $$0
4,1031, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
88,900, // "c"
89,1420, // "l"
90,1428, // "a"
91,378, // "s"
94,1212, // "e"
95,132, // "b"
97,863, // "n"
98,606, // "r"
101,480, // "t"
102,631, // "d"
103,1569, // "f"
104,731, // "i"
105,737, // "w"
107,1398, // "p"
109,1282, // "v"
112,1030, // "g"
170,742, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 761
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 762
2,973, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 763
0x80000000|1461, // match move
0x80000000|884, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 764
0x80000000|601, // match move
0x80000000|1348, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 765
0x80000000|556, // match move
0x80000000|205, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 766
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 767
2,452, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 768
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 769
2,1309, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 770
0x80000000|366, // match move
0x80000000|1008, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 771
-1, // $$start
-1, // start
928, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+164, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+164, // "k"
MIN_REDUCTION+164, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+164, // "u"
1398, // "p"
MIN_REDUCTION+164, // "h"
1282, // "v"
MIN_REDUCTION+164, // "y"
MIN_REDUCTION+164, // "m"
1030, // "g"
MIN_REDUCTION+164, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+164, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+164, // {"A".."Z" "j" "q"}
MIN_REDUCTION+164, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 772
0x80000000|1432, // match move
0x80000000|1326, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 773
110,383, // "y"
  }
,
{ // state 774
90,491, // "a"
  }
,
{ // state 775
2,384, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 776
0x80000000|2, // match move
0x80000000|1016, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 777
0x80000000|937, // match move
0x80000000|1465, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 778
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+88, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+88, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+88, // $
MIN_REDUCTION+88, // $NT
  }
,
{ // state 779
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 780
-1, // $$start
-1, // start
1236, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+179, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+179, // "k"
MIN_REDUCTION+179, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+179, // "u"
1398, // "p"
MIN_REDUCTION+179, // "h"
1282, // "v"
MIN_REDUCTION+179, // "y"
MIN_REDUCTION+179, // "m"
1030, // "g"
MIN_REDUCTION+179, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+179, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+179, // {"A".."Z" "j" "q"}
MIN_REDUCTION+179, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 781
173,MIN_REDUCTION+330, // $NT
  }
,
{ // state 782
0x80000000|109, // match move
0x80000000|140, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 783
2,157, // ws*
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 784
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 785
173,MIN_REDUCTION+332, // $NT
  }
,
{ // state 786
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 787
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 788
106,210, // "u"
  }
,
{ // state 789
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+277, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+277, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 790
0x80000000|1438, // match move
0x80000000|1121, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 791
2,452, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 792
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 793
173,MIN_REDUCTION+301, // $NT
  }
,
{ // state 794
2,557, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 795
173,MIN_REDUCTION+150, // $NT
  }
,
{ // state 796
0x80000000|486, // match move
0x80000000|1125, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 797
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 798
0x80000000|455, // match move
0x80000000|1338, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 799
173,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 800
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 801
0x80000000|89, // match move
0x80000000|1190, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 802
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 803
94,279, // "e"
  }
,
{ // state 804
2,438, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 805
0x80000000|870, // match move
0x80000000|1039, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 806
173,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 807
101,1062, // "t"
  }
,
{ // state 808
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 809
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 810
0x80000000|666, // match move
0x80000000|1135, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 811
94,911, // "e"
  }
,
{ // state 812
-1, // $$start
-1, // start
983, // ws*
-1, // $$0
MIN_REDUCTION+268, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
-1, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
-1, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+268, // "*"
1349, // "+"
230, // ","
MIN_REDUCTION+268, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 813
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+160, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+160, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+160, // $
MIN_REDUCTION+160, // $NT
  }
,
{ // state 814
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+142, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+142, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+142, // $
MIN_REDUCTION+142, // $NT
  }
,
{ // state 815
2,1361, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 816
0x80000000|1186, // match move
0x80000000|1466, // no-match move
// T-test match for "0":
135,
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 817
2,284, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 818
0x80000000|293, // match move
0x80000000|1405, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 819
0x80000000|431, // match move
0x80000000|1511, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 820
147,388, // '"'
157,1218, // validStringCharacter**
158,1160, // $$2
167,838, // validStringCharacter*
  }
,
{ // state 821
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 822
0x80000000|510, // match move
0x80000000|255, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 823
0x80000000|2, // match move
0x80000000|543, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 824
173,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 825
173,MIN_REDUCTION+108, // $NT
  }
,
{ // state 826
173,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 827
-1, // $$start
-1, // start
1119, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+191, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+191, // "k"
MIN_REDUCTION+191, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+191, // "u"
1398, // "p"
MIN_REDUCTION+191, // "h"
1282, // "v"
MIN_REDUCTION+191, // "y"
MIN_REDUCTION+191, // "m"
1030, // "g"
MIN_REDUCTION+191, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+191, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+191, // {"A".."Z" "j" "q"}
MIN_REDUCTION+191, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 828
0x80000000|604, // match move
0x80000000|219, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 829
2,327, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 830
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 831
0x80000000|647, // match move
0x80000000|306, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 832
88,1262, // "c"
89,1262, // "l"
90,1262, // "a"
91,1262, // "s"
94,1262, // "e"
95,1262, // "b"
96,1262, // "o"
97,1262, // "n"
98,1262, // "r"
99,1262, // "k"
100,1262, // "x"
101,1262, // "t"
102,1262, // "d"
103,1262, // "f"
104,1262, // "i"
105,1262, // "w"
106,1262, // "u"
107,1262, // "p"
108,1262, // "h"
109,1262, // "v"
110,1262, // "y"
111,1262, // "m"
112,1262, // "g"
113,1262, // "z"
114,1262, // "!"
115,1262, // "="
116,1262, // "%"
117,1262, // "&"
118,1262, // "("
119,1262, // ")"
120,1262, // "*"
121,1262, // "+"
122,1262, // ","
123,1262, // "-"
124,1262, // "."
125,1262, // "/"
126,1262, // ";"
127,1262, // "<"
128,1262, // ">"
129,1262, // "["
130,1262, // "]"
131,1262, // "{"
132,1262, // "}"
133,1262, // "|"
135,1262, // "0"
139,1262, // "_"
140,1262, // {"A".."Z" "j" "q"}
141,1262, // {"1".."9"}
142,1180, // printableChar
143,1262, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,1262, // " "
145,1262, // "\"
146,1262, // "'"
147,1262, // '"'
157,1218, // validStringCharacter**
159,1034, // validStringCharacter
167,838, // validStringCharacter*
  }
,
{ // state 833
0x80000000|1468, // match move
0x80000000|559, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 834
0x80000000|2, // match move
0x80000000|291, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 835
0x80000000|1046, // match move
0x80000000|638, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 836
0x80000000|372, // match move
0x80000000|386, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 837
0x80000000|1243, // match move
0x80000000|1307, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 838
0x80000000|177, // match move
0x80000000|1152, // no-match move
0x80000000|295, // NT-test-match state for validStringCharacter
  }
,
{ // state 839
104,1192, // "i"
  }
,
{ // state 840
3,1203, // $$0
4,1031, // token
58,800, // `!
59,1553, // `!=
60,746, // `%
61,1217, // `&&
63,91, // `(
64,23, // `)
65,881, // `{
66,1366, // `}
67,1554, // `-
68,579, // `+
69,861, // `=
70,1070, // `==
71,972, // `[
72,802, // `]
73,445, // `||
74,615, // `<
75,351, // `<=
76,1252, // `,
77,186, // `>
78,532, // `>=
79,57, // `.
80,926, // `;
81,62, // `++
82,1500, // `--
83,232, // `/
84,919, // ID
85,541, // INTLIT
86,207, // STRINGLIT
87,1441, // CHARLIT
135,1523, // "0"
137,338, // letter
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
170,742, // token*
  }
,
{ // state 841
173,MIN_REDUCTION+138, // $NT
  }
,
{ // state 842
0x80000000|69, // match move
0x80000000|673, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 843
90,256, // "a"
106,353, // "u"
110,698, // "y"
  }
,
{ // state 844
101,148, // "t"
  }
,
{ // state 845
91,823, // "s"
  }
,
{ // state 846
2,280, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 847
2,697, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 848
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 849
2,1119, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 850
0x80000000|1513, // match move
0x80000000|283, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 851
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 852
0x80000000|706, // match move
0x80000000|898, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 853
0x80000000|2, // match move
0x80000000|1091, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 854
0x80000000|1024, // match move
0x80000000|1084, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 855
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 856
173,MIN_REDUCTION+306, // $NT
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 857
104,390, // "i"
  }
,
{ // state 858
0x80000000|1337, // match move
0x80000000|1271, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 859
0x80000000|111, // match move
0x80000000|410, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 860
89,1364, // "l"
  }
,
{ // state 861
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 862
164,1376, // commentContent
165,692, // commentContent**
166,1454, // commentContent*
  }
,
{ // state 863
90,991, // "a"
94,1263, // "e"
106,121, // "u"
  }
,
{ // state 864
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+109, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+109, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+109, // $
MIN_REDUCTION+109, // $NT
  }
,
{ // state 865
2,1493, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 866
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 867
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+249, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+249, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 868
2,191, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 869
89,629, // "l"
96,105, // "o"
  }
,
{ // state 870
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 871
2,1177, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 872
2,566, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 873
2,1236, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 874
0x80000000|262, // match move
0x80000000|8, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 875
104,1215, // "i"
  }
,
{ // state 876
0x80000000|769, // match move
0x80000000|1449, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 877
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+235, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 878
173,MIN_REDUCTION+135, // $NT
  }
,
{ // state 879
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 880
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+253, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+253, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 881
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 882
173,MIN_REDUCTION+204, // $NT
  }
,
{ // state 883
0x80000000|1356, // match move
0x80000000|594, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 884
0x80000000|664, // match move
0x80000000|346, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 885
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 886
88,103, // "c"
89,103, // "l"
90,103, // "a"
91,103, // "s"
94,103, // "e"
95,103, // "b"
96,103, // "o"
97,103, // "n"
98,103, // "r"
99,103, // "k"
100,103, // "x"
101,103, // "t"
102,103, // "d"
103,103, // "f"
104,103, // "i"
105,103, // "w"
106,103, // "u"
107,103, // "p"
108,103, // "h"
109,103, // "v"
110,103, // "y"
111,103, // "m"
112,103, // "g"
113,103, // "z"
114,103, // "!"
115,103, // "="
116,103, // "%"
117,103, // "&"
118,103, // "("
119,103, // ")"
120,103, // "*"
121,103, // "+"
122,103, // ","
123,103, // "-"
124,103, // "."
125,103, // "/"
126,103, // ";"
127,103, // "<"
128,103, // ">"
129,103, // "["
130,103, // "]"
131,103, // "{"
132,103, // "}"
133,103, // "|"
135,103, // "0"
139,103, // "_"
140,103, // {"A".."Z" "j" "q"}
141,103, // {"1".."9"}
142,785, // printableChar
143,103, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,103, // " "
145,103, // "\"
146,103, // "'"
147,103, // '"'
150,1255, // eol
153,325, // {10}
154,257, // {13}
  }
,
{ // state 887
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 888
0x80000000|269, // match move
0x80000000|521, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 889
173,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 890
-1, // $$start
-1, // start
650, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+224, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+224, // "k"
MIN_REDUCTION+224, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+224, // "u"
1398, // "p"
MIN_REDUCTION+224, // "h"
1282, // "v"
MIN_REDUCTION+224, // "y"
MIN_REDUCTION+224, // "m"
1030, // "g"
MIN_REDUCTION+224, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+224, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+224, // {"A".."Z" "j" "q"}
MIN_REDUCTION+224, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 891
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 892
0x80000000|1482, // match move
0x80000000|464, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 893
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+172, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+172, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+172, // $
MIN_REDUCTION+172, // $NT
  }
,
{ // state 894
0x80000000|2, // match move
0x80000000|357, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 895
0x80000000|1107, // match move
0x80000000|329, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 896
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 897
88,103, // "c"
89,103, // "l"
90,103, // "a"
91,103, // "s"
94,103, // "e"
95,103, // "b"
96,103, // "o"
97,103, // "n"
98,103, // "r"
99,103, // "k"
100,103, // "x"
101,103, // "t"
102,103, // "d"
103,103, // "f"
104,103, // "i"
105,103, // "w"
106,103, // "u"
107,103, // "p"
108,103, // "h"
109,103, // "v"
110,103, // "y"
111,103, // "m"
112,103, // "g"
113,103, // "z"
114,103, // "!"
115,103, // "="
116,103, // "%"
117,103, // "&"
118,103, // "("
119,103, // ")"
120,103, // "*"
121,103, // "+"
122,103, // ","
123,103, // "-"
124,103, // "."
125,103, // "/"
126,103, // ";"
127,103, // "<"
128,103, // ">"
129,103, // "["
130,103, // "]"
131,103, // "{"
132,103, // "}"
133,103, // "|"
135,103, // "0"
139,103, // "_"
140,103, // {"A".."Z" "j" "q"}
141,103, // {"1".."9"}
143,103, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,103, // " "
145,103, // "\"
146,103, // "'"
147,103, // '"'
  }
,
{ // state 898
-1, // $$start
-1, // start
156, // ws*
-1, // $$0
MIN_REDUCTION+272, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+272, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 899
0x80000000|2, // match move
0x80000000|143, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 900
89,970, // "l"
90,732, // "a"
96,920, // "o"
108,774, // "h"
  }
,
{ // state 901
102,1521, // "d"
  }
,
{ // state 902
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 903
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 904
2,650, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 905
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 906
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 907
2,403, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 908
0x80000000|1299, // match move
0x80000000|1529, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 909
2,403, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 910
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+193, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+193, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+193, // $
MIN_REDUCTION+193, // $NT
  }
,
{ // state 911
0x80000000|2, // match move
0x80000000|190, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 912
0x80000000|608, // match move
0x80000000|1501, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 913
0x80000000|49, // match move
0x80000000|1328, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 914
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+211, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+211, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+211, // $
MIN_REDUCTION+211, // $NT
  }
,
{ // state 915
-1, // $$start
-1, // start
981, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+149, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+149, // "k"
MIN_REDUCTION+149, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+149, // "u"
1398, // "p"
MIN_REDUCTION+149, // "h"
1282, // "v"
MIN_REDUCTION+149, // "y"
MIN_REDUCTION+149, // "m"
1030, // "g"
MIN_REDUCTION+149, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+149, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+149, // {"A".."Z" "j" "q"}
MIN_REDUCTION+149, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 916
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 917
91,899, // "s"
  }
,
{ // state 918
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 919
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 920
97,456, // "n"
  }
,
{ // state 921
0x80000000|1127, // match move
0x80000000|1474, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 922
0x80000000|966, // match move
0x80000000|1179, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 923
88,719, // "c"
89,719, // "l"
90,719, // "a"
91,719, // "s"
94,719, // "e"
95,719, // "b"
96,719, // "o"
97,719, // "n"
98,719, // "r"
99,719, // "k"
100,719, // "x"
101,719, // "t"
102,719, // "d"
103,719, // "f"
104,719, // "i"
105,719, // "w"
106,719, // "u"
107,719, // "p"
108,719, // "h"
109,719, // "v"
110,719, // "y"
111,719, // "m"
112,719, // "g"
113,719, // "z"
114,719, // "!"
115,719, // "="
116,719, // "%"
117,719, // "&"
118,719, // "("
119,719, // ")"
120,719, // "*"
121,719, // "+"
122,719, // ","
123,719, // "-"
124,719, // "."
125,719, // "/"
126,719, // ";"
127,719, // "<"
128,719, // ">"
129,719, // "["
130,719, // "]"
131,719, // "{"
132,719, // "}"
133,719, // "|"
135,719, // "0"
139,719, // "_"
140,719, // {"A".."Z" "j" "q"}
141,719, // {"1".."9"}
142,485, // printableChar
143,719, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,719, // " "
145,719, // "\"
146,719, // "'"
147,719, // '"'
150,261, // eol
153,142, // {10}
154,1085, // {13}
164,1376, // commentContent
165,692, // commentContent**
166,1454, // commentContent*
  }
,
{ // state 924
117,1492, // "&"
  }
,
{ // state 925
94,585, // "e"
  }
,
{ // state 926
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 927
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+291, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+291, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 928
0x80000000|1052, // match move
0x80000000|1284, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 929
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+267, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+267, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 930
173,MIN_REDUCTION+231, // $NT
  }
,
{ // state 931
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+103, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+103, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+103, // $
MIN_REDUCTION+103, // $NT
  }
,
{ // state 932
98,807, // "r"
  }
,
{ // state 933
0x80000000|1418, // match move
0x80000000|405, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 934
0x80000000|51, // match move
0x80000000|613, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 935
0x80000000|492, // match move
0x80000000|880, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 936
0x80000000|1205, // match move
0x80000000|106, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 937
2,199, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 938
2,1230, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
156,1531, // $$1
161,994, // multiLineCommentStart
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 939
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 940
-1, // $$start
520, // start
275, // ws*
1056, // $$0
1031, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
-1, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
742, // token*
118, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 941
97,530, // "n"
  }
,
{ // state 942
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 943
0x80000000|620, // match move
0x80000000|1098, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 944
173,MIN_REDUCTION+90, // $NT
  }
,
{ // state 945
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 946
0x80000000|2, // match move
0x80000000|248, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 947
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 948
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 949
0x80000000|806, // match move
0x80000000|958, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 950
0x80000000|938, // match move
0x80000000|790, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 951
94,1427, // "e"
  }
,
{ // state 952
0x80000000|367, // match move
0x80000000|640, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 953
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 954
107,869, // "p"
  }
,
{ // state 955
89,193, // "l"
97,266, // "n"
98,1495, // "r"
100,323, // "x"
  }
,
{ // state 956
0x80000000|645, // match move
0x80000000|677, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 957
0x80000000|999, // match move
0x80000000|752, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 958
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+112, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+112, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+112, // $
MIN_REDUCTION+112, // $NT
  }
,
{ // state 959
0x80000000|2, // match move
0x80000000|701, // no-match move
// T-test match for {"'" "\"}:
145,
146,
  }
,
{ // state 960
91,844, // "s"
101,1038, // "t"
  }
,
{ // state 961
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 962
88,672, // "c"
89,672, // "l"
90,672, // "a"
91,672, // "s"
94,672, // "e"
95,672, // "b"
96,672, // "o"
97,672, // "n"
98,672, // "r"
99,672, // "k"
100,672, // "x"
101,672, // "t"
102,672, // "d"
103,672, // "f"
104,672, // "i"
105,672, // "w"
106,672, // "u"
107,672, // "p"
108,672, // "h"
109,672, // "v"
110,672, // "y"
111,672, // "m"
112,672, // "g"
113,672, // "z"
114,672, // "!"
115,672, // "="
116,672, // "%"
117,672, // "&"
118,672, // "("
119,672, // ")"
120,672, // "*"
121,672, // "+"
122,672, // ","
123,672, // "-"
124,672, // "."
125,672, // "/"
126,672, // ";"
127,672, // "<"
128,672, // ">"
129,672, // "["
130,672, // "]"
131,672, // "{"
132,672, // "}"
133,672, // "|"
135,672, // "0"
139,672, // "_"
140,672, // {"A".."Z" "j" "q"}
141,672, // {"1".."9"}
142,1379, // printableChar
143,672, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,672, // " "
145,672, // "\"
146,672, // "'"
147,672, // '"'
  }
,
{ // state 963
2,696, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 964
0x80000000|309, // match move
0x80000000|764, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 965
-1, // $$start
-1, // start
798, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+239, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+239, // "k"
MIN_REDUCTION+239, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+239, // "u"
1398, // "p"
MIN_REDUCTION+239, // "h"
1282, // "v"
MIN_REDUCTION+239, // "y"
MIN_REDUCTION+239, // "m"
1030, // "g"
MIN_REDUCTION+239, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+239, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+239, // {"A".."Z" "j" "q"}
MIN_REDUCTION+239, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 966
2,663, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 967
2,1000, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 968
0x80000000|788, // match move
0x80000000|636, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 969
109,348, // "v"
  }
,
{ // state 970
90,1557, // "a"
  }
,
{ // state 971
0x80000000|1206, // match move
0x80000000|977, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 972
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 973
0x80000000|738, // match move
0x80000000|159, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 974
0x80000000|35, // match move
0x80000000|376, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 975
0x80000000|1471, // match move
0x80000000|707, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 976
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 977
0x80000000|569, // match move
0x80000000|933, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 978
150,108, // eol
153,325, // {10}
154,257, // {13}
160,213, // printableChar**
169,1246, // printableChar*
  }
,
{ // state 979
0x80000000|865, // match move
0x80000000|125, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 980
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 981
0x80000000|1341, // match move
0x80000000|816, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 982
-1, // $$start
-1, // start
1216, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+212, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+212, // "k"
MIN_REDUCTION+212, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+212, // "u"
1398, // "p"
MIN_REDUCTION+212, // "h"
1282, // "v"
MIN_REDUCTION+212, // "y"
MIN_REDUCTION+212, // "m"
1030, // "g"
MIN_REDUCTION+212, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+212, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+212, // {"A".."Z" "j" "q"}
MIN_REDUCTION+212, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 983
0x80000000|1480, // match move
0x80000000|1360, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 984
94,946, // "e"
  }
,
{ // state 985
0x80000000|847, // match move
0x80000000|175, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 986
0x80000000|461, // match move
0x80000000|910, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 987
112,168, // "g"
  }
,
{ // state 988
0x80000000|1007, // match move
0x80000000|508, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 989
0x80000000|2, // match move
0x80000000|467, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 990
90,649, // "a"
  }
,
{ // state 991
101,857, // "t"
  }
,
{ // state 992
173,MIN_REDUCTION+328, // $NT
  }
,
{ // state 993
173,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 994
0x80000000|730, // match move
0x80000000|1191, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 995
0x80000000|892, // match move
0x80000000|302, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 996
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+133, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+133, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+133, // $
MIN_REDUCTION+133, // $NT
  }
,
{ // state 997
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 998
98,308, // "r"
  }
,
{ // state 999
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1000
0x80000000|250, // match move
0x80000000|1050, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1001
2,1561, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1002
-1, // $$start
-1, // start
313, // ws*
-1, // $$0
MIN_REDUCTION+254, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+254, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 1003
173,MIN_REDUCTION+141, // $NT
  }
,
{ // state 1004
-1, // $$start
-1, // start
1515, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+101, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+101, // "k"
MIN_REDUCTION+101, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+101, // "u"
1398, // "p"
MIN_REDUCTION+101, // "h"
1282, // "v"
MIN_REDUCTION+101, // "y"
MIN_REDUCTION+101, // "m"
1030, // "g"
MIN_REDUCTION+101, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+101, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+101, // {"A".."Z" "j" "q"}
MIN_REDUCTION+101, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1005
0x80000000|1297, // match move
0x80000000|667, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1006
104,1371, // "i"
  }
,
{ // state 1007
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1008
0x80000000|704, // match move
0x80000000|720, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1009
-1, // $$start
-1, // start
782, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+194, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+194, // "k"
MIN_REDUCTION+194, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+194, // "u"
1398, // "p"
MIN_REDUCTION+194, // "h"
1282, // "v"
MIN_REDUCTION+194, // "y"
MIN_REDUCTION+194, // "m"
1030, // "g"
MIN_REDUCTION+194, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+194, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+194, // {"A".."Z" "j" "q"}
MIN_REDUCTION+194, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 1010
0x80000000|2, // match move
0x80000000|1458, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1011
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1012
2,370, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1013
173,MIN_REDUCTION+102, // $NT
  }
,
{ // state 1014
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1015
88,1080, // "c"
  }
,
{ // state 1016
0x80000000|1099, // match move
0x80000000|540, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1017
0x80000000|1138, // match move
0x80000000|1182, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1018
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1019
173,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1020
173,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1021
0x80000000|513, // match move
0x80000000|1072, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1022
173,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1023
0x80000000|119, // match move
0x80000000|988, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1024
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1025
90,1168, // "a"
98,757, // "r"
108,228, // "h"
  }
,
{ // state 1026
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1027
-1, // $$start
-1, // start
155, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+221, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+221, // "k"
MIN_REDUCTION+221, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+221, // "u"
1398, // "p"
MIN_REDUCTION+221, // "h"
1282, // "v"
MIN_REDUCTION+221, // "y"
MIN_REDUCTION+221, // "m"
1030, // "g"
MIN_REDUCTION+221, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+221, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+221, // {"A".."Z" "j" "q"}
MIN_REDUCTION+221, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 1028
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+269, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+269, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1029
115,1214, // "="
  }
,
{ // state 1030
96,138, // "o"
  }
,
{ // state 1031
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1032
101,1559, // "t"
  }
,
{ // state 1033
173,MIN_REDUCTION+129, // $NT
  }
,
{ // state 1034
0x80000000|31, // match move
0x80000000|1057, // no-match move
0x80000000|295, // NT-test-match state for validStringCharacter
  }
,
{ // state 1035
173,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1036
0x80000000|997, // match move
0x80000000|1129, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 1037
0x80000000|632, // match move
0x80000000|1005, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1038
0x80000000|951, // match move
0x80000000|246, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1039
0x80000000|444, // match move
0x80000000|1450, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1040
0x80000000|1329, // match move
0x80000000|1443, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1041
2,663, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1042
-1, // $$start
-1, // start
696, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+170, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+170, // "k"
MIN_REDUCTION+170, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+170, // "u"
1398, // "p"
MIN_REDUCTION+170, // "h"
1282, // "v"
MIN_REDUCTION+170, // "y"
MIN_REDUCTION+170, // "m"
1030, // "g"
MIN_REDUCTION+170, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+170, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+170, // {"A".."Z" "j" "q"}
MIN_REDUCTION+170, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 1043
94,53, // "e"
  }
,
{ // state 1044
2,44, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1045
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1046
2,983, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1047
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1048
0x80000000|130, // match move
0x80000000|135, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1049
0x80000000|1336, // match move
0x80000000|1530, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1050
0x80000000|414, // match move
0x80000000|396, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1051
0x80000000|122, // match move
0x80000000|929, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1052
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1053
2,1552, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1054
0x80000000|1496, // match move
0x80000000|837, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1055
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+261, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+261, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 1056
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1057
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1058
0x80000000|595, // match move
0x80000000|1388, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1059
173,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1060
0x80000000|1359, // match move
0x80000000|242, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1061
0x80000000|2, // match move
0x80000000|656, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1062
0x80000000|2, // match move
0x80000000|842, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1063
0x80000000|1079, // match move
0x80000000|618, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1064
173,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1065
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1066
89,776, // "l"
  }
,
{ // state 1067
0x80000000|14, // match move
0x80000000|278, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1068
2,156, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1069
-1, // $$start
-1, // start
157, // ws*
-1, // $$0
MIN_REDUCTION+276, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+276, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 1070
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1071
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+121, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+121, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+121, // $
MIN_REDUCTION+121, // $NT
  }
,
{ // state 1072
0x80000000|1097, // match move
0x80000000|1171, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1073
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1074
0x80000000|544, // match move
0x80000000|927, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1075
88,30, // "c"
  }
,
{ // state 1076
0x80000000|551, // match move
0x80000000|1126, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1077
101,1423, // "t"
  }
,
{ // state 1078
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1079
2,663, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1080
0x80000000|2, // match move
0x80000000|1558, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1081
0x80000000|1383, // match move
0x80000000|1525, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1082
0x80000000|1396, // match move
0x80000000|659, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1083
0x80000000|767, // match move
0x80000000|484, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1084
0x80000000|1462, // match move
0x80000000|828, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1085
0x80000000|1104, // match move
0x80000000|1158, // no-match move
// T-test match for 10:
153,
  }
,
{ // state 1086
173,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1087
88,77, // "c"
  }
,
{ // state 1088
173,MIN_REDUCTION+96, // $NT
  }
,
{ // state 1089
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1090
0x80000000|791, // match move
0x80000000|1083, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1091
0x80000000|904, // match move
0x80000000|890, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1092
95,1519, // "b"
  }
,
{ // state 1093
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1094
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+181, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+181, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+181, // $
MIN_REDUCTION+181, // $NT
  }
,
{ // state 1095
-1, // $$start
-1, // start
15, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+119, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+119, // "k"
MIN_REDUCTION+119, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+119, // "u"
1398, // "p"
MIN_REDUCTION+119, // "h"
1282, // "v"
MIN_REDUCTION+119, // "y"
MIN_REDUCTION+119, // "m"
1030, // "g"
MIN_REDUCTION+119, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+119, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+119, // {"A".."Z" "j" "q"}
MIN_REDUCTION+119, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 1096
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1097
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1098
-1, // $$start
-1, // start
182, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+176, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+176, // "k"
MIN_REDUCTION+176, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+176, // "u"
1398, // "p"
MIN_REDUCTION+176, // "h"
1282, // "v"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
1030, // "g"
MIN_REDUCTION+176, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+176, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+176, // {"A".."Z" "j" "q"}
MIN_REDUCTION+176, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 1099
2,16, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1100
0x80000000|592, // match move
0x80000000|144, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1101
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1102
0x80000000|1109, // match move
0x80000000|439, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1103
2,983, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1104
153,46, // {10}
  }
,
{ // state 1105
0x80000000|1148, // match move
0x80000000|259, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1106
0x80000000|179, // match move
0x80000000|1565, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1107
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1108
97,1460, // "n"
  }
,
{ // state 1109
2,1505, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1110
0x80000000|451, // match move
0x80000000|1485, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1111
91,875, // "s"
  }
,
{ // state 1112
0x80000000|762, // match move
0x80000000|423, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1113
0x80000000|942, // match move
0x80000000|151, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1114
-1, // $$start
-1, // start
280, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+140, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+140, // "k"
MIN_REDUCTION+140, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+140, // "u"
1398, // "p"
MIN_REDUCTION+140, // "h"
1282, // "v"
MIN_REDUCTION+140, // "y"
MIN_REDUCTION+140, // "m"
1030, // "g"
MIN_REDUCTION+140, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+140, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+140, // {"A".."Z" "j" "q"}
MIN_REDUCTION+140, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 1115
0x80000000|2, // match move
0x80000000|777, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1116
101,1189, // "t"
105,693, // "w"
106,1261, // "u"
108,1503, // "h"
110,1108, // "y"
  }
,
{ // state 1117
173,MIN_REDUCTION+222, // $NT
  }
,
{ // state 1118
0x80000000|354, // match move
0x80000000|187, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1119
0x80000000|501, // match move
0x80000000|1430, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1120
0x80000000|1447, // match move
0x80000000|740, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1121
0x80000000|1331, // match move
0x80000000|1440, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1122
173,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1123
0x80000000|705, // match move
0x80000000|12, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1124
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1125
-1, // $$start
-1, // start
417, // ws*
-1, // $$0
MIN_REDUCTION+258, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+258, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 1126
0x80000000|760, // match move
0x80000000|686, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1127
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1128
-1, // $$start
-1, // start
609, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1403, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+182, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+182, // "k"
MIN_REDUCTION+182, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+182, // "u"
1398, // "p"
MIN_REDUCTION+182, // "h"
1282, // "v"
MIN_REDUCTION+182, // "y"
MIN_REDUCTION+182, // "m"
1030, // "g"
MIN_REDUCTION+182, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+182, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+182, // {"A".."Z" "j" "q"}
MIN_REDUCTION+182, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 1129
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1130
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1131
173,MIN_REDUCTION+307, // $NT
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1132
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1133
173,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1134
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1135
0x80000000|524, // match move
0x80000000|319, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1136
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1137
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1138
2,417, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1139
135,225, // "0"
141,225, // {"1".."9"}
  }
,
{ // state 1140
0x80000000|1199, // match move
0x80000000|358, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1141
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+279, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+279, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 1142
0x80000000|201, // match move
0x80000000|363, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1143
-1, // $$start
-1, // start
763, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+134, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+134, // "k"
MIN_REDUCTION+134, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+134, // "u"
1398, // "p"
MIN_REDUCTION+134, // "h"
1282, // "v"
MIN_REDUCTION+134, // "y"
MIN_REDUCTION+134, // "m"
1030, // "g"
MIN_REDUCTION+134, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+134, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+134, // {"A".."Z" "j" "q"}
MIN_REDUCTION+134, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 1144
-1, // $$start
-1, // start
1000, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+173, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+173, // "k"
MIN_REDUCTION+173, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
210, // "u"
1398, // "p"
MIN_REDUCTION+173, // "h"
1282, // "v"
MIN_REDUCTION+173, // "y"
MIN_REDUCTION+173, // "m"
1030, // "g"
MIN_REDUCTION+173, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+173, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+173, // {"A".."Z" "j" "q"}
MIN_REDUCTION+173, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 1145
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1146
115,1081, // "="
  }
,
{ // state 1147
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1148
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1149
0x80000000|1193, // match move
0x80000000|134, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1150
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1151
173,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1152
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1153
0x80000000|1276, // match move
0x80000000|1106, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1154
2,912, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1155
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+251, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+251, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 1156
0x80000000|755, // match move
0x80000000|874, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1157
0x80000000|56, // match move
0x80000000|311, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1158
0x80000000|60, // match move
0x80000000|1431, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 1159
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1160
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1161
0x80000000|1510, // match move
0x80000000|29, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1162
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+356, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+356, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+356, // $
-1, // $NT
  }
,
{ // state 1163
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1164
89,736, // "l"
  }
,
{ // state 1165
0x80000000|2, // match move
0x80000000|555, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1166
2,818, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1167
173,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1168
101,518, // "t"
  }
,
{ // state 1169
98,550, // "r"
  }
,
{ // state 1170
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1171
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+265, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+265, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1172
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1173
2,1361, // ws*
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1174
0x80000000|824, // match move
0x80000000|864, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1175
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1176
120,992, // "*"
  }
,
{ // state 1177
0x80000000|809, // match move
0x80000000|1556, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1178
0x80000000|1528, // match move
0x80000000|1254, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1179
0x80000000|1041, // match move
0x80000000|1063, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1180
0x80000000|215, // match move
0x80000000|903, // no-match move
0x80000000|295, // NT-test-match state for validStringCharacter
  }
,
{ // state 1181
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1182
0x80000000|220, // match move
0x80000000|796, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1183
0x80000000|92, // match move
0x80000000|276, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1184
173,MIN_REDUCTION+325, // $NT
  }
,
{ // state 1185
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+287, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 1186
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1187
-1, // $$start
-1, // start
655, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+227, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+227, // "k"
MIN_REDUCTION+227, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+227, // "u"
1398, // "p"
MIN_REDUCTION+227, // "h"
1282, // "v"
MIN_REDUCTION+227, // "y"
MIN_REDUCTION+227, // "m"
1030, // "g"
MIN_REDUCTION+227, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+227, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+227, // {"A".."Z" "j" "q"}
MIN_REDUCTION+227, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 1188
173,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1189
90,1168, // "a"
98,197, // "r"
  }
,
{ // state 1190
-1, // $$start
-1, // start
436, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+236, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+236, // "u"
1398, // "p"
MIN_REDUCTION+236, // "h"
1282, // "v"
MIN_REDUCTION+236, // "y"
MIN_REDUCTION+236, // "m"
1030, // "g"
MIN_REDUCTION+236, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+236, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"A".."Z" "j" "q"}
MIN_REDUCTION+236, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1191
120,497, // "*"
162,1022, // multiLineCommentEnd
165,692, // commentContent**
166,1454, // commentContent*
  }
,
{ // state 1192
89,744, // "l"
  }
,
{ // state 1193
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1194
173,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1195
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1196
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1197
0x80000000|300, // match move
0x80000000|446, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1198
173,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1199
2,191, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1200
0x80000000|408, // match move
0x80000000|1539, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1201
0x80000000|574, // match move
0x80000000|1404, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1202
0x80000000|1335, // match move
0x80000000|1128, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1203
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1204
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 1205
2,284, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1206
2,330, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1207
101,894, // "t"
  }
,
{ // state 1208
-1, // $$start
-1, // start
912, // ws*
-1, // $$0
MIN_REDUCTION+270, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+270, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 1209
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1210
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1211
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1212
89,193, // "l"
97,266, // "n"
100,323, // "x"
  }
,
{ // state 1213
173,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1214
0x80000000|1012, // match move
0x80000000|934, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1215
94,603, // "e"
  }
,
{ // state 1216
0x80000000|808, // match move
0x80000000|1178, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1217
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1218
147,388, // '"'
158,519, // $$2
  }
,
{ // state 1219
0x80000000|1469, // match move
0x80000000|1497, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1220
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1221
0x80000000|1375, // match move
0x80000000|660, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1222
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1223
173,MIN_REDUCTION+156, // $NT
  }
,
{ // state 1224
0x80000000|2, // match move
0x80000000|340, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1225
2,15, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1226
94,1, // "e"
  }
,
{ // state 1227
173,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1228
88,1382, // "c"
  }
,
{ // state 1229
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1230
0x80000000|1014, // match move
0x80000000|652, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1231
-1, // $$start
-1, // start
588, // ws*
-1, // $$0
MIN_REDUCTION+294, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+294, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+294, // $
-1, // $NT
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1232
0x80000000|87, // match move
0x80000000|552, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1233
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1234
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1235
104,1560, // "i"
  }
,
{ // state 1236
0x80000000|1132, // match move
0x80000000|1281, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1237
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+163, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+163, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+163, // $
MIN_REDUCTION+163, // $NT
  }
,
{ // state 1238
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1239
-1, // $$start
-1, // start
818, // ws*
-1, // $$0
MIN_REDUCTION+296, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+296, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 1240
173,MIN_REDUCTION+168, // $NT
  }
,
{ // state 1241
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+187, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 1242
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1243
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1244
0x80000000|1147, // match move
0x80000000|687, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1245
135,19, // "0"
138,287, // digit
141,19, // {"1".."9"}
  }
,
{ // state 1246
0x80000000|962, // match move
0x80000000|1425, // no-match move
0x80000000|897, // NT-test-match state for printableChar
  }
,
{ // state 1247
111,1288, // "m"
  }
,
{ // state 1248
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1249
0x80000000|188, // match move
0x80000000|1280, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1250
0x80000000|885, // match move
0x80000000|1436, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1251
2,625, // ws*
144,856, // " "
148,63, // ws
149,856, // {9}
150,1131, // eol
153,325, // {10}
154,257, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1252
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1253
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1254
0x80000000|61, // match move
0x80000000|914, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1255
173,MIN_REDUCTION+333, // $NT
  }
,
{ // state 1256
0x80000000|170, // match move
0x80000000|1102, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1257
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1258
0x80000000|1283, // match move
0x80000000|1402, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1259
-1, // $$start
-1, // start
1552, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+206, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+206, // "k"
MIN_REDUCTION+206, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+206, // "u"
1398, // "p"
MIN_REDUCTION+206, // "h"
1282, // "v"
MIN_REDUCTION+206, // "y"
MIN_REDUCTION+206, // "m"
1030, // "g"
MIN_REDUCTION+206, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+206, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+206, // {"A".."Z" "j" "q"}
MIN_REDUCTION+206, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 1260
173,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1261
107,1483, // "p"
  }
,
{ // state 1262
0x80000000|312, // match move
0x80000000|593, // no-match move
0x80000000|295, // NT-test-match state for validStringCharacter
  }
,
{ // state 1263
105,1477, // "w"
  }
,
{ // state 1264
2,818, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1265
88,131, // "c"
  }
,
{ // state 1266
2,833, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1267
94,364, // "e"
  }
,
{ // state 1268
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1269
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1270
0x80000000|1086, // match move
0x80000000|670, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1271
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+271, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+271, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 1272
0x80000000|1257, // match move
0x80000000|1270, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1273
0x80000000|424, // match move
0x80000000|908, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1274
0x80000000|1238, // match move
0x80000000|765, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1275
173,MIN_REDUCTION+303, // $NT
  }
,
{ // state 1276
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1277
0x80000000|547, // match move
0x80000000|495, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1278
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1279
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1280
-1, // $$start
-1, // start
171, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+161, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+161, // "k"
MIN_REDUCTION+161, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+161, // "u"
1398, // "p"
MIN_REDUCTION+161, // "h"
1282, // "v"
MIN_REDUCTION+161, // "y"
MIN_REDUCTION+161, // "m"
1030, // "g"
MIN_REDUCTION+161, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+161, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+161, // {"A".."Z" "j" "q"}
MIN_REDUCTION+161, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 1281
0x80000000|1101, // match move
0x80000000|626, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1282
96,591, // "o"
  }
,
{ // state 1283
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1284
0x80000000|374, // match move
0x80000000|342, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1285
0x80000000|1173, // match move
0x80000000|1491, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1286
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1287
2,983, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1288
0x80000000|2, // match move
0x80000000|285, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1289
102,845, // "d"
  }
,
{ // state 1290
0x80000000|2, // match move
0x80000000|943, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1291
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1292
0x80000000|657, // match move
0x80000000|1358, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1293
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+178, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 1294
173,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1295
-1, // $$start
-1, // start
452, // ws*
-1, // $$0
MIN_REDUCTION+286, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
-1, // `=
-1, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
MIN_REDUCTION+286, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+286, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 1296
101,460, // "t"
  }
,
{ // state 1297
173,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1298
0x80000000|872, // match move
0x80000000|463, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1299
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1300
2,1054, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1301
89,811, // "l"
  }
,
{ // state 1302
0x80000000|1151, // match move
0x80000000|681, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1303
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+106, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+106, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+106, // $
MIN_REDUCTION+106, // $NT
  }
,
{ // state 1304
0x80000000|617, // match move
0x80000000|614, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1305
0x80000000|2, // match move
0x80000000|952, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1306
0x80000000|397, // match move
0x80000000|539, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1307
0x80000000|708, // match move
0x80000000|402, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1308
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+226, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+226, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+226, // $
MIN_REDUCTION+226, // $NT
  }
,
{ // state 1309
0x80000000|743, // match move
0x80000000|1153, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1310
0x80000000|1456, // match move
0x80000000|848, // no-match move
0x80000000|295, // NT-test-match state for validStringCharacter
  }
,
{ // state 1311
0x80000000|2, // match move
0x80000000|96, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1312
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1313
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1314
0x80000000|2, // match move
0x80000000|4, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1315
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1316
0x80000000|194, // match move
0x80000000|1476, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1317
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+232, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+232, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+232, // $
MIN_REDUCTION+232, // $NT
  }
,
{ // state 1318
173,MIN_REDUCTION+246, // $NT
  }
,
{ // state 1319
0x80000000|1001, // match move
0x80000000|635, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1320
0x80000000|945, // match move
0x80000000|1048, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1321
0x80000000|400, // match move
0x80000000|858, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1322
2,327, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1323
2,895, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1324
94,639, // "e"
  }
,
{ // state 1325
0x80000000|40, // match move
0x80000000|771, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1326
0x80000000|247, // match move
0x80000000|161, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1327
0x80000000|447, // match move
0x80000000|93, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1328
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+229, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+229, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+229, // $
MIN_REDUCTION+229, // $NT
  }
,
{ // state 1329
2,384, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1330
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1331
2,1230, // ws*
156,1531, // $$1
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1332
98,1165, // "r"
  }
,
{ // state 1333
0x80000000|267, // match move
0x80000000|409, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1334
-1, // $$start
-1, // start
895, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+131, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+131, // "k"
MIN_REDUCTION+131, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+131, // "u"
1398, // "p"
MIN_REDUCTION+131, // "h"
1282, // "v"
MIN_REDUCTION+131, // "y"
MIN_REDUCTION+131, // "m"
1030, // "g"
MIN_REDUCTION+131, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+131, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+131, // {"A".."Z" "j" "q"}
MIN_REDUCTION+131, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 1335
2,609, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1336
2,819, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1337
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1338
0x80000000|1546, // match move
0x80000000|558, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1339
0x80000000|2, // match move
0x80000000|582, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1340
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1341
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1342
94,1548, // "e"
  }
,
{ // state 1343
96,359, // "o"
  }
,
{ // state 1344
106,395, // "u"
  }
,
{ // state 1345
0x80000000|1571, // match move
0x80000000|1201, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1346
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+293, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+293, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1347
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1348
0x80000000|1467, // match move
0x80000000|789, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1349
0x80000000|440, // match move
0x80000000|726, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 1350
2,191, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1351
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1352
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1353
0x80000000|469, // match move
0x80000000|1040, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1354
0x80000000|412, // match move
0x80000000|166, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1355
0x80000000|339, // match move
0x80000000|876, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1356
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1357
0x80000000|1096, // match move
0x80000000|1372, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1358
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+263, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+263, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1359
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1360
0x80000000|1130, // match move
0x80000000|1051, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1361
0x80000000|1312, // match move
0x80000000|98, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1362
0x80000000|83, // match move
0x80000000|1187, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1363
0x80000000|76, // match move
0x80000000|948, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1364
94,1290, // "e"
  }
,
{ // state 1365
0x80000000|826, // match move
0x80000000|1071, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1366
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1367
2,854, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1368
0x80000000|578, // match move
0x80000000|1313, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1369
0x80000000|163, // match move
0x80000000|735, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1370
0x80000000|141, // match move
0x80000000|22, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1371
88,20, // "c"
  }
,
{ // state 1372
0x80000000|1286, // match move
0x80000000|1055, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1373
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1374
0x80000000|1401, // match move
0x80000000|949, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1375
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1376
0x80000000|416, // match move
0x80000000|1026, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 1377
2,1244, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1378
173,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1379
0x80000000|465, // match move
0x80000000|59, // no-match move
0x80000000|897, // NT-test-match state for printableChar
  }
,
{ // state 1380
2,157, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1381
0x80000000|628, // match move
0x80000000|915, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1382
101,834, // "t"
  }
,
{ // state 1383
2,327, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1384
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1385
103,160, // "f"
  }
,
{ // state 1386
0x80000000|350, // match move
0x80000000|1572, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1387
0x80000000|214, // match move
0x80000000|286, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1388
0x80000000|641, // match move
0x80000000|307, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1389
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1390
0x80000000|1464, // match move
0x80000000|1475, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1391
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1392
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1393
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1394
3,1203, // $$0
4,1031, // token
58,800, // `!
59,1553, // `!=
60,746, // `%
61,1217, // `&&
62,542, // `*
63,91, // `(
64,23, // `)
65,881, // `{
66,1366, // `}
67,1554, // `-
68,579, // `+
69,861, // `=
70,1070, // `==
71,972, // `[
72,802, // `]
73,445, // `||
74,615, // `<
75,351, // `<=
76,1252, // `,
77,186, // `>
78,532, // `>=
79,57, // `.
80,926, // `;
81,62, // `++
82,1500, // `--
84,919, // ID
85,541, // INTLIT
86,207, // STRINGLIT
87,1441, // CHARLIT
120,25, // "*"
134,642, // intLit2
136,264, // digit++
137,338, // letter
138,624, // digit
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
170,742, // token*
171,118, // digit+
  }
,
{ // state 1395
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1396
173,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1397
2,370, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1398
90,382, // "a"
98,1562, // "r"
106,1092, // "u"
  }
,
{ // state 1399
-1, // $$start
-1, // start
859, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+110, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+110, // "k"
MIN_REDUCTION+110, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+110, // "u"
1398, // "p"
MIN_REDUCTION+110, // "h"
1282, // "v"
MIN_REDUCTION+110, // "y"
MIN_REDUCTION+110, // "m"
1030, // "g"
MIN_REDUCTION+110, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+110, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+110, // {"A".."Z" "j" "q"}
MIN_REDUCTION+110, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 1400
4,1159, // token
58,800, // `!
59,1553, // `!=
60,746, // `%
61,1217, // `&&
63,91, // `(
64,23, // `)
65,881, // `{
66,1366, // `}
67,1554, // `-
68,579, // `+
69,861, // `=
70,1070, // `==
71,972, // `[
72,802, // `]
73,445, // `||
74,615, // `<
75,351, // `<=
76,1252, // `,
77,186, // `>
78,532, // `>=
79,57, // `.
80,926, // `;
81,62, // `++
82,1500, // `--
83,232, // `/
84,919, // ID
85,541, // INTLIT
86,207, // STRINGLIT
87,1441, // CHARLIT
88,822, // "c"
89,822, // "l"
90,822, // "a"
91,822, // "s"
94,822, // "e"
95,822, // "b"
96,822, // "o"
97,822, // "n"
98,822, // "r"
99,822, // "k"
100,822, // "x"
101,822, // "t"
102,822, // "d"
103,822, // "f"
104,822, // "i"
105,822, // "w"
106,822, // "u"
107,822, // "p"
108,822, // "h"
109,822, // "v"
110,822, // "y"
111,822, // "m"
112,822, // "g"
113,822, // "z"
114,1058, // "!"
115,1494, // "="
116,1110, // "%"
117,924, // "&"
118,971, // "("
119,1017, // ")"
121,1349, // "+"
122,230, // ","
123,162, // "-"
124,1067, // "."
125,728, // "/"
126,1455, // ";"
127,222, // "<"
128,515, // ">"
129,277, // "["
130,1298, // "]"
131,407, // "{"
132,437, // "}"
133,750, // "|"
134,642, // intLit2
135,19, // "0"
136,264, // digit++
137,338, // letter
138,624, // digit
140,822, // {"A".."Z" "j" "q"}
141,19, // {"1".."9"}
146,959, // "'"
147,258, // '"'
171,118, // digit+
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1401
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1402
0x80000000|1536, // match move
0x80000000|814, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1403
96,694, // "o"
110,383, // "y"
  }
,
{ // state 1404
0x80000000|1122, // match move
0x80000000|347, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1405
0x80000000|866, // match move
0x80000000|1369, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1406
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1407
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1408
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1409
-1, // $$start
-1, // start
557, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+209, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+209, // "k"
MIN_REDUCTION+209, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+209, // "u"
1398, // "p"
MIN_REDUCTION+209, // "h"
1282, // "v"
MIN_REDUCTION+209, // "y"
MIN_REDUCTION+209, // "m"
1030, // "g"
MIN_REDUCTION+209, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+209, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+209, // {"A".."Z" "j" "q"}
MIN_REDUCTION+209, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 1410
-1, // $$start
-1, // start
284, // ws*
-1, // $$0
MIN_REDUCTION+282, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
-1, // `=
-1, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
MIN_REDUCTION+282, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+282, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 1411
0x80000000|2, // match move
0x80000000|584, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1412
0x80000000|221, // match move
0x80000000|1507, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1413
173,MIN_REDUCTION+99, // $NT
  }
,
{ // state 1414
173,MIN_REDUCTION+132, // $NT
  }
,
{ // state 1415
173,MIN_REDUCTION+237, // $NT
  }
,
{ // state 1416
101,1267, // "t"
  }
,
{ // state 1417
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1418
2,330, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1419
173,MIN_REDUCTION+192, // $NT
  }
,
{ // state 1420
96,694, // "o"
  }
,
{ // state 1421
2,1361, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1422
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1423
88,487, // "c"
  }
,
{ // state 1424
0x80000000|2, // match move
0x80000000|565, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1425
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1426
0x80000000|906, // match move
0x80000000|1365, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1427
98,1495, // "r"
  }
,
{ // state 1428
91,398, // "s"
95,748, // "b"
  }
,
{ // state 1429
0x80000000|1227, // match move
0x80000000|699, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1430
0x80000000|779, // match move
0x80000000|718, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1431
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1432
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 1433
0x80000000|271, // match move
0x80000000|1303, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1434
0x80000000|375, // match move
0x80000000|1094, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1435
2,313, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1436
0x80000000|13, // match move
0x80000000|1241, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1437
2,206, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1438
2,1230, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
156,1531, // $$1
161,994, // multiLineCommentStart
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1439
-1, // $$start
-1, // start
1230, // ws*
-1, // $$0
MIN_REDUCTION+316, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+316, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+316, // "k"
MIN_REDUCTION+316, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+316, // "u"
1398, // "p"
MIN_REDUCTION+316, // "h"
1282, // "v"
MIN_REDUCTION+316, // "y"
MIN_REDUCTION+316, // "m"
1030, // "g"
MIN_REDUCTION+316, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+316, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+316, // {"A".."Z" "j" "q"}
MIN_REDUCTION+316, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
950, // idChar**
1463, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
716, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+316, // $
-1, // $NT
  }
,
{ // state 1440
-1, // $$start
-1, // start
1230, // ws*
-1, // $$0
MIN_REDUCTION+314, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+314, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
1531, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 1441
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1442
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1443
-1, // $$start
-1, // start
384, // ws*
-1, // $$0
MIN_REDUCTION+266, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+266, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 1444
0x80000000|963, // match move
0x80000000|1042, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1445
89,136, // "l"
  }
,
{ // state 1446
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1447
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1448
0x80000000|336, // match move
0x80000000|422, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1449
-1, // $$start
-1, // start
1309, // ws*
-1, // $$0
MIN_REDUCTION+290, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+290, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 1450
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+94, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+94, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+94, // $
MIN_REDUCTION+94, // $NT
  }
};
}
private class Initter8{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1451
0x80000000|721, // match move
0x80000000|272, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1452
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1453
0x80000000|909, // match move
0x80000000|1451, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1454
0x80000000|1564, // match move
0x80000000|1487, // no-match move
0x80000000|101, // NT-test-match state for commentContent
  }
,
{ // state 1455
0x80000000|299, // match move
0x80000000|562, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1456
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1457
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1458
0x80000000|39, // match move
0x80000000|1399, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1459
173,MIN_REDUCTION+159, // $NT
  }
,
{ // state 1460
88,337, // "c"
  }
,
{ // state 1461
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1462
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1463
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1464
2,588, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1465
-1, // $$start
-1, // start
199, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+95, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+95, // "k"
MIN_REDUCTION+95, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+95, // "u"
1398, // "p"
MIN_REDUCTION+95, // "h"
1282, // "v"
MIN_REDUCTION+95, // "y"
MIN_REDUCTION+95, // "m"
1030, // "g"
MIN_REDUCTION+95, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+95, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+95, // {"A".."Z" "j" "q"}
MIN_REDUCTION+95, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 1466
0x80000000|1260, // match move
0x80000000|506, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1467
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1468
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 1469
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1470
96,1385, // "o"
  }
,
{ // state 1471
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1472
-1, // $$start
-1, // start
1489, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+146, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+146, // "k"
MIN_REDUCTION+146, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+146, // "u"
1398, // "p"
MIN_REDUCTION+146, // "h"
1282, // "v"
MIN_REDUCTION+146, // "y"
MIN_REDUCTION+146, // "m"
1030, // "g"
MIN_REDUCTION+146, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+146, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+146, // {"A".."Z" "j" "q"}
MIN_REDUCTION+146, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 1473
89,644, // "l"
  }
,
{ // state 1474
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+257, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+257, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 1475
0x80000000|79, // match move
0x80000000|1231, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1476
0x80000000|654, // match move
0x80000000|813, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1477
0x80000000|2, // match move
0x80000000|237, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1478
0x80000000|1532, // match move
0x80000000|1524, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1479
104,581, // "i"
  }
,
{ // state 1480
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1481
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+273, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+273, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1482
1,520, // start
2,275, // ws*
3,1056, // $$0
4,1031, // token
5,202, // `boolean
6,116, // `class
7,612, // `extends
8,1204, // `void
9,470, // `int
10,587, // `while
11,380, // `if
12,442, // `else
13,429, // `for
14,1570, // `break
15,150, // `this
16,688, // `false
17,195, // `true
18,537, // `super
19,590, // `null
20,1315, // `return
21,792, // `instanceof
22,1195, // `new
23,24, // `abstract
24,1210, // `assert
25,1278, // `byte
26,1248, // `case
27,1078, // `catch
28,1073, // `char
29,294, // `const
30,335, // `continue
31,331, // `default
32,546, // `do
33,1535, // `double
34,1253, // `enum
35,371, // `final
36,786, // `finally
37,477, // `float
38,32, // `goto
39,918, // `implements
40,674, // `import
41,1407, // `interface
42,1517, // `long
43,600, // `native
44,896, // `package
45,768, // `private
46,174, // `protected
47,1145, // `public
48,217, // `short
49,153, // `static
50,939, // `strictfp
51,711, // `switch
52,749, // `synchronized
53,360, // `throw
54,787, // `throws
55,575, // `transient
56,288, // `try
57,902, // `volatile
170,742, // token*
  }
,
{ // state 1483
94,11, // "e"
  }
,
{ // state 1484
0x80000000|198, // match move
0x80000000|536, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1485
0x80000000|466, // match move
0x80000000|1142, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1486
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1487
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1488
94,1061, // "e"
  }
,
{ // state 1489
0x80000000|947, // match move
0x80000000|1540, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1490
97,41, // "n"
  }
,
{ // state 1491
-1, // $$start
-1, // start
1361, // ws*
-1, // $$0
MIN_REDUCTION+322, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+322, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+322, // $
-1, // $NT
  }
,
{ // state 1492
0x80000000|561, // match move
0x80000000|888, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1493
0x80000000|99, // match move
0x80000000|377, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1494
0x80000000|1029, // match move
0x80000000|936, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1495
103,17, // "f"
  }
,
{ // state 1496
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1497
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+321, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+321, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+321, // $
-1, // $NT
  }
,
{ // state 1498
88,1262, // "c"
89,1262, // "l"
90,1262, // "a"
91,1262, // "s"
94,1262, // "e"
95,1262, // "b"
96,1262, // "o"
97,1262, // "n"
98,1262, // "r"
99,1262, // "k"
100,1262, // "x"
101,1262, // "t"
102,1262, // "d"
103,1262, // "f"
104,1262, // "i"
105,1262, // "w"
106,1262, // "u"
107,1262, // "p"
108,1262, // "h"
109,1262, // "v"
110,1262, // "y"
111,1262, // "m"
112,1262, // "g"
113,1262, // "z"
114,1262, // "!"
115,1262, // "="
116,1262, // "%"
117,1262, // "&"
118,1262, // "("
119,1262, // ")"
120,1262, // "*"
121,1262, // "+"
122,1262, // ","
123,1262, // "-"
124,1262, // "."
125,1262, // "/"
126,1262, // ";"
127,1262, // "<"
128,1262, // ">"
129,1262, // "["
130,1262, // "]"
131,1262, // "{"
132,1262, // "}"
133,1262, // "|"
135,1262, // "0"
139,1262, // "_"
140,1262, // {"A".."Z" "j" "q"}
141,1262, // {"1".."9"}
142,1180, // printableChar
143,1262, // {"#".."$" ":" "?".."@" "^" "`" "~"}
144,1262, // " "
145,1262, // "\"
146,1262, // "'"
147,1262, // '"'
159,1310, // validStringCharacter
  }
,
{ // state 1499
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1500
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1501
0x80000000|218, // match move
0x80000000|494, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1502
90,18, // "a"
  }
,
{ // state 1503
96,932, // "o"
  }
,
{ // state 1504
0x80000000|2, // match move
0x80000000|434, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1505
0x80000000|1181, // match move
0x80000000|1060, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1506
0x80000000|761, // match move
0x80000000|528, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1507
0x80000000|1093, // match move
0x80000000|1141, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1508
173,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1509
2,912, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1510
2,964, // ws*
148,63, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1511
0x80000000|753, // match move
0x80000000|684, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1512
0x80000000|1294, // match move
0x80000000|344, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1513
173,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1514
0x80000000|1103, // match move
0x80000000|835, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1515
0x80000000|1279, // match move
0x80000000|1221, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1516
0x80000000|2, // match move
0x80000000|801, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1517
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1518
-1, // $$start
-1, // start
1120, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+107, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+107, // "k"
MIN_REDUCTION+107, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+107, // "u"
1398, // "p"
MIN_REDUCTION+107, // "h"
1282, // "v"
MIN_REDUCTION+107, // "y"
MIN_REDUCTION+107, // "m"
1030, // "g"
MIN_REDUCTION+107, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+107, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+107, // {"A".."Z" "j" "q"}
MIN_REDUCTION+107, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 1519
89,1006, // "l"
  }
,
{ // state 1520
-1, // $$start
-1, // start
327, // ws*
-1, // $$0
MIN_REDUCTION+288, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+288, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 1521
0x80000000|2, // match move
0x80000000|722, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1522
-1, // $$start
-1, // start
1244, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+167, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+167, // "k"
MIN_REDUCTION+167, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+167, // "u"
1398, // "p"
MIN_REDUCTION+167, // "h"
1282, // "v"
MIN_REDUCTION+167, // "y"
MIN_REDUCTION+167, // "m"
1030, // "g"
MIN_REDUCTION+167, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+167, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+167, // {"A".."Z" "j" "q"}
MIN_REDUCTION+167, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 1523
0x80000000|2, // match move
0x80000000|1100, // no-match move
0x80000000|1139, // NT-test-match state for digit
  }
,
{ // state 1524
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+220, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+220, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+220, // $
MIN_REDUCTION+220, // $NT
  }
,
{ // state 1525
0x80000000|829, // match move
0x80000000|145, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1526
0x80000000|523, // match move
0x80000000|1037, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1527
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1528
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1529
0x80000000|1268, // match move
0x80000000|236, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1530
-1, // $$start
-1, // start
819, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+104, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+104, // "k"
MIN_REDUCTION+104, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+104, // "u"
1398, // "p"
MIN_REDUCTION+104, // "h"
1282, // "v"
MIN_REDUCTION+104, // "y"
MIN_REDUCTION+104, // "m"
1030, // "g"
MIN_REDUCTION+104, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+104, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+104, // {"A".."Z" "j" "q"}
MIN_REDUCTION+104, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 1531
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1532
173,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1533
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1534
0x80000000|227, // match move
0x80000000|321, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1535
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1536
173,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1537
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1538
0x80000000|713, // match move
0x80000000|710, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1539
0x80000000|500, // match move
0x80000000|671, // no-match move
0x80000000|328, // NT-test-match state for reserved
  }
,
{ // state 1540
0x80000000|545, // match move
0x80000000|1082, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1541
0x80000000|1065, // match move
0x80000000|850, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1542
173,MIN_REDUCTION+225, // $NT
  }
,
{ // state 1543
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+247, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+247, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+247, // $
-1, // $NT
  }
,
{ // state 1544
173,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1545
0x80000000|45, // match move
0x80000000|1429, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1546
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1547
0x80000000|871, // match move
0x80000000|55, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1548
0x80000000|2, // match move
0x80000000|200, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1549
173,MIN_REDUCTION+114, // $NT
  }
,
{ // state 1550
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1551
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+136, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+136, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+136, // $
MIN_REDUCTION+136, // $NT
  }
,
{ // state 1552
0x80000000|1211, // match move
0x80000000|104, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1553
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1554
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1555
153,598, // {10}
  }
,
{ // state 1556
0x80000000|1533, // match move
0x80000000|349, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1557
91,448, // "s"
  }
,
{ // state 1558
0x80000000|531, // match move
0x80000000|1027, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1559
0x80000000|2, // match move
0x80000000|1381, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1560
97,88, // "n"
  }
,
{ // state 1561
0x80000000|493, // match move
0x80000000|432, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1562
96,274, // "o"
104,969, // "i"
  }
,
{ // state 1563
-1, // $$start
-1, // start
436, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+236, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
1025, // "t"
631, // "d"
1569, // "f"
731, // "i"
260, // "w"
1261, // "u"
1398, // "p"
1503, // "h"
1282, // "v"
1108, // "y"
MIN_REDUCTION+236, // "m"
1030, // "g"
MIN_REDUCTION+236, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+236, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"A".."Z" "j" "q"}
MIN_REDUCTION+236, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1564
0x80000000|602, // match move
0x80000000|630, // no-match move
0x80000000|389, // NT-test-match state for commentSymbol
  }
,
{ // state 1565
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+289, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
822, // "c"
822, // "l"
822, // "a"
822, // "s"
-1, // idChar
-1, // reserved
822, // "e"
822, // "b"
822, // "o"
822, // "n"
822, // "r"
822, // "k"
822, // "x"
822, // "t"
822, // "d"
822, // "f"
822, // "i"
822, // "w"
822, // "u"
822, // "p"
822, // "h"
822, // "v"
822, // "y"
822, // "m"
822, // "g"
822, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+289, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
642, // intLit2
19, // "0"
264, // digit++
338, // letter
624, // digit
-1, // "_"
822, // {"A".."Z" "j" "q"}
19, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
240, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
118, // digit+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 1566
0x80000000|2, // match move
0x80000000|428, // no-match move
0x80000000|669, // NT-test-match state for idChar
  }
,
{ // state 1567
2,975, // ws*
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1568
88,984, // "c"
  }
,
{ // state 1569
89,146, // "l"
90,1473, // "a"
96,1332, // "o"
104,941, // "i"
  }
,
{ // state 1570
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1571
148,240, // ws
150,1131, // eol
151,180, // singleLineComment
152,231, // multiLineComment
161,994, // multiLineCommentStart
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1572
-1, // $$start
-1, // start
1023, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
202, // `boolean
116, // `class
612, // `extends
1204, // `void
470, // `int
587, // `while
380, // `if
442, // `else
429, // `for
1570, // `break
150, // `this
688, // `false
195, // `true
537, // `super
590, // `null
1315, // `return
792, // `instanceof
1195, // `new
24, // `abstract
1210, // `assert
1278, // `byte
1248, // `case
1078, // `catch
1073, // `char
294, // `const
335, // `continue
331, // `default
546, // `do
1535, // `double
1253, // `enum
371, // `final
786, // `finally
477, // `float
32, // `goto
918, // `implements
674, // `import
1407, // `interface
1517, // `long
600, // `native
896, // `package
768, // `private
174, // `protected
1145, // `public
217, // `short
153, // `static
939, // `strictfp
711, // `switch
749, // `synchronized
360, // `throw
787, // `throws
575, // `transient
288, // `try
902, // `volatile
800, // `!
1553, // `!=
746, // `%
1217, // `&&
-1, // `*
91, // `(
23, // `)
881, // `{
1366, // `}
1554, // `-
579, // `+
861, // `=
1070, // `==
972, // `[
802, // `]
445, // `||
615, // `<
351, // `<=
1252, // `,
186, // `>
532, // `>=
57, // `.
926, // `;
62, // `++
1500, // `--
232, // `/
919, // ID
541, // INTLIT
207, // STRINGLIT
1441, // CHARLIT
900, // "c"
1420, // "l"
1428, // "a"
378, // "s"
-1, // idChar
-1, // reserved
1212, // "e"
132, // "b"
MIN_REDUCTION+197, // "o"
863, // "n"
606, // "r"
MIN_REDUCTION+197, // "k"
MIN_REDUCTION+197, // "x"
480, // "t"
631, // "d"
1569, // "f"
731, // "i"
737, // "w"
MIN_REDUCTION+197, // "u"
1398, // "p"
MIN_REDUCTION+197, // "h"
1282, // "v"
MIN_REDUCTION+197, // "y"
MIN_REDUCTION+197, // "m"
1030, // "g"
MIN_REDUCTION+197, // "z"
1058, // "!"
1494, // "="
1110, // "%"
924, // "&"
971, // "("
1017, // ")"
MIN_REDUCTION+197, // "*"
1349, // "+"
230, // ","
162, // "-"
1067, // "."
611, // "/"
1455, // ";"
222, // "<"
515, // ">"
277, // "["
1298, // "]"
407, // "{"
437, // "}"
750, // "|"
-1, // intLit2
1523, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+197, // {"A".."Z" "j" "q"}
MIN_REDUCTION+197, // {"1".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
856, // " "
-1, // "\"
959, // "'"
258, // '"'
63, // ws
856, // {9}
1131, // eol
180, // singleLineComment
231, // multiLineComment
325, // {10}
257, // {13}
-1, // idChar**
-1, // $$1
-1, // validStringCharacter**
-1, // $$2
-1, // validStringCharacter
-1, // printableChar**
994, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // commentSymbol
-1, // commentContent
-1, // commentContent**
-1, // commentContent*
-1, // validStringCharacter*
-1, // idChar*
-1, // printableChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1573][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
  doneSoFar += new Initter8().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= ws* $$0
(1<<16)+2,
// start ::= ws*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INTLIT
(4<<16)+1,
// token ::= STRINGLIT
(4<<16)+1,
// token ::= CHARLIT
(4<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(93<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(93<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(93<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(93<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(93<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(93<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(93<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(93<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(93<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(93<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(93<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(93<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(93<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(93<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(93<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(93<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(93<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(93<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(93<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(93<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(93<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(93<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(93<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(93<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(93<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(93<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(93<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(93<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(93<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(93<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(93<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(93<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(93<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(93<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(93<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(93<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(93<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(93<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(93<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(93<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(93<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(93<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(93<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(93<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(93<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(93<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(93<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(93<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(93<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(93<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(93<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(93<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(93<<16)+1,
// `! ::= "!" !"=" ws*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `% ::= "%" ws*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" ws*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `( ::= "(" ws*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" ws*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `, ::= "," ws*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `- ::= "-" !"-" ws*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `-- ::= "-" "-" ws*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `. ::= "." ws*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `/ ::= !"*" "/" !{"*" "/"} ws*
(83<<16)+2,
// `/ ::= !"*" "/" !{"*" "/"}
(83<<16)+1,
// `; ::= ";" ws*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `< ::= "<" !"=" ws*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" ws*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `= ::= "=" !"=" ws*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `> ::= ">" !"=" ws*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" ws*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `[ ::= "[" ws*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" ws*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `{ ::= "{" ws*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" ws*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `|| ::= "|" "|" ws*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// intLit2 ::= !"0" digit++
(134<<16)+1,
// idChar ::= letter
(92<<16)+1,
// idChar ::= digit
(92<<16)+1,
// idChar ::= "_"
(92<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(137<<16)+1,
// digit ::= {"0".."9"}
(138<<16)+1,
// printableChar ::= {" ".."~"}
(142<<16)+1,
// ws ::= {9 " "}
(148<<16)+1,
// ws ::= eol
(148<<16)+1,
// ws ::= singleLineComment
(148<<16)+1,
// ws ::= multiLineComment
(148<<16)+1,
// eol ::= {10}
(150<<16)+1,
// eol ::= {13} {10}
(150<<16)+2,
// eol ::= {13} !10
(150<<16)+1,
// ID ::= !reserved letter idChar** $$1
(84<<16)+3,
// ID ::= !reserved letter idChar**
(84<<16)+2,
// ID ::= !reserved letter !idChar $$1
(84<<16)+2,
// ID ::= !reserved letter !idChar
(84<<16)+1,
// INTLIT ::= "0" !digit ws*
(85<<16)+2,
// INTLIT ::= "0" !digit
(85<<16)+1,
// INTLIT ::= intLit2 ws*
(85<<16)+2,
// INTLIT ::= intLit2
(85<<16)+1,
// CHARLIT ::= "'" !{"'" "\"} printableChar "'" ws*
(87<<16)+4,
// CHARLIT ::= "'" !{"'" "\"} printableChar "'"
(87<<16)+3,
// STRINGLIT ::= '"' validStringCharacter** $$2
(86<<16)+3,
// STRINGLIT ::= '"' !validStringCharacter $$2
(86<<16)+2,
// validStringCharacter ::= !{'"' "\"} printableChar
(159<<16)+1,
// singleLineComment ::= "/" "/" printableChar** eol
(151<<16)+4,
// singleLineComment ::= "/" "/" !printableChar eol
(151<<16)+3,
// multiLineCommentStart ::= "/" "*"
(161<<16)+2,
// multiLineCommentEnd ::= "*" "/"
(162<<16)+2,
// commentSymbol ::= multiLineCommentStart
(163<<16)+1,
// commentSymbol ::= multiLineCommentEnd
(163<<16)+1,
// commentContent ::= !commentSymbol printableChar
(164<<16)+1,
// commentContent ::= eol
(164<<16)+1,
// multiLineComment ::= multiLineCommentStart commentContent** multiLineCommentEnd
(152<<16)+3,
// multiLineComment ::= multiLineCommentStart !commentContent multiLineCommentEnd
(152<<16)+2,
// commentContent** ::= commentContent* !commentContent
(165<<16)+1,
// validStringCharacter** ::= validStringCharacter* !validStringCharacter
(157<<16)+1,
// idChar** ::= idChar* !idChar
(155<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// printableChar** ::= printableChar* !printableChar
(160<<16)+1,
// token* ::= token* token
(170<<16)+2,
// token* ::= token
(170<<16)+1,
// digit++ ::= digit+ !digit
(136<<16)+1,
// validStringCharacter* ::= validStringCharacter* validStringCharacter
(167<<16)+2,
// validStringCharacter* ::= validStringCharacter
(167<<16)+1,
// digit+ ::= digit
(171<<16)+1,
// digit+ ::= digit+ digit
(171<<16)+2,
// printableChar* ::= printableChar* printableChar
(169<<16)+2,
// printableChar* ::= printableChar
(169<<16)+1,
// commentContent* ::= commentContent* commentContent
(166<<16)+2,
// commentContent* ::= commentContent
(166<<16)+1,
// idChar* ::= idChar* idChar
(168<<16)+2,
// idChar* ::= idChar
(168<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
(156<<16)+1,
// $$2 ::= '"' ws*
(158<<16)+2,
// $$2 ::= '"'
(158<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
149, // 9
153, // 10
-1, // 11
-1, // 12
154, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
144, // " "
114, // "!"
147, // '"'
143, // "#"
143, // "$"
116, // "%"
117, // "&"
146, // "'"
118, // "("
119, // ")"
120, // "*"
121, // "+"
122, // ","
123, // "-"
124, // "."
125, // "/"
135, // "0"
141, // "1"
141, // "2"
141, // "3"
141, // "4"
141, // "5"
141, // "6"
141, // "7"
141, // "8"
141, // "9"
143, // ":"
126, // ";"
127, // "<"
115, // "="
128, // ">"
143, // "?"
143, // "@"
140, // "A"
140, // "B"
140, // "C"
140, // "D"
140, // "E"
140, // "F"
140, // "G"
140, // "H"
140, // "I"
140, // "J"
140, // "K"
140, // "L"
140, // "M"
140, // "N"
140, // "O"
140, // "P"
140, // "Q"
140, // "R"
140, // "S"
140, // "T"
140, // "U"
140, // "V"
140, // "W"
140, // "X"
140, // "Y"
140, // "Z"
129, // "["
145, // "\"
130, // "]"
143, // "^"
139, // "_"
143, // "`"
90, // "a"
95, // "b"
88, // "c"
102, // "d"
94, // "e"
103, // "f"
112, // "g"
108, // "h"
104, // "i"
140, // "j"
99, // "k"
89, // "l"
111, // "m"
97, // "n"
96, // "o"
107, // "p"
140, // "q"
98, // "r"
91, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
113, // "z"
131, // "{"
133, // "|"
132, // "}"
143, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"start ::= ws* token*", // 2
"start ::= ws* token*", // 3
"start ::= ws* token*", // 4
"token ::= # `boolean", // 5
"token ::= # `class", // 6
"token ::= # `extends", // 7
"token ::= # `void", // 8
"token ::= # `int", // 9
"token ::= # `while", // 10
"token ::= # `if", // 11
"token ::= # `else", // 12
"token ::= # `for", // 13
"token ::= # `break", // 14
"token ::= # `this", // 15
"token ::= # `false", // 16
"token ::= # `true", // 17
"token ::= # `super", // 18
"token ::= # `null", // 19
"token ::= # `return", // 20
"token ::= # `instanceof", // 21
"token ::= # `new", // 22
"token ::= # `abstract", // 23
"token ::= # `assert", // 24
"token ::= # `byte", // 25
"token ::= # `case", // 26
"token ::= # `catch", // 27
"token ::= # `char", // 28
"token ::= # `const", // 29
"token ::= # `continue", // 30
"token ::= # `default", // 31
"token ::= # `do", // 32
"token ::= # `double", // 33
"token ::= # `enum", // 34
"token ::= # `final", // 35
"token ::= # `finally", // 36
"token ::= # `float", // 37
"token ::= # `goto", // 38
"token ::= # `implements", // 39
"token ::= # `import", // 40
"token ::= # `interface", // 41
"token ::= # `long", // 42
"token ::= # `native", // 43
"token ::= # `package", // 44
"token ::= # `private", // 45
"token ::= # `protected", // 46
"token ::= # `public", // 47
"token ::= # `short", // 48
"token ::= # `static", // 49
"token ::= # `strictfp", // 50
"token ::= # `switch", // 51
"token ::= # `synchronized", // 52
"token ::= # `throw", // 53
"token ::= # `throws", // 54
"token ::= # `transient", // 55
"token ::= # `try", // 56
"token ::= # `volatile", // 57
"token ::= # `!", // 58
"token ::= # `!=", // 59
"token ::= # `%", // 60
"token ::= # `&&", // 61
"token ::= # `*", // 62
"token ::= # `(", // 63
"token ::= # `)", // 64
"token ::= # `{", // 65
"token ::= # `}", // 66
"token ::= # `-", // 67
"token ::= # `+", // 68
"token ::= # `=", // 69
"token ::= # `==", // 70
"token ::= # `[", // 71
"token ::= # `]", // 72
"token ::= # `||", // 73
"token ::= # `<", // 74
"token ::= # `<=", // 75
"token ::= # `,", // 76
"token ::= # `>", // 77
"token ::= # `>=", // 78
"token ::= # `.", // 79
"token ::= # `;", // 80
"token ::= # `++", // 81
"token ::= # `--", // 82
"token ::= # `/", // 83
"token ::= # ID", // 84
"token ::= # INTLIT", // 85
"token ::= # STRINGLIT", // 86
"token ::= # CHARLIT", // 87
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 88
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 89
"reserved ::= `class", // 90
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 91
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 92
"reserved ::= `else", // 93
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 94
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 95
"reserved ::= `boolean", // 96
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 97
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 98
"reserved ::= `break", // 99
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 100
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 101
"reserved ::= `extends", // 102
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 103
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 104
"reserved ::= `false", // 105
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 106
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 107
"reserved ::= `for", // 108
"`if ::= \"i\" \"f\" !idChar ws*", // 109
"`if ::= \"i\" \"f\" !idChar ws*", // 110
"reserved ::= `if", // 111
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 112
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 113
"reserved ::= `instanceof", // 114
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 115
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 116
"reserved ::= `int", // 117
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 118
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 119
"reserved ::= `new", // 120
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 121
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 122
"reserved ::= `null", // 123
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 124
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 125
"reserved ::= `public", // 126
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 127
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 128
"reserved ::= `return", // 129
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 130
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 131
"reserved ::= `super", // 132
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 133
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 134
"reserved ::= `this", // 135
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 136
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 137
"reserved ::= `true", // 138
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 139
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 140
"reserved ::= `void", // 141
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 142
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 143
"reserved ::= `while", // 144
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 145
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 146
"reserved ::= `abstract", // 147
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 148
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 149
"reserved ::= `assert", // 150
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 151
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 152
"reserved ::= `byte", // 153
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 154
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 155
"reserved ::= `case", // 156
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 157
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 158
"reserved ::= `catch", // 159
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 160
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 161
"reserved ::= `char", // 162
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 163
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 164
"reserved ::= `const", // 165
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 166
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 167
"reserved ::= `continue", // 168
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 169
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 170
"reserved ::= `default", // 171
"`do ::= \"d\" \"o\" !idChar ws*", // 172
"`do ::= \"d\" \"o\" !idChar ws*", // 173
"reserved ::= `do", // 174
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 175
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 176
"reserved ::= `double", // 177
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 178
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 179
"reserved ::= `enum", // 180
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 181
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 182
"reserved ::= `final", // 183
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 184
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 185
"reserved ::= `finally", // 186
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 187
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 188
"reserved ::= `float", // 189
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 190
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 191
"reserved ::= `goto", // 192
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 193
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 194
"reserved ::= `implements", // 195
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 196
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 197
"reserved ::= `import", // 198
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 199
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 200
"reserved ::= `interface", // 201
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 202
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 203
"reserved ::= `long", // 204
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 205
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 206
"reserved ::= `native", // 207
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 208
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 209
"reserved ::= `package", // 210
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 211
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 212
"reserved ::= `private", // 213
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 214
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 215
"reserved ::= `protected", // 216
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 217
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 218
"reserved ::= `short", // 219
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 220
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 221
"reserved ::= `static", // 222
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 223
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 224
"reserved ::= `strictfp", // 225
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 226
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 227
"reserved ::= `switch", // 228
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 229
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 230
"reserved ::= `synchronized", // 231
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 232
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 233
"reserved ::= `throw", // 234
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 235
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 236
"reserved ::= `throws", // 237
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 238
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 239
"reserved ::= `transient", // 240
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 241
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 242
"reserved ::= `try", // 243
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 244
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 245
"reserved ::= `volatile", // 246
"`! ::= \"!\" !\"=\" ws*", // 247
"`! ::= \"!\" !\"=\" ws*", // 248
"`!= ::= \"!\" \"=\" ws*", // 249
"`!= ::= \"!\" \"=\" ws*", // 250
"`% ::= \"%\" ws*", // 251
"`% ::= \"%\" ws*", // 252
"`&& ::= \"&\" \"&\" ws*", // 253
"`&& ::= \"&\" \"&\" ws*", // 254
"`( ::= \"(\" ws*", // 255
"`( ::= \"(\" ws*", // 256
"`) ::= \")\" ws*", // 257
"`) ::= \")\" ws*", // 258
"`* ::= \"*\" ws*", // 259
"`* ::= \"*\" ws*", // 260
"`+ ::= \"+\" !\"+\" ws*", // 261
"`+ ::= \"+\" !\"+\" ws*", // 262
"`++ ::= \"+\" \"+\" ws*", // 263
"`++ ::= \"+\" \"+\" ws*", // 264
"`, ::= \",\" ws*", // 265
"`, ::= \",\" ws*", // 266
"`- ::= \"-\" !\"-\" ws*", // 267
"`- ::= \"-\" !\"-\" ws*", // 268
"`-- ::= \"-\" \"-\" ws*", // 269
"`-- ::= \"-\" \"-\" ws*", // 270
"`. ::= \".\" ws*", // 271
"`. ::= \".\" ws*", // 272
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 273
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 274
"`; ::= \";\" ws*", // 275
"`; ::= \";\" ws*", // 276
"`< ::= \"<\" !\"=\" ws*", // 277
"`< ::= \"<\" !\"=\" ws*", // 278
"`<= ::= \"<\" \"=\" ws*", // 279
"`<= ::= \"<\" \"=\" ws*", // 280
"`= ::= \"=\" !\"=\" ws*", // 281
"`= ::= \"=\" !\"=\" ws*", // 282
"`== ::= \"=\" \"=\" ws*", // 283
"`== ::= \"=\" \"=\" ws*", // 284
"`> ::= \">\" !\"=\" ws*", // 285
"`> ::= \">\" !\"=\" ws*", // 286
"`>= ::= \">\" \"=\" ws*", // 287
"`>= ::= \">\" \"=\" ws*", // 288
"`[ ::= \"[\" ws*", // 289
"`[ ::= \"[\" ws*", // 290
"`] ::= \"]\" ws*", // 291
"`] ::= \"]\" ws*", // 292
"`{ ::= \"{\" ws*", // 293
"`{ ::= \"{\" ws*", // 294
"`} ::= \"}\" ws*", // 295
"`} ::= \"}\" ws*", // 296
"`|| ::= \"|\" \"|\" ws*", // 297
"`|| ::= \"|\" \"|\" ws*", // 298
"intLit2 ::= !\"0\" digit++", // 299
"idChar ::= letter", // 300
"idChar ::= digit", // 301
"idChar ::= \"_\"", // 302
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 303
"digit ::= {\"0\"..\"9\"}", // 304
"printableChar ::= {\" \"..\"~\"}", // 305
"ws ::= {9 \" \"}", // 306
"ws ::= eol", // 307
"ws ::= singleLineComment", // 308
"ws ::= multiLineComment", // 309
"eol ::= {10} registerNewline", // 310
"eol ::= {13} {10} registerNewline", // 311
"eol ::= {13} !10 registerNewline", // 312
"ID ::= # !reserved letter idChar** ws*", // 313
"ID ::= # !reserved letter idChar** ws*", // 314
"ID ::= # !reserved letter idChar** ws*", // 315
"ID ::= # !reserved letter idChar** ws*", // 316
"INTLIT ::= # \"0\" !digit ws*", // 317
"INTLIT ::= # \"0\" !digit ws*", // 318
"INTLIT ::= # intLit2 ws*", // 319
"INTLIT ::= # intLit2 ws*", // 320
"CHARLIT ::= # \"\'\" !{\"\'\" \"\\\"} printableChar \"\'\" ws*", // 321
"CHARLIT ::= # \"\'\" !{\"\'\" \"\\\"} printableChar \"\'\" ws*", // 322
"STRINGLIT ::= # \'\"\' validStringCharacter** \'\"\' ws*", // 323
"STRINGLIT ::= # \'\"\' validStringCharacter** \'\"\' ws*", // 324
"validStringCharacter ::= !{\'\"\' \"\\\"} printableChar", // 325
"singleLineComment ::= \"/\" \"/\" printableChar** eol", // 326
"singleLineComment ::= \"/\" \"/\" printableChar** eol", // 327
"multiLineCommentStart ::= \"/\" \"*\"", // 328
"multiLineCommentEnd ::= \"*\" \"/\"", // 329
"commentSymbol ::= multiLineCommentStart", // 330
"commentSymbol ::= multiLineCommentEnd", // 331
"commentContent ::= !commentSymbol printableChar", // 332
"commentContent ::= eol", // 333
"multiLineComment ::= multiLineCommentStart commentContent** multiLineCommentEnd", // 334
"multiLineComment ::= multiLineCommentStart commentContent** multiLineCommentEnd", // 335
"commentContent** ::= commentContent* !commentContent", // 336
"validStringCharacter** ::= validStringCharacter* !validStringCharacter", // 337
"idChar** ::= idChar* !idChar", // 338
"ws* ::= ws* ws", // 339
"ws* ::= ws* ws", // 340
"printableChar** ::= printableChar* !printableChar", // 341
"token* ::= token* token", // 342
"token* ::= token* token", // 343
"digit++ ::= digit+ !digit", // 344
"validStringCharacter* ::= validStringCharacter* validStringCharacter", // 345
"validStringCharacter* ::= validStringCharacter* validStringCharacter", // 346
"digit+ ::= digit", // 347
"digit+ ::= digit+ digit", // 348
"printableChar* ::= printableChar* printableChar", // 349
"printableChar* ::= printableChar* printableChar", // 350
"commentContent* ::= commentContent* commentContent", // 351
"commentContent* ::= commentContent* commentContent", // 352
"idChar* ::= idChar* idChar", // 353
"idChar* ::= idChar* idChar", // 354
"", // 355
"", // 356
"", // 357
"", // 358
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 89: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 90: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 91: `else ::= "e" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 92: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 93: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 94: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 95: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 96: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 97: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 98: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 99: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 100: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 101: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 102: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 103: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 104: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 105: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 106: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 109: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 110: `if ::= "i" "f" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 112: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 113: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 114: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 115: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 118: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 121: `null ::= "n" "u" "l" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 122: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 123: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 124: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 125: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 126: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 127: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 128: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 129: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 130: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 131: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 132: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 133: `this ::= "t" "h" "i" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 134: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 135: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 136: `true ::= "t" "r" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 137: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 138: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 139: `void ::= "v" "o" "i" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 140: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 141: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 142: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 143: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 144: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 145: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 146: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 147: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 148: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 149: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 150: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 151: `byte ::= "b" "y" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 152: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 153: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 154: `case ::= "c" "a" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 155: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 156: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 157: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 158: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 159: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 160: `char ::= "c" "h" "a" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 161: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 162: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 163: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 164: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 165: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 166: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 167: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 168: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 169: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 170: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 171: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 172: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 173: `do ::= "d" "o" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 174: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 175: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 176: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 177: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 178: `enum ::= "e" "n" "u" "m" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 179: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 180: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 181: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 182: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 183: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 184: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 185: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 186: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 187: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 188: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 189: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: `goto ::= "g" "o" "t" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 191: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 192: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 194: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 195: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 197: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 198: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 200: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 201: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: `long ::= "l" "o" "n" "g" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 203: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 204: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 206: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 207: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 209: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 210: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 212: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 213: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 215: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 216: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 218: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 219: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 221: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 222: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 224: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 225: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 227: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 228: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 230: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 231: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 233: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 234: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 236: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 237: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 239: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 240: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 242: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 243: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 245: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 246: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `! ::= "!" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 250: `!= ::= "!" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 251: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 254: `&& ::= "&" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 255: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `+ ::= "+" !"+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: `++ ::= "+" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 265: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `, ::= "," [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `- ::= "-" !"-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 270: `-- ::= "-" "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `. ::= "." [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `/ ::= !"*" "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `/ ::= !"*" "/" !{"*" "/"} [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `< ::= "<" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 280: `<= ::= "<" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 281: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `= ::= "=" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `== ::= "=" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 285: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `> ::= ">" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `>= ::= ">" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 289: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 291: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 292: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 298: `|| ::= "|" "|" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 299: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 300: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 301: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 302: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 303: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 304: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 305: printableChar ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 306: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 307: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 308: ws ::= singleLineComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 309: ws ::= multiLineComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 310: eol ::= {10} [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 311: eol ::= {13} {10} [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 312: eol ::= {13} !10 [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 313: ID ::= !reserved [#] letter idChar** $$1 @idToString(int,Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 314: ID ::= !reserved [#] letter idChar** [ws*] @idToString(int,Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 315: ID ::= !reserved [#] letter !idChar [idChar**] $$1 @idToString(int,Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 316: ID ::= !reserved [#] letter !idChar [idChar**] [ws*] @idToString(int,Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 317: INTLIT ::= [#] "0" !digit ws* @presentZeroAsInt(int,Character)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 318: INTLIT ::= [#] "0" !digit [ws*] @presentZeroAsInt(int,Character)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 319: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 320: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 321: CHARLIT ::= [#] "'" !{"'" "\"} printableChar "'" ws* @charToInt(int,Character,Character,Character)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 322: CHARLIT ::= [#] "'" !{"'" "\"} printableChar "'" [ws*] @charToInt(int,Character,Character,Character)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 323: STRINGLIT ::= [#] '"' validStringCharacter** $$2 @stripQuotesFromString(int,Character,List<Character>,Character)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 324: STRINGLIT ::= [#] '"' !validStringCharacter [validStringCharacter**] $$2 @stripQuotesFromString(int,Character,List<Character>,Character)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 325: validStringCharacter ::= !{'"' "\"} printableChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 326: singleLineComment ::= "/" "/" printableChar** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 327: singleLineComment ::= "/" "/" !printableChar [printableChar**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 328: multiLineCommentStart ::= "/" "*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 329: multiLineCommentEnd ::= "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 330: commentSymbol ::= multiLineCommentStart @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: commentSymbol ::= multiLineCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 332: commentContent ::= !commentSymbol printableChar @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 333: commentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 334: multiLineComment ::= multiLineCommentStart commentContent** multiLineCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 335: multiLineComment ::= multiLineCommentStart !commentContent [commentContent**] multiLineCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 336: commentContent** ::= commentContent* !commentContent @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: validStringCharacter** ::= validStringCharacter* !validStringCharacter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 338: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 339: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 341: printableChar** ::= printableChar* !printableChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 343: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 344: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: validStringCharacter* ::= validStringCharacter* validStringCharacter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 346: validStringCharacter* ::= [validStringCharacter*] validStringCharacter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 347: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 348: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 349: printableChar* ::= printableChar* printableChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 350: printableChar* ::= [printableChar*] printableChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 351: commentContent* ::= commentContent* commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 352: commentContent* ::= [commentContent*] commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 353: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 355: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 356: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 357: $$2 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 358: $$2 ::= '"' [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "validStringCharacter** ::= validStringCharacter* !validStringCharacter", // validStringCharacter**
    "commentContent** ::= commentContent* !commentContent", // commentContent**
    "commentContent* ::=", // commentContent*
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "printableChar* ::=", // printableChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "printableChar** ::= printableChar* !printableChar", // printableChar**
    "validStringCharacter* ::=", // validStringCharacter*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // validStringCharacter**
      ((10<<5)|0x6)/*nullProductionAction:10*/,
    },
    { // commentContent**
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // commentContent*
    },
    { // start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // ws*
    },
    { // printableChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // printableChar**
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // validStringCharacter*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      String result = actionObject.idToString(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 84: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      int result = actionObject.presentZeroAsInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      Character parm2 = (Character)si.popPb();
      Character parm3 = (Character)si.popPb();
      int result = actionObject.charToInt(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      Character parm3 = (Character)si.popPb();
      String result = actionObject.stripQuotesFromString(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"String idToString(int,Character,List<Character>)",
"int presentZeroAsInt(int,Character)",
"int convertToInt(int,String)",
"int charToInt(int,Character,Character,Character)",
"String stripQuotesFromString(int,Character,List<Character>,Character)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
3,1,
2,1,
2,1,
4,1,
4,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    0,
    -1,
    0,
    0,
    0,
    -1,
    -1,
    1,
    0,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
