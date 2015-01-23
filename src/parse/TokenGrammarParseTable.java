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
public int getEofSym() { return 155; }
public int getNttSym() { return 156; }
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
"letter",
"idChar**",
"$$1",
"intLit2",
"\"0\"",
"digit++",
"digit",
"\"_\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"{\"1\"..\"9\"}",
"ws",
"{9 \" \"}",
"eol",
"10",
"13",
"130",
"131",
"132",
"idChar*",
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
public int numSymbols() { return 157;}
private static final int MIN_REDUCTION = 682;
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
0x80000000|220, // match move
0x80000000|561, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1, // match move
0x80000000|621, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 3
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 4
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 5
89,93, // "l"
  }
,
{ // state 6
94,277, // "e"
  }
,
{ // state 7
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 8
102,199, // "d"
  }
,
{ // state 9
156,MIN_REDUCTION+126, // $NT
  }
,
{ // state 10
2,328, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 11
2,294, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 12
101,409, // "t"
  }
,
{ // state 13
101,517, // "t"
  }
,
{ // state 14
90,86, // "a"
98,165, // "r"
108,443, // "h"
  }
,
{ // state 15
108,121, // "h"
  }
,
{ // state 16
101,499, // "t"
  }
,
{ // state 17
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 18
101,610, // "t"
105,45, // "w"
106,454, // "u"
108,27, // "h"
110,197, // "y"
  }
,
{ // state 19
0x80000000|675, // match move
0x80000000|303, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 20
2,671, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 21
3,52, // $$0
4,130, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
153,633, // token*
  }
,
{ // state 22
104,381, // "i"
  }
,
{ // state 23
0x80000000|1, // match move
0x80000000|570, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 24
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 25
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 26
94,322, // "e"
96,44, // "o"
  }
,
{ // state 27
96,280, // "o"
  }
,
{ // state 28
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 29
156,MIN_REDUCTION+307, // $NT
  }
,
{ // state 30
156,MIN_REDUCTION+313, // $NT
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 31
101,562, // "t"
  }
,
{ // state 32
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 33
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 34
2,568, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 35
156,MIN_REDUCTION+105, // $NT
  }
,
{ // state 36
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 37
0x80000000|68, // match move
0x80000000|530, // no-match move
0x80000000|644, // NT-test-match state for digit
  }
,
{ // state 38
156,MIN_REDUCTION+150, // $NT
  }
,
{ // state 39
111,62, // "m"
  }
,
{ // state 40
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 41
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 42
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 43
89,602, // "l"
90,5, // "a"
96,321, // "o"
104,59, // "i"
  }
,
{ // state 44
0x80000000|215, // match move
0x80000000|419, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 45
104,522, // "i"
  }
,
{ // state 46
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 47
0x80000000|653, // match move
0x80000000|149, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 48
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 49
94,85, // "e"
  }
,
{ // state 50
156,MIN_REDUCTION+147, // $NT
  }
,
{ // state 51
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 53
0x80000000|248, // match move
0x80000000|468, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 54
101,564, // "t"
  }
,
{ // state 55
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 58
0x80000000|533, // match move
0x80000000|136, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 59
97,477, // "n"
  }
,
{ // state 60
107,661, // "p"
  }
,
{ // state 61
0x80000000|1, // match move
0x80000000|645, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 62
94,650, // "e"
  }
,
{ // state 63
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 64
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 65
90,375, // "a"
  }
,
{ // state 66
0x80000000|1, // match move
0x80000000|348, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 67
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 69
0x80000000|207, // match move
0x80000000|462, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 70
2,7, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 71
156,MIN_REDUCTION+108, // $NT
  }
,
{ // state 72
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 73
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|104, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 75
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 76
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 78
2,545, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 79
156,MIN_REDUCTION+153, // $NT
  }
,
{ // state 80
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 81
2,76, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 82
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|10, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 84
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|626, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 86
101,652, // "t"
  }
,
{ // state 87
97,273, // "n"
  }
,
{ // state 88
156,MIN_REDUCTION+156, // $NT
  }
,
{ // state 89
2,391, // ws*
144,234, // ws
146,629, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 90
97,171, // "n"
  }
,
{ // state 91
3,52, // $$0
4,130, // token
58,51, // `!
59,217, // `!=
60,485, // `%
61,569, // `&&
63,3, // `(
64,635, // `)
65,84, // `{
66,257, // `}
67,209, // `-
68,525, // `+
69,163, // `=
70,490, // `==
71,77, // `[
72,518, // `]
73,398, // `||
74,606, // `<
75,466, // `<=
76,252, // `,
77,128, // `>
78,155, // `>=
79,455, // `.
80,390, // `;
81,678, // `++
82,124, // `--
83,327, // `/
84,679, // ID
85,297, // INTLIT
86,146, // STRINGLIT
87,597, // CHARLIT
134,359, // letter
144,431, // ws
146,629, // eol
153,633, // token*
  }
,
{ // state 92
156,MIN_REDUCTION+138, // $NT
  }
,
{ // state 93
91,161, // "s"
  }
,
{ // state 94
0x80000000|481, // match move
0x80000000|286, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 95
-1, // $$start
-1, // start
200, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
126, // `boolean
309, // `class
56, // `extends
288, // `void
226, // `int
169, // `while
57, // `if
267, // `else
553, // `for
471, // `break
478, // `this
250, // `false
329, // `true
305, // `super
432, // `null
203, // `return
473, // `instanceof
516, // `new
109, // `abstract
483, // `assert
67, // `byte
276, // `case
665, // `catch
46, // `char
40, // `const
142, // `continue
594, // `default
293, // `do
600, // `double
119, // `enum
402, // `final
80, // `finally
337, // `float
152, // `goto
179, // `implements
527, // `import
347, // `interface
145, // `long
444, // `native
433, // `package
380, // `private
556, // `protected
270, // `public
72, // `short
371, // `static
438, // `strictfp
183, // `switch
255, // `synchronized
615, // `throw
28, // `throws
628, // `transient
599, // `try
387, // `volatile
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
167, // "c"
106, // "l"
350, // "a"
457, // "s"
-1, // idChar
-1, // reserved
116, // "e"
544, // "b"
MIN_REDUCTION+116, // "o"
582, // "n"
505, // "r"
MIN_REDUCTION+116, // "k"
MIN_REDUCTION+116, // "x"
461, // "t"
26, // "d"
43, // "f"
588, // "i"
15, // "w"
MIN_REDUCTION+116, // "u"
314, // "p"
MIN_REDUCTION+116, // "h"
465, // "v"
MIN_REDUCTION+116, // "y"
MIN_REDUCTION+116, // "m"
304, // "g"
MIN_REDUCTION+116, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
MIN_REDUCTION+116, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
-1, // letter
-1, // idChar**
-1, // $$1
-1, // intLit2
MIN_REDUCTION+116, // "0"
-1, // digit++
-1, // digit
-1, // "_"
MIN_REDUCTION+116, // {"A".."Z" "j" "q"}
MIN_REDUCTION+116, // {"1".."9"}
234, // ws
131, // {9 " "}
629, // eol
30, // {10}
586, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 96
101,49, // "t"
  }
,
{ // state 97
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 98
156,MIN_REDUCTION+195, // $NT
  }
,
{ // state 99
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 100
99,535, // "k"
  }
,
{ // state 101
0x80000000|189, // match move
0x80000000|388, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 102
2,464, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 103
107,467, // "p"
  }
,
{ // state 104
2,614, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 105
90,542, // "a"
  }
,
{ // state 106
96,447, // "o"
  }
,
{ // state 107
115,243, // "="
  }
,
{ // state 108
2,269, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 110
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 111
1,216, // start
2,120, // ws*
3,407, // $$0
4,130, // token
58,51, // `!
59,217, // `!=
60,485, // `%
61,569, // `&&
63,3, // `(
64,635, // `)
65,84, // `{
66,257, // `}
67,209, // `-
68,525, // `+
69,163, // `=
70,490, // `==
71,77, // `[
72,518, // `]
73,398, // `||
74,606, // `<
75,466, // `<=
76,252, // `,
77,128, // `>
78,155, // `>=
79,455, // `.
80,390, // `;
81,678, // `++
82,124, // `--
83,327, // `/
84,679, // ID
85,297, // INTLIT
86,146, // STRINGLIT
87,597, // CHARLIT
134,359, // letter
144,234, // ws
146,629, // eol
153,633, // token*
  }
,
{ // state 112
2,425, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 113
0x80000000|1, // match move
0x80000000|507, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 114
90,463, // "a"
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 116
89,410, // "l"
97,555, // "n"
98,480, // "r"
100,54, // "x"
  }
,
{ // state 117
156,MIN_REDUCTION+168, // $NT
  }
,
{ // state 118
2,643, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 120
0x80000000|479, // match move
0x80000000|472, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 121
104,256, // "i"
  }
,
{ // state 122
95,324, // "b"
  }
,
{ // state 123
88,495, // "c"
  }
,
{ // state 124
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 125
2,137, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 127
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 129
94,656, // "e"
  }
,
{ // state 130
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 131
156,MIN_REDUCTION+311, // $NT
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 132
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 133
94,511, // "e"
  }
,
{ // state 134
115,70, // "="
  }
,
{ // state 135
156,MIN_REDUCTION+165, // $NT
  }
,
{ // state 136
0x80000000|486, // match move
0x80000000|95, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 137
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 138
138,37, // "0"
140,510, // digit
143,37, // {"1".."9"}
  }
,
{ // state 139
156,MIN_REDUCTION+117, // $NT
  }
,
{ // state 140
104,429, // "i"
  }
,
{ // state 141
97,213, // "n"
  }
,
{ // state 142
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 143
94,39, // "e"
  }
,
{ // state 144
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 147
0x80000000|1, // match move
0x80000000|81, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 148
2,532, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 149
-1, // $$start
-1, // start
73, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
126, // `boolean
309, // `class
56, // `extends
288, // `void
226, // `int
169, // `while
57, // `if
267, // `else
553, // `for
471, // `break
478, // `this
250, // `false
329, // `true
305, // `super
432, // `null
203, // `return
473, // `instanceof
516, // `new
109, // `abstract
483, // `assert
67, // `byte
276, // `case
665, // `catch
46, // `char
40, // `const
142, // `continue
594, // `default
293, // `do
600, // `double
119, // `enum
402, // `final
80, // `finally
337, // `float
152, // `goto
179, // `implements
527, // `import
347, // `interface
145, // `long
444, // `native
433, // `package
380, // `private
556, // `protected
270, // `public
72, // `short
371, // `static
438, // `strictfp
183, // `switch
255, // `synchronized
615, // `throw
28, // `throws
628, // `transient
599, // `try
387, // `volatile
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
167, // "c"
106, // "l"
350, // "a"
457, // "s"
-1, // idChar
-1, // reserved
204, // "e"
544, // "b"
MIN_REDUCTION+236, // "o"
582, // "n"
505, // "r"
MIN_REDUCTION+236, // "k"
MIN_REDUCTION+236, // "x"
14, // "t"
26, // "d"
43, // "f"
588, // "i"
418, // "w"
454, // "u"
314, // "p"
27, // "h"
465, // "v"
197, // "y"
MIN_REDUCTION+236, // "m"
304, // "g"
MIN_REDUCTION+236, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
MIN_REDUCTION+236, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
-1, // letter
-1, // idChar**
-1, // $$1
-1, // intLit2
MIN_REDUCTION+236, // "0"
-1, // digit++
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"A".."Z" "j" "q"}
MIN_REDUCTION+236, // {"1".."9"}
234, // ws
131, // {9 " "}
629, // eol
30, // {10}
586, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 150
156,MIN_REDUCTION+183, // $NT
  }
,
{ // state 151
89,285, // "l"
  }
,
{ // state 152
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 153
91,389, // "s"
  }
,
{ // state 154
0x80000000|1, // match move
0x80000000|573, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 155
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 156
2,298, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 157
90,96, // "a"
  }
,
{ // state 158
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 159
2,210, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 160
90,87, // "a"
  }
,
{ // state 161
94,238, // "e"
  }
,
{ // state 162
0x80000000|1, // match move
0x80000000|353, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 163
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 164
156,MIN_REDUCTION+213, // $NT
  }
,
{ // state 165
90,632, // "a"
104,672, // "i"
106,133, // "u"
110,23, // "y"
  }
,
{ // state 166
2,307, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 167
89,539, // "l"
90,239, // "a"
96,397, // "o"
108,623, // "h"
  }
,
{ // state 168
2,242, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 170
0x80000000|188, // match move
0x80000000|331, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 171
104,259, // "i"
  }
,
{ // state 172
156,MIN_REDUCTION+135, // $NT
  }
,
{ // state 173
94,575, // "e"
  }
,
{ // state 174
94,405, // "e"
  }
,
{ // state 175
156,MIN_REDUCTION+204, // $NT
  }
,
{ // state 176
-1, // $$start
-1, // start
408, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
126, // `boolean
309, // `class
56, // `extends
288, // `void
226, // `int
169, // `while
57, // `if
267, // `else
553, // `for
471, // `break
478, // `this
250, // `false
329, // `true
305, // `super
432, // `null
203, // `return
473, // `instanceof
516, // `new
109, // `abstract
483, // `assert
67, // `byte
276, // `case
665, // `catch
46, // `char
40, // `const
142, // `continue
594, // `default
293, // `do
600, // `double
119, // `enum
402, // `final
80, // `finally
337, // `float
152, // `goto
179, // `implements
527, // `import
347, // `interface
145, // `long
444, // `native
433, // `package
380, // `private
556, // `protected
270, // `public
72, // `short
371, // `static
438, // `strictfp
183, // `switch
255, // `synchronized
615, // `throw
28, // `throws
628, // `transient
599, // `try
387, // `volatile
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
167, // "c"
106, // "l"
350, // "a"
457, // "s"
-1, // idChar
-1, // reserved
204, // "e"
544, // "b"
MIN_REDUCTION+173, // "o"
582, // "n"
505, // "r"
MIN_REDUCTION+173, // "k"
MIN_REDUCTION+173, // "x"
461, // "t"
26, // "d"
43, // "f"
588, // "i"
15, // "w"
515, // "u"
314, // "p"
MIN_REDUCTION+173, // "h"
465, // "v"
MIN_REDUCTION+173, // "y"
MIN_REDUCTION+173, // "m"
304, // "g"
MIN_REDUCTION+173, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
MIN_REDUCTION+173, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
-1, // letter
-1, // idChar**
-1, // $$1
-1, // intLit2
MIN_REDUCTION+173, // "0"
-1, // digit++
-1, // digit
-1, // "_"
MIN_REDUCTION+173, // {"A".."Z" "j" "q"}
MIN_REDUCTION+173, // {"1".."9"}
234, // ws
131, // {9 " "}
629, // eol
30, // {10}
586, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 177
94,540, // "e"
  }
,
{ // state 178
108,548, // "h"
  }
,
{ // state 179
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 180
0x80000000|325, // match move
0x80000000|366, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 181
103,103, // "f"
  }
,
{ // state 182
101,550, // "t"
  }
,
{ // state 183
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 184
2,408, // ws*
144,234, // ws
146,629, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 185
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 186
94,379, // "e"
  }
,
{ // state 187
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 188
121,446, // "+"
  }
,
{ // state 189
3,52, // $$0
4,130, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
153,633, // token*
  }
,
{ // state 190
94,343, // "e"
  }
,
{ // state 191
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 192
0x80000000|577, // match move
0x80000000|346, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 193
2,4, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 194
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 195
156,MIN_REDUCTION+306, // $NT
  }
,
{ // state 196
0x80000000|1, // match move
0x80000000|316, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 197
97,333, // "n"
  }
,
{ // state 198
156,MIN_REDUCTION+309, // $NT
  }
,
{ // state 199
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 200
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 201
2,502, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 202
2,287, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 204
89,410, // "l"
97,555, // "n"
100,54, // "x"
  }
,
{ // state 205
0x80000000|1, // match move
0x80000000|619, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 206
0x80000000|526, // match move
0x80000000|111, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 207
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 208
101,113, // "t"
  }
,
{ // state 209
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 210
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 211
2,576, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 212
101,181, // "t"
  }
,
{ // state 213
102,153, // "d"
  }
,
{ // state 214
2,475, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 215
106,515, // "u"
  }
,
{ // state 216
155,MIN_REDUCTION+0, // $
  }
,
{ // state 217
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 218
2,99, // ws*
136,413, // $$1
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 219
2,110, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 220
0x80000000|1, // match move
0x80000000|240, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 221
156,MIN_REDUCTION+243, // $NT
  }
,
{ // state 222
98,625, // "r"
  }
,
{ // state 223
101,395, // "t"
  }
,
{ // state 224
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 225
2,24, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 227
89,630, // "l"
  }
,
{ // state 228
2,667, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 229
2,132, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 230
4,674, // token
58,51, // `!
59,217, // `!=
60,485, // `%
61,569, // `&&
62,646, // `*
63,3, // `(
64,635, // `)
65,84, // `{
66,257, // `}
67,209, // `-
68,525, // `+
69,163, // `=
70,490, // `==
71,77, // `[
72,518, // `]
73,398, // `||
74,606, // `<
75,466, // `<=
76,252, // `,
77,128, // `>
78,155, // `>=
79,455, // `.
80,390, // `;
81,678, // `++
82,124, // `--
84,679, // ID
85,297, // INTLIT
86,146, // STRINGLIT
87,597, // CHARLIT
120,306, // "*"
134,359, // letter
137,620, // intLit2
139,469, // digit++
140,424, // digit
154,237, // digit+
  }
,
{ // state 231
2,422, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 232
98,567, // "r"
  }
,
{ // state 233
0x80000000|392, // match move
0x80000000|362, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 234
156,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 235
1,216, // start
2,120, // ws*
3,407, // $$0
4,130, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
88,167, // "c"
89,106, // "l"
90,350, // "a"
91,457, // "s"
94,204, // "e"
95,544, // "b"
97,582, // "n"
98,505, // "r"
101,461, // "t"
102,26, // "d"
103,43, // "f"
104,588, // "i"
105,15, // "w"
107,314, // "p"
109,465, // "v"
112,304, // "g"
150,332, // {131}
153,633, // token*
155,MIN_REDUCTION+1, // $
  }
,
{ // state 236
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 237
0x80000000|138, // match move
0x80000000|663, // no-match move
0x80000000|644, // NT-test-match state for digit
  }
,
{ // state 238
0x80000000|1, // match move
0x80000000|421, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 239
91,177, // "s"
101,275, // "t"
  }
,
{ // state 240
0x80000000|406, // match move
0x80000000|400, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 241
0x80000000|134, // match move
0x80000000|638, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 242
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 243
2,491, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 244
98,208, // "r"
  }
,
{ // state 245
156,MIN_REDUCTION+120, // $NT
  }
,
{ // state 246
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 247
2,334, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 249
108,205, // "h"
  }
,
{ // state 250
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 251
133,428, // "|"
  }
,
{ // state 252
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 253
94,295, // "e"
  }
,
{ // state 254
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 256
89,129, // "l"
  }
,
{ // state 257
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 258
2,17, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 259
113,386, // "z"
  }
,
{ // state 260
0x80000000|18, // match move
0x80000000|47, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 261
2,383, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 262
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 263
2,361, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 264
156,MIN_REDUCTION+246, // $NT
  }
,
{ // state 265
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 266
91,31, // "s"
101,374, // "t"
  }
,
{ // state 267
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 269
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 271
112,190, // "g"
  }
,
{ // state 272
156,MIN_REDUCTION+231, // $NT
  }
,
{ // state 273
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 274
89,105, // "l"
104,8, // "i"
  }
,
{ // state 275
88,249, // "c"
  }
,
{ // state 276
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 277
0x80000000|1, // match move
0x80000000|261, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 278
0x80000000|235, // match move
0x80000000|508, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 279
0x80000000|21, // match move
0x80000000|91, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 280
98,282, // "r"
  }
,
{ // state 281
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 282
101,66, // "t"
  }
,
{ // state 283
156,MIN_REDUCTION+174, // $NT
  }
,
{ // state 284
89,291, // "l"
  }
,
{ // state 285
0x80000000|284, // match move
0x80000000|557, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 286
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 287
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 289
96,311, // "o"
  }
,
{ // state 290
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 291
110,115, // "y"
  }
,
{ // state 292
90,498, // "a"
  }
,
{ // state 293
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 294
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 295
97,13, // "n"
  }
,
{ // state 296
91,574, // "s"
  }
,
{ // state 297
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 298
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 299
3,52, // $$0
4,130, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
88,167, // "c"
89,106, // "l"
90,350, // "a"
91,457, // "s"
94,204, // "e"
95,544, // "b"
97,582, // "n"
98,505, // "r"
101,461, // "t"
102,26, // "d"
103,43, // "f"
104,588, // "i"
105,15, // "w"
107,314, // "p"
109,465, // "v"
112,304, // "g"
150,332, // {131}
153,633, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 300
96,74, // "o"
  }
,
{ // state 301
98,370, // "r"
  }
,
{ // state 302
2,25, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 303
4,674, // token
58,51, // `!
59,217, // `!=
60,485, // `%
61,569, // `&&
63,3, // `(
64,635, // `)
65,84, // `{
66,257, // `}
67,209, // `-
68,525, // `+
69,163, // `=
70,490, // `==
71,77, // `[
72,518, // `]
73,398, // `||
74,606, // `<
75,466, // `<=
76,252, // `,
77,128, // `>
78,155, // `>=
79,455, // `.
80,390, // `;
81,678, // `++
82,124, // `--
83,327, // `/
84,679, // ID
85,297, // INTLIT
86,146, // STRINGLIT
87,597, // CHARLIT
134,359, // letter
  }
,
{ // state 304
96,373, // "o"
  }
,
{ // state 305
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 306
2,194, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 307
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 308
156,MIN_REDUCTION+90, // $NT
  }
,
{ // state 309
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 310
156,MIN_REDUCTION+240, // $NT
  }
,
{ // state 311
103,357, // "f"
  }
,
{ // state 312
0x80000000|426, // match move
0x80000000|396, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 313
2,441, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 314
90,659, // "a"
98,607, // "r"
106,122, // "u"
  }
,
{ // state 315
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 316
2,658, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 317
2,48, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 318
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 319
101,680, // "t"
  }
,
{ // state 320
0x80000000|19, // match move
0x80000000|312, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 321
98,494, // "r"
  }
,
{ // state 322
103,655, // "f"
  }
,
{ // state 323
0x80000000|404, // match move
0x80000000|647, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 324
89,140, // "l"
  }
,
{ // state 325
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 326
0x80000000|459, // match move
0x80000000|354, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 327
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 328
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 330
156,MIN_REDUCTION+198, // $NT
  }
,
{ // state 331
2,372, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 333
88,178, // "c"
  }
,
{ // state 334
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 335
99,384, // "k"
  }
,
{ // state 336
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 337
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 338
2,32, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 339
101,624, // "t"
  }
,
{ // state 340
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 341
90,632, // "a"
106,133, // "u"
110,23, // "y"
  }
,
{ // state 342
91,339, // "s"
  }
,
{ // state 343
0x80000000|1, // match move
0x80000000|202, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 344
105,590, // "w"
  }
,
{ // state 345
0x80000000|340, // match move
0x80000000|262, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 346
-1, // $$start
-1, // start
265, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
126, // `boolean
309, // `class
56, // `extends
288, // `void
226, // `int
169, // `while
57, // `if
267, // `else
553, // `for
471, // `break
478, // `this
250, // `false
329, // `true
305, // `super
432, // `null
203, // `return
473, // `instanceof
516, // `new
109, // `abstract
483, // `assert
67, // `byte
276, // `case
665, // `catch
46, // `char
40, // `const
142, // `continue
594, // `default
293, // `do
600, // `double
119, // `enum
402, // `final
80, // `finally
337, // `float
152, // `goto
179, // `implements
527, // `import
347, // `interface
145, // `long
444, // `native
433, // `package
380, // `private
556, // `protected
270, // `public
72, // `short
371, // `static
438, // `strictfp
183, // `switch
255, // `synchronized
615, // `throw
28, // `throws
628, // `transient
599, // `try
387, // `volatile
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
167, // "c"
106, // "l"
350, // "a"
260, // "s"
-1, // idChar
-1, // reserved
204, // "e"
544, // "b"
MIN_REDUCTION+233, // "o"
582, // "n"
505, // "r"
MIN_REDUCTION+233, // "k"
MIN_REDUCTION+233, // "x"
461, // "t"
26, // "d"
43, // "f"
588, // "i"
15, // "w"
MIN_REDUCTION+233, // "u"
314, // "p"
MIN_REDUCTION+233, // "h"
465, // "v"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
304, // "g"
MIN_REDUCTION+233, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
MIN_REDUCTION+233, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
-1, // letter
-1, // idChar**
-1, // $$1
-1, // intLit2
MIN_REDUCTION+233, // "0"
-1, // digit++
-1, // digit
-1, // "_"
MIN_REDUCTION+233, // {"A".."Z" "j" "q"}
MIN_REDUCTION+233, // {"1".."9"}
234, // ws
131, // {9 " "}
629, // eol
30, // {10}
586, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 347
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 348
2,589, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 349
108,185, // "h"
  }
,
{ // state 350
91,296, // "s"
95,342, // "b"
  }
,
{ // state 351
0x80000000|592, // match move
0x80000000|230, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 352
-1, // $$start
-1, // start
391, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
126, // `boolean
309, // `class
56, // `extends
288, // `void
226, // `int
169, // `while
57, // `if
267, // `else
553, // `for
471, // `break
478, // `this
250, // `false
329, // `true
305, // `super
432, // `null
203, // `return
473, // `instanceof
516, // `new
109, // `abstract
483, // `assert
67, // `byte
276, // `case
665, // `catch
46, // `char
40, // `const
142, // `continue
594, // `default
293, // `do
600, // `double
119, // `enum
402, // `final
80, // `finally
337, // `float
152, // `goto
179, // `implements
527, // `import
347, // `interface
145, // `long
444, // `native
433, // `package
380, // `private
556, // `protected
270, // `public
72, // `short
371, // `static
438, // `strictfp
183, // `switch
255, // `synchronized
615, // `throw
28, // `throws
628, // `transient
599, // `try
387, // `volatile
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
167, // "c"
364, // "l"
350, // "a"
457, // "s"
-1, // idChar
-1, // reserved
204, // "e"
544, // "b"
MIN_REDUCTION+182, // "o"
582, // "n"
505, // "r"
MIN_REDUCTION+182, // "k"
MIN_REDUCTION+182, // "x"
461, // "t"
26, // "d"
43, // "f"
588, // "i"
15, // "w"
MIN_REDUCTION+182, // "u"
314, // "p"
MIN_REDUCTION+182, // "h"
465, // "v"
MIN_REDUCTION+182, // "y"
MIN_REDUCTION+182, // "m"
304, // "g"
MIN_REDUCTION+182, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
MIN_REDUCTION+182, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
-1, // letter
-1, // idChar**
-1, // $$1
-1, // intLit2
MIN_REDUCTION+182, // "0"
-1, // digit++
-1, // digit
-1, // "_"
MIN_REDUCTION+182, // {"A".."Z" "j" "q"}
MIN_REDUCTION+182, // {"1".."9"}
234, // ws
131, // {9 " "}
629, // eol
30, // {10}
586, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
-1, // token*
-1, // digit+
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 353
2,536, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 355
101,538, // "t"
  }
,
{ // state 356
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 357
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 358
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 359
0x80000000|654, // match move
0x80000000|604, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 360
2,365, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 361
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 362
2,97, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 363
156,MIN_REDUCTION+228, // $NT
  }
,
{ // state 364
96,447, // "o"
110,115, // "y"
  }
,
{ // state 365
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 366
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 367
88,512, // "c"
  }
,
{ // state 368
156,MIN_REDUCTION+123, // $NT
  }
,
{ // state 369
94,196, // "e"
  }
,
{ // state 370
97,514, // "n"
  }
,
{ // state 371
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 372
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 373
101,300, // "t"
  }
,
{ // state 374
104,541, // "i"
  }
,
{ // state 375
101,154, // "t"
  }
,
{ // state 376
89,319, // "l"
  }
,
{ // state 377
94,61, // "e"
  }
,
{ // state 378
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 379
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 380
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 381
89,173, // "l"
  }
,
{ // state 382
98,12, // "r"
  }
,
{ // state 383
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 384
90,271, // "a"
  }
,
{ // state 385
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 386
94,640, // "e"
  }
,
{ // state 387
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 388
3,52, // $$0
4,130, // token
58,51, // `!
59,217, // `!=
60,485, // `%
61,569, // `&&
62,646, // `*
63,3, // `(
64,635, // `)
65,84, // `{
66,257, // `}
67,209, // `-
68,525, // `+
69,163, // `=
70,490, // `==
71,77, // `[
72,518, // `]
73,398, // `||
74,606, // `<
75,466, // `<=
76,252, // `,
77,128, // `>
78,155, // `>=
79,455, // `.
80,390, // `;
81,678, // `++
82,124, // `--
84,679, // ID
85,297, // INTLIT
86,146, // STRINGLIT
87,597, // CHARLIT
120,306, // "*"
134,359, // letter
137,620, // intLit2
139,469, // digit++
140,424, // digit
144,431, // ws
146,629, // eol
153,633, // token*
154,237, // digit+
  }
,
{ // state 389
0x80000000|1, // match move
0x80000000|484, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 390
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 391
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 392
115,34, // "="
  }
,
{ // state 393
156,MIN_REDUCTION+180, // $NT
  }
,
{ // state 394
0x80000000|107, // match move
0x80000000|247, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 395
106,301, // "u"
  }
,
{ // state 396
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
674, // token
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
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
69, // "c"
69, // "l"
69, // "a"
69, // "s"
-1, // idChar
-1, // reserved
69, // "e"
69, // "b"
69, // "o"
69, // "n"
69, // "r"
69, // "k"
69, // "x"
69, // "t"
69, // "d"
69, // "f"
69, // "i"
69, // "w"
69, // "u"
69, // "p"
69, // "h"
69, // "v"
69, // "y"
69, // "m"
69, // "g"
69, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
-1, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
359, // letter
-1, // idChar**
-1, // $$1
620, // intLit2
37, // "0"
469, // digit++
424, // digit
-1, // "_"
69, // {"A".."Z" "j" "q"}
37, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
-1, // token*
237, // digit+
MIN_REDUCTION+329, // $
-1, // $NT
  }
,
{ // state 397
97,266, // "n"
  }
,
{ // state 398
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 399
117,504, // "&"
  }
,
{ // state 400
1,216, // start
2,120, // ws*
3,407, // $$0
4,130, // token
58,51, // `!
59,217, // `!=
60,485, // `%
61,569, // `&&
62,646, // `*
63,3, // `(
64,635, // `)
65,84, // `{
66,257, // `}
67,209, // `-
68,525, // `+
69,163, // `=
70,490, // `==
71,77, // `[
72,518, // `]
73,398, // `||
74,606, // `<
75,466, // `<=
76,252, // `,
77,128, // `>
78,155, // `>=
79,455, // `.
80,390, // `;
81,678, // `++
82,124, // `--
84,679, // ID
85,297, // INTLIT
86,146, // STRINGLIT
87,597, // CHARLIT
120,306, // "*"
134,359, // letter
137,620, // intLit2
139,469, // digit++
140,424, // digit
144,234, // ws
146,629, // eol
153,633, // token*
154,237, // digit+
  }
,
{ // state 401
156,MIN_REDUCTION+310, // $NT
  }
,
{ // state 402
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 403
104,672, // "i"
  }
,
{ // state 404
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 405
88,591, // "c"
  }
,
{ // state 406
1,216, // start
2,120, // ws*
3,407, // $$0
4,130, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
153,633, // token*
  }
,
{ // state 407
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 408
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 409
0x80000000|1, // match move
0x80000000|313, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 410
91,377, // "s"
  }
,
{ // state 411
156,MIN_REDUCTION+141, // $NT
  }
,
{ // state 412
0x80000000|1, // match move
0x80000000|351, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 413
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 414
156,MIN_REDUCTION+99, // $NT
  }
,
{ // state 415
156,MIN_REDUCTION+132, // $NT
  }
,
{ // state 416
156,MIN_REDUCTION+237, // $NT
  }
,
{ // state 417
96,612, // "o"
  }
,
{ // state 418
104,522, // "i"
108,121, // "h"
  }
,
{ // state 419
0x80000000|184, // match move
0x80000000|176, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 420
156,MIN_REDUCTION+192, // $NT
  }
,
{ // state 421
2,64, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 422
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 423
91,449, // "s"
  }
,
{ // state 424
0x80000000|144, // match move
0x80000000|456, // no-match move
0x80000000|644, // NT-test-match state for digit
  }
,
{ // state 425
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 426
4,674, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
88,167, // "c"
89,106, // "l"
90,350, // "a"
91,457, // "s"
94,204, // "e"
95,544, // "b"
97,582, // "n"
98,505, // "r"
101,461, // "t"
102,26, // "d"
103,43, // "f"
104,588, // "i"
105,15, // "w"
107,314, // "p"
109,465, // "v"
112,304, // "g"
150,332, // {131}
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 427
156,MIN_REDUCTION+102, // $NT
  }
,
{ // state 428
2,558, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 429
88,474, // "c"
  }
,
{ // state 430
2,73, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 431
156,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 434
0x80000000|571, // match move
0x80000000|192, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 435
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 436
156,MIN_REDUCTION+207, // $NT
  }
,
{ // state 437
106,186, // "u"
  }
,
{ // state 438
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 439
156,MIN_REDUCTION+234, // $NT
  }
,
{ // state 440
94,83, // "e"
  }
,
{ // state 441
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 442
109,157, // "v"
  }
,
{ // state 443
98,417, // "r"
104,423, // "i"
  }
,
{ // state 444
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 445
2,42, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 446
2,356, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 447
97,565, // "n"
  }
,
{ // state 448
89,598, // "l"
  }
,
{ // state 449
0x80000000|1, // match move
0x80000000|20, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 450
156,MIN_REDUCTION+314, // $NT
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 451
101,174, // "t"
  }
,
{ // state 452
88,69, // "c"
89,69, // "l"
90,69, // "a"
91,69, // "s"
92,323, // idChar
94,69, // "e"
95,69, // "b"
96,69, // "o"
97,69, // "n"
98,69, // "r"
99,69, // "k"
100,69, // "x"
101,69, // "t"
102,69, // "d"
103,69, // "f"
104,69, // "i"
105,69, // "w"
106,69, // "u"
107,69, // "p"
108,69, // "h"
109,69, // "v"
110,69, // "y"
111,69, // "m"
112,69, // "g"
113,69, // "z"
134,326, // letter
138,180, // "0"
140,53, // digit
141,345, // "_"
142,69, // {"A".."Z" "j" "q"}
143,180, // {"1".."9"}
  }
,
{ // state 453
123,168, // "-"
  }
,
{ // state 454
107,496, // "p"
  }
,
{ // state 455
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 456
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 457
101,610, // "t"
105,45, // "w"
106,454, // "u"
108,27, // "h"
110,197, // "y"
  }
,
{ // state 458
156,MIN_REDUCTION+129, // $NT
  }
,
{ // state 459
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 460
156,MIN_REDUCTION+111, // $NT
  }
,
{ // state 461
98,341, // "r"
108,443, // "h"
  }
,
{ // state 462
135,MIN_REDUCTION+309, // idChar**
141,MIN_REDUCTION+309, // "_"
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 463
88,6, // "c"
  }
,
{ // state 464
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 465
96,274, // "o"
  }
,
{ // state 466
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 467
0x80000000|1, // match move
0x80000000|102, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 468
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 470
156,MIN_REDUCTION+216, // $NT
  }
,
{ // state 471
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 472
0x80000000|279, // match move
0x80000000|476, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 473
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 474
0x80000000|1, // match move
0x80000000|228, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 475
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 476
0x80000000|299, // match move
0x80000000|493, // no-match move
0x80000000|572, // NT-test-match state for reserved
  }
,
{ // state 477
90,151, // "a"
  }
,
{ // state 478
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 479
0x80000000|1, // match move
0x80000000|101, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 480
103,114, // "f"
  }
,
{ // state 481
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 482
2,318, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 483
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 484
2,596, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 485
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 486
2,200, // ws*
144,234, // ws
146,629, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 487
156,MIN_REDUCTION+159, // $NT
  }
,
{ // state 488
88,349, // "c"
  }
,
{ // state 489
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 491
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 492
0x80000000|559, // match move
0x80000000|523, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 493
-1, // $$start
-1, // start
-1, // ws*
52, // $$0
130, // token
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
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
69, // "c"
69, // "l"
69, // "a"
69, // "s"
-1, // idChar
-1, // reserved
69, // "e"
69, // "b"
69, // "o"
69, // "n"
69, // "r"
69, // "k"
69, // "x"
69, // "t"
69, // "d"
69, // "f"
69, // "i"
69, // "w"
69, // "u"
69, // "p"
69, // "h"
69, // "v"
69, // "y"
69, // "m"
69, // "g"
69, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
-1, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
359, // letter
-1, // idChar**
-1, // $$1
620, // intLit2
37, // "0"
469, // digit++
424, // digit
-1, // "_"
69, // {"A".."Z" "j" "q"}
37, // {"1".."9"}
431, // ws
131, // {9 " "}
629, // eol
30, // {10}
586, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
633, // token*
237, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 494
0x80000000|1, // match move
0x80000000|616, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 496
94,232, // "e"
  }
,
{ // state 497
88,198, // "c"
89,198, // "l"
90,198, // "a"
91,198, // "s"
94,198, // "e"
95,198, // "b"
96,198, // "o"
97,198, // "n"
98,198, // "r"
99,198, // "k"
100,198, // "x"
101,198, // "t"
102,198, // "d"
103,198, // "f"
104,198, // "i"
105,198, // "w"
106,198, // "u"
107,198, // "p"
108,198, // "h"
109,198, // "v"
110,198, // "y"
111,198, // "m"
112,198, // "g"
113,198, // "z"
134,195, // letter
138,401, // "0"
140,29, // digit
141,584, // "_"
142,198, // {"A".."Z" "j" "q"}
143,401, // {"1".."9"}
  }
,
{ // state 498
88,182, // "c"
  }
,
{ // state 499
104,524, // "i"
  }
,
{ // state 500
90,100, // "a"
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|430, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 502
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 503
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 504
2,537, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 505
94,223, // "e"
  }
,
{ // state 506
2,489, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 507
2,378, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 508
-1, // $$start
216, // start
120, // ws*
407, // $$0
130, // token
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
51, // `!
217, // `!=
485, // `%
569, // `&&
-1, // `*
3, // `(
635, // `)
84, // `{
257, // `}
209, // `-
525, // `+
163, // `=
490, // `==
77, // `[
518, // `]
398, // `||
606, // `<
466, // `<=
252, // `,
128, // `>
155, // `>=
455, // `.
390, // `;
678, // `++
124, // `--
327, // `/
679, // ID
297, // INTLIT
146, // STRINGLIT
597, // CHARLIT
69, // "c"
69, // "l"
69, // "a"
69, // "s"
-1, // idChar
-1, // reserved
69, // "e"
69, // "b"
69, // "o"
69, // "n"
69, // "r"
69, // "k"
69, // "x"
69, // "t"
69, // "d"
69, // "f"
69, // "i"
69, // "w"
69, // "u"
69, // "p"
69, // "h"
69, // "v"
69, // "y"
69, // "m"
69, // "g"
69, // "z"
241, // "!"
492, // "="
193, // "%"
399, // "&"
211, // "("
302, // ")"
-1, // "*"
170, // "+"
580, // ","
622, // "-"
11, // "."
664, // "/"
156, // ";"
394, // "<"
233, // ">"
554, // "["
634, // "]"
662, // "{"
521, // "}"
251, // "|"
359, // letter
-1, // idChar**
-1, // $$1
620, // intLit2
37, // "0"
469, // digit++
424, // digit
-1, // "_"
69, // {"A".."Z" "j" "q"}
37, // {"1".."9"}
234, // ws
131, // {9 " "}
629, // eol
30, // {10}
586, // {13}
236, // {130}
332, // {131}
187, // {132}
-1, // idChar*
633, // token*
237, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 509
2,546, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 510
0x80000000|637, // match move
0x80000000|158, // no-match move
0x80000000|644, // NT-test-match state for digit
  }
,
{ // state 511
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 512
94,289, // "e"
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
{ // state 513
156,MIN_REDUCTION+315, // $NT
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 514
0x80000000|1, // match move
0x80000000|231, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 515
95,639, // "b"
  }
,
{ // state 516
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 517
0x80000000|1, // match move
0x80000000|445, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 518
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 519
91,649, // "s"
  }
,
{ // state 520
156,MIN_REDUCTION+171, // $NT
  }
,
{ // state 521
2,63, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 522
101,488, // "t"
  }
,
{ // state 523
2,503, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 524
109,369, // "v"
  }
,
{ // state 525
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 526
1,216, // start
2,120, // ws*
3,407, // $$0
4,130, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
153,633, // token*
  }
,
{ // state 527
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 528
156,MIN_REDUCTION+144, // $NT
  }
,
{ // state 529
89,227, // "l"
  }
,
{ // state 530
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 531
91,147, // "s"
  }
,
{ // state 532
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 533
94,581, // "e"
  }
,
{ // state 534
156,MIN_REDUCTION+186, // $NT
  }
,
{ // state 535
0x80000000|1, // match move
0x80000000|676, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 536
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 537
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 538
94,2, // "e"
  }
,
{ // state 539
90,603, // "a"
  }
,
{ // state 540
0x80000000|1, // match move
0x80000000|360, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 541
97,437, // "n"
  }
,
{ // state 542
101,22, // "t"
  }
,
{ // state 543
94,660, // "e"
  }
,
{ // state 544
96,609, // "o"
98,595, // "r"
110,355, // "y"
  }
,
{ // state 545
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 546
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 547
156,MIN_REDUCTION+210, // $NT
  }
,
{ // state 548
98,670, // "r"
  }
,
{ // state 549
101,657, // "t"
  }
,
{ // state 550
0x80000000|1, // match move
0x80000000|148, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 551
2,290, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 552
91,549, // "s"
101,58, // "t"
  }
,
{ // state 553
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 554
2,254, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 555
106,608, // "u"
  }
,
{ // state 556
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 557
0x80000000|89, // match move
0x80000000|352, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 558
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 559
115,118, // "="
  }
,
{ // state 560
156,MIN_REDUCTION+96, // $NT
  }
,
{ // state 561
0x80000000|206, // match move
0x80000000|278, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 562
0x80000000|1, // match move
0x80000000|108, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 563
91,224, // "s"
  }
,
{ // state 564
94,141, // "e"
  }
,
{ // state 565
112,281, // "g"
  }
,
{ // state 566
156,MIN_REDUCTION+219, // $NT
  }
,
{ // state 567
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 568
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 569
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 570
2,55, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 571
91,501, // "s"
  }
,
{ // state 572
5,560, // `boolean
6,308, // `class
7,427, // `extends
8,411, // `void
9,139, // `int
10,528, // `while
11,460, // `if
12,613, // `else
13,71, // `for
14,414, // `break
15,172, // `this
16,35, // `false
17,92, // `true
18,415, // `super
19,368, // `null
20,458, // `return
21,651, // `instanceof
22,245, // `new
23,50, // `abstract
24,38, // `assert
25,79, // `byte
26,88, // `case
27,487, // `catch
28,585, // `char
29,135, // `const
30,117, // `continue
31,520, // `default
32,283, // `do
33,587, // `double
34,393, // `enum
35,150, // `final
36,534, // `finally
37,668, // `float
38,420, // `goto
39,98, // `implements
40,330, // `import
41,677, // `interface
42,175, // `long
43,436, // `native
44,547, // `package
45,164, // `private
46,470, // `protected
47,9, // `public
48,566, // `short
49,605, // `static
50,641, // `strictfp
51,363, // `switch
52,272, // `synchronized
53,439, // `throw
54,416, // `throws
55,310, // `transient
56,221, // `try
57,264, // `volatile
88,167, // "c"
89,106, // "l"
90,350, // "a"
91,457, // "s"
94,204, // "e"
95,544, // "b"
97,582, // "n"
98,505, // "r"
101,461, // "t"
102,26, // "d"
103,43, // "f"
104,588, // "i"
105,15, // "w"
107,314, // "p"
109,465, // "v"
112,304, // "g"
  }
,
{ // state 573
2,578, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 574
94,244, // "e"
  }
,
{ // state 575
0x80000000|1, // match move
0x80000000|627, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 576
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 577
2,265, // ws*
144,234, // ws
146,629, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 578
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 579
0x80000000|452, // match move
0x80000000|191, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 580
2,666, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 581
98,480, // "r"
  }
,
{ // state 582
90,16, // "a"
94,344, // "e"
106,529, // "u"
  }
,
{ // state 583
2,385, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 584
156,MIN_REDUCTION+308, // $NT
  }
,
{ // state 585
156,MIN_REDUCTION+162, // $NT
  }
,
{ // state 586
0x80000000|631, // match move
0x80000000|513, // no-match move
// T-test match for 10:
147,
  }
,
{ // state 587
156,MIN_REDUCTION+177, // $NT
  }
,
{ // state 588
97,552, // "n"
103,41, // "f"
111,60, // "m"
  }
,
{ // state 589
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 590
0x80000000|1, // match move
0x80000000|338, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 591
101,543, // "t"
  }
,
{ // state 592
4,674, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
  }
,
{ // state 593
97,367, // "n"
  }
,
{ // state 594
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 595
94,500, // "e"
  }
,
{ // state 596
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 598
94,160, // "e"
  }
,
{ // state 599
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 600
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 601
0x80000000|1, // match move
0x80000000|166, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 602
96,65, // "o"
  }
,
{ // state 603
91,531, // "s"
  }
,
{ // state 604
2,99, // ws*
135,218, // idChar**
136,268, // $$1
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
152,579, // idChar*
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 605
156,MIN_REDUCTION+222, // $NT
  }
,
{ // state 606
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 607
96,451, // "o"
104,442, // "i"
  }
,
{ // state 608
111,618, // "m"
  }
,
{ // state 609
96,448, // "o"
  }
,
{ // state 610
90,86, // "a"
98,403, // "r"
  }
,
{ // state 611
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 612
105,434, // "w"
  }
,
{ // state 613
156,MIN_REDUCTION+93, // $NT
  }
,
{ // state 614
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 616
2,617, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 617
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 618
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 619
2,127, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 620
2,246, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 621
2,669, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 622
0x80000000|453, // match move
0x80000000|583, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 623
90,222, // "a"
  }
,
{ // state 624
98,292, // "r"
  }
,
{ // state 625
0x80000000|1, // match move
0x80000000|482, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 626
2,75, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 627
2,611, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 628
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 629
156,MIN_REDUCTION+312, // $NT
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 630
0x80000000|1, // match move
0x80000000|673, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 631
147,450, // {10}
  }
,
{ // state 632
97,519, // "n"
  }
,
{ // state 633
0x80000000|412, // match move
0x80000000|320, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 634
2,315, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 636
106,376, // "u"
  }
,
{ // state 637
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 638
2,336, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 639
89,440, // "l"
  }
,
{ // state 640
102,162, // "d"
  }
,
{ // state 641
156,MIN_REDUCTION+225, // $NT
  }
,
{ // state 642
2,82, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 643
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 644
138,401, // "0"
143,401, // {"1".."9"}
  }
,
{ // state 645
2,36, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 646
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 647
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 648
101,563, // "t"
  }
,
{ // state 649
104,253, // "i"
  }
,
{ // state 650
97,648, // "n"
  }
,
{ // state 651
156,MIN_REDUCTION+114, // $NT
  }
,
{ // state 652
104,123, // "i"
  }
,
{ // state 653
2,73, // ws*
144,234, // ws
146,629, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 654
88,69, // "c"
89,69, // "l"
90,69, // "a"
91,69, // "s"
92,94, // idChar
94,69, // "e"
95,69, // "b"
96,69, // "o"
97,69, // "n"
98,69, // "r"
99,69, // "k"
100,69, // "x"
101,69, // "t"
102,69, // "d"
103,69, // "f"
104,69, // "i"
105,69, // "w"
106,69, // "u"
107,69, // "p"
108,69, // "h"
109,69, // "v"
110,69, // "y"
111,69, // "m"
112,69, // "g"
113,69, // "z"
134,326, // letter
135,218, // idChar**
138,180, // "0"
140,53, // digit
141,345, // "_"
142,69, // {"A".."Z" "j" "q"}
143,180, // {"1".."9"}
152,579, // idChar*
  }
,
{ // state 655
90,636, // "a"
  }
,
{ // state 656
0x80000000|1, // match move
0x80000000|642, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
{ // state 657
90,593, // "a"
  }
,
{ // state 658
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 659
88,335, // "c"
  }
,
{ // state 660
102,601, // "d"
  }
,
{ // state 661
89,143, // "l"
96,382, // "o"
  }
,
{ // state 662
2,358, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 663
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 664
0x80000000|1, // match move
0x80000000|112, // no-match move
// T-test match for {"*" "/"}:
120,
125,
  }
,
{ // state 665
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 666
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 667
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 668
156,MIN_REDUCTION+189, // $NT
  }
,
{ // state 669
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 670
96,90, // "o"
  }
,
{ // state 671
144,431, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 672
88,212, // "c"
  }
,
{ // state 673
2,33, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 674
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 675
4,674, // token
5,126, // `boolean
6,309, // `class
7,56, // `extends
8,288, // `void
9,226, // `int
10,169, // `while
11,57, // `if
12,267, // `else
13,553, // `for
14,471, // `break
15,478, // `this
16,250, // `false
17,329, // `true
18,305, // `super
19,432, // `null
20,203, // `return
21,473, // `instanceof
22,516, // `new
23,109, // `abstract
24,483, // `assert
25,67, // `byte
26,276, // `case
27,665, // `catch
28,46, // `char
29,40, // `const
30,142, // `continue
31,594, // `default
32,293, // `do
33,600, // `double
34,119, // `enum
35,402, // `final
36,80, // `finally
37,337, // `float
38,152, // `goto
39,179, // `implements
40,527, // `import
41,347, // `interface
42,145, // `long
43,444, // `native
44,433, // `package
45,380, // `private
46,556, // `protected
47,270, // `public
48,72, // `short
49,371, // `static
50,438, // `strictfp
51,183, // `switch
52,255, // `synchronized
53,615, // `throw
54,28, // `throws
55,628, // `transient
56,599, // `try
57,387, // `volatile
84,679, // ID
  }
,
{ // state 676
2,435, // ws*
144,234, // ws
145,131, // {9 " "}
146,629, // eol
147,30, // {10}
148,586, // {13}
156,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 677
156,MIN_REDUCTION+201, // $NT
  }
,
{ // state 678
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 679
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 680
0x80000000|1, // match move
0x80000000|78, // no-match move
0x80000000|497, // NT-test-match state for idChar
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[681][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// intLit2 ::= !"0" digit++
(137<<16)+1,
// idChar ::= letter
(92<<16)+1,
// idChar ::= digit
(92<<16)+1,
// idChar ::= "_"
(92<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(134<<16)+1,
// digit ::= {"0".."9"}
(140<<16)+1,
// ws ::= {9 " "}
(144<<16)+1,
// ws ::= eol
(144<<16)+1,
// eol ::= {10}
(146<<16)+1,
// eol ::= {13} {10}
(146<<16)+2,
// eol ::= {13} !10
(146<<16)+1,
// CHARLIT ::= {130}
(87<<16)+1,
// ID ::= {131}
(84<<16)+1,
// STRINGLIT ::= {132}
(86<<16)+1,
// idChar** ::= idChar* !idChar
(135<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// token* ::= token* token
(153<<16)+2,
// token* ::= token
(153<<16)+1,
// digit++ ::= digit+ !digit
(139<<16)+1,
// digit+ ::= digit
(154<<16)+1,
// digit+ ::= digit+ digit
(154<<16)+2,
// idChar* ::= idChar* idChar
(152<<16)+2,
// idChar* ::= idChar
(152<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
(136<<16)+1,
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
145, // 9
147, // 10
-1, // 11
-1, // 12
148, // 13
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
145, // " "
114, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
116, // "%"
117, // "&"
-1, // "'"
118, // "("
119, // ")"
120, // "*"
121, // "+"
122, // ","
123, // "-"
124, // "."
125, // "/"
138, // "0"
143, // "1"
143, // "2"
143, // "3"
143, // "4"
143, // "5"
143, // "6"
143, // "7"
143, // "8"
143, // "9"
-1, // ":"
126, // ";"
127, // "<"
115, // "="
128, // ">"
-1, // "?"
-1, // "@"
142, // "A"
142, // "B"
142, // "C"
142, // "D"
142, // "E"
142, // "F"
142, // "G"
142, // "H"
142, // "I"
142, // "J"
142, // "K"
142, // "L"
142, // "M"
142, // "N"
142, // "O"
142, // "P"
142, // "Q"
142, // "R"
142, // "S"
142, // "T"
142, // "U"
142, // "V"
142, // "W"
142, // "X"
142, // "Y"
142, // "Z"
129, // "["
-1, // "\"
130, // "]"
-1, // "^"
141, // "_"
-1, // "`"
90, // "a"
95, // "b"
88, // "c"
102, // "d"
94, // "e"
103, // "f"
112, // "g"
108, // "h"
104, // "i"
142, // "j"
99, // "k"
89, // "l"
111, // "m"
97, // "n"
96, // "o"
107, // "p"
142, // "q"
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
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
149, // 130
150, // 131
151, // 132
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
"ID ::= !reserved letter idChar** ws*", // 299
"ID ::= !reserved letter idChar** ws*", // 300
"ID ::= !reserved letter idChar** ws*", // 301
"ID ::= !reserved letter idChar** ws*", // 302
"INTLIT ::= # intLit2 ws*", // 303
"INTLIT ::= # intLit2 ws*", // 304
"intLit2 ::= !\"0\" digit++", // 305
"idChar ::= letter", // 306
"idChar ::= digit", // 307
"idChar ::= \"_\"", // 308
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 309
"digit ::= {\"0\"..\"9\"}", // 310
"ws ::= {9 \" \"}", // 311
"ws ::= eol", // 312
"eol ::= {10} registerNewline", // 313
"eol ::= {13} {10} registerNewline", // 314
"eol ::= {13} !10 registerNewline", // 315
"CHARLIT ::= {130}", // 316
"ID ::= {131}", // 317
"STRINGLIT ::= {132}", // 318
"idChar** ::= idChar* !idChar", // 319
"ws* ::= ws* ws", // 320
"ws* ::= ws* ws", // 321
"token* ::= token* token", // 322
"token* ::= token* token", // 323
"digit++ ::= digit+ !digit", // 324
"digit+ ::= digit", // 325
"digit+ ::= digit+ digit", // 326
"idChar* ::= idChar* idChar", // 327
"idChar* ::= idChar* idChar", // 328
"", // 329
"", // 330
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 299: ID ::= !reserved letter idChar** $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 300: ID ::= !reserved letter idChar** [ws*] @text
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 301: ID ::= !reserved letter !idChar [idChar**] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 302: ID ::= !reserved letter !idChar [idChar**] [ws*] @text
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 303: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 304: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 305: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 306: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 307: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 308: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 309: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 310: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 312: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 313: eol ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 314: eol ::= {13} {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 315: eol ::= {13} !10 [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 316: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 317: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 318: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 319: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 321: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 322: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 323: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 324: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 325: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 326: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 327: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 328: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 329: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 330: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // ws*
    },
    { // idChar**
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((85<<5)|0x5)/*methodCall:85*/,
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
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 84: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.zero(parm0);
      si.pushPb(result);
    }
    break;
    case 85: {
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
"int convertToInt(int,String)",
"int zero(char)",
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
2,1,
1,1,
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
    1,
    0,
    1,
    -1,
    1,
    1,
    -1,
    -1,
    -1,
    0,
    -1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
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
