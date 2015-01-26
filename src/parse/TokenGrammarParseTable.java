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
public int getEofSym() { return 183; }
public int getNttSym() { return 184; }
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
"{\"G\"..\"W\" \"Y\"..\"Z\" \"j\" \"q\"}",
"{\"A\"..\"F\"}",
"\"X\"",
"{\"1\"..\"7\"}",
"{\"8\"..\"9\"}",
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
"octalDigit",
"octalDigit**",
"$$2",
"hex",
"hexVal",
"hexVal++",
"validStringCharacter**",
"$$3",
"validStringCharacter",
"printableChar**",
"multiLineCommentStart",
"multiLineCommentEnd",
"invalidCommentContent",
"validCommentContent",
"validCommentContent**",
"validStringCharacter*",
"idChar*",
"validCommentContent*",
"hexVal+",
"printableChar*",
"octalDigit*",
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
public int numSymbols() { return 185;}
private static final int MIN_REDUCTION = 1650;
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
0x80000000|547, // match move
0x80000000|1107, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 2
  }
,
{ // state 3
-1, // $$start
-1, // start
1349, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+260, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 4
2,46, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 5
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+154, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+154, // $
MIN_REDUCTION+154, // $NT
  }
,
{ // state 6
0x80000000|821, // match move
0x80000000|296, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 7
0x80000000|1463, // match move
0x80000000|893, // no-match move
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+283, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 9
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+275, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 10
184,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 11
0x80000000|2, // match move
0x80000000|1170, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 12
0x80000000|506, // match move
0x80000000|615, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 13
0x80000000|1053, // match move
0x80000000|968, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 14
-1, // $$start
-1, // start
282, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+140, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+140, // "k"
MIN_REDUCTION+140, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+140, // "u"
33, // "p"
MIN_REDUCTION+140, // "h"
1193, // "v"
MIN_REDUCTION+140, // "y"
MIN_REDUCTION+140, // "m"
421, // "g"
MIN_REDUCTION+140, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+140, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+140, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+140, // {"A".."F"}
MIN_REDUCTION+140, // "X"
MIN_REDUCTION+140, // {"1".."7"}
MIN_REDUCTION+140, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 15
0x80000000|617, // match move
0x80000000|1013, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 16
0x80000000|1036, // match move
0x80000000|1502, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 17
0x80000000|2, // match move
0x80000000|1045, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 18
0x80000000|875, // match move
0x80000000|1560, // no-match move
0x80000000|1201, // NT-test-match state for digit
  }
,
{ // state 19
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 20
0x80000000|1032, // match move
0x80000000|1421, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 21
0x80000000|760, // match move
0x80000000|598, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 22
96,1547, // "o"
  }
,
{ // state 23
2,164, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 24
0x80000000|239, // match move
0x80000000|824, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 25
98,317, // "r"
  }
,
{ // state 26
2,609, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 27
2,408, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 28
117,1326, // "&"
  }
,
{ // state 29
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 30
0x80000000|385, // match move
0x80000000|214, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 31
0x80000000|4, // match move
0x80000000|241, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 32
2,1579, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 33
90,935, // "a"
98,1135, // "r"
106,1118, // "u"
  }
,
{ // state 34
0x80000000|1189, // match move
0x80000000|1348, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 35
2,910, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 36
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 37
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 38
101,1400, // "t"
  }
,
{ // state 39
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+297, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 40
0x80000000|2, // match move
0x80000000|1561, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 41
0x80000000|1232, // match move
0x80000000|3, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 42
0x80000000|402, // match move
0x80000000|1442, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 43
0x80000000|1496, // match move
0x80000000|139, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 44
184,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 45
184,MIN_REDUCTION+153, // $NT
  }
,
{ // state 46
0x80000000|1008, // match move
0x80000000|1341, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 47
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 48
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 49
0x80000000|1027, // match move
0x80000000|1067, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 50
0x80000000|485, // match move
0x80000000|1454, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 51
2,332, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 52
0x80000000|559, // match move
0x80000000|1556, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 53
184,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 55
0x80000000|1200, // match move
0x80000000|710, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 56
0x80000000|520, // match move
0x80000000|1471, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 57
101,1339, // "t"
  }
,
{ // state 58
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 59
0x80000000|339, // match move
0x80000000|848, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 60
0x80000000|1575, // match move
0x80000000|887, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 61
0x80000000|302, // match move
0x80000000|769, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 62
101,892, // "t"
  }
,
{ // state 63
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 64
2,394, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 65
2,1024, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 67
-1, // $$start
-1, // start
738, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+170, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+170, // "k"
MIN_REDUCTION+170, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+170, // "u"
33, // "p"
MIN_REDUCTION+170, // "h"
1193, // "v"
MIN_REDUCTION+170, // "y"
MIN_REDUCTION+170, // "m"
421, // "g"
MIN_REDUCTION+170, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+170, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+170, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+170, // {"A".."F"}
MIN_REDUCTION+170, // "X"
MIN_REDUCTION+170, // {"1".."7"}
MIN_REDUCTION+170, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 68
184,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 70
0x80000000|451, // match move
0x80000000|1275, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 71
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 72
0x80000000|1605, // match move
0x80000000|779, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 73
0x80000000|203, // match move
0x80000000|1052, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 74
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 75
89,1510, // "l"
  }
,
{ // state 76
90,1508, // "a"
  }
,
{ // state 77
0x80000000|1163, // match move
0x80000000|853, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 78
0x80000000|32, // match move
0x80000000|1461, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 79
184,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 80
0x80000000|338, // match move
0x80000000|5, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 81
184,MIN_REDUCTION+183, // $NT
  }
,
{ // state 82
184,MIN_REDUCTION+312, // $NT
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 84
-1, // $$start
-1, // start
847, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+239, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+239, // "k"
MIN_REDUCTION+239, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+239, // "u"
33, // "p"
MIN_REDUCTION+239, // "h"
1193, // "v"
MIN_REDUCTION+239, // "y"
MIN_REDUCTION+239, // "m"
421, // "g"
MIN_REDUCTION+239, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+239, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+239, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+239, // {"A".."F"}
MIN_REDUCTION+239, // "X"
MIN_REDUCTION+239, // {"1".."7"}
MIN_REDUCTION+239, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 85
-1, // $$start
-1, // start
1325, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+167, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+167, // "k"
MIN_REDUCTION+167, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+167, // "u"
33, // "p"
MIN_REDUCTION+167, // "h"
1193, // "v"
MIN_REDUCTION+167, // "y"
MIN_REDUCTION+167, // "m"
421, // "g"
MIN_REDUCTION+167, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+167, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+167, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+167, // {"A".."F"}
MIN_REDUCTION+167, // "X"
MIN_REDUCTION+167, // {"1".."7"}
MIN_REDUCTION+167, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 86
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 87
184,MIN_REDUCTION+213, // $NT
  }
,
{ // state 88
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 89
2,336, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 90
0x80000000|745, // match move
0x80000000|1645, // no-match move
// T-test match for {"X" "x"}:
100,
142,
  }
,
{ // state 91
2,668, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 92
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 93
0x80000000|1309, // match move
0x80000000|90, // no-match move
0x80000000|1323, // NT-test-match state for octalDigit
  }
,
{ // state 94
94,1603, // "e"
  }
,
{ // state 95
0x80000000|64, // match move
0x80000000|504, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 96
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 97
125,1240, // "/"
170,978, // multiLineCommentStart
  }
,
{ // state 98
2,408, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 100
94,1594, // "e"
  }
,
{ // state 101
0x80000000|2, // match move
0x80000000|1495, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 102
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 103
184,MIN_REDUCTION+327, // $NT
  }
,
{ // state 104
0x80000000|487, // match move
0x80000000|1026, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 105
0x80000000|374, // match move
0x80000000|761, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 106
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 107
97,768, // "n"
  }
,
{ // state 108
0x80000000|983, // match move
0x80000000|360, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 109
102,718, // "d"
  }
,
{ // state 110
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 111
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 113
184,MIN_REDUCTION+305, // $NT
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 114
0x80000000|1070, // match move
0x80000000|540, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 115
0x80000000|1089, // match move
0x80000000|582, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 116
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 117
184,MIN_REDUCTION+243, // $NT
  }
,
{ // state 118
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 119
0x80000000|337, // match move
0x80000000|874, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 120
-1, // $$start
-1, // start
16, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+122, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+122, // "k"
MIN_REDUCTION+122, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+122, // "u"
33, // "p"
MIN_REDUCTION+122, // "h"
1193, // "v"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
421, // "g"
MIN_REDUCTION+122, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+122, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+122, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+122, // {"A".."F"}
MIN_REDUCTION+122, // "X"
MIN_REDUCTION+122, // {"1".."7"}
MIN_REDUCTION+122, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 121
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 122
4,1222, // token
58,58, // `!
59,673, // `!=
60,138, // `%
61,355, // `&&
62,1543, // `*
63,234, // `(
64,1148, // `)
65,255, // `{
66,541, // `}
67,1091, // `-
68,573, // `+
69,210, // `=
70,500, // `==
71,1115, // `[
72,584, // `]
73,237, // `||
74,969, // `<
75,1105, // `<=
76,1354, // `,
77,984, // `>
78,642, // `>=
79,465, // `.
80,1144, // `;
81,1081, // `++
82,144, // `--
84,512, // ID
85,135, // INTLIT
86,1585, // STRINGLIT
87,1083, // CHARLIT
120,218, // "*"
134,572, // intLit2
136,274, // digit++
137,807, // letter
138,652, // digit
182,128, // digit+
  }
,
{ // state 123
101,94, // "t"
  }
,
{ // state 124
-1, // $$start
-1, // start
163, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+221, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+221, // "k"
MIN_REDUCTION+221, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+221, // "u"
33, // "p"
MIN_REDUCTION+221, // "h"
1193, // "v"
MIN_REDUCTION+221, // "y"
MIN_REDUCTION+221, // "m"
421, // "g"
MIN_REDUCTION+221, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+221, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+221, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+221, // {"A".."F"}
MIN_REDUCTION+221, // "X"
MIN_REDUCTION+221, // {"1".."7"}
MIN_REDUCTION+221, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 125
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 126
0x80000000|816, // match move
0x80000000|701, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 127
94,1142, // "e"
  }
,
{ // state 128
0x80000000|1327, // match move
0x80000000|814, // no-match move
0x80000000|1201, // NT-test-match state for digit
  }
,
{ // state 129
-1, // $$start
-1, // start
-1, // ws*
1272, // $$0
367, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
-1, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
793, // token*
128, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 130
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 131
0x80000000|1449, // match move
0x80000000|281, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 132
101,1257, // "t"
  }
,
{ // state 133
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 134
184,MIN_REDUCTION+120, // $NT
  }
,
{ // state 135
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 137
104,660, // "i"
  }
,
{ // state 138
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 139
-1, // $$start
-1, // start
15, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+119, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+119, // "k"
MIN_REDUCTION+119, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+119, // "u"
33, // "p"
MIN_REDUCTION+119, // "h"
1193, // "v"
MIN_REDUCTION+119, // "y"
MIN_REDUCTION+119, // "m"
421, // "g"
MIN_REDUCTION+119, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+119, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+119, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+119, // {"A".."F"}
MIN_REDUCTION+119, // "X"
MIN_REDUCTION+119, // {"1".."7"}
MIN_REDUCTION+119, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 140
0x80000000|2, // match move
0x80000000|567, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 141
0x80000000|1119, // match move
0x80000000|565, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 142
0x80000000|676, // match move
0x80000000|966, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 143
88,1518, // "c"
90,1518, // "a"
94,1518, // "e"
95,1518, // "b"
102,1518, // "d"
103,1518, // "f"
135,1368, // "0"
138,831, // digit
141,965, // {"A".."F"}
143,1368, // {"1".."7"}
144,1368, // {"8".."9"}
164,1082, // hexVal
  }
,
{ // state 144
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 145
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 146
0x80000000|2, // match move
0x80000000|515, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 147
-1, // $$start
-1, // start
472, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
-1, // `=
-1, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
MIN_REDUCTION+286, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+286, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 148
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+281, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 149
0x80000000|1131, // match move
0x80000000|1402, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 150
101,917, // "t"
  }
,
{ // state 151
2,7, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 152
0x80000000|151, // match move
0x80000000|419, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 153
0x80000000|885, // match move
0x80000000|1042, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 154
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 155
2,165, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 156
0x80000000|2, // match move
0x80000000|842, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 157
184,MIN_REDUCTION+174, // $NT
  }
,
{ // state 158
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 160
-1, // $$start
-1, // start
1305, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+179, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+179, // "k"
MIN_REDUCTION+179, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+179, // "u"
33, // "p"
MIN_REDUCTION+179, // "h"
1193, // "v"
MIN_REDUCTION+179, // "y"
MIN_REDUCTION+179, // "m"
421, // "g"
MIN_REDUCTION+179, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+179, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+179, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+179, // {"A".."F"}
MIN_REDUCTION+179, // "X"
MIN_REDUCTION+179, // {"1".."7"}
MIN_REDUCTION+179, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 161
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+255, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 162
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 163
0x80000000|175, // match move
0x80000000|473, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 164
0x80000000|1467, // match move
0x80000000|1406, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 165
0x80000000|946, // match move
0x80000000|518, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 166
184,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 167
0x80000000|1601, // match move
0x80000000|80, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 168
0x80000000|1464, // match move
0x80000000|73, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 169
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+202, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+202, // $
MIN_REDUCTION+202, // $NT
  }
,
{ // state 170
104,920, // "i"
  }
,
{ // state 171
90,1530, // "a"
94,1448, // "e"
106,372, // "u"
  }
,
{ // state 172
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 173
184,MIN_REDUCTION+240, // $NT
  }
,
{ // state 174
0x80000000|656, // match move
0x80000000|1475, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 175
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 177
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+151, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+151, // $
MIN_REDUCTION+151, // $NT
  }
,
{ // state 178
0x80000000|1210, // match move
0x80000000|1401, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 179
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 180
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+190, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+190, // $
MIN_REDUCTION+190, // $NT
  }
,
{ // state 181
-1, // $$start
-1, // start
1465, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+200, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+200, // "k"
MIN_REDUCTION+200, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+200, // "u"
33, // "p"
MIN_REDUCTION+200, // "h"
1193, // "v"
MIN_REDUCTION+200, // "y"
MIN_REDUCTION+200, // "m"
421, // "g"
MIN_REDUCTION+200, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+200, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+200, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+200, // {"A".."F"}
MIN_REDUCTION+200, // "X"
MIN_REDUCTION+200, // {"1".."7"}
MIN_REDUCTION+200, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 182
0x80000000|1152, // match move
0x80000000|197, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 183
0x80000000|2, // match move
0x80000000|1568, // no-match move
// T-test match for {'"' "\"}:
148,
150,
  }
,
{ // state 184
0x80000000|1517, // match move
0x80000000|1451, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 185
0x80000000|595, // match move
0x80000000|265, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 186
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 187
184,MIN_REDUCTION+308, // $NT
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 188
0x80000000|690, // match move
0x80000000|438, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 189
0x80000000|1160, // match move
0x80000000|537, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 190
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+175, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+175, // $
MIN_REDUCTION+175, // $NT
  }
,
{ // state 191
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 193
2,739, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 194
150,556, // '"'
166,287, // validStringCharacter**
167,260, // $$3
175,896, // validStringCharacter*
  }
,
{ // state 195
0x80000000|1542, // match move
0x80000000|546, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 196
0x80000000|669, // match move
0x80000000|41, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 197
0x80000000|1565, // match move
0x80000000|886, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 198
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 199
120,1150, // "*"
  }
,
{ // state 200
184,MIN_REDUCTION+339, // $NT
  }
,
{ // state 201
2,609, // ws*
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 202
0x80000000|1010, // match move
0x80000000|1590, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 203
2,1393, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 204
0x80000000|1491, // match move
0x80000000|307, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 205
0x80000000|1426, // match move
0x80000000|916, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 206
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 207
0x80000000|106, // match move
0x80000000|859, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 208
104,1353, // "i"
108,1514, // "h"
  }
,
{ // state 209
135,1247, // "0"
143,1247, // {"1".."7"}
160,1162, // octalDigit
  }
,
{ // state 210
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 211
0x80000000|694, // match move
0x80000000|1512, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 212
2,34, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 213
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 214
0x80000000|403, // match move
0x80000000|931, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 215
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+169, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+169, // $
MIN_REDUCTION+169, // $NT
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
{ // state 216
94,655, // "e"
  }
,
{ // state 217
0x80000000|365, // match move
0x80000000|1433, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 218
0x80000000|980, // match move
0x80000000|196, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 219
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 220
-1, // $$start
-1, // start
1300, // ws*
-1, // $$0
MIN_REDUCTION+316, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+316, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+316, // "k"
MIN_REDUCTION+316, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+316, // "u"
33, // "p"
MIN_REDUCTION+316, // "h"
1193, // "v"
MIN_REDUCTION+316, // "y"
MIN_REDUCTION+316, // "m"
421, // "g"
MIN_REDUCTION+316, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+316, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+316, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+316, // {"A".."F"}
MIN_REDUCTION+316, // "X"
MIN_REDUCTION+316, // {"1".."7"}
MIN_REDUCTION+316, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
544, // idChar**
1054, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
766, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+316, // $
-1, // $NT
  }
,
{ // state 221
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 222
0x80000000|1196, // match move
0x80000000|1624, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 223
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 224
153,349, // eol
156,1631, // {10}
157,594, // {13}
  }
,
{ // state 225
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 226
96,1146, // "o"
  }
,
{ // state 227
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 229
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+157, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+157, // $
MIN_REDUCTION+157, // $NT
  }
,
{ // state 230
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 231
0x80000000|2, // match move
0x80000000|72, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 232
0x80000000|1237, // match move
0x80000000|996, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 233
0x80000000|855, // match move
0x80000000|549, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 234
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 235
184,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 236
184,MIN_REDUCTION+304, // $NT
  }
,
{ // state 237
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 238
2,217, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 239
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 240
184,MIN_REDUCTION+309, // $NT
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 241
-1, // $$start
-1, // start
46, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+143, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+143, // "k"
MIN_REDUCTION+143, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+143, // "u"
33, // "p"
MIN_REDUCTION+143, // "h"
1193, // "v"
MIN_REDUCTION+143, // "y"
MIN_REDUCTION+143, // "m"
421, // "g"
MIN_REDUCTION+143, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+143, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+143, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+143, // {"A".."F"}
MIN_REDUCTION+143, // "X"
MIN_REDUCTION+143, // {"1".."7"}
MIN_REDUCTION+143, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 242
0x80000000|65, // match move
0x80000000|1078, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 243
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 244
184,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 245
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+259, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 246
0x80000000|843, // match move
0x80000000|1522, // no-match move
0x80000000|1378, // NT-test-match state for invalidCommentContent
  }
,
{ // state 247
101,723, // "t"
  }
,
{ // state 248
102,785, // "d"
  }
,
{ // state 249
0x80000000|2, // match move
0x80000000|77, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 250
2,204, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 251
184,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 252
0x80000000|243, // match move
0x80000000|39, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 253
184,MIN_REDUCTION+207, // $NT
  }
,
{ // state 254
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 256
0x80000000|456, // match move
0x80000000|536, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 257
2,872, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 258
0x80000000|692, // match move
0x80000000|482, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 259
184,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 261
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 262
0x80000000|522, // match move
0x80000000|310, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 263
2,1563, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 264
2,1039, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 265
-1, // $$start
-1, // start
1418, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+215, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+215, // "k"
MIN_REDUCTION+215, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+215, // "u"
33, // "p"
MIN_REDUCTION+215, // "h"
1193, // "v"
MIN_REDUCTION+215, // "y"
MIN_REDUCTION+215, // "m"
421, // "g"
MIN_REDUCTION+215, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+215, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+215, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+215, // {"A".."F"}
MIN_REDUCTION+215, // "X"
MIN_REDUCTION+215, // {"1".."7"}
MIN_REDUCTION+215, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 266
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 267
2,1640, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 268
0x80000000|1521, // match move
0x80000000|479, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 269
139,MIN_REDUCTION+303, // "_"
158,MIN_REDUCTION+303, // idChar**
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 270
0x80000000|589, // match move
0x80000000|914, // no-match move
// T-test match for {"*" "/"}:
120,
125,
  }
,
{ // state 271
0x80000000|1279, // match move
0x80000000|415, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 272
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 273
184,MIN_REDUCTION+216, // $NT
  }
,
{ // state 274
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 275
0x80000000|464, // match move
0x80000000|592, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 276
107,1219, // "p"
  }
,
{ // state 277
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+223, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+223, // $
MIN_REDUCTION+223, // $NT
  }
,
{ // state 278
0x80000000|2, // match move
0x80000000|56, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 279
184,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 280
89,1117, // "l"
96,1060, // "o"
  }
,
{ // state 281
-1, // $$start
-1, // start
561, // ws*
-1, // $$0
MIN_REDUCTION+331, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+331, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+331, // $
-1, // $NT
  }
,
{ // state 282
0x80000000|37, // match move
0x80000000|1620, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 283
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+115, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+115, // $
MIN_REDUCTION+115, // $NT
  }
,
{ // state 284
0x80000000|1573, // match move
0x80000000|1553, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 285
90,964, // "a"
  }
,
{ // state 286
0x80000000|1256, // match move
0x80000000|242, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 287
150,556, // '"'
167,868, // $$3
  }
,
{ // state 288
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 289
90,62, // "a"
98,934, // "r"
108,1293, // "h"
  }
,
{ // state 290
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 291
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+139, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+139, // $
MIN_REDUCTION+139, // $NT
  }
,
{ // state 292
0x80000000|1303, // match move
0x80000000|787, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 293
0x80000000|391, // match move
0x80000000|1616, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 294
0x80000000|797, // match move
0x80000000|86, // no-match move
0x80000000|1201, // NT-test-match state for digit
  }
,
{ // state 295
0x80000000|2, // match move
0x80000000|1061, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 296
0x80000000|778, // match move
0x80000000|1392, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 297
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 298
0x80000000|2, // match move
0x80000000|553, // no-match move
// T-test match for {'"' "\"}:
148,
150,
  }
,
{ // state 299
88,432, // "c"
  }
,
{ // state 300
91,11, // "s"
  }
,
{ // state 301
184,MIN_REDUCTION+171, // $NT
  }
,
{ // state 302
2,1241, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 303
184,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 304
0x80000000|1233, // match move
0x80000000|925, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 305
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 306
0x80000000|1197, // match move
0x80000000|1509, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 307
0x80000000|622, // match move
0x80000000|1369, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 308
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 309
94,962, // "e"
  }
,
{ // state 310
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+374, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+374, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+374, // $
-1, // $NT
  }
,
{ // state 311
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 312
0x80000000|800, // match move
0x80000000|376, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 313
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 314
0x80000000|767, // match move
0x80000000|232, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 315
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 316
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 317
0x80000000|2, // match move
0x80000000|858, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 318
184,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 319
184,MIN_REDUCTION+210, // $NT
  }
,
{ // state 320
2,7, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 321
0x80000000|26, // match move
0x80000000|60, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 322
0x80000000|2, // match move
0x80000000|826, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 323
0x80000000|693, // match move
0x80000000|429, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 324
0x80000000|2, // match move
0x80000000|115, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 325
97,1068, // "n"
103,1031, // "f"
111,825, // "m"
  }
,
{ // state 326
115,1546, // "="
  }
,
{ // state 327
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+118, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 328
0x80000000|1531, // match move
0x80000000|1063, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 329
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 332
0x80000000|1320, // match move
0x80000000|1263, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 333
2,332, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 334
5,1158, // `boolean
6,1004, // `class
7,1065, // `extends
8,1056, // `void
9,498, // `int
10,721, // `while
11,1092, // `if
12,786, // `else
13,878, // `for
14,1488, // `break
15,927, // `this
16,428, // `false
17,898, // `true
18,1489, // `super
19,626, // `null
20,1088, // `return
21,1633, // `instanceof
22,134, // `new
23,441, // `abstract
24,836, // `assert
25,45, // `byte
26,1296, // `case
27,1536, // `catch
28,343, // `char
29,496, // `const
30,1310, // `continue
31,301, // `default
32,157, // `do
33,774, // `double
34,638, // `enum
35,81, // `final
36,730, // `finally
37,395, // `float
38,1493, // `goto
39,475, // `implements
40,606, // `import
41,400, // `interface
42,930, // `long
43,253, // `native
44,319, // `package
45,87, // `private
46,273, // `protected
47,410, // `public
48,1581, // `short
49,1182, // `static
50,1623, // `strictfp
51,1459, // `switch
52,993, // `synchronized
53,664, // `throw
54,1490, // `throws
55,173, // `transient
56,117, // `try
57,1403, // `volatile
88,1483, // "c"
89,1129, // "l"
90,629, // "a"
91,1404, // "s"
94,351, // "e"
95,879, // "b"
97,171, // "n"
98,517, // "r"
101,1175, // "t"
102,551, // "d"
103,773, // "f"
104,325, // "i"
105,1332, // "w"
107,33, // "p"
109,1193, // "v"
112,421, // "g"
  }
,
{ // state 335
0x80000000|1428, // match move
0x80000000|1586, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 336
0x80000000|844, // match move
0x80000000|812, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 337
2,392, // ws*
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 338
184,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 340
2,472, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 341
0x80000000|1289, // match move
0x80000000|1370, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 342
91,514, // "s"
  }
,
{ // state 343
184,MIN_REDUCTION+162, // $NT
  }
,
{ // state 344
2,1075, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 345
0x80000000|1048, // match move
0x80000000|1307, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 346
0x80000000|2, // match move
0x80000000|839, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 347
2,292, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 348
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+130, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+130, // $
MIN_REDUCTION+130, // $NT
  }
,
{ // state 349
184,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 350
0x80000000|1576, // match move
0x80000000|632, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 351
89,1046, // "l"
97,1295, // "n"
100,123, // "x"
  }
,
{ // state 352
0x80000000|79, // match move
0x80000000|1049, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 353
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+214, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+214, // $
MIN_REDUCTION+214, // $NT
  }
,
{ // state 354
-1, // $$start
-1, // start
1185, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+107, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+107, // "k"
MIN_REDUCTION+107, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+107, // "u"
33, // "p"
MIN_REDUCTION+107, // "h"
1193, // "v"
MIN_REDUCTION+107, // "y"
MIN_REDUCTION+107, // "m"
421, // "g"
MIN_REDUCTION+107, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+107, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+107, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+107, // {"A".."F"}
MIN_REDUCTION+107, // "X"
MIN_REDUCTION+107, // {"1".."7"}
MIN_REDUCTION+107, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 355
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 356
-1, // $$start
-1, // start
1640, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+125, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+125, // "k"
MIN_REDUCTION+125, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+125, // "u"
33, // "p"
MIN_REDUCTION+125, // "h"
1193, // "v"
MIN_REDUCTION+125, // "y"
MIN_REDUCTION+125, // "m"
421, // "g"
MIN_REDUCTION+125, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+125, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+125, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+125, // {"A".."F"}
MIN_REDUCTION+125, // "X"
MIN_REDUCTION+125, // {"1".."7"}
MIN_REDUCTION+125, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 357
125,199, // "/"
170,1251, // multiLineCommentStart
173,59, // validCommentContent
  }
,
{ // state 358
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 359
2,738, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 360
-1, // $$start
-1, // start
1055, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+173, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+173, // "k"
MIN_REDUCTION+173, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
1015, // "u"
33, // "p"
MIN_REDUCTION+173, // "h"
1193, // "v"
MIN_REDUCTION+173, // "y"
MIN_REDUCTION+173, // "m"
421, // "g"
MIN_REDUCTION+173, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+173, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+173, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+173, // {"A".."F"}
MIN_REDUCTION+173, // "X"
MIN_REDUCTION+173, // {"1".."7"}
MIN_REDUCTION+173, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 361
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 362
0x80000000|852, // match move
0x80000000|1634, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 363
0x80000000|989, // match move
0x80000000|84, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 364
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 365
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 366
149,862, // "'"
  }
,
{ // state 367
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 368
0x80000000|158, // match move
0x80000000|1230, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 369
0x80000000|2, // match move
0x80000000|1552, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 370
0x80000000|35, // match move
0x80000000|687, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 371
1,545, // start
2,388, // ws*
3,1361, // $$0
4,367, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
88,1483, // "c"
89,1129, // "l"
90,629, // "a"
91,1404, // "s"
94,351, // "e"
95,879, // "b"
97,171, // "n"
98,517, // "r"
101,1175, // "t"
102,551, // "d"
103,773, // "f"
104,325, // "i"
105,1332, // "w"
107,33, // "p"
109,1193, // "v"
112,421, // "g"
181,793, // token*
183,MIN_REDUCTION+1, // $
  }
,
{ // state 372
89,1143, // "l"
  }
,
{ // state 373
0x80000000|576, // match move
0x80000000|256, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 374
184,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 375
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 376
0x80000000|1627, // match move
0x80000000|177, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 377
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 378
2,1220, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 379
0x80000000|604, // match move
0x80000000|1217, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 380
0x80000000|1494, // match move
0x80000000|222, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 381
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 382
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 383
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 384
184,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 385
2,1300, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
159,102, // $$1
170,596, // multiLineCommentStart
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 386
0x80000000|918, // match move
0x80000000|901, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 387
0x80000000|713, // match move
0x80000000|277, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 388
0x80000000|278, // match move
0x80000000|1478, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 389
0x80000000|649, // match move
0x80000000|971, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 390
2,620, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 391
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 392
0x80000000|1395, // match move
0x80000000|1595, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 393
0x80000000|2, // match move
0x80000000|835, // no-match move
// T-test match for {'"' "\"}:
148,
150,
  }
,
{ // state 394
0x80000000|162, // match move
0x80000000|1074, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 395
184,MIN_REDUCTION+189, // $NT
  }
,
{ // state 396
0x80000000|1470, // match move
0x80000000|1216, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 397
4,1222, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
  }
,
{ // state 398
0x80000000|958, // match move
0x80000000|406, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 399
-1, // $$start
-1, // start
599, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+292, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 400
184,MIN_REDUCTION+201, // $NT
  }
,
{ // state 401
0x80000000|944, // match move
0x80000000|948, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 402
2,418, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 403
2,1300, // ws*
159,102, // $$1
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 404
111,1205, // "m"
  }
,
{ // state 405
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 406
0x80000000|235, // match move
0x80000000|283, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 407
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+184, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+184, // $
MIN_REDUCTION+184, // $NT
  }
,
{ // state 408
0x80000000|681, // match move
0x80000000|614, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 409
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 410
184,MIN_REDUCTION+126, // $NT
  }
,
{ // state 411
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 412
0x80000000|1570, // match move
0x80000000|1238, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 413
0x80000000|854, // match move
0x80000000|1444, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 414
0x80000000|397, // match move
0x80000000|590, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 415
0x80000000|1260, // match move
0x80000000|532, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 416
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 417
3,1272, // $$0
4,367, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
181,793, // token*
  }
,
{ // state 418
0x80000000|1234, // match move
0x80000000|728, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 419
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+252, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 420
2,336, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 421
96,57, // "o"
  }
,
{ // state 422
2,459, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 423
2,580, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 424
2,1579, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 425
0x80000000|1123, // match move
0x80000000|321, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 426
103,1458, // "f"
  }
,
{ // state 427
0x80000000|1422, // match move
0x80000000|1578, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 428
184,MIN_REDUCTION+105, // $NT
  }
,
{ // state 429
-1, // $$start
-1, // start
24, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+203, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+203, // "k"
MIN_REDUCTION+203, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+203, // "u"
33, // "p"
MIN_REDUCTION+203, // "h"
1193, // "v"
MIN_REDUCTION+203, // "y"
MIN_REDUCTION+203, // "m"
421, // "g"
MIN_REDUCTION+203, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+203, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+203, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+203, // {"A".."F"}
MIN_REDUCTION+203, // "X"
MIN_REDUCTION+203, // {"1".."7"}
MIN_REDUCTION+203, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
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
{ // state 430
2,217, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 431
0x80000000|1322, // match move
0x80000000|1566, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 432
101,1398, // "t"
  }
,
{ // state 433
97,753, // "n"
  }
,
{ // state 434
-1, // $$start
-1, // start
817, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+134, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+134, // "k"
MIN_REDUCTION+134, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+134, // "u"
33, // "p"
MIN_REDUCTION+134, // "h"
1193, // "v"
MIN_REDUCTION+134, // "y"
MIN_REDUCTION+134, // "m"
421, // "g"
MIN_REDUCTION+134, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+134, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+134, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+134, // {"A".."F"}
MIN_REDUCTION+134, // "X"
MIN_REDUCTION+134, // {"1".."7"}
MIN_REDUCTION+134, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 435
91,1550, // "s"
101,1376, // "t"
  }
,
{ // state 436
0x80000000|1499, // match move
0x80000000|1040, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 437
89,446, // "l"
  }
,
{ // state 438
0x80000000|1397, // match move
0x80000000|682, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 439
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 440
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+97, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+97, // $
MIN_REDUCTION+97, // $NT
  }
,
{ // state 441
184,MIN_REDUCTION+147, // $NT
  }
,
{ // state 442
0x80000000|390, // match move
0x80000000|644, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 443
0x80000000|121, // match move
0x80000000|700, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 444
0x80000000|1227, // match move
0x80000000|1625, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 445
0x80000000|976, // match move
0x80000000|1524, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 446
91,1236, // "s"
  }
,
{ // state 447
-1, // $$start
-1, // start
527, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
1636, // "e"
879, // "b"
MIN_REDUCTION+116, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+116, // "k"
MIN_REDUCTION+116, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+116, // "u"
33, // "p"
MIN_REDUCTION+116, // "h"
1193, // "v"
MIN_REDUCTION+116, // "y"
MIN_REDUCTION+116, // "m"
421, // "g"
MIN_REDUCTION+116, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+116, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+116, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+116, // {"A".."F"}
MIN_REDUCTION+116, // "X"
MIN_REDUCTION+116, // {"1".."7"}
MIN_REDUCTION+116, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 448
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 449
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 450
171,MIN_REDUCTION+337, // multiLineCommentEnd
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 451
2,1513, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 452
89,1311, // "l"
  }
,
{ // state 453
0x80000000|364, // match move
0x80000000|141, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 454
106,1314, // "u"
  }
,
{ // state 455
0x80000000|2, // match move
0x80000000|1096, // no-match move
// T-test match for {"'" "\"}:
148,
149,
  }
,
{ // state 456
2,458, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 457
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 458
0x80000000|928, // match move
0x80000000|733, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 459
0x80000000|1485, // match move
0x80000000|461, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 460
0x80000000|505, // match move
0x80000000|131, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 461
0x80000000|457, // match move
0x80000000|603, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 462
184,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 463
121,530, // "+"
  }
,
{ // state 464
2,379, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 465
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 466
109,1330, // "v"
  }
,
{ // state 467
0x80000000|74, // match move
0x80000000|1253, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 468
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 469
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 470
0x80000000|2, // match move
0x80000000|840, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 471
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+100, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+100, // $
MIN_REDUCTION+100, // $NT
  }
,
{ // state 472
0x80000000|1104, // match move
0x80000000|1268, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 473
0x80000000|213, // match move
0x80000000|1554, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 474
96,1335, // "o"
110,324, // "y"
  }
,
{ // state 475
184,MIN_REDUCTION+195, // $NT
  }
,
{ // state 476
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 478
184,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 479
-1, // $$start
-1, // start
706, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+280, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 480
0x80000000|1466, // match move
0x80000000|258, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 481
1,545, // start
2,388, // ws*
3,1361, // $$0
4,367, // token
58,58, // `!
59,673, // `!=
60,138, // `%
61,355, // `&&
63,234, // `(
64,1148, // `)
65,255, // `{
66,541, // `}
67,1091, // `-
68,573, // `+
69,210, // `=
70,500, // `==
71,1115, // `[
72,584, // `]
73,237, // `||
74,969, // `<
75,1105, // `<=
76,1354, // `,
77,984, // `>
78,642, // `>=
79,465, // `.
80,1144, // `;
81,1081, // `++
82,144, // `--
83,136, // `/
84,512, // ID
85,135, // INTLIT
86,1585, // STRINGLIT
87,1083, // CHARLIT
135,93, // "0"
137,807, // letter
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
181,793, // token*
  }
,
{ // state 482
-1, // $$start
-1, // start
634, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
474, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+182, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+182, // "k"
MIN_REDUCTION+182, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+182, // "u"
33, // "p"
MIN_REDUCTION+182, // "h"
1193, // "v"
MIN_REDUCTION+182, // "y"
MIN_REDUCTION+182, // "m"
421, // "g"
MIN_REDUCTION+182, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+182, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+182, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+182, // {"A".."F"}
MIN_REDUCTION+182, // "X"
MIN_REDUCTION+182, // {"1".."7"}
MIN_REDUCTION+182, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 483
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 485
2,314, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 486
0x80000000|1273, // match move
0x80000000|262, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 487
2,937, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
162,775, // $$2
170,596, // multiLineCommentStart
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 489
0x80000000|1608, // match move
0x80000000|168, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 490
2,392, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 491
184,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 492
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 493
-1, // $$start
-1, // start
459, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+89, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+89, // "k"
MIN_REDUCTION+89, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+89, // "u"
33, // "p"
MIN_REDUCTION+89, // "h"
1193, // "v"
MIN_REDUCTION+89, // "y"
MIN_REDUCTION+89, // "m"
421, // "g"
MIN_REDUCTION+89, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+89, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+89, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+89, // {"A".."F"}
MIN_REDUCTION+89, // "X"
MIN_REDUCTION+89, // {"1".."7"}
MIN_REDUCTION+89, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 494
0x80000000|751, // match move
0x80000000|108, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 495
2,937, // ws*
161,1604, // octalDigit**
162,96, // $$2
180,1338, // octalDigit*
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 496
184,MIN_REDUCTION+165, // $NT
  }
,
{ // state 497
-1, // $$start
-1, // start
189, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+176, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+176, // "k"
MIN_REDUCTION+176, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+176, // "u"
33, // "p"
MIN_REDUCTION+176, // "h"
1193, // "v"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
421, // "g"
MIN_REDUCTION+176, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+176, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+176, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+176, // {"A".."F"}
MIN_REDUCTION+176, // "X"
MIN_REDUCTION+176, // {"1".."7"}
MIN_REDUCTION+176, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 498
184,MIN_REDUCTION+117, // $NT
  }
,
{ // state 499
101,1161, // "t"
  }
,
{ // state 500
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 502
88,717, // "c"
89,717, // "l"
90,717, // "a"
91,717, // "s"
94,717, // "e"
95,717, // "b"
96,717, // "o"
97,717, // "n"
98,717, // "r"
99,717, // "k"
100,717, // "x"
101,717, // "t"
102,717, // "d"
103,717, // "f"
104,717, // "i"
105,717, // "w"
106,717, // "u"
107,717, // "p"
108,717, // "h"
109,717, // "v"
110,717, // "y"
111,717, // "m"
112,717, // "g"
113,717, // "z"
114,717, // "!"
115,717, // "="
116,717, // "%"
117,717, // "&"
118,717, // "("
119,717, // ")"
120,717, // "*"
121,717, // "+"
122,717, // ","
123,717, // "-"
124,717, // "."
125,717, // "/"
126,717, // ";"
127,717, // "<"
128,717, // ">"
129,717, // "["
130,717, // "]"
131,717, // "{"
132,717, // "}"
133,717, // "|"
135,717, // "0"
139,717, // "_"
140,717, // {"G".."W" "Y".."Z" "j" "q"}
141,717, // {"A".."F"}
142,717, // "X"
143,717, // {"1".."7"}
144,717, // {"8".."9"}
145,1204, // printableChar
146,717, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,717, // " "
148,717, // "\"
149,717, // "'"
150,717, // '"'
169,224, // printableChar**
179,1329, // printableChar*
  }
,
{ // state 503
0x80000000|881, // match move
0x80000000|42, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 504
0x80000000|1528, // match move
0x80000000|674, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 505
2,561, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 506
2,1173, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 507
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 508
94,1356, // "e"
  }
,
{ // state 509
0x80000000|1539, // match move
0x80000000|1012, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 510
88,1523, // "c"
  }
,
{ // state 511
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 513
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 514
0x80000000|2, // match move
0x80000000|1313, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 515
0x80000000|1019, // match move
0x80000000|124, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 516
0x80000000|1102, // match move
0x80000000|1084, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 517
94,1103, // "e"
  }
,
{ // state 518
0x80000000|1302, // match move
0x80000000|1188, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 519
125,303, // "/"
  }
,
{ // state 520
3,1272, // $$0
4,367, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
181,793, // token*
  }
,
{ // state 521
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+196, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+196, // $
MIN_REDUCTION+196, // $NT
  }
,
{ // state 522
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 523
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 524
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 525
184,MIN_REDUCTION+300, // $NT
  }
,
{ // state 526
2,427, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 527
0x80000000|308, // match move
0x80000000|398, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 528
184,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 529
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+148, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+148, // $
MIN_REDUCTION+148, // $NT
  }
,
{ // state 530
0x80000000|1099, // match move
0x80000000|1457, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 531
0x80000000|491, // match move
0x80000000|521, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 532
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+217, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+217, // $
MIN_REDUCTION+217, // $NT
  }
,
{ // state 533
184,MIN_REDUCTION+344, // $NT
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 534
-1, // $$start
-1, // start
907, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+158, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+158, // "k"
MIN_REDUCTION+158, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+158, // "u"
33, // "p"
MIN_REDUCTION+158, // "h"
1193, // "v"
MIN_REDUCTION+158, // "y"
MIN_REDUCTION+158, // "m"
421, // "g"
MIN_REDUCTION+158, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+158, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+158, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+158, // {"A".."F"}
MIN_REDUCTION+158, // "X"
MIN_REDUCTION+158, // {"1".."7"}
MIN_REDUCTION+158, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 535
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 536
-1, // $$start
-1, // start
458, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+236, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
289, // "t"
551, // "d"
773, // "f"
325, // "i"
208, // "w"
276, // "u"
33, // "p"
226, // "h"
1193, // "v"
1041, // "y"
MIN_REDUCTION+236, // "m"
421, // "g"
MIN_REDUCTION+236, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+236, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+236, // {"A".."F"}
MIN_REDUCTION+236, // "X"
MIN_REDUCTION+236, // {"1".."7"}
MIN_REDUCTION+236, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 537
0x80000000|906, // match move
0x80000000|703, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 538
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 539
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 540
0x80000000|244, // match move
0x80000000|757, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 541
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 542
-1, // $$start
-1, // start
418, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+258, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 543
0x80000000|975, // match move
0x80000000|1159, // no-match move
0x80000000|298, // NT-test-match state for validStringCharacter
  }
,
{ // state 544
0x80000000|940, // match move
0x80000000|30, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 545
183,MIN_REDUCTION+0, // $
  }
,
{ // state 546
-1, // $$start
-1, // start
1635, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+206, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+206, // "k"
MIN_REDUCTION+206, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+206, // "u"
33, // "p"
MIN_REDUCTION+206, // "h"
1193, // "v"
MIN_REDUCTION+206, // "y"
MIN_REDUCTION+206, // "m"
421, // "g"
MIN_REDUCTION+206, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+206, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+206, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+206, // {"A".."F"}
MIN_REDUCTION+206, // "X"
MIN_REDUCTION+206, // {"1".."7"}
MIN_REDUCTION+206, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 547
0x80000000|2, // match move
0x80000000|1385, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 548
98,1043, // "r"
  }
,
{ // state 549
0x80000000|347, // match move
0x80000000|1558, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 550
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 551
94,1156, // "e"
96,494, // "o"
  }
,
{ // state 552
2,937, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
161,1604, // octalDigit**
162,96, // $$2
170,596, // multiLineCommentStart
180,1338, // octalDigit*
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 553
88,113, // "c"
89,113, // "l"
90,113, // "a"
91,113, // "s"
94,113, // "e"
95,113, // "b"
96,113, // "o"
97,113, // "n"
98,113, // "r"
99,113, // "k"
100,113, // "x"
101,113, // "t"
102,113, // "d"
103,113, // "f"
104,113, // "i"
105,113, // "w"
106,113, // "u"
107,113, // "p"
108,113, // "h"
109,113, // "v"
110,113, // "y"
111,113, // "m"
112,113, // "g"
113,113, // "z"
114,113, // "!"
115,113, // "="
116,113, // "%"
117,113, // "&"
118,113, // "("
119,113, // ")"
120,113, // "*"
121,113, // "+"
122,113, // ","
123,113, // "-"
124,113, // "."
125,113, // "/"
126,113, // ";"
127,113, // "<"
128,113, // ">"
129,113, // "["
130,113, // "]"
131,113, // "{"
132,113, // "}"
133,113, // "|"
135,113, // "0"
139,113, // "_"
140,113, // {"G".."W" "Y".."Z" "j" "q"}
141,113, // {"A".."F"}
142,113, // "X"
143,113, // {"1".."7"}
144,113, // {"8".."9"}
145,1252, // printableChar
146,113, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,113, // " "
148,113, // "\"
149,113, // "'"
150,113, // '"'
  }
,
{ // state 554
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 555
0x80000000|1255, // match move
0x80000000|742, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 556
0x80000000|1591, // match move
0x80000000|1270, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 557
184,MIN_REDUCTION+350, // $NT
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 558
106,1589, // "u"
  }
,
{ // state 559
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 560
0x80000000|942, // match move
0x80000000|1140, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 561
0x80000000|759, // match move
0x80000000|1386, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 562
2,872, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 563
-1, // $$start
-1, // start
1600, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+245, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+245, // "k"
MIN_REDUCTION+245, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+245, // "u"
33, // "p"
MIN_REDUCTION+245, // "h"
1193, // "v"
MIN_REDUCTION+245, // "y"
MIN_REDUCTION+245, // "m"
421, // "g"
MIN_REDUCTION+245, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+245, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+245, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+245, // {"A".."F"}
MIN_REDUCTION+245, // "X"
MIN_REDUCTION+245, // {"1".."7"}
MIN_REDUCTION+245, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 564
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 565
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+124, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+124, // $
MIN_REDUCTION+124, // $NT
  }
,
{ // state 566
-1, // $$start
-1, // start
1286, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+212, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+212, // "k"
MIN_REDUCTION+212, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+212, // "u"
33, // "p"
MIN_REDUCTION+212, // "h"
1193, // "v"
MIN_REDUCTION+212, // "y"
MIN_REDUCTION+212, // "m"
421, // "g"
MIN_REDUCTION+212, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+212, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+212, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+212, // {"A".."F"}
MIN_REDUCTION+212, // "X"
MIN_REDUCTION+212, // {"1".."7"}
MIN_REDUCTION+212, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 567
0x80000000|895, // match move
0x80000000|1584, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 568
0x80000000|420, // match move
0x80000000|1383, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 569
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 570
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 571
0x80000000|300, // match move
0x80000000|747, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 572
0x80000000|490, // match move
0x80000000|1306, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 573
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 574
0x80000000|417, // match move
0x80000000|897, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 575
0x80000000|1073, // match move
0x80000000|440, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 576
101,666, // "t"
105,1132, // "w"
106,276, // "u"
108,226, // "h"
110,1041, // "y"
  }
,
{ // state 577
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 578
2,314, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 579
184,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 580
0x80000000|110, // match move
0x80000000|1409, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 581
101,1034, // "t"
  }
,
{ // state 582
-1, // $$start
-1, // start
1114, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+185, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+185, // "k"
MIN_REDUCTION+185, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+185, // "u"
33, // "p"
MIN_REDUCTION+185, // "h"
1193, // "v"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
421, // "g"
MIN_REDUCTION+185, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+185, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+185, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+185, // {"A".."F"}
MIN_REDUCTION+185, // "X"
MIN_REDUCTION+185, // {"1".."7"}
MIN_REDUCTION+185, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 583
0x80000000|1282, // match move
0x80000000|708, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 584
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 585
0x80000000|264, // match move
0x80000000|1540, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 586
0x80000000|97, // match move
0x80000000|784, // no-match move
0x80000000|1378, // NT-test-match state for invalidCommentContent
  }
,
{ // state 587
0x80000000|1360, // match move
0x80000000|160, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 588
98,101, // "r"
  }
,
{ // state 589
120,1150, // "*"
125,1334, // "/"
  }
,
{ // state 590
4,1222, // token
58,58, // `!
59,673, // `!=
60,138, // `%
61,355, // `&&
63,234, // `(
64,1148, // `)
65,255, // `{
66,541, // `}
67,1091, // `-
68,573, // `+
69,210, // `=
70,500, // `==
71,1115, // `[
72,584, // `]
73,237, // `||
74,969, // `<
75,1105, // `<=
76,1354, // `,
77,984, // `>
78,642, // `>=
79,465, // `.
80,1144, // `;
81,1081, // `++
82,144, // `--
83,136, // `/
84,512, // ID
85,135, // INTLIT
86,1585, // STRINGLIT
87,1083, // CHARLIT
135,93, // "0"
137,807, // letter
  }
,
{ // state 591
0x80000000|359, // match move
0x80000000|67, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 592
-1, // $$start
-1, // start
379, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+284, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 593
0x80000000|1125, // match move
0x80000000|1211, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 594
0x80000000|1215, // match move
0x80000000|82, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 595
2,1418, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 596
0x80000000|436, // match move
0x80000000|631, // no-match move
0x80000000|1378, // NT-test-match state for invalidCommentContent
  }
,
{ // state 597
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 598
0x80000000|340, // match move
0x80000000|147, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 599
0x80000000|88, // match move
0x80000000|560, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 600
89,956, // "l"
104,952, // "i"
  }
,
{ // state 601
0x80000000|1646, // match move
0x80000000|659, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 602
0x80000000|1011, // match move
0x80000000|129, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 603
0x80000000|1266, // match move
0x80000000|828, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 604
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 605
104,466, // "i"
  }
,
{ // state 606
184,MIN_REDUCTION+198, // $NT
  }
,
{ // state 607
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 608
2,1300, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
158,544, // idChar**
159,1054, // $$1
170,596, // multiLineCommentStart
176,766, // idChar*
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 609
0x80000000|125, // match move
0x80000000|380, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 610
2,1039, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 611
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 612
-1, // $$start
-1, // start
1563, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+230, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+230, // "k"
MIN_REDUCTION+230, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+230, // "u"
33, // "p"
MIN_REDUCTION+230, // "h"
1193, // "v"
MIN_REDUCTION+230, // "y"
MIN_REDUCTION+230, // "m"
421, // "g"
MIN_REDUCTION+230, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+230, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+230, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+230, // {"A".."F"}
MIN_REDUCTION+230, // "X"
MIN_REDUCTION+230, // {"1".."7"}
MIN_REDUCTION+230, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
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
{ // state 613
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 614
0x80000000|1064, // match move
0x80000000|205, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 615
-1, // $$start
-1, // start
1173, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+218, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+218, // "k"
MIN_REDUCTION+218, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+218, // "u"
33, // "p"
MIN_REDUCTION+218, // "h"
1193, // "v"
MIN_REDUCTION+218, // "y"
MIN_REDUCTION+218, // "m"
421, // "g"
MIN_REDUCTION+218, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+218, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+218, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+218, // {"A".."F"}
MIN_REDUCTION+218, // "X"
MIN_REDUCTION+218, // {"1".."7"}
MIN_REDUCTION+218, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 616
0x80000000|777, // match move
0x80000000|122, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 617
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 618
0x80000000|1429, // match move
0x80000000|1249, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 619
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 620
0x80000000|382, // match move
0x80000000|1447, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 621
90,1093, // "a"
106,1520, // "u"
110,1377, // "y"
  }
,
{ // state 622
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 623
96,452, // "o"
  }
,
{ // state 624
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 626
184,MIN_REDUCTION+123, // $NT
  }
,
{ // state 627
184,MIN_REDUCTION+311, // $NT
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 628
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 629
91,1009, // "s"
95,685, // "b"
  }
,
{ // state 630
184,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 631
88,444, // "c"
89,444, // "l"
90,444, // "a"
91,444, // "s"
94,444, // "e"
95,444, // "b"
96,444, // "o"
97,444, // "n"
98,444, // "r"
99,444, // "k"
100,444, // "x"
101,444, // "t"
102,444, // "d"
103,444, // "f"
104,444, // "i"
105,444, // "w"
106,444, // "u"
107,444, // "p"
108,444, // "h"
109,444, // "v"
110,444, // "y"
111,444, // "m"
112,444, // "g"
113,444, // "z"
114,444, // "!"
115,444, // "="
116,444, // "%"
117,444, // "&"
118,444, // "("
119,444, // ")"
120,444, // "*"
121,444, // "+"
122,444, // ","
123,444, // "-"
124,444, // "."
125,444, // "/"
126,444, // ";"
127,444, // "<"
128,444, // ">"
129,444, // "["
130,444, // "]"
131,444, // "{"
132,444, // "}"
133,444, // "|"
135,444, // "0"
139,444, // "_"
140,444, // {"G".."W" "Y".."Z" "j" "q"}
141,444, // {"A".."F"}
142,444, // "X"
143,444, // {"1".."7"}
144,444, // {"8".."9"}
145,284, // printableChar
146,444, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,444, // " "
148,444, // "\"
149,444, // "'"
150,444, // '"'
153,986, // eol
156,1503, // {10}
157,641, // {13}
173,837, // validCommentContent
174,1277, // validCommentContent**
177,246, // validCommentContent*
  }
,
{ // state 632
0x80000000|1090, // match move
0x80000000|268, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 633
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 634
0x80000000|1614, // match move
0x80000000|306, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 635
2,332, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 636
-1, // $$start
-1, // start
164, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+272, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 637
97,1372, // "n"
  }
,
{ // state 638
184,MIN_REDUCTION+180, // $NT
  }
,
{ // state 639
101,137, // "t"
  }
,
{ // state 640
1,545, // start
2,388, // ws*
3,1361, // $$0
4,367, // token
58,58, // `!
59,673, // `!=
60,138, // `%
61,355, // `&&
62,1543, // `*
63,234, // `(
64,1148, // `)
65,255, // `{
66,541, // `}
67,1091, // `-
68,573, // `+
69,210, // `=
70,500, // `==
71,1115, // `[
72,584, // `]
73,237, // `||
74,969, // `<
75,1105, // `<=
76,1354, // `,
77,984, // `>
78,642, // `>=
79,465, // `.
80,1144, // `;
81,1081, // `++
82,144, // `--
84,512, // ID
85,135, // INTLIT
86,1585, // STRINGLIT
87,1083, // CHARLIT
120,218, // "*"
134,572, // intLit2
136,274, // digit++
137,807, // letter
138,652, // digit
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
181,793, // token*
182,128, // digit+
  }
,
{ // state 641
0x80000000|1526, // match move
0x80000000|1058, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 642
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 643
1,545, // start
2,388, // ws*
3,1361, // $$0
4,367, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
181,793, // token*
  }
,
{ // state 644
0x80000000|725, // match move
0x80000000|1569, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 645
-1, // $$start
-1, // start
609, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
-1, // `=
-1, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
MIN_REDUCTION+248, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+248, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 646
0x80000000|635, // match move
0x80000000|1639, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 647
-1, // $$start
-1, // start
699, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+227, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+227, // "k"
MIN_REDUCTION+227, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+227, // "u"
33, // "p"
MIN_REDUCTION+227, // "h"
1193, // "v"
MIN_REDUCTION+227, // "y"
MIN_REDUCTION+227, // "m"
421, // "g"
MIN_REDUCTION+227, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+227, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+227, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+227, // {"A".."F"}
MIN_REDUCTION+227, // "X"
MIN_REDUCTION+227, // {"1".."7"}
MIN_REDUCTION+227, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 648
0x80000000|2, // match move
0x80000000|688, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 649
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 651
0x80000000|288, // match move
0x80000000|1628, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 652
0x80000000|501, // match move
0x80000000|266, // no-match move
0x80000000|1201, // NT-test-match state for digit
  }
,
{ // state 653
0x80000000|727, // match move
0x80000000|810, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 654
0x80000000|166, // match move
0x80000000|1374, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 655
0x80000000|2, // match move
0x80000000|1181, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 656
4,1222, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
88,1483, // "c"
89,1129, // "l"
90,629, // "a"
91,1404, // "s"
94,351, // "e"
95,879, // "b"
97,171, // "n"
98,517, // "r"
101,1175, // "t"
102,551, // "d"
103,773, // "f"
104,325, // "i"
105,1332, // "w"
107,33, // "p"
109,1193, // "v"
112,421, // "g"
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 657
-1, // $$start
-1, // start
739, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+113, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+113, // "k"
MIN_REDUCTION+113, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+113, // "u"
33, // "p"
MIN_REDUCTION+113, // "h"
1193, // "v"
MIN_REDUCTION+113, // "y"
MIN_REDUCTION+113, // "m"
421, // "g"
MIN_REDUCTION+113, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+113, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+113, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+113, // {"A".."F"}
MIN_REDUCTION+113, // "X"
MIN_REDUCTION+113, // {"1".."7"}
MIN_REDUCTION+113, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 658
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 659
-1, // $$start
-1, // start
1562, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+146, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+146, // "k"
MIN_REDUCTION+146, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+146, // "u"
33, // "p"
MIN_REDUCTION+146, // "h"
1193, // "v"
MIN_REDUCTION+146, // "y"
MIN_REDUCTION+146, // "m"
421, // "g"
MIN_REDUCTION+146, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+146, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+146, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+146, // {"A".."F"}
MIN_REDUCTION+146, // "X"
MIN_REDUCTION+146, // {"1".."7"}
MIN_REDUCTION+146, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 660
89,1072, // "l"
  }
,
{ // state 661
0x80000000|1299, // match move
0x80000000|1301, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 662
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 663
2,937, // ws*
162,775, // $$2
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 664
184,MIN_REDUCTION+234, // $NT
  }
,
{ // state 665
108,470, // "h"
  }
,
{ // state 666
90,62, // "a"
98,982, // "r"
  }
,
{ // state 667
2,418, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 668
0x80000000|932, // match move
0x80000000|486, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 669
2,1349, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 670
2,189, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 671
0x80000000|51, // match move
0x80000000|646, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 672
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 673
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 674
0x80000000|845, // match move
0x80000000|1183, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 675
88,876, // "c"
89,876, // "l"
90,876, // "a"
91,876, // "s"
92,1014, // idChar
94,876, // "e"
95,876, // "b"
96,876, // "o"
97,876, // "n"
98,876, // "r"
99,876, // "k"
100,876, // "x"
101,876, // "t"
102,876, // "d"
103,876, // "f"
104,876, // "i"
105,876, // "w"
106,876, // "u"
107,876, // "p"
108,876, // "h"
109,876, // "v"
110,876, // "y"
111,876, // "m"
112,876, // "g"
113,876, // "z"
135,933, // "0"
137,184, // letter
138,445, // digit
139,1445, // "_"
140,876, // {"G".."W" "Y".."Z" "j" "q"}
141,876, // {"A".."F"}
142,876, // "X"
143,933, // {"1".."7"}
144,933, // {"8".."9"}
  }
,
{ // state 676
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 677
-1, // $$start
-1, // start
872, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+296, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 678
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 679
2,949, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 680
113,1618, // "z"
  }
,
{ // state 681
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 682
0x80000000|783, // match move
0x80000000|399, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 683
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 684
-1, // $$start
-1, // start
970, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+270, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 685
91,581, // "s"
  }
,
{ // state 686
0x80000000|212, // match move
0x80000000|974, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 687
-1, // $$start
-1, // start
910, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+110, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+110, // "k"
MIN_REDUCTION+110, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+110, // "u"
33, // "p"
MIN_REDUCTION+110, // "h"
1193, // "v"
MIN_REDUCTION+110, // "y"
MIN_REDUCTION+110, // "m"
421, // "g"
MIN_REDUCTION+110, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+110, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+110, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+110, // {"A".."F"}
MIN_REDUCTION+110, // "X"
MIN_REDUCTION+110, // {"1".."7"}
MIN_REDUCTION+110, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 688
0x80000000|1130, // match move
0x80000000|14, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 689
0x80000000|143, // match move
0x80000000|650, // no-match move
0x80000000|1147, // NT-test-match state for hexVal
  }
,
{ // state 690
2,599, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 691
0x80000000|1020, // match move
0x80000000|1029, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 692
2,634, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 693
2,24, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 694
94,1423, // "e"
  }
,
{ // state 695
2,392, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 696
0x80000000|316, // match move
0x80000000|368, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 697
135,1247, // "0"
143,1247, // {"1".."7"}
160,857, // octalDigit
161,1604, // octalDigit**
180,1338, // octalDigit*
  }
,
{ // state 698
184,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 699
0x80000000|1231, // match move
0x80000000|6, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 700
0x80000000|483, // match move
0x80000000|1515, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 701
-1, // $$start
-1, // start
1024, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
-1, // `=
-1, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
MIN_REDUCTION+278, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+278, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 702
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 703
0x80000000|528, // match move
0x80000000|190, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 704
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+145, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+145, // $
MIN_REDUCTION+145, // $NT
  }
,
{ // state 705
0x80000000|1071, // match move
0x80000000|471, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 706
0x80000000|1292, // match move
0x80000000|1487, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 707
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 708
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+238, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 709
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 710
0x80000000|1145, // match move
0x80000000|636, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 711
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+244, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+244, // $
MIN_REDUCTION+244, // $NT
  }
,
{ // state 712
0x80000000|1373, // match move
0x80000000|1425, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 713
184,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 714
88,1351, // "c"
89,1351, // "l"
90,1351, // "a"
91,1351, // "s"
94,1351, // "e"
95,1351, // "b"
96,1351, // "o"
97,1351, // "n"
98,1351, // "r"
99,1351, // "k"
100,1351, // "x"
101,1351, // "t"
102,1351, // "d"
103,1351, // "f"
104,1351, // "i"
105,1351, // "w"
106,1351, // "u"
107,1351, // "p"
108,1351, // "h"
109,1351, // "v"
110,1351, // "y"
111,1351, // "m"
112,1351, // "g"
113,1351, // "z"
135,236, // "0"
137,525, // letter
138,834, // digit
139,772, // "_"
140,1351, // {"G".."W" "Y".."Z" "j" "q"}
141,1351, // {"A".."F"}
142,1351, // "X"
143,236, // {"1".."7"}
144,236, // {"8".."9"}
  }
,
{ // state 715
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+241, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+241, // $
MIN_REDUCTION+241, // $NT
  }
,
{ // state 716
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+285, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 717
0x80000000|179, // match move
0x80000000|1472, // no-match move
0x80000000|953, // NT-test-match state for printableChar
  }
,
{ // state 718
0x80000000|2, // match move
0x80000000|924, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 719
0x80000000|754, // match move
0x80000000|1038, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 720
0x80000000|318, // match move
0x80000000|327, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 721
184,MIN_REDUCTION+144, // $NT
  }
,
{ // state 722
90,1396, // "a"
  }
,
{ // state 723
0x80000000|2, // match move
0x80000000|601, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 724
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+166, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+166, // $
MIN_REDUCTION+166, // $NT
  }
,
{ // state 725
2,620, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 726
0x80000000|1198, // match move
0x80000000|1169, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 727
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 728
0x80000000|1262, // match move
0x80000000|987, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 729
0x80000000|1195, // match move
0x80000000|994, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 730
184,MIN_REDUCTION+186, // $NT
  }
,
{ // state 731
0x80000000|908, // match move
0x80000000|1381, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 732
110,324, // "y"
  }
,
{ // state 733
0x80000000|71, // match move
0x80000000|304, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 734
98,433, // "r"
  }
,
{ // state 735
0x80000000|267, // match move
0x80000000|356, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 736
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 737
0x80000000|193, // match move
0x80000000|657, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 738
0x80000000|1367, // match move
0x80000000|1350, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 739
0x80000000|741, // match move
0x80000000|1455, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 740
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+127, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+127, // $
MIN_REDUCTION+127, // $NT
  }
,
{ // state 741
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 742
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+91, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+91, // $
MIN_REDUCTION+91, // $NT
  }
,
{ // state 743
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 744
0x80000000|257, // match move
0x80000000|1290, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 745
100,658, // "x"
142,658, // "X"
163,822, // hex
  }
,
{ // state 746
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 747
0x80000000|1141, // match move
0x80000000|1265, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 748
184,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 749
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 750
-1, // $$start
-1, // start
217, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
-1, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
-1, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+262, // "*"
MIN_REDUCTION+262, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 751
106,1015, // "u"
  }
,
{ // state 752
108,548, // "h"
  }
,
{ // state 753
0x80000000|2, // match move
0x80000000|1202, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 754
2,292, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 755
109,863, // "v"
  }
,
{ // state 756
0x80000000|2, // match move
0x80000000|1225, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 757
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+205, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+205, // $
MIN_REDUCTION+205, // $NT
  }
,
{ // state 758
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+199, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+199, // $
MIN_REDUCTION+199, // $NT
  }
,
{ // state 759
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 760
2,472, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 761
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+208, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+208, // $
MIN_REDUCTION+208, // $NT
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
{ // state 762
184,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 763
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 764
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 765
0x80000000|221, // match move
0x80000000|1333, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 766
0x80000000|675, // match move
0x80000000|99, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 767
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 768
104,680, // "i"
  }
,
{ // state 769
-1, // $$start
-1, // start
1241, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+137, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+137, // "k"
MIN_REDUCTION+137, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+137, // "u"
33, // "p"
MIN_REDUCTION+137, // "h"
1193, // "v"
MIN_REDUCTION+137, // "y"
MIN_REDUCTION+137, // "m"
421, // "g"
MIN_REDUCTION+137, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+137, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+137, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+137, // {"A".."F"}
MIN_REDUCTION+137, // "X"
MIN_REDUCTION+137, // {"1".."7"}
MIN_REDUCTION+137, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 770
0x80000000|44, // match move
0x80000000|180, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 771
97,435, // "n"
  }
,
{ // state 772
184,MIN_REDUCTION+302, // $NT
  }
,
{ // state 773
89,22, // "l"
90,437, // "a"
96,25, // "o"
104,999, // "i"
  }
,
{ // state 774
184,MIN_REDUCTION+177, // $NT
  }
,
{ // state 775
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 777
4,1222, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
  }
,
{ // state 778
184,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 779
-1, // $$start
-1, // start
873, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+104, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+104, // "k"
MIN_REDUCTION+104, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+104, // "u"
33, // "p"
MIN_REDUCTION+104, // "h"
1193, // "v"
MIN_REDUCTION+104, // "y"
MIN_REDUCTION+104, // "m"
421, // "g"
MIN_REDUCTION+104, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+104, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+104, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+104, // {"A".."F"}
MIN_REDUCTION+104, // "X"
MIN_REDUCTION+104, // {"1".."7"}
MIN_REDUCTION+104, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 780
2,561, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 781
0x80000000|995, // match move
0x80000000|50, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 782
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 783
2,599, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 784
88,113, // "c"
89,113, // "l"
90,113, // "a"
91,113, // "s"
94,113, // "e"
95,113, // "b"
96,113, // "o"
97,113, // "n"
98,113, // "r"
99,113, // "k"
100,113, // "x"
101,113, // "t"
102,113, // "d"
103,113, // "f"
104,113, // "i"
105,113, // "w"
106,113, // "u"
107,113, // "p"
108,113, // "h"
109,113, // "v"
110,113, // "y"
111,113, // "m"
112,113, // "g"
113,113, // "z"
114,113, // "!"
115,113, // "="
116,113, // "%"
117,113, // "&"
118,113, // "("
119,113, // ")"
120,113, // "*"
121,113, // "+"
122,113, // ","
123,113, // "-"
124,113, // "."
125,113, // "/"
126,113, // ";"
127,113, // "<"
128,113, // ">"
129,113, // "["
130,113, // "]"
131,113, // "{"
132,113, // "}"
133,113, // "|"
135,113, // "0"
139,113, // "_"
140,113, // {"G".."W" "Y".."Z" "j" "q"}
141,113, // {"A".."F"}
142,113, // "X"
143,113, // {"1".."7"}
144,113, // {"8".."9"}
145,943, // printableChar
146,113, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,113, // " "
148,113, // "\"
149,113, // "'"
150,113, // '"'
153,1172, // eol
156,1631, // {10}
157,594, // {13}
  }
,
{ // state 785
91,1245, // "s"
  }
,
{ // state 786
184,MIN_REDUCTION+93, // $NT
  }
,
{ // state 787
0x80000000|507, // match move
0x80000000|1209, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 788
88,247, // "c"
  }
,
{ // state 789
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+295, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 790
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 791
0x80000000|1596, // match move
0x80000000|959, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 792
0x80000000|1468, // match move
0x80000000|1507, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 793
0x80000000|1486, // match move
0x80000000|1430, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 794
0x80000000|1002, // match move
0x80000000|566, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 795
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 796
2,472, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 797
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 798
184,MIN_REDUCTION+340, // $NT
  }
,
{ // state 799
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 800
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 801
88,876, // "c"
89,876, // "l"
90,876, // "a"
91,876, // "s"
92,328, // idChar
94,876, // "e"
95,876, // "b"
96,876, // "o"
97,876, // "n"
98,876, // "r"
99,876, // "k"
100,876, // "x"
101,876, // "t"
102,876, // "d"
103,876, // "f"
104,876, // "i"
105,876, // "w"
106,876, // "u"
107,876, // "p"
108,876, // "h"
109,876, // "v"
110,876, // "y"
111,876, // "m"
112,876, // "g"
113,876, // "z"
135,933, // "0"
137,184, // letter
138,445, // digit
139,1445, // "_"
140,876, // {"G".."W" "Y".."Z" "j" "q"}
141,876, // {"A".."F"}
142,876, // "X"
143,933, // {"1".."7"}
144,933, // {"8".."9"}
158,544, // idChar**
176,766, // idChar*
  }
,
{ // state 802
0x80000000|393, // match move
0x80000000|194, // no-match move
0x80000000|298, // NT-test-match state for validStringCharacter
  }
,
{ // state 803
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 804
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 805
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 806
2,204, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 807
0x80000000|801, // match move
0x80000000|1304, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 808
184,MIN_REDUCTION+325, // $NT
  }
,
{ // state 809
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 810
0x80000000|1416, // match move
0x80000000|52, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 811
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 812
0x80000000|1239, // match move
0x80000000|1180, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 813
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 814
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 815
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 816
2,1024, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 817
0x80000000|1538, // match move
0x80000000|938, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 818
112,951, // "g"
  }
,
{ // state 819
0x80000000|628, // match move
0x80000000|1424, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 820
0x80000000|579, // match move
0x80000000|215, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 821
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 822
88,1518, // "c"
90,1518, // "a"
94,1518, // "e"
95,1518, // "b"
102,1518, // "d"
103,1518, // "f"
135,1368, // "0"
138,831, // digit
141,965, // {"A".."F"}
143,1368, // {"1".."7"}
144,1368, // {"8".."9"}
164,915, // hexVal
165,70, // hexVal++
178,689, // hexVal+
  }
,
{ // state 823
111,1207, // "m"
  }
,
{ // state 824
0x80000000|1506, // match move
0x80000000|1408, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 825
107,280, // "p"
  }
,
{ // state 826
0x80000000|1168, // match move
0x80000000|647, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 827
0x80000000|2, // match move
0x80000000|43, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 828
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+88, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+88, // $
MIN_REDUCTION+88, // $NT
  }
,
{ // state 829
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 830
0x80000000|116, // match move
0x80000000|153, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 831
0x80000000|577, // match move
0x80000000|749, // no-match move
0x80000000|1147, // NT-test-match state for hexVal
  }
,
{ // state 832
105,571, // "w"
  }
,
{ // state 833
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+277, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 834
184,MIN_REDUCTION+301, // $NT
  }
,
{ // state 835
88,1343, // "c"
89,1343, // "l"
90,1343, // "a"
91,1343, // "s"
94,1343, // "e"
95,1343, // "b"
96,1343, // "o"
97,1343, // "n"
98,1343, // "r"
99,1343, // "k"
100,1343, // "x"
101,1343, // "t"
102,1343, // "d"
103,1343, // "f"
104,1343, // "i"
105,1343, // "w"
106,1343, // "u"
107,1343, // "p"
108,1343, // "h"
109,1343, // "v"
110,1343, // "y"
111,1343, // "m"
112,1343, // "g"
113,1343, // "z"
114,1343, // "!"
115,1343, // "="
116,1343, // "%"
117,1343, // "&"
118,1343, // "("
119,1343, // ")"
120,1343, // "*"
121,1343, // "+"
122,1343, // ","
123,1343, // "-"
124,1343, // "."
125,1343, // "/"
126,1343, // ";"
127,1343, // "<"
128,1343, // ">"
129,1343, // "["
130,1343, // "]"
131,1343, // "{"
132,1343, // "}"
133,1343, // "|"
135,1343, // "0"
139,1343, // "_"
140,1343, // {"G".."W" "Y".."Z" "j" "q"}
141,1343, // {"A".."F"}
142,1343, // "X"
143,1343, // {"1".."7"}
144,1343, // {"8".."9"}
145,1243, // printableChar
146,1343, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,1343, // " "
148,1343, // "\"
149,1343, // "'"
150,1343, // '"'
166,287, // validStringCharacter**
168,543, // validStringCharacter
175,896, // validStringCharacter*
  }
,
{ // state 836
184,MIN_REDUCTION+150, // $NT
  }
,
{ // state 837
0x80000000|764, // match move
0x80000000|83, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 838
90,788, // "a"
  }
,
{ // state 839
0x80000000|422, // match move
0x80000000|493, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 840
0x80000000|1128, // match move
0x80000000|534, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 841
2,830, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 842
0x80000000|841, // match move
0x80000000|1419, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 843
0x80000000|357, // match move
0x80000000|611, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 844
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 845
2,394, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 846
89,1637, // "l"
  }
,
{ // state 847
0x80000000|476, // match move
0x80000000|1415, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 848
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 849
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 850
123,182, // "-"
  }
,
{ // state 851
-1, // $$start
-1, // start
427, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+92, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+92, // "k"
MIN_REDUCTION+92, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+92, // "u"
33, // "p"
MIN_REDUCTION+92, // "h"
1193, // "v"
MIN_REDUCTION+92, // "y"
MIN_REDUCTION+92, // "m"
421, // "g"
MIN_REDUCTION+92, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+92, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+92, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+92, // {"A".."F"}
MIN_REDUCTION+92, // "X"
MIN_REDUCTION+92, // {"1".."7"}
MIN_REDUCTION+92, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 852
184,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 853
-1, // $$start
-1, // start
1037, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+149, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+149, // "k"
MIN_REDUCTION+149, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+149, // "u"
33, // "p"
MIN_REDUCTION+149, // "h"
1193, // "v"
MIN_REDUCTION+149, // "y"
MIN_REDUCTION+149, // "m"
421, // "g"
MIN_REDUCTION+149, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+149, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+149, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+149, // {"A".."F"}
MIN_REDUCTION+149, // "X"
MIN_REDUCTION+149, // {"1".."7"}
MIN_REDUCTION+149, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 854
2,1513, // ws*
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 855
115,341, // "="
  }
,
{ // state 856
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 857
0x80000000|539, // match move
0x80000000|375, // no-match move
0x80000000|1323, // NT-test-match state for octalDigit
  }
,
{ // state 858
0x80000000|1264, // match move
0x80000000|354, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 859
0x80000000|919, // match move
0x80000000|1101, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 860
184,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 861
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 862
0x80000000|780, // match move
0x80000000|460, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 863
90,1411, // "a"
  }
,
{ // state 864
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 865
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+160, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+160, // $
MIN_REDUCTION+160, // $NT
  }
,
{ // state 866
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+142, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+142, // $
MIN_REDUCTION+142, // $NT
  }
,
{ // state 867
0x80000000|950, // match move
0x80000000|750, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 868
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 869
0x80000000|1254, // match move
0x80000000|1544, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 870
2,620, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 871
112,1519, // "g"
  }
,
{ // state 872
0x80000000|297, // match move
0x80000000|1482, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 873
0x80000000|448, // match move
0x80000000|1582, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 874
-1, // $$start
-1, // start
392, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+318, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+318, // $
-1, // $NT
  }
,
{ // state 875
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 876
0x80000000|535, // match move
0x80000000|269, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 877
184,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 878
184,MIN_REDUCTION+108, // $NT
  }
,
{ // state 879
96,623, // "o"
98,127, // "r"
110,1438, // "y"
  }
,
{ // state 880
184,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 881
2,418, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 882
0x80000000|630, // match move
0x80000000|229, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 883
0x80000000|1176, // match move
0x80000000|85, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 884
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 885
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 886
0x80000000|1440, // match move
0x80000000|684, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 887
0x80000000|201, // match move
0x80000000|645, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 888
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 889
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 890
106,734, // "u"
  }
,
{ // state 891
0x80000000|2, // match move
0x80000000|618, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 892
104,1641, // "i"
  }
,
{ // state 893
0x80000000|381, // match move
0x80000000|396, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 894
0x80000000|1324, // match move
0x80000000|1388, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 895
2,765, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 896
0x80000000|183, // match move
0x80000000|1213, // no-match move
0x80000000|298, // NT-test-match state for validStringCharacter
  }
,
{ // state 897
3,1272, // $$0
4,367, // token
58,58, // `!
59,673, // `!=
60,138, // `%
61,355, // `&&
63,234, // `(
64,1148, // `)
65,255, // `{
66,541, // `}
67,1091, // `-
68,573, // `+
69,210, // `=
70,500, // `==
71,1115, // `[
72,584, // `]
73,237, // `||
74,969, // `<
75,1105, // `<=
76,1354, // `,
77,984, // `>
78,642, // `>=
79,465, // `.
80,1144, // `;
81,1081, // `++
82,144, // `--
83,136, // `/
84,512, // ID
85,135, // INTLIT
86,1585, // STRINGLIT
87,1083, // CHARLIT
135,93, // "0"
137,807, // letter
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
181,793, // token*
  }
,
{ // state 898
184,MIN_REDUCTION+138, // $NT
  }
,
{ // state 899
0x80000000|2, // match move
0x80000000|202, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 900
97,558, // "n"
  }
,
{ // state 901
0x80000000|1051, // match move
0x80000000|1278, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 902
97,150, // "n"
  }
,
{ // state 903
2,817, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 904
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 905
0x80000000|1587, // match move
0x80000000|291, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 906
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 907
0x80000000|1077, // match move
0x80000000|1155, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 908
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 909
0x80000000|1414, // match move
0x80000000|1347, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 910
0x80000000|118, // match move
0x80000000|412, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 911
184,MIN_REDUCTION+306, // $NT
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 912
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+109, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+109, // $
MIN_REDUCTION+109, // $NT
  }
,
{ // state 913
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 914
2,653, // ws*
147,911, // " "
151,557, // ws
152,911, // {9}
153,1192, // eol
156,1631, // {10}
157,594, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 915
0x80000000|1248, // match move
0x80000000|1317, // no-match move
0x80000000|1147, // NT-test-match state for hexVal
  }
,
{ // state 916
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+249, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 917
91,156, // "s"
  }
,
{ // state 918
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 919
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 920
94,1630, // "e"
  }
,
{ // state 921
96,832, // "o"
  }
,
{ // state 922
0x80000000|272, // match move
0x80000000|8, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 923
90,818, // "a"
  }
,
{ // state 924
0x80000000|263, // match move
0x80000000|612, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 925
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+235, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 926
-1, // $$start
-1, // start
661, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+98, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+98, // "k"
MIN_REDUCTION+98, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+98, // "u"
33, // "p"
MIN_REDUCTION+98, // "h"
1193, // "v"
MIN_REDUCTION+98, // "y"
MIN_REDUCTION+98, // "m"
421, // "g"
MIN_REDUCTION+98, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+98, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+98, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+98, // {"A".."F"}
MIN_REDUCTION+98, // "X"
MIN_REDUCTION+98, // {"1".."7"}
MIN_REDUCTION+98, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 927
184,MIN_REDUCTION+135, // $NT
  }
,
{ // state 928
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 929
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+253, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 930
184,MIN_REDUCTION+204, // $NT
  }
,
{ // state 931
-1, // $$start
-1, // start
1300, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+314, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
102, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 932
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 933
0x80000000|1432, // match move
0x80000000|625, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 934
90,1093, // "a"
104,1626, // "i"
106,1520, // "u"
110,1377, // "y"
  }
,
{ // state 935
88,1124, // "c"
  }
,
{ // state 936
103,1357, // "f"
  }
,
{ // state 937
0x80000000|1223, // match move
0x80000000|386, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 938
0x80000000|707, // match move
0x80000000|352, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 939
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 940
2,1300, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
159,102, // $$1
170,596, // multiLineCommentStart
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 941
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 942
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 943
184,MIN_REDUCTION+341, // $NT
  }
,
{ // state 944
184,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 945
90,1437, // "a"
  }
,
{ // state 946
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 947
0x80000000|1559, // match move
0x80000000|481, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 948
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+172, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+172, // $
MIN_REDUCTION+172, // $NT
  }
,
{ // state 949
0x80000000|1178, // match move
0x80000000|335, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 950
2,217, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 951
94,295, // "e"
  }
,
{ // state 952
102,648, // "d"
  }
,
{ // state 953
88,113, // "c"
89,113, // "l"
90,113, // "a"
91,113, // "s"
94,113, // "e"
95,113, // "b"
96,113, // "o"
97,113, // "n"
98,113, // "r"
99,113, // "k"
100,113, // "x"
101,113, // "t"
102,113, // "d"
103,113, // "f"
104,113, // "i"
105,113, // "w"
106,113, // "u"
107,113, // "p"
108,113, // "h"
109,113, // "v"
110,113, // "y"
111,113, // "m"
112,113, // "g"
113,113, // "z"
114,113, // "!"
115,113, // "="
116,113, // "%"
117,113, // "&"
118,113, // "("
119,113, // ")"
120,113, // "*"
121,113, // "+"
122,113, // ","
123,113, // "-"
124,113, // "."
125,113, // "/"
126,113, // ";"
127,113, // "<"
128,113, // ">"
129,113, // "["
130,113, // "]"
131,113, // "{"
132,113, // "}"
133,113, // "|"
135,113, // "0"
139,113, // "_"
140,113, // {"G".."W" "Y".."Z" "j" "q"}
141,113, // {"A".."F"}
142,113, // "X"
143,113, // {"1".."7"}
144,113, // {"8".."9"}
146,113, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,113, // " "
148,113, // "\"
149,113, // "'"
150,113, // '"'
  }
,
{ // state 954
0x80000000|1431, // match move
0x80000000|985, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 955
88,752, // "c"
  }
,
{ // state 956
90,639, // "a"
  }
,
{ // state 957
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 958
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 959
-1, // $$start
-1, // start
1579, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+298, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 960
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 961
2,937, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
162,775, // $$2
170,596, // multiLineCommentStart
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 962
0x80000000|2, // match move
0x80000000|794, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 963
0x80000000|1380, // match move
0x80000000|1606, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 964
97,1583, // "n"
  }
,
{ // state 965
0x80000000|449, // match move
0x80000000|888, // no-match move
0x80000000|1147, // NT-test-match state for hexVal
  }
,
{ // state 966
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 967
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+193, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+193, // $
MIN_REDUCTION+193, // $NT
  }
,
{ // state 968
0x80000000|1106, // match move
0x80000000|1345, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 969
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 970
0x80000000|633, // match move
0x80000000|1572, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 971
0x80000000|53, // match move
0x80000000|1410, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 972
94,1025, // "e"
  }
,
{ // state 973
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+211, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+211, // $
MIN_REDUCTION+211, // $NT
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
{ // state 974
-1, // $$start
-1, // start
34, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+242, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+242, // "k"
MIN_REDUCTION+242, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+242, // "u"
33, // "p"
MIN_REDUCTION+242, // "h"
1193, // "v"
MIN_REDUCTION+242, // "y"
MIN_REDUCTION+242, // "m"
421, // "g"
MIN_REDUCTION+242, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+242, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+242, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+242, // {"A".."F"}
MIN_REDUCTION+242, // "X"
MIN_REDUCTION+242, // {"1".."7"}
MIN_REDUCTION+242, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 975
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 976
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 977
184,MIN_REDUCTION+319, // $NT
  }
,
{ // state 978
184,MIN_REDUCTION+345, // $NT
  }
,
{ // state 979
2,651, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 980
2,1349, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 981
0x80000000|796, // match move
0x80000000|21, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 982
104,1626, // "i"
  }
,
{ // state 983
2,1055, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 984
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 985
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+330, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+330, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+330, // $
-1, // $NT
  }
,
{ // state 986
0x80000000|254, // match move
0x80000000|1497, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 987
0x80000000|1190, // match move
0x80000000|1549, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 988
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 989
2,847, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 990
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+291, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 991
0x80000000|1113, // match move
0x80000000|1364, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 992
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+267, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 993
184,MIN_REDUCTION+231, // $NT
  }
,
{ // state 994
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+103, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+103, // $
MIN_REDUCTION+103, // $NT
  }
,
{ // state 995
2,314, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 996
0x80000000|511, // match move
0x80000000|929, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 997
184,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 998
2,527, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 999
97,722, // "n"
  }
,
{ // state 1000
0x80000000|344, // match move
0x80000000|1259, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1001
90,637, // "a"
  }
,
{ // state 1002
2,1286, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1003
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1004
184,MIN_REDUCTION+90, // $NT
  }
,
{ // state 1005
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1006
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1007
0x80000000|860, // match move
0x80000000|1016, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1008
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1009
91,972, // "s"
  }
,
{ // state 1010
2,178, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1011
3,1272, // $$0
4,367, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
88,1483, // "c"
89,1129, // "l"
90,629, // "a"
91,1404, // "s"
94,351, // "e"
95,879, // "b"
97,171, // "n"
98,517, // "r"
101,1175, // "t"
102,551, // "d"
103,773, // "f"
104,325, // "i"
105,1332, // "w"
107,33, // "p"
109,1193, // "v"
112,421, // "g"
181,793, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1012
-1, // $$start
-1, // start
1028, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+155, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+155, // "k"
MIN_REDUCTION+155, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+155, // "u"
33, // "p"
MIN_REDUCTION+155, // "h"
1193, // "v"
MIN_REDUCTION+155, // "y"
MIN_REDUCTION+155, // "m"
421, // "g"
MIN_REDUCTION+155, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+155, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+155, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+155, // {"A".."F"}
MIN_REDUCTION+155, // "X"
MIN_REDUCTION+155, // {"1".."7"}
MIN_REDUCTION+155, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 1013
0x80000000|678, // match move
0x80000000|720, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1014
0x80000000|1050, // match move
0x80000000|804, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1015
95,1136, // "b"
  }
,
{ // state 1016
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+112, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+112, // $
MIN_REDUCTION+112, // $NT
  }
,
{ // state 1017
2,1513, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1018
-1, // $$start
-1, // start
949, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+131, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+131, // "k"
MIN_REDUCTION+131, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+131, // "u"
33, // "p"
MIN_REDUCTION+131, // "h"
1193, // "v"
MIN_REDUCTION+131, // "y"
MIN_REDUCTION+131, // "m"
421, // "g"
MIN_REDUCTION+131, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+131, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+131, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+131, // {"A".."F"}
MIN_REDUCTION+131, // "X"
MIN_REDUCTION+131, // {"1".."7"}
MIN_REDUCTION+131, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 1019
2,163, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1020
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 1021
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1022
88,717, // "c"
89,717, // "l"
90,717, // "a"
91,717, // "s"
94,717, // "e"
95,717, // "b"
96,717, // "o"
97,717, // "n"
98,717, // "r"
99,717, // "k"
100,717, // "x"
101,717, // "t"
102,717, // "d"
103,717, // "f"
104,717, // "i"
105,717, // "w"
106,717, // "u"
107,717, // "p"
108,717, // "h"
109,717, // "v"
110,717, // "y"
111,717, // "m"
112,717, // "g"
113,717, // "z"
114,717, // "!"
115,717, // "="
116,717, // "%"
117,717, // "&"
118,717, // "("
119,717, // ")"
120,717, // "*"
121,717, // "+"
122,717, // ","
123,717, // "-"
124,717, // "."
125,717, // "/"
126,717, // ";"
127,717, // "<"
128,717, // ">"
129,717, // "["
130,717, // "]"
131,717, // "{"
132,717, // "}"
133,717, // "|"
135,717, // "0"
139,717, // "_"
140,717, // {"G".."W" "Y".."Z" "j" "q"}
141,717, // {"A".."F"}
142,717, // "X"
143,717, // {"1".."7"}
144,717, // {"8".."9"}
145,1460, // printableChar
146,717, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,717, // " "
148,717, // "\"
149,717, // "'"
150,717, // '"'
  }
,
{ // state 1023
0x80000000|2, // match move
0x80000000|195, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1024
0x80000000|311, // match move
0x80000000|819, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1025
98,1098, // "r"
  }
,
{ // state 1026
0x80000000|663, // match move
0x80000000|1501, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1027
2,1592, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1028
0x80000000|790, // match move
0x80000000|167, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1029
0x80000000|36, // match move
0x80000000|387, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1030
0x80000000|2, // match move
0x80000000|185, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1031
0x80000000|2, // match move
0x80000000|370, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1032
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1033
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1034
98,838, // "r"
  }
,
{ // state 1035
91,508, // "s"
101,1564, // "t"
  }
,
{ // state 1036
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1037
0x80000000|1417, // match move
0x80000000|869, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1038
-1, // $$start
-1, // start
292, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
-1, // `=
-1, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
MIN_REDUCTION+282, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+282, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 1039
0x80000000|1557, // match move
0x80000000|1439, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1040
120,519, // "*"
171,533, // multiLineCommentEnd
174,1277, // validCommentContent**
177,246, // validCommentContent*
  }
,
{ // state 1041
97,955, // "n"
  }
,
{ // state 1042
0x80000000|478, // match move
0x80000000|967, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1043
96,107, // "o"
  }
,
{ // state 1044
0x80000000|1062, // match move
0x80000000|531, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1045
0x80000000|1284, // match move
0x80000000|120, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1046
91,1139, // "s"
  }
,
{ // state 1047
184,MIN_REDUCTION+337, // $NT
  }
,
{ // state 1048
184,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1049
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+133, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+133, // $
MIN_REDUCTION+133, // $NT
  }
,
{ // state 1050
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 1051
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 1052
-1, // $$start
-1, // start
1393, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+290, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 1053
2,165, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1054
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1055
0x80000000|261, // match move
0x80000000|1111, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1056
184,MIN_REDUCTION+141, // $NT
  }
,
{ // state 1057
0x80000000|552, // match move
0x80000000|1362, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1058
0x80000000|889, // match move
0x80000000|813, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 1059
0x80000000|1379, // match move
0x80000000|711, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1060
98,132, // "r"
  }
,
{ // state 1061
0x80000000|423, // match move
0x80000000|1607, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1062
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1063
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 1064
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1065
184,MIN_REDUCTION+102, // $NT
  }
,
{ // state 1066
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 1067
-1, // $$start
-1, // start
1592, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+101, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+101, // "k"
MIN_REDUCTION+101, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+101, // "u"
33, // "p"
MIN_REDUCTION+101, // "h"
1193, // "v"
MIN_REDUCTION+101, // "y"
MIN_REDUCTION+101, // "m"
421, // "g"
MIN_REDUCTION+101, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+101, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+101, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+101, // {"A".."F"}
MIN_REDUCTION+101, // "X"
MIN_REDUCTION+101, // {"1".."7"}
MIN_REDUCTION+101, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 1068
91,1391, // "s"
101,211, // "t"
  }
,
{ // state 1069
0x80000000|89, // match move
0x80000000|1481, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1070
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1071
184,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1072
94,1535, // "e"
  }
,
{ // state 1073
184,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1074
0x80000000|538, // match move
0x80000000|1138, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1075
0x80000000|130, // match move
0x80000000|1044, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1076
2,7, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1077
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1078
0x80000000|1179, // match move
0x80000000|126, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1079
88,1597, // "c"
  }
,
{ // state 1080
91,170, // "s"
  }
,
{ // state 1081
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1082
0x80000000|736, // match move
0x80000000|1612, // no-match move
0x80000000|1147, // NT-test-match state for hexVal
  }
,
{ // state 1083
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1084
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+269, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1085
133,78, // "|"
  }
,
{ // state 1086
0x80000000|2, // match move
0x80000000|12, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1087
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1088
184,MIN_REDUCTION+129, // $NT
  }
,
{ // state 1089
2,1114, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1090
2,706, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1091
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1092
184,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1093
97,1080, // "n"
  }
,
{ // state 1094
0x80000000|662, // match move
0x80000000|1059, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1095
2,1184, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1096
88,113, // "c"
89,113, // "l"
90,113, // "a"
91,113, // "s"
94,113, // "e"
95,113, // "b"
96,113, // "o"
97,113, // "n"
98,113, // "r"
99,113, // "k"
100,113, // "x"
101,113, // "t"
102,113, // "d"
103,113, // "f"
104,113, // "i"
105,113, // "w"
106,113, // "u"
107,113, // "p"
108,113, // "h"
109,113, // "v"
110,113, // "y"
111,113, // "m"
112,113, // "g"
113,113, // "z"
114,113, // "!"
115,113, // "="
116,113, // "%"
117,113, // "&"
118,113, // "("
119,113, // ")"
120,113, // "*"
121,113, // "+"
122,113, // ","
123,113, // "-"
124,113, // "."
125,113, // "/"
126,113, // ";"
127,113, // "<"
128,113, // ">"
129,113, // "["
130,113, // "]"
131,113, // "{"
132,113, // "}"
133,113, // "|"
135,113, // "0"
139,113, // "_"
140,113, // {"G".."W" "Y".."Z" "j" "q"}
141,113, // {"A".."F"}
142,113, // "X"
143,113, // {"1".."7"}
144,113, // {"8".."9"}
145,366, // printableChar
146,113, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,113, // " "
148,113, // "\"
149,113, // "'"
150,113, // '"'
  }
,
{ // state 1097
2,872, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1098
101,249, // "t"
  }
,
{ // state 1099
2,204, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1100
-1, // $$start
-1, // start
937, // ws*
-1, // $$0
MIN_REDUCTION+323, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+323, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
1604, // octalDigit**
96, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
1338, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+323, // $
-1, // $NT
  }
,
{ // state 1101
0x80000000|462, // match move
0x80000000|1529, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1102
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1103
101,890, // "t"
  }
,
{ // state 1104
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1105
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1106
2,165, // ws*
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1107
0x80000000|947, // match move
0x80000000|1281, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1108
0x80000000|145, // match move
0x80000000|149, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1109
0x80000000|806, // match move
0x80000000|1382, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1110
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 1111
0x80000000|416, // match move
0x80000000|401, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1112
0x80000000|133, // match move
0x80000000|992, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1113
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1114
0x80000000|1567, // match move
0x80000000|894, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1115
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1116
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+261, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 1117
94,823, // "e"
  }
,
{ // state 1118
95,75, // "b"
  }
,
{ // state 1119
184,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1120
0x80000000|23, // match move
0x80000000|55, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1121
0x80000000|1436, // match move
0x80000000|252, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1122
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1123
115,431, // "="
  }
,
{ // state 1124
99,923, // "k"
  }
,
{ // state 1125
2,668, // ws*
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 1126
-1, // $$start
-1, // start
651, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+128, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+128, // "k"
MIN_REDUCTION+128, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+128, // "u"
33, // "p"
MIN_REDUCTION+128, // "h"
1193, // "v"
MIN_REDUCTION+128, // "y"
MIN_REDUCTION+128, // "m"
421, // "g"
MIN_REDUCTION+128, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+128, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+128, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+128, // {"A".."F"}
MIN_REDUCTION+128, // "X"
MIN_REDUCTION+128, // {"1".."7"}
MIN_REDUCTION+128, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 1127
0x80000000|2, // match move
0x80000000|591, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1128
2,907, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1129
96,1335, // "o"
  }
,
{ // state 1130
2,282, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1131
184,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1132
104,1353, // "i"
  }
,
{ // state 1133
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1134
0x80000000|1076, // match move
0x80000000|1221, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1135
96,38, // "o"
104,755, // "i"
  }
,
{ // state 1136
89,100, // "l"
  }
,
{ // state 1137
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+121, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+121, // $
MIN_REDUCTION+121, // $NT
  }
,
{ // state 1138
0x80000000|1167, // match move
0x80000000|1235, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1139
94,756, // "e"
  }
,
{ // state 1140
0x80000000|569, // match move
0x80000000|990, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1141
2,1405, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1142
90,1371, // "a"
  }
,
{ // state 1143
89,17, // "l"
  }
,
{ // state 1144
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1145
2,164, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1146
98,1224, // "r"
  }
,
{ // state 1147
88,1413, // "c"
90,1413, // "a"
94,1413, // "e"
95,1413, // "b"
102,1413, // "d"
103,1413, // "f"
135,236, // "0"
138,808, // digit
141,103, // {"A".."F"}
143,236, // {"1".."7"}
144,236, // {"8".."9"}
  }
,
{ // state 1148
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1149
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1150
0x80000000|358, // match move
0x80000000|450, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 1151
96,936, // "o"
  }
,
{ // state 1152
2,970, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1153
0x80000000|1473, // match move
0x80000000|704, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1154
0x80000000|2, // match move
0x80000000|883, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1155
0x80000000|1541, // match move
0x80000000|882, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1156
103,1407, // "f"
  }
,
{ // state 1157
184,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1158
184,MIN_REDUCTION+96, // $NT
  }
,
{ // state 1159
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1160
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1161
0x80000000|2, // match move
0x80000000|363, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1162
0x80000000|1318, // match move
0x80000000|377, // no-match move
0x80000000|1323, // NT-test-match state for octalDigit
  }
,
{ // state 1163
2,1037, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1164
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1165
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+181, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+181, // $
MIN_REDUCTION+181, // $NT
  }
,
{ // state 1166
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1167
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1168
2,699, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1169
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+317, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+317, // $
-1, // $NT
  }
,
{ // state 1170
0x80000000|456, // match move
0x80000000|1537, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1171
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1172
184,MIN_REDUCTION+342, // $NT
  }
,
{ // state 1173
0x80000000|1208, // match move
0x80000000|271, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1174
0x80000000|186, // match move
0x80000000|1644, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1175
98,621, // "r"
108,1293, // "h"
  }
,
{ // state 1176
2,1325, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1177
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1178
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1179
2,1024, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1180
0x80000000|1003, // match move
0x80000000|161, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1181
0x80000000|378, // match move
0x80000000|1643, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1182
184,MIN_REDUCTION+222, // $NT
  }
,
{ // state 1183
-1, // $$start
-1, // start
394, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+266, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 1184
0x80000000|524, // match move
0x80000000|1505, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1185
0x80000000|1527, // match move
0x80000000|792, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1186
184,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1187
0x80000000|2, // match move
0x80000000|712, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1188
0x80000000|746, // match move
0x80000000|9, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1189
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1190
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1191
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1192
184,MIN_REDUCTION+307, // $NT
MIN_REDUCTION+307, // (default reduction)
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
{ // state 1193
96,600, // "o"
  }
,
{ // state 1194
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1195
184,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1196
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1197
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1198
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1199
-1, // $$start
545, // start
388, // ws*
1361, // $$0
367, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
-1, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
793, // token*
128, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1200
2,164, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1201
135,236, // "0"
143,236, // {"1".."7"}
144,236, // {"8".."9"}
  }
,
{ // state 1202
0x80000000|979, // match move
0x80000000|1126, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1203
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+279, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 1204
0x80000000|1532, // match move
0x80000000|290, // no-match move
0x80000000|953, // NT-test-match state for printableChar
  }
,
{ // state 1205
0x80000000|2, // match move
0x80000000|587, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1206
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1207
94,902, // "e"
  }
,
{ // state 1208
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1209
0x80000000|1258, // match move
0x80000000|148, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1210
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1211
-1, // $$start
-1, // start
668, // ws*
-1, // $$0
MIN_REDUCTION+375, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+375, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+375, // $
-1, // $NT
  }
,
{ // state 1212
184,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1213
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1214
0x80000000|1355, // match move
0x80000000|1174, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1215
156,627, // {10}
  }
,
{ // state 1216
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+251, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 1217
0x80000000|811, // match move
0x80000000|922, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1218
184,MIN_REDUCTION+343, // $NT
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1219
94,588, // "e"
  }
,
{ // state 1220
0x80000000|63, // match move
0x80000000|312, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1221
0x80000000|320, // match move
0x80000000|152, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1222
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1223
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 1224
101,1086, // "t"
  }
,
{ // state 1225
0x80000000|526, // match move
0x80000000|851, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1226
0x80000000|2, // match move
0x80000000|1352, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1227
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1228
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1229
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1230
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+372, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+372, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+372, // $
-1, // $NT
  }
,
{ // state 1231
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1232
2,1349, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1233
184,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1234
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1235
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+265, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1236
94,231, // "e"
  }
,
{ // state 1237
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1238
0x80000000|877, // match move
0x80000000|912, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1239
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1240
120,1047, // "*"
  }
,
{ // state 1241
0x80000000|864, // match move
0x80000000|1638, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1242
0x80000000|1602, // match move
0x80000000|1336, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1243
0x80000000|225, // match move
0x80000000|957, // no-match move
0x80000000|298, // NT-test-match state for validStringCharacter
  }
,
{ // state 1244
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1245
0x80000000|2, // match move
0x80000000|49, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1246
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1247
0x80000000|988, // match move
0x80000000|1229, // no-match move
0x80000000|1323, // NT-test-match state for octalDigit
  }
,
{ // state 1248
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1249
-1, // $$start
-1, // start
991, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+164, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+164, // "k"
MIN_REDUCTION+164, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+164, // "u"
33, // "p"
MIN_REDUCTION+164, // "h"
1193, // "v"
MIN_REDUCTION+164, // "y"
MIN_REDUCTION+164, // "m"
421, // "g"
MIN_REDUCTION+164, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+164, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+164, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+164, // {"A".."F"}
MIN_REDUCTION+164, // "X"
MIN_REDUCTION+164, // {"1".."7"}
MIN_REDUCTION+164, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 1250
0x80000000|463, // match move
0x80000000|1492, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 1251
0x80000000|330, // match move
0x80000000|799, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 1252
184,MIN_REDUCTION+334, // $NT
  }
,
{ // state 1253
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+287, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 1254
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1255
184,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1256
115,350, // "="
  }
,
{ // state 1257
0x80000000|2, // match move
0x80000000|1000, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1258
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1259
-1, // $$start
-1, // start
1075, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+197, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+197, // "k"
MIN_REDUCTION+197, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+197, // "u"
33, // "p"
MIN_REDUCTION+197, // "h"
1193, // "v"
MIN_REDUCTION+197, // "y"
MIN_REDUCTION+197, // "m"
421, // "g"
MIN_REDUCTION+197, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+197, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+197, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+197, // {"A".."F"}
MIN_REDUCTION+197, // "X"
MIN_REDUCTION+197, // {"1".."7"}
MIN_REDUCTION+197, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 1260
184,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1261
0x80000000|430, // match move
0x80000000|867, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1262
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1263
0x80000000|305, // match move
0x80000000|467, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1264
2,1185, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1265
-1, // $$start
-1, // start
1405, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
373, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+233, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+233, // "k"
MIN_REDUCTION+233, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+233, // "u"
33, // "p"
MIN_REDUCTION+233, // "h"
1193, // "v"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
421, // "g"
MIN_REDUCTION+233, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+233, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+233, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+233, // {"A".."F"}
MIN_REDUCTION+233, // "X"
MIN_REDUCTION+233, // {"1".."7"}
MIN_REDUCTION+233, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 1266
184,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1267
153,997, // eol
156,1631, // {10}
157,594, // {13}
169,224, // printableChar**
179,1329, // printableChar*
  }
,
{ // state 1268
0x80000000|411, // match move
0x80000000|1619, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1269
0x80000000|607, // match move
0x80000000|1479, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1270
0x80000000|91, // match move
0x80000000|593, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1271
2,937, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
161,1604, // octalDigit**
162,96, // $$2
170,596, // multiLineCommentStart
180,1338, // octalDigit*
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1272
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1273
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 1274
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1275
0x80000000|1017, // match move
0x80000000|413, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1276
2,1600, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1277
120,519, // "*"
171,1218, // multiLineCommentEnd
  }
,
{ // state 1278
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+373, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+373, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+373, // $
-1, // $NT
  }
,
{ // state 1279
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1280
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1281
0x80000000|371, // match move
0x80000000|1199, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1282
184,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1283
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1284
2,16, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1285
2,292, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1286
0x80000000|861, // match move
0x80000000|1242, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1287
2,379, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1288
2,207, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1289
2,379, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1290
0x80000000|562, // match move
0x80000000|677, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1291
0x80000000|610, // match move
0x80000000|1642, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1292
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1293
98,921, // "r"
104,342, // "i"
  }
,
{ // state 1294
0x80000000|1456, // match move
0x80000000|705, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1295
106,404, // "u"
  }
,
{ // state 1296
184,MIN_REDUCTION+156, // $NT
  }
,
{ // state 1297
88,1574, // "c"
  }
,
{ // state 1298
184,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1299
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1300
0x80000000|1066, // match move
0x80000000|696, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1301
0x80000000|92, // match move
0x80000000|575, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1302
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1303
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1304
0x80000000|608, // match move
0x80000000|220, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1305
0x80000000|1194, // match move
0x80000000|1359, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1306
0x80000000|695, // match move
0x80000000|119, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1307
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+163, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+163, // $
MIN_REDUCTION+163, // $NT
  }
,
{ // state 1308
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1309
0x80000000|2, // match move
0x80000000|697, // no-match move
// T-test match for {"X" "x"}:
100,
142,
  }
,
{ // state 1310
184,MIN_REDUCTION+168, // $NT
  }
,
{ // state 1311
94,1001, // "e"
  }
,
{ // state 1312
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+187, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 1313
0x80000000|903, // match move
0x80000000|434, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1314
89,1516, // "l"
  }
,
{ // state 1315
0x80000000|2, // match move
0x80000000|31, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1316
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1317
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1318
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 1319
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1320
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1321
94,1151, // "e"
  }
,
{ // state 1322
2,408, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1323
135,977, // "0"
143,977, // {"1".."7"}
  }
,
{ // state 1324
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1325
0x80000000|1206, // match move
0x80000000|731, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1326
0x80000000|578, // match move
0x80000000|781, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1327
135,18, // "0"
138,294, // digit
143,18, // {"1".."7"}
144,18, // {"8".."9"}
  }
,
{ // state 1328
103,1615, // "f"
  }
,
{ // state 1329
0x80000000|1022, // match move
0x80000000|1500, // no-match move
0x80000000|953, // NT-test-match state for printableChar
  }
,
{ // state 1330
94,1023, // "e"
  }
,
{ // state 1331
101,140, // "t"
  }
,
{ // state 1332
108,1514, // "h"
  }
,
{ // state 1333
0x80000000|939, // match move
0x80000000|1511, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1334
0x80000000|502, // match move
0x80000000|1267, // no-match move
0x80000000|953, // NT-test-match state for printableChar
  }
,
{ // state 1335
97,871, // "n"
  }
,
{ // state 1336
0x80000000|68, // match move
0x80000000|973, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1337
91,346, // "s"
  }
,
{ // state 1338
0x80000000|209, // match move
0x80000000|941, // no-match move
0x80000000|1323, // NT-test-match state for octalDigit
  }
,
{ // state 1339
96,1226, // "o"
  }
,
{ // state 1340
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1341
0x80000000|1363, // match move
0x80000000|1477, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1342
184,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1343
0x80000000|313, // match move
0x80000000|624, // no-match move
0x80000000|298, // NT-test-match state for validStringCharacter
  }
,
{ // state 1344
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1345
-1, // $$start
-1, // start
165, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+276, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 1346
0x80000000|1157, // match move
0x80000000|715, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1347
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+271, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 1348
0x80000000|1340, // match move
0x80000000|1346, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1349
0x80000000|439, // match move
0x80000000|963, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1350
0x80000000|1308, // match move
0x80000000|820, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1351
184,MIN_REDUCTION+303, // $NT
  }
,
{ // state 1352
0x80000000|1095, // match move
0x80000000|1453, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1353
101,510, // "t"
  }
,
{ // state 1354
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1355
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1356
0x80000000|2, // match move
0x80000000|509, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1357
0x80000000|2, // match move
0x80000000|737, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1358
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1359
0x80000000|1171, // match move
0x80000000|654, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1360
2,1305, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1361
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1362
0x80000000|495, // match move
0x80000000|1100, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1363
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1364
0x80000000|383, // match move
0x80000000|345, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1365
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1366
101,426, // "t"
  }
,
{ // state 1367
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1368
0x80000000|191, // match move
0x80000000|492, // no-match move
0x80000000|1147, // NT-test-match state for hexVal
  }
,
{ // state 1369
0x80000000|702, // match move
0x80000000|1435, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1370
0x80000000|1287, // match move
0x80000000|275, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1371
99,40, // "k"
  }
,
{ // state 1372
0x80000000|2, // match move
0x80000000|1480, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1373
2,691, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1374
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+178, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 1375
184,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1376
104,900, // "i"
  }
,
{ // state 1377
0x80000000|2, // match move
0x80000000|686, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1378
120,519, // "*"
125,1240, // "/"
170,200, // multiLineCommentStart
171,798, // multiLineCommentEnd
  }
,
{ // state 1379
184,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1380
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1381
0x80000000|1212, // match move
0x80000000|724, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1382
-1, // $$start
-1, // start
204, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+264, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 1383
0x80000000|1462, // match move
0x80000000|1069, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1384
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+106, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+106, // $
MIN_REDUCTION+106, // $NT
  }
,
{ // state 1385
0x80000000|643, // match move
0x80000000|640, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1386
0x80000000|1, // match move
0x80000000|954, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1387
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1388
0x80000000|748, // match move
0x80000000|407, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1389
0x80000000|1276, // match move
0x80000000|563, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1390
-1, // $$start
-1, // start
408, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+250, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 1391
101,285, // "t"
  }
,
{ // state 1392
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+226, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+226, // $
MIN_REDUCTION+226, // $NT
  }
,
{ // state 1393
0x80000000|795, // match move
0x80000000|1214, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1394
0x80000000|1534, // match move
0x80000000|904, // no-match move
0x80000000|298, // NT-test-match state for validStringCharacter
  }
,
{ // state 1395
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1396
89,480, // "l"
  }
,
{ // state 1397
2,599, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1398
94,1622, // "e"
  }
,
{ // state 1399
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1400
94,299, // "e"
  }
,
{ // state 1401
0x80000000|206, // match move
0x80000000|1551, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1402
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+232, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+232, // $
MIN_REDUCTION+232, // $NT
  }
,
{ // state 1403
184,MIN_REDUCTION+246, // $NT
  }
,
{ // state 1404
101,666, // "t"
105,1132, // "w"
106,276, // "u"
108,226, // "h"
110,1041, // "y"
  }
,
{ // state 1405
0x80000000|1005, // match move
0x80000000|1108, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1406
0x80000000|405, // match move
0x80000000|909, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1407
90,454, // "a"
  }
,
{ // state 1408
0x80000000|259, // match move
0x80000000|169, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1409
0x80000000|469, // match move
0x80000000|105, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1410
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+229, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+229, // $
MIN_REDUCTION+229, // $NT
  }
,
{ // state 1411
101,309, // "t"
  }
,
{ // state 1412
2,1465, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+200, // (default reduction)
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
{ // state 1413
184,MIN_REDUCTION+326, // $NT
  }
,
{ // state 1414
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1415
0x80000000|1629, // match move
0x80000000|583, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1416
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1417
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1418
0x80000000|1647, // match move
0x80000000|1269, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1419
-1, // $$start
-1, // start
830, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+194, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+194, // "k"
MIN_REDUCTION+194, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+194, // "u"
33, // "p"
MIN_REDUCTION+194, // "h"
1193, // "v"
MIN_REDUCTION+194, // "y"
MIN_REDUCTION+194, // "m"
421, // "g"
MIN_REDUCTION+194, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+194, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+194, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+194, // {"A".."F"}
MIN_REDUCTION+194, // "X"
MIN_REDUCTION+194, // {"1".."7"}
MIN_REDUCTION+194, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 1420
0x80000000|326, // match move
0x80000000|981, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1421
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+293, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1422
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1423
98,1328, // "r"
  }
,
{ // state 1424
0x80000000|1545, // match move
0x80000000|833, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1425
-1, // $$start
-1, // start
691, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+224, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+224, // "k"
MIN_REDUCTION+224, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+224, // "u"
33, // "p"
MIN_REDUCTION+224, // "h"
1193, // "v"
MIN_REDUCTION+224, // "y"
MIN_REDUCTION+224, // "m"
421, // "g"
MIN_REDUCTION+224, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+224, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+224, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+224, // {"A".."F"}
MIN_REDUCTION+224, // "X"
MIN_REDUCTION+224, // {"1".."7"}
MIN_REDUCTION+224, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 1426
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1427
0x80000000|870, // match move
0x80000000|442, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1428
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1429
2,991, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1430
0x80000000|414, // match move
0x80000000|174, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1431
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1432
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1433
0x80000000|1166, // match move
0x80000000|1450, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1434
0x80000000|1097, // match move
0x80000000|744, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1435
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+263, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1436
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1437
98,899, // "r"
  }
,
{ // state 1438
101,216, // "t"
  }
,
{ // state 1439
0x80000000|1191, // match move
0x80000000|1112, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1440
2,970, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1441
0x80000000|880, // match move
0x80000000|1137, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1442
0x80000000|667, // match move
0x80000000|542, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1443
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1444
-1, // $$start
-1, // start
1513, // ws*
-1, // $$0
MIN_REDUCTION+329, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+329, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+329, // $
-1, // $NT
  }
,
{ // state 1445
0x80000000|613, // match move
0x80000000|1399, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1446
0x80000000|172, // match move
0x80000000|789, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1447
0x80000000|154, // match move
0x80000000|20, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1448
105,827, // "w"
  }
,
{ // state 1449
2,561, // ws*
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1450
0x80000000|1365, // match move
0x80000000|1116, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1451
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1452
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1453
-1, // $$start
-1, // start
1184, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+191, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+191, // "k"
MIN_REDUCTION+191, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+191, // "u"
33, // "p"
MIN_REDUCTION+191, // "h"
1193, // "v"
MIN_REDUCTION+191, // "y"
MIN_REDUCTION+191, // "m"
421, // "g"
MIN_REDUCTION+191, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+191, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+191, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+191, // {"A".."F"}
MIN_REDUCTION+191, // "X"
MIN_REDUCTION+191, // {"1".."7"}
MIN_REDUCTION+191, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 1454
-1, // $$start
-1, // start
314, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+254, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 1455
0x80000000|1476, // match move
0x80000000|1007, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1456
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1457
0x80000000|250, // match move
0x80000000|1109, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1458
107,1187, // "p"
  }
,
{ // state 1459
184,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1460
0x80000000|484, // match move
0x80000000|66, // no-match move
0x80000000|953, // NT-test-match state for printableChar
  }
,
{ // state 1461
0x80000000|424, // match move
0x80000000|791, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1462
2,336, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1463
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1464
2,1393, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1465
0x80000000|223, // match move
0x80000000|293, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1466
89,732, // "l"
  }
,
{ // state 1467
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1468
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1469
0x80000000|670, // match move
0x80000000|497, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1470
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1471
3,1272, // $$0
4,367, // token
58,58, // `!
59,673, // `!=
60,138, // `%
61,355, // `&&
62,1543, // `*
63,234, // `(
64,1148, // `)
65,255, // `{
66,541, // `}
67,1091, // `-
68,573, // `+
69,210, // `=
70,500, // `==
71,1115, // `[
72,584, // `]
73,237, // `||
74,969, // `<
75,1105, // `<=
76,1354, // `,
77,984, // `>
78,642, // `>=
79,465, // `.
80,1144, // `;
81,1081, // `++
82,144, // `--
84,512, // ID
85,135, // INTLIT
86,1585, // STRINGLIT
87,1083, // CHARLIT
120,218, // "*"
134,572, // intLit2
136,274, // digit++
137,807, // letter
138,652, // digit
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
181,793, // token*
182,128, // digit+
  }
,
{ // state 1472
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1473
184,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1474
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1475
4,1222, // token
58,58, // `!
59,673, // `!=
60,138, // `%
61,355, // `&&
63,234, // `(
64,1148, // `)
65,255, // `{
66,541, // `}
67,1091, // `-
68,573, // `+
69,210, // `=
70,500, // `==
71,1115, // `[
72,584, // `]
73,237, // `||
74,969, // `<
75,1105, // `<=
76,1354, // `,
77,984, // `>
78,642, // `>=
79,465, // `.
80,1144, // `;
81,1081, // `++
82,144, // `--
83,136, // `/
84,512, // ID
85,135, // INTLIT
86,1585, // STRINGLIT
87,1083, // CHARLIT
88,876, // "c"
89,876, // "l"
90,876, // "a"
91,876, // "s"
94,876, // "e"
95,876, // "b"
96,876, // "o"
97,876, // "n"
98,876, // "r"
99,876, // "k"
100,876, // "x"
101,876, // "t"
102,876, // "d"
103,876, // "f"
104,876, // "i"
105,876, // "w"
106,876, // "u"
107,876, // "p"
108,876, // "h"
109,876, // "v"
110,876, // "y"
111,876, // "m"
112,876, // "g"
113,876, // "z"
114,425, // "!"
115,233, // "="
116,1134, // "%"
117,28, // "&"
118,568, // "("
119,503, // ")"
121,1250, // "+"
122,95, // ","
123,1571, // "-"
124,1120, // "."
125,1577, // "/"
126,1648, // ";"
127,286, // "<"
128,1420, // ">"
129,489, // "["
130,188, // "]"
131,1427, // "{"
132,1434, // "}"
133,1085, // "|"
134,572, // intLit2
135,18, // "0"
136,274, // digit++
137,807, // letter
138,652, // digit
140,876, // {"G".."W" "Y".."Z" "j" "q"}
141,876, // {"A".."F"}
142,876, // "X"
143,18, // {"1".."7"}
144,18, // {"8".."9"}
149,455, // "'"
150,802, // '"'
182,128, // digit+
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 1476
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1477
0x80000000|1613, // match move
0x80000000|866, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1478
0x80000000|574, // match move
0x80000000|602, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1479
0x80000000|1186, // match move
0x80000000|353, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1480
0x80000000|1288, // match move
0x80000000|1498, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1481
-1, // $$start
-1, // start
336, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+256, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 1482
0x80000000|913, // match move
0x80000000|1446, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1483
89,76, // "l"
90,1035, // "a"
96,771, // "o"
108,945, // "h"
  }
,
{ // state 1484
0x80000000|2, // match move
0x80000000|61, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1485
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1486
0x80000000|2, // match move
0x80000000|616, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1487
0x80000000|230, // match move
0x80000000|1580, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1488
184,MIN_REDUCTION+99, // $NT
  }
,
{ // state 1489
184,MIN_REDUCTION+132, // $NT
  }
,
{ // state 1490
184,MIN_REDUCTION+237, // $NT
  }
,
{ // state 1491
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1492
0x80000000|238, // match move
0x80000000|1261, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1493
184,MIN_REDUCTION+192, // $NT
  }
,
{ // state 1494
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1495
0x80000000|679, // match move
0x80000000|1018, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1496
2,15, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1497
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1498
-1, // $$start
-1, // start
207, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+95, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+95, // "k"
MIN_REDUCTION+95, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+95, // "u"
33, // "p"
MIN_REDUCTION+95, // "h"
1193, // "v"
MIN_REDUCTION+95, // "y"
MIN_REDUCTION+95, // "m"
421, // "g"
MIN_REDUCTION+95, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+95, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+95, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+95, // {"A".."F"}
MIN_REDUCTION+95, // "X"
MIN_REDUCTION+95, // {"1".."7"}
MIN_REDUCTION+95, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 1499
125,199, // "/"
170,1251, // multiLineCommentStart
173,837, // validCommentContent
174,1277, // validCommentContent**
177,246, // validCommentContent*
  }
,
{ // state 1500
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1501
-1, // $$start
-1, // start
937, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+321, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
775, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+321, // $
-1, // $NT
  }
,
{ // state 1502
0x80000000|960, // match move
0x80000000|1441, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1503
0x80000000|159, // match move
0x80000000|361, // no-match move
0x80000000|586, // NT-test-match state for validCommentContent
  }
,
{ // state 1504
0x80000000|1298, // match move
0x80000000|740, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1505
0x80000000|829, // match move
0x80000000|770, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1506
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 1507
0x80000000|279, // match move
0x80000000|1384, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1508
91,1337, // "s"
  }
,
{ // state 1509
0x80000000|384, // match move
0x80000000|1165, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1510
104,1297, // "i"
  }
,
{ // state 1511
0x80000000|10, // match move
0x80000000|1312, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1512
0x80000000|998, // match move
0x80000000|447, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1513
0x80000000|1474, // match move
0x80000000|443, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1514
104,846, // "i"
  }
,
{ // state 1515
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+328, // token
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+328, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+328, // $
-1, // $NT
  }
,
{ // state 1516
101,1127, // "t"
  }
,
{ // state 1517
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1518
0x80000000|409, // match move
0x80000000|1033, // no-match move
0x80000000|1147, // NT-test-match state for hexVal
  }
,
{ // state 1519
0x80000000|2, // match move
0x80000000|323, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1520
94,1484, // "e"
  }
,
{ // state 1521
2,706, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1522
88,444, // "c"
89,444, // "l"
90,444, // "a"
91,444, // "s"
94,444, // "e"
95,444, // "b"
96,444, // "o"
97,444, // "n"
98,444, // "r"
99,444, // "k"
100,444, // "x"
101,444, // "t"
102,444, // "d"
103,444, // "f"
104,444, // "i"
105,444, // "w"
106,444, // "u"
107,444, // "p"
108,444, // "h"
109,444, // "v"
110,444, // "y"
111,444, // "m"
112,444, // "g"
113,444, // "z"
114,444, // "!"
115,444, // "="
116,444, // "%"
117,444, // "&"
118,444, // "("
119,444, // ")"
120,444, // "*"
121,444, // "+"
122,444, // ","
123,444, // "-"
124,444, // "."
125,444, // "/"
126,444, // ";"
127,444, // "<"
128,444, // ">"
129,444, // "["
130,444, // "]"
131,444, // "{"
132,444, // "}"
133,444, // "|"
135,444, // "0"
139,444, // "_"
140,444, // {"G".."W" "Y".."Z" "j" "q"}
141,444, // {"A".."F"}
142,444, // "X"
143,444, // {"1".."7"}
144,444, // {"8".."9"}
145,284, // printableChar
146,444, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,444, // " "
148,444, // "\"
149,444, // "'"
150,444, // '"'
153,986, // eol
156,1503, // {10}
157,641, // {13}
173,59, // validCommentContent
  }
,
{ // state 1523
108,322, // "h"
  }
,
{ // state 1524
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1525
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1526
156,142, // {10}
  }
,
{ // state 1527
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1528
2,394, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1529
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+94, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+94, // $
MIN_REDUCTION+94, // $NT
  }
,
{ // state 1530
101,605, // "t"
  }
,
{ // state 1531
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 1532
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1533
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 1534
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1535
0x80000000|2, // match move
0x80000000|1389, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1536
184,MIN_REDUCTION+159, // $NT
  }
,
{ // state 1537
-1, // $$start
-1, // start
458, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+236, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+236, // "u"
33, // "p"
MIN_REDUCTION+236, // "h"
1193, // "v"
MIN_REDUCTION+236, // "y"
MIN_REDUCTION+236, // "m"
421, // "g"
MIN_REDUCTION+236, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+236, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+236, // {"A".."F"}
MIN_REDUCTION+236, // "X"
MIN_REDUCTION+236, // {"1".."7"}
MIN_REDUCTION+236, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1538
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1539
2,1028, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1540
-1, // $$start
-1, // start
1039, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
-1, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
-1, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+268, // "*"
1250, // "+"
95, // ","
MIN_REDUCTION+268, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 1541
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1542
2,1635, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1543
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1544
0x80000000|1342, // match move
0x80000000|529, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1545
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1546
0x80000000|333, // match move
0x80000000|671, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1547
90,1331, // "a"
  }
,
{ // state 1548
2,1039, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1549
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+257, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 1550
101,891, // "t"
  }
,
{ // state 1551
0x80000000|698, // match move
0x80000000|865, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1552
0x80000000|1412, // match move
0x80000000|181, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1553
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1554
0x80000000|1609, // match move
0x80000000|1598, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1555
120,1150, // "*"
125,1334, // "/"
  }
,
{ // state 1556
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+273, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1557
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1558
0x80000000|1285, // match move
0x80000000|719, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1559
1,545, // start
2,388, // ws*
3,1361, // $$0
4,367, // token
5,1110, // `boolean
6,803, // `class
7,19, // `extends
8,329, // `void
9,597, // `int
10,805, // `while
11,69, // `if
12,112, // `else
13,54, // `for
14,856, // `break
15,782, // `this
16,477, // `false
17,1387, // `true
18,619, // `super
19,1533, // `null
20,1087, // `return
21,776, // `instanceof
22,47, // `new
23,219, // `abstract
24,1149, // `assert
25,884, // `byte
26,468, // `case
27,176, // `catch
28,1228, // `char
29,315, // `const
30,554, // `continue
31,1452, // `default
32,1177, // `do
33,1021, // `double
34,849, // `enum
35,1632, // `final
36,228, // `finally
37,1244, // `float
38,672, // `goto
39,1525, // `implements
40,1617, // `import
41,743, // `interface
42,709, // `long
43,564, // `native
44,488, // `package
45,198, // `private
46,763, // `protected
47,1443, // `public
48,683, // `short
49,1611, // `static
50,29, // `strictfp
51,1316, // `switch
52,1122, // `synchronized
53,331, // `throw
54,1274, // `throws
55,1599, // `transient
56,192, // `try
57,1319, // `volatile
181,793, // token*
  }
,
{ // state 1560
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1561
0x80000000|1593, // match move
0x80000000|926, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1562
0x80000000|1006, // match move
0x80000000|1621, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1563
0x80000000|111, // match move
0x80000000|389, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1564
88,665, // "c"
  }
,
{ // state 1565
2,970, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1566
0x80000000|27, // match move
0x80000000|1588, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1567
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1568
88,1343, // "c"
89,1343, // "l"
90,1343, // "a"
91,1343, // "s"
94,1343, // "e"
95,1343, // "b"
96,1343, // "o"
97,1343, // "n"
98,1343, // "r"
99,1343, // "k"
100,1343, // "x"
101,1343, // "t"
102,1343, // "d"
103,1343, // "f"
104,1343, // "i"
105,1343, // "w"
106,1343, // "u"
107,1343, // "p"
108,1343, // "h"
109,1343, // "v"
110,1343, // "y"
111,1343, // "m"
112,1343, // "g"
113,1343, // "z"
114,1343, // "!"
115,1343, // "="
116,1343, // "%"
117,1343, // "&"
118,1343, // "("
119,1343, // ")"
120,1343, // "*"
121,1343, // "+"
122,1343, // ","
123,1343, // "-"
124,1343, // "."
125,1343, // "/"
126,1343, // ";"
127,1343, // "<"
128,1343, // ">"
129,1343, // "["
130,1343, // "]"
131,1343, // "{"
132,1343, // "}"
133,1343, // "|"
135,1343, // "0"
139,1343, // "_"
140,1343, // {"G".."W" "Y".."Z" "j" "q"}
141,1343, // {"A".."F"}
142,1343, // "X"
143,1343, // {"1".."7"}
144,1343, // {"8".."9"}
145,1243, // printableChar
146,1343, // {"#".."$" ":" "?".."@" "^" "`" "~"}
147,1343, // " "
148,1343, // "\"
149,1343, // "'"
150,1343, // '"'
168,1394, // validStringCharacter
  }
,
{ // state 1569
-1, // $$start
-1, // start
620, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+294, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 1570
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1571
0x80000000|850, // match move
0x80000000|1291, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 1572
0x80000000|227, // match move
0x80000000|516, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1573
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1574
0x80000000|2, // match move
0x80000000|735, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1575
2,609, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1576
2,706, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1577
0x80000000|2, // match move
0x80000000|914, // no-match move
// T-test match for {"*" "/"}:
120,
125,
  }
,
{ // state 1578
0x80000000|815, // match move
0x80000000|555, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1579
0x80000000|1246, // match move
0x80000000|1121, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1580
0x80000000|1164, // match move
0x80000000|1203, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1581
184,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1582
0x80000000|809, // match move
0x80000000|729, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1583
88,1321, // "c"
  }
,
{ // state 1584
-1, // $$start
-1, // start
765, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+188, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+188, // "k"
MIN_REDUCTION+188, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+188, // "u"
33, // "p"
MIN_REDUCTION+188, // "h"
1193, // "v"
MIN_REDUCTION+188, // "y"
MIN_REDUCTION+188, // "m"
421, // "g"
MIN_REDUCTION+188, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+188, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+188, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+188, // {"A".."F"}
MIN_REDUCTION+188, // "X"
MIN_REDUCTION+188, // {"1".."7"}
MIN_REDUCTION+188, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 1585
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1586
0x80000000|1375, // match move
0x80000000|348, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1587
184,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1588
0x80000000|98, // match move
0x80000000|1390, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1589
94,1154, // "e"
  }
,
{ // state 1590
-1, // $$start
-1, // start
178, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+161, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+161, // "k"
MIN_REDUCTION+161, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+161, // "u"
33, // "p"
MIN_REDUCTION+161, // "h"
1193, // "v"
MIN_REDUCTION+161, // "y"
MIN_REDUCTION+161, // "m"
421, // "g"
MIN_REDUCTION+161, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+161, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+161, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+161, // {"A".."F"}
MIN_REDUCTION+161, // "X"
MIN_REDUCTION+161, // {"1".."7"}
MIN_REDUCTION+161, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 1591
2,668, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+375, // (default reduction)
  }
,
{ // state 1592
0x80000000|1358, // match move
0x80000000|1294, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1593
2,661, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1594
0x80000000|2, // match move
0x80000000|1469, // no-match move
0x80000000|714, // NT-test-match state for idChar
  }
,
{ // state 1595
0x80000000|1283, // match move
0x80000000|726, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1596
2,1579, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1597
94,369, // "e"
  }
,
{ // state 1598
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+220, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+220, // $
MIN_REDUCTION+220, // $NT
  }
};
}
private class Initter9{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1599
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1600
0x80000000|550, // match move
0x80000000|1094, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1601
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1602
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1603
97,248, // "n"
  }
,
{ // state 1604
0x80000000|961, // match move
0x80000000|104, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1605
2,873, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1606
0x80000000|1344, // match move
0x80000000|245, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1607
-1, // $$start
-1, // start
580, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+209, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+209, // "k"
MIN_REDUCTION+209, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+209, // "u"
33, // "p"
MIN_REDUCTION+209, // "h"
1193, // "v"
MIN_REDUCTION+209, // "y"
MIN_REDUCTION+209, // "m"
421, // "g"
MIN_REDUCTION+209, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+209, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+209, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+209, // {"A".."F"}
MIN_REDUCTION+209, // "X"
MIN_REDUCTION+209, // {"1".."7"}
MIN_REDUCTION+209, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 1608
2,1393, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1609
184,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1610
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1611
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1612
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1613
184,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1614
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1615
90,1079, // "a"
  }
,
{ // state 1616
0x80000000|762, // match move
0x80000000|758, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1617
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1618
94,109, // "e"
  }
,
{ // state 1619
0x80000000|523, // match move
0x80000000|716, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1620
0x80000000|1133, // match move
0x80000000|905, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1621
0x80000000|570, // match move
0x80000000|1153, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1622
102,1030, // "d"
  }
,
{ // state 1623
184,MIN_REDUCTION+225, // $NT
  }
,
{ // state 1624
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+247, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+247, // $
-1, // $NT
  }
,
{ // state 1625
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1626
88,1366, // "c"
  }
,
{ // state 1627
184,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1628
0x80000000|48, // match move
0x80000000|1504, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1629
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1630
97,499, // "n"
  }
,
{ // state 1631
184,MIN_REDUCTION+310, // $NT
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1632
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1633
184,MIN_REDUCTION+114, // $NT
  }
,
{ // state 1634
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+136, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+136, // $
MIN_REDUCTION+136, // $NT
  }
,
{ // state 1635
0x80000000|1280, // match move
0x80000000|114, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1636
89,1046, // "l"
97,1295, // "n"
98,1328, // "r"
100,123, // "x"
  }
,
{ // state 1637
94,1315, // "e"
  }
,
{ // state 1638
0x80000000|1610, // match move
0x80000000|362, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1639
-1, // $$start
-1, // start
332, // ws*
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+288, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 1640
0x80000000|513, // match move
0x80000000|453, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1641
88,146, // "c"
  }
,
{ // state 1642
0x80000000|1548, // match move
0x80000000|585, // no-match move
// T-test match for "0":
135,
  }
,
{ // state 1643
-1, // $$start
-1, // start
1220, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
1110, // `boolean
803, // `class
19, // `extends
329, // `void
597, // `int
805, // `while
69, // `if
112, // `else
54, // `for
856, // `break
782, // `this
477, // `false
1387, // `true
619, // `super
1533, // `null
1087, // `return
776, // `instanceof
47, // `new
219, // `abstract
1149, // `assert
884, // `byte
468, // `case
176, // `catch
1228, // `char
315, // `const
554, // `continue
1452, // `default
1177, // `do
1021, // `double
849, // `enum
1632, // `final
228, // `finally
1244, // `float
672, // `goto
1525, // `implements
1617, // `import
743, // `interface
709, // `long
564, // `native
488, // `package
198, // `private
763, // `protected
1443, // `public
683, // `short
1611, // `static
29, // `strictfp
1316, // `switch
1122, // `synchronized
331, // `throw
1274, // `throws
1599, // `transient
192, // `try
1319, // `volatile
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
1483, // "c"
1129, // "l"
629, // "a"
1404, // "s"
-1, // idChar
-1, // reserved
351, // "e"
879, // "b"
MIN_REDUCTION+152, // "o"
171, // "n"
517, // "r"
MIN_REDUCTION+152, // "k"
MIN_REDUCTION+152, // "x"
1175, // "t"
551, // "d"
773, // "f"
325, // "i"
1332, // "w"
MIN_REDUCTION+152, // "u"
33, // "p"
MIN_REDUCTION+152, // "h"
1193, // "v"
MIN_REDUCTION+152, // "y"
MIN_REDUCTION+152, // "m"
421, // "g"
MIN_REDUCTION+152, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+152, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
-1, // intLit2
93, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
MIN_REDUCTION+152, // {"G".."W" "Y".."Z" "j" "q"}
MIN_REDUCTION+152, // {"A".."F"}
MIN_REDUCTION+152, // "X"
MIN_REDUCTION+152, // {"1".."7"}
MIN_REDUCTION+152, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
557, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
-1, // digit+
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 1644
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
58, // `!
673, // `!=
138, // `%
355, // `&&
-1, // `*
234, // `(
1148, // `)
255, // `{
541, // `}
1091, // `-
573, // `+
210, // `=
500, // `==
1115, // `[
584, // `]
237, // `||
969, // `<
1105, // `<=
1354, // `,
984, // `>
642, // `>=
465, // `.
1144, // `;
1081, // `++
144, // `--
136, // `/
512, // ID
135, // INTLIT
1585, // STRINGLIT
1083, // CHARLIT
876, // "c"
876, // "l"
876, // "a"
876, // "s"
-1, // idChar
-1, // reserved
876, // "e"
876, // "b"
876, // "o"
876, // "n"
876, // "r"
876, // "k"
876, // "x"
876, // "t"
876, // "d"
876, // "f"
876, // "i"
876, // "w"
876, // "u"
876, // "p"
876, // "h"
876, // "v"
876, // "y"
876, // "m"
876, // "g"
876, // "z"
425, // "!"
233, // "="
1134, // "%"
28, // "&"
568, // "("
503, // ")"
MIN_REDUCTION+289, // "*"
1250, // "+"
95, // ","
1571, // "-"
1120, // "."
270, // "/"
1648, // ";"
286, // "<"
1420, // ">"
489, // "["
188, // "]"
1427, // "{"
1434, // "}"
1085, // "|"
572, // intLit2
18, // "0"
274, // digit++
807, // letter
652, // digit
-1, // "_"
876, // {"G".."W" "Y".."Z" "j" "q"}
876, // {"A".."F"}
876, // "X"
18, // {"1".."7"}
18, // {"8".."9"}
-1, // printableChar
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
911, // " "
-1, // "\"
455, // "'"
802, // '"'
251, // ws
911, // {9}
1192, // eol
187, // singleLineComment
240, // multiLineComment
1631, // {10}
594, // {13}
-1, // idChar**
-1, // $$1
-1, // octalDigit
-1, // octalDigit**
-1, // $$2
-1, // hex
-1, // hexVal
-1, // hexVal++
-1, // validStringCharacter**
-1, // $$3
-1, // validStringCharacter
-1, // printableChar**
596, // multiLineCommentStart
-1, // multiLineCommentEnd
-1, // invalidCommentContent
-1, // validCommentContent
-1, // validCommentContent**
-1, // validStringCharacter*
-1, // idChar*
-1, // validCommentContent*
-1, // hexVal+
-1, // printableChar*
-1, // octalDigit*
-1, // token*
128, // digit+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 1645
0x80000000|1271, // match move
0x80000000|1057, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1646
2,1562, // ws*
151,557, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1647
151,251, // ws
153,1192, // eol
154,187, // singleLineComment
155,240, // multiLineComment
170,596, // multiLineCommentStart
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1648
0x80000000|155, // match move
0x80000000|13, // no-match move
// T-test match for "*":
120,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1649][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
  doneSoFar += new Initter8().doInit(doneSoFar);
  doneSoFar += new Initter9().doInit(doneSoFar);
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
(145<<16)+1,
// ws ::= {9 " "}
(151<<16)+1,
// ws ::= eol
(151<<16)+1,
// ws ::= singleLineComment
(151<<16)+1,
// ws ::= multiLineComment
(151<<16)+1,
// eol ::= {10}
(153<<16)+1,
// eol ::= {13} {10}
(153<<16)+2,
// eol ::= {13} !10
(153<<16)+1,
// ID ::= !reserved letter idChar** $$1
(84<<16)+3,
// ID ::= !reserved letter idChar**
(84<<16)+2,
// ID ::= !reserved letter !idChar $$1
(84<<16)+2,
// ID ::= !reserved letter !idChar
(84<<16)+1,
// INTLIT ::= intLit2 ws*
(85<<16)+2,
// INTLIT ::= intLit2
(85<<16)+1,
// octalDigit ::= {"0".."7"}
(160<<16)+1,
// INTLIT ::= "0" !{"X" "x"} octalDigit** $$2
(85<<16)+3,
// INTLIT ::= "0" !{"X" "x"} octalDigit**
(85<<16)+2,
// INTLIT ::= "0" !octalDigit !{"X" "x"} $$2
(85<<16)+2,
// INTLIT ::= "0" !octalDigit !{"X" "x"}
(85<<16)+1,
// hex ::= {"X" "x"}
(163<<16)+1,
// hexVal ::= digit
(164<<16)+1,
// hexVal ::= {"a".."f"}
(164<<16)+1,
// hexVal ::= {"A".."F"}
(164<<16)+1,
// INTLIT ::= "0" hex hexVal++ ws*
(85<<16)+4,
// INTLIT ::= "0" hex hexVal++
(85<<16)+3,
// CHARLIT ::= "'" !{"'" "\"} printableChar "'" ws*
(87<<16)+4,
// CHARLIT ::= "'" !{"'" "\"} printableChar "'"
(87<<16)+3,
// STRINGLIT ::= '"' validStringCharacter** $$3
(86<<16)+3,
// STRINGLIT ::= '"' !validStringCharacter $$3
(86<<16)+2,
// validStringCharacter ::= !{'"' "\"} printableChar
(168<<16)+1,
// singleLineComment ::= "/" "/" printableChar** eol
(154<<16)+4,
// singleLineComment ::= "/" "/" !printableChar eol
(154<<16)+3,
// multiLineCommentStart ::= "/" "*"
(170<<16)+2,
// multiLineCommentEnd ::= "*" "/"
(171<<16)+2,
// invalidCommentContent ::= multiLineCommentStart
(172<<16)+1,
// invalidCommentContent ::= multiLineCommentEnd
(172<<16)+1,
// validCommentContent ::= !invalidCommentContent printableChar
(173<<16)+1,
// validCommentContent ::= eol
(173<<16)+1,
// multiLineComment ::= multiLineCommentStart validCommentContent** multiLineCommentEnd
(155<<16)+3,
// multiLineComment ::= multiLineCommentStart !validCommentContent multiLineCommentEnd
(155<<16)+2,
// validCommentContent ::= multiLineCommentStart
(173<<16)+1,
// validStringCharacter** ::= validStringCharacter* !validStringCharacter
(166<<16)+1,
// idChar** ::= idChar* !idChar
(158<<16)+1,
// validCommentContent** ::= validCommentContent* !validCommentContent
(174<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// hexVal++ ::= hexVal+ !hexVal
(165<<16)+1,
// printableChar** ::= printableChar* !printableChar
(169<<16)+1,
// octalDigit** ::= octalDigit* !octalDigit
(161<<16)+1,
// token* ::= token* token
(181<<16)+2,
// token* ::= token
(181<<16)+1,
// digit++ ::= digit+ !digit
(136<<16)+1,
// validCommentContent* ::= validCommentContent* validCommentContent
(177<<16)+2,
// validCommentContent* ::= validCommentContent
(177<<16)+1,
// validStringCharacter* ::= validStringCharacter* validStringCharacter
(175<<16)+2,
// validStringCharacter* ::= validStringCharacter
(175<<16)+1,
// digit+ ::= digit
(182<<16)+1,
// digit+ ::= digit+ digit
(182<<16)+2,
// printableChar* ::= printableChar* printableChar
(179<<16)+2,
// printableChar* ::= printableChar
(179<<16)+1,
// hexVal+ ::= hexVal
(178<<16)+1,
// hexVal+ ::= hexVal+ hexVal
(178<<16)+2,
// octalDigit* ::= octalDigit* octalDigit
(180<<16)+2,
// octalDigit* ::= octalDigit
(180<<16)+1,
// idChar* ::= idChar* idChar
(176<<16)+2,
// idChar* ::= idChar
(176<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
(159<<16)+1,
// $$2 ::= ws*
(162<<16)+1,
// $$3 ::= '"' ws*
(167<<16)+2,
// $$3 ::= '"'
(167<<16)+1,
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
152, // 9
156, // 10
-1, // 11
-1, // 12
157, // 13
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
147, // " "
114, // "!"
150, // '"'
146, // "#"
146, // "$"
116, // "%"
117, // "&"
149, // "'"
118, // "("
119, // ")"
120, // "*"
121, // "+"
122, // ","
123, // "-"
124, // "."
125, // "/"
135, // "0"
143, // "1"
143, // "2"
143, // "3"
143, // "4"
143, // "5"
143, // "6"
143, // "7"
144, // "8"
144, // "9"
146, // ":"
126, // ";"
127, // "<"
115, // "="
128, // ">"
146, // "?"
146, // "@"
141, // "A"
141, // "B"
141, // "C"
141, // "D"
141, // "E"
141, // "F"
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
142, // "X"
140, // "Y"
140, // "Z"
129, // "["
148, // "\"
130, // "]"
146, // "^"
139, // "_"
146, // "`"
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
146, // "~"
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
"INTLIT ::= # intLit2 ws*", // 317
"INTLIT ::= # intLit2 ws*", // 318
"octalDigit ::= {\"0\"..\"7\"}", // 319
"INTLIT ::= # \"0\" !{\"X\" \"x\"} octalDigit** ws*", // 320
"INTLIT ::= # \"0\" !{\"X\" \"x\"} octalDigit** ws*", // 321
"INTLIT ::= # \"0\" !{\"X\" \"x\"} octalDigit** ws*", // 322
"INTLIT ::= # \"0\" !{\"X\" \"x\"} octalDigit** ws*", // 323
"hex ::= {\"X\" \"x\"}", // 324
"hexVal ::= digit", // 325
"hexVal ::= {\"a\"..\"f\"}", // 326
"hexVal ::= {\"A\"..\"F\"}", // 327
"INTLIT ::= # \"0\" hex hexVal++ ws*", // 328
"INTLIT ::= # \"0\" hex hexVal++ ws*", // 329
"CHARLIT ::= # \"\'\" !{\"\'\" \"\\\"} printableChar \"\'\" ws*", // 330
"CHARLIT ::= # \"\'\" !{\"\'\" \"\\\"} printableChar \"\'\" ws*", // 331
"STRINGLIT ::= # \'\"\' validStringCharacter** \'\"\' ws*", // 332
"STRINGLIT ::= # \'\"\' validStringCharacter** \'\"\' ws*", // 333
"validStringCharacter ::= !{\'\"\' \"\\\"} printableChar", // 334
"singleLineComment ::= \"/\" \"/\" printableChar** eol", // 335
"singleLineComment ::= \"/\" \"/\" printableChar** eol", // 336
"multiLineCommentStart ::= \"/\" \"*\"", // 337
"multiLineCommentEnd ::= \"*\" \"/\"", // 338
"invalidCommentContent ::= multiLineCommentStart", // 339
"invalidCommentContent ::= multiLineCommentEnd", // 340
"validCommentContent ::= !invalidCommentContent printableChar", // 341
"validCommentContent ::= eol", // 342
"multiLineComment ::= multiLineCommentStart validCommentContent** multiLineCommentEnd", // 343
"multiLineComment ::= multiLineCommentStart validCommentContent** multiLineCommentEnd", // 344
"validCommentContent ::= # multiLineCommentStart", // 345
"validStringCharacter** ::= validStringCharacter* !validStringCharacter", // 346
"idChar** ::= idChar* !idChar", // 347
"validCommentContent** ::= validCommentContent* !validCommentContent", // 348
"ws* ::= ws* ws", // 349
"ws* ::= ws* ws", // 350
"hexVal++ ::= hexVal+ !hexVal", // 351
"printableChar** ::= printableChar* !printableChar", // 352
"octalDigit** ::= octalDigit* !octalDigit", // 353
"token* ::= token* token", // 354
"token* ::= token* token", // 355
"digit++ ::= digit+ !digit", // 356
"validCommentContent* ::= validCommentContent* validCommentContent", // 357
"validCommentContent* ::= validCommentContent* validCommentContent", // 358
"validStringCharacter* ::= validStringCharacter* validStringCharacter", // 359
"validStringCharacter* ::= validStringCharacter* validStringCharacter", // 360
"digit+ ::= digit", // 361
"digit+ ::= digit+ digit", // 362
"printableChar* ::= printableChar* printableChar", // 363
"printableChar* ::= printableChar* printableChar", // 364
"hexVal+ ::= hexVal", // 365
"hexVal+ ::= hexVal+ hexVal", // 366
"octalDigit* ::= octalDigit* octalDigit", // 367
"octalDigit* ::= octalDigit* octalDigit", // 368
"idChar* ::= idChar* idChar", // 369
"idChar* ::= idChar* idChar", // 370
"", // 371
"", // 372
"", // 373
"", // 374
"", // 375
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
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
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
      ((15<<5)|0x6)/*nullProductionAction:15*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 311: eol ::= {13} {10} [registerNewline] @void
      ((15<<5)|0x6)/*nullProductionAction:15*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 312: eol ::= {13} !10 [registerNewline] @void
      ((15<<5)|0x6)/*nullProductionAction:15*/,
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
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 314: ID ::= !reserved [#] letter idChar** [ws*] @idToString(int,Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 315: ID ::= !reserved [#] letter !idChar [idChar**] $$1 @idToString(int,Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 316: ID ::= !reserved [#] letter !idChar [idChar**] [ws*] @idToString(int,Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 317: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 318: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 319: octalDigit ::= {"0".."7"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: INTLIT ::= [#] "0" !{"X" "x"} octalDigit** $$2 @convertOctalToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 321: INTLIT ::= [#] "0" !{"X" "x"} octalDigit** [ws*] @convertOctalToInt(int,Character,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 322: INTLIT ::= [#] "0" !octalDigit !{"X" "x"} [octalDigit**] $$2 @convertOctalToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 323: INTLIT ::= [#] "0" !octalDigit !{"X" "x"} [octalDigit**] [ws*] @convertOctalToInt(int,Character,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 324: hex ::= {"X" "x"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 325: hexVal ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 326: hexVal ::= {"a".."f"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 327: hexVal ::= {"A".."F"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 328: INTLIT ::= [#] "0" hex hexVal++ ws* @hexToInt(int,Character,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 329: INTLIT ::= [#] "0" hex hexVal++ [ws*] @hexToInt(int,Character,Character,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 330: CHARLIT ::= [#] "'" !{"'" "\"} printableChar "'" ws* @charToInt(int,Character,Character,Character)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 331: CHARLIT ::= [#] "'" !{"'" "\"} printableChar "'" [ws*] @charToInt(int,Character,Character,Character)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 332: STRINGLIT ::= [#] '"' validStringCharacter** $$3 @stripQuotesFromString(int,Character,List<Character>,Character)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 333: STRINGLIT ::= [#] '"' !validStringCharacter [validStringCharacter**] $$3 @stripQuotesFromString(int,Character,List<Character>,Character)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 334: validStringCharacter ::= !{'"' "\"} printableChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 335: singleLineComment ::= "/" "/" printableChar** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 336: singleLineComment ::= "/" "/" !printableChar [printableChar**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 337: multiLineCommentStart ::= "/" "*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 338: multiLineCommentEnd ::= "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 339: invalidCommentContent ::= multiLineCommentStart @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: invalidCommentContent ::= multiLineCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 341: validCommentContent ::= !invalidCommentContent printableChar @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 342: validCommentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 343: multiLineComment ::= multiLineCommentStart validCommentContent** multiLineCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 344: multiLineComment ::= multiLineCommentStart !validCommentContent [validCommentContent**] multiLineCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: validCommentContent ::= [#] multiLineCommentStart @warnOnNestedComments(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 346: validStringCharacter** ::= validStringCharacter* !validStringCharacter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 348: validCommentContent** ::= validCommentContent* !validCommentContent @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 350: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 351: hexVal++ ::= hexVal+ !hexVal @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 352: printableChar** ::= printableChar* !printableChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 353: octalDigit** ::= octalDigit* !octalDigit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 354: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 355: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 356: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 357: validCommentContent* ::= validCommentContent* validCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 358: validCommentContent* ::= [validCommentContent*] validCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 359: validStringCharacter* ::= validStringCharacter* validStringCharacter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 360: validStringCharacter* ::= [validStringCharacter*] validStringCharacter @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 361: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 362: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 363: printableChar* ::= printableChar* printableChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 364: printableChar* ::= [printableChar*] printableChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 365: hexVal+ ::= hexVal @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 366: hexVal+ ::= hexVal+ hexVal @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 367: octalDigit* ::= octalDigit* octalDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 368: octalDigit* ::= [octalDigit*] octalDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 369: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 370: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 371: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 372: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 373: $$2 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 374: $$3 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 375: $$3 ::= '"' [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "validStringCharacter** ::= validStringCharacter* !validStringCharacter", // validStringCharacter**
    "validCommentContent* ::=", // validCommentContent*
    "validCommentContent** ::= validCommentContent* !validCommentContent", // validCommentContent**
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "printableChar* ::=", // printableChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "octalDigit* ::=", // octalDigit*
    "octalDigit** ::= octalDigit* !octalDigit", // octalDigit**
    "printableChar** ::= printableChar* !printableChar", // printableChar**
    "validStringCharacter* ::=", // validStringCharacter*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // validStringCharacter**
      ((12<<5)|0x6)/*nullProductionAction:12*/,
    },
    { // validCommentContent*
    },
    { // validCommentContent**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // octalDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // octalDigit**
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((90<<5)|0x5)/*methodCall:90*/,
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
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      int result = actionObject.convertOctalToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      Character parm2 = (Character)si.popPb();
      List<Character> parm3 = (List<Character>)si.popPb();
      int result = actionObject.hexToInt(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      Character parm2 = (Character)si.popPb();
      Character parm3 = (Character)si.popPb();
      int result = actionObject.charToInt(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      Character parm3 = (Character)si.popPb();
      String result = actionObject.stripQuotesFromString(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 89: {
      int parm0 = (Integer)si.popPb();
      actionObject.warnOnNestedComments(parm0);
    }
    break;
    case 90: {
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
"int convertToInt(int,String)",
"int convertOctalToInt(int,Character,List<Character>)",
"int hexToInt(int,Character,Character,List<Character>)",
"int charToInt(int,Character,Character,Character)",
"String stripQuotesFromString(int,Character,List<Character>,Character)",
"void warnOnNestedComments(int)",
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
3,1,
4,1,
4,1,
4,1,
1,0,
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
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
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
