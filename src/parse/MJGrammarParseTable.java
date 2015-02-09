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
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 148; }
public int getNttSym() { return 149; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"`break",
"`;",
"<assign>",
"<if>",
"<while>",
"<callExp>",
"`if",
"<exp>",
"`else",
"`while",
"<local var decl>",
"`=",
"`++",
"`--",
"`||",
"<exp2>",
"`&&",
"<exp3>",
"`!=",
"<exp4>",
"`==",
"`<",
"<exp5>",
"`>",
"`<=",
"`>=",
"`instanceof",
"`+",
"<exp6>",
"`-",
"`*",
"<exp7>",
"`/",
"`%",
"<cast exp>",
"<unary exp>",
"<exp8>",
"`!",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"`false",
"`true",
"`null",
"`this",
"`.",
"`new",
"<expList>?",
"`super",
"<expList>",
"`,",
"letter",
"\"a\"",
"\"p\"",
"\"s\"",
"\"v\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"x\"..\"z\"}",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"n\"",
"\"t\"",
"\"w\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\",\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"{0..9 11..31 \"$\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
"\"\'\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"any*",
"$$3",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 150;}
private static final int MIN_REDUCTION = 532;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
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
1,431, // <start>
2,515, // ws*
3,303, // <program>
4,456, // <class decl>+
5,530, // <class decl>
6,474, // `class
108,148, // " "
109,372, // "#"
126,205, // {10}
135,227, // ws
  }
,
{ // state 1
0x80000000|215, // match move
0x80000000|111, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 2
0x80000000|408, // match move
0x80000000|438, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 3
  }
,
{ // state 4
7,512, // ID
30,392, // <callExp>
52,21, // `+
54,476, // `-
60,180, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 5
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 8
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 9
7,512, // ID
15,45, // `(
16,307, // `)
30,392, // <callExp>
32,158, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
72,279, // <expList>?
73,265, // `super
74,214, // <expList>
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
111,125, // ")"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 10
0x80000000|3, // match move
0x80000000|285, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
52,117, // `+
54,404, // `-
105,168, // "-"
121,396, // "+"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 12
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 13
0x80000000|202, // match move
0x80000000|367, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 14
76,166, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,322, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
98,20, // digit
99,319, // {"1".."9"}
100,319, // "0"
101,470, // digit128
102,1, // {176..185}
123,454, // "_"
133,171, // {223}
136,481, // idChar*
137,488, // $$0
144,312, // idChar
145,361, // idChar128
  }
,
{ // state 15
2,102, // ws*
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 16
88,216, // "u"
  }
,
{ // state 17
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 19
84,330, // "i"
  }
,
{ // state 20
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 21
7,512, // ID
30,392, // <callExp>
52,21, // `+
54,476, // `-
60,155, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 22
108,MIN_REDUCTION+85, // " "
126,MIN_REDUCTION+85, // {10}
135,MIN_REDUCTION+85, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 23
149,MIN_REDUCTION+13, // $NT
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 25
2,17, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 26
2,368, // ws*
  }
,
{ // state 27
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 28
107,432, // "|"
110,466, // "&"
124,240, // "="
128,223, // "!"
  }
,
{ // state 29
108,37, // " "
126,462, // {10}
135,13, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 30
0x80000000|3, // match move
0x80000000|525, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 31
108,148, // " "
126,205, // {10}
135,337, // ws
149,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 32
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 33
22,MIN_REDUCTION+72, // `[
104,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 34
26,518, // `;
115,415, // ";"
  }
,
{ // state 35
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 36
0x80000000|3, // match move
0x80000000|40, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
0x80000000|259, // match move
0x80000000|22, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 38
26,434, // `;
115,415, // ";"
  }
,
{ // state 39
0x80000000|3, // match move
0x80000000|118, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 40
15,9, // `(
22,MIN_REDUCTION+68, // `[
104,MIN_REDUCTION+68, // "["
120,293, // "("
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 42
2,354, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 43
22,MIN_REDUCTION+194, // `[
104,MIN_REDUCTION+194, // "["
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 45
7,250, // ID
18,129, // <type>
19,401, // `int
20,458, // `boolean
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
109,310, // "#"
  }
,
{ // state 46
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 47
2,423, // ws*
108,37, // " "
126,462, // {10}
135,234, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 48
0x80000000|3, // match move
0x80000000|502, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 49
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 51
22,MIN_REDUCTION+71, // `[
104,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 52
22,MIN_REDUCTION+171, // `[
104,MIN_REDUCTION+171, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 53
22,MIN_REDUCTION+80, // `[
104,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 55
22,MIN_REDUCTION+65, // `[
104,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 56
2,105, // ws*
22,MIN_REDUCTION+106, // `[
104,MIN_REDUCTION+106, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 58
22,MIN_REDUCTION+73, // `[
104,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 59
7,195, // ID
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
  }
,
{ // state 60
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 61
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 62
22,MIN_REDUCTION+107, // `[
104,MIN_REDUCTION+107, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 63
22,MIN_REDUCTION+201, // `[
104,MIN_REDUCTION+201, // "["
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 64
22,MIN_REDUCTION+173, // `[
104,MIN_REDUCTION+173, // "["
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 65
9,79, // <decl in class>*
10,41, // `}
11,237, // <decl in class>
12,170, // <method decl>
13,440, // `public
109,491, // "#"
127,229, // "}"
  }
,
{ // state 66
2,391, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 67
2,510, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 70
22,MIN_REDUCTION+192, // `[
104,MIN_REDUCTION+192, // "["
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 72
2,32, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 73
2,233, // ws*
22,MIN_REDUCTION+178, // `[
104,MIN_REDUCTION+178, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 75
2,499, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 76
77,44, // "a"
78,44, // "p"
79,44, // "s"
80,44, // "v"
81,44, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,44, // "c"
83,44, // "f"
84,44, // "i"
85,44, // "l"
86,44, // "o"
87,44, // "r"
88,44, // "u"
89,44, // "b"
90,44, // "e"
91,44, // "h"
92,44, // "n"
93,44, // "t"
94,44, // "w"
97,81, // {193..198 225..230}
99,44, // {"1".."9"}
100,44, // "0"
102,81, // {176..185}
141,39, // $$2
146,343, // hexDigit
147,439, // hexDigit128
  }
,
{ // state 77
2,472, // ws*
22,MIN_REDUCTION+108, // `[
104,MIN_REDUCTION+108, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 78
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
127, // ID
175, // `{
-1, // <decl in class>*
299, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
45, // `(
-1, // `)
142, // <stmt>*
115, // <type>
401, // `int
458, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
24, // <stmt>
522, // `break
-1, // `;
38, // <assign>
162, // <if>
50, // <while>
446, // <callExp>
311, // `if
464, // <exp>
-1, // `else
329, // `while
34, // <local var decl>
-1, // `=
147, // `++
164, // `--
-1, // `||
382, // <exp2>
-1, // `&&
86, // <exp3>
-1, // `!=
269, // <exp4>
-1, // `==
-1, // `<
213, // <exp5>
-1, // `>
-1, // `<=
-1, // `>=
-1, // `instanceof
21, // `+
428, // <exp6>
476, // `-
-1, // `*
191, // <exp7>
-1, // `/
-1, // `%
54, // <cast exp>
320, // <unary exp>
485, // <exp8>
4, // `!
271, // INTLIT
152, // STRINGLIT
10, // CHARLIT
30, // `false
406, // `true
48, // `null
174, // `this
-1, // `.
495, // `new
-1, // <expList>?
265, // `super
-1, // <expList>
-1, // `,
14, // letter
167, // "a"
167, // "p"
167, // "s"
167, // "v"
167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
167, // "c"
167, // "f"
167, // "i"
167, // "l"
167, // "o"
167, // "r"
167, // "u"
167, // "b"
167, // "e"
167, // "h"
167, // "n"
167, // "t"
167, // "w"
2, // letter128
249, // {199..218 231..250}
249, // {193..198 225..230}
-1, // digit
275, // {"1".."9"}
185, // "0"
239, // digit128
1, // {176..185}
-1, // any
-1, // "["
168, // "-"
-1, // "<"
-1, // "|"
-1, // " "
126, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
136, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
293, // "("
396, // "+"
-1, // "."
-1, // "_"
-1, // "="
412, // "@"
-1, // {10}
403, // "}"
75, // "!"
398, // "'"
220, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 79
10,7, // `}
11,497, // <decl in class>
12,170, // <method decl>
13,440, // `public
109,491, // "#"
127,229, // "}"
  }
,
{ // state 80
7,512, // ID
15,45, // `(
30,392, // <callExp>
44,132, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 81
0x80000000|471, // match move
0x80000000|43, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
2,405, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 83
0x80000000|6, // match move
0x80000000|316, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 84
2,467, // ws*
22,MIN_REDUCTION+132, // `[
104,MIN_REDUCTION+132, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 86
43,304, // `!=
45,80, // `==
125,28, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 87
7,512, // ID
15,45, // `(
30,392, // <callExp>
47,366, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 88
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 89
2,524, // ws*
22,MIN_REDUCTION+182, // `[
104,MIN_REDUCTION+182, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 90
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,200, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 91
7,512, // ID
15,45, // `(
30,392, // <callExp>
52,21, // `+
54,476, // `-
56,379, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 92
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 93
0x80000000|414, // match move
0x80000000|498, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 94
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 95
2,508, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 96
26,281, // `;
115,194, // ";"
  }
,
{ // state 97
0x80000000|247, // match move
0x80000000|56, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
108,MIN_REDUCTION+86, // " "
126,MIN_REDUCTION+86, // {10}
135,MIN_REDUCTION+86, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 99
0x80000000|529, // match move
0x80000000|274, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
55,91, // `*
57,255, // `/
58,455, // `%
114,208, // "/"
119,422, // "%"
131,317, // "*"
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 101
15,261, // `(
120,293, // "("
  }
,
{ // state 102
0x80000000|187, // match move
0x80000000|298, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 104
55,91, // `*
57,255, // `/
58,455, // `%
114,208, // "/"
119,422, // "%"
131,317, // "*"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 105
0x80000000|3, // match move
0x80000000|301, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 106
0x80000000|449, // match move
0x80000000|384, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 107
15,332, // `(
120,293, // "("
  }
,
{ // state 108
22,MIN_REDUCTION+70, // `[
26,83, // `;
104,MIN_REDUCTION+70, // "["
115,194, // ";"
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 109
16,477, // `)
111,25, // ")"
  }
,
{ // state 110
93,387, // "t"
  }
,
{ // state 111
22,MIN_REDUCTION+82, // `[
104,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 112
22,MIN_REDUCTION+180, // `[
104,MIN_REDUCTION+180, // "["
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 113
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 115
7,523, // ID
21,390, // <empty bracket pair>
22,218, // `[
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
104,358, // "["
  }
,
{ // state 116
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,289, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 117
7,512, // ID
15,45, // `(
30,392, // <callExp>
52,21, // `+
53,100, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 118
22,MIN_REDUCTION+179, // `[
104,MIN_REDUCTION+179, // "["
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 119
2,362, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 120
79,16, // "s"
83,313, // "f"
92,371, // "n"
93,520, // "t"
  }
,
{ // state 121
0x80000000|3, // match move
0x80000000|270, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
2,445, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 123
22,MIN_REDUCTION+176, // `[
104,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 124
2,306, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 125
0x80000000|189, // match move
0x80000000|84, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 126
79,16, // "s"
83,313, // "f"
84,110, // "i"
89,437, // "b"
92,371, // "n"
93,520, // "t"
94,294, // "w"
121,72, // "+"
  }
,
{ // state 127
0x80000000|143, // match move
0x80000000|450, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 128
22,MIN_REDUCTION+214, // `[
104,MIN_REDUCTION+214, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 129
16,224, // `)
21,390, // <empty bracket pair>
22,218, // `[
104,358, // "["
111,25, // ")"
  }
,
{ // state 130
0x80000000|287, // match move
0x80000000|77, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 132
46,411, // `<
48,87, // `>
49,198, // `<=
50,277, // `>=
51,156, // `instanceof
106,122, // "<"
109,19, // "#"
116,480, // ">"
125,409, // "@"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 133
0x80000000|3, // match move
0x80000000|177, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 134
7,512, // ID
15,45, // `(
30,392, // <callExp>
42,365, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 135
2,12, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 136
2,288, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 137
2,242, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 138
0x80000000|353, // match move
0x80000000|351, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 139
39,267, // `||
125,349, // "@"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 140
22,MIN_REDUCTION+216, // `[
104,MIN_REDUCTION+216, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 141
2,360, // ws*
108,37, // " "
126,462, // {10}
135,234, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 142
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
127, // ID
175, // `{
-1, // <decl in class>*
348, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
45, // `(
-1, // `)
-1, // <stmt>*
115, // <type>
401, // `int
458, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
374, // <stmt>
522, // `break
-1, // `;
38, // <assign>
162, // <if>
50, // <while>
446, // <callExp>
311, // `if
464, // <exp>
-1, // `else
329, // `while
34, // <local var decl>
-1, // `=
147, // `++
164, // `--
-1, // `||
382, // <exp2>
-1, // `&&
86, // <exp3>
-1, // `!=
269, // <exp4>
-1, // `==
-1, // `<
213, // <exp5>
-1, // `>
-1, // `<=
-1, // `>=
-1, // `instanceof
21, // `+
428, // <exp6>
476, // `-
-1, // `*
191, // <exp7>
-1, // `/
-1, // `%
54, // <cast exp>
320, // <unary exp>
485, // <exp8>
4, // `!
271, // INTLIT
152, // STRINGLIT
10, // CHARLIT
30, // `false
406, // `true
48, // `null
174, // `this
-1, // `.
495, // `new
-1, // <expList>?
265, // `super
-1, // <expList>
-1, // `,
14, // letter
167, // "a"
167, // "p"
167, // "s"
167, // "v"
167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
167, // "c"
167, // "f"
167, // "i"
167, // "l"
167, // "o"
167, // "r"
167, // "u"
167, // "b"
167, // "e"
167, // "h"
167, // "n"
167, // "t"
167, // "w"
2, // letter128
249, // {199..218 231..250}
249, // {193..198 225..230}
-1, // digit
275, // {"1".."9"}
185, // "0"
239, // digit128
1, // {176..185}
-1, // any
-1, // "["
168, // "-"
-1, // "<"
-1, // "|"
-1, // " "
126, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
136, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
293, // "("
396, // "+"
-1, // "."
-1, // "_"
-1, // "="
412, // "@"
-1, // {10}
403, // "}"
75, // "!"
398, // "'"
220, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 143
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 145
0x80000000|3, // match move
0x80000000|112, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 146
2,423, // ws*
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 147
7,114, // ID
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
  }
,
{ // state 148
149,MIN_REDUCTION+85, // $NT
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 150
2,524, // ws*
  }
,
{ // state 151
22,MIN_REDUCTION+177, // `[
104,MIN_REDUCTION+177, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 152
0x80000000|3, // match move
0x80000000|383, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 153
2,121, // ws*
22,MIN_REDUCTION+112, // `[
104,MIN_REDUCTION+112, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 156
7,394, // ID
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
  }
,
{ // state 157
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 158
39,267, // `||
75,206, // `,
112,95, // ","
125,349, // "@"
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 159
2,131, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 160
86,424, // "o"
  }
,
{ // state 161
46,411, // `<
48,87, // `>
49,198, // `<=
50,277, // `>=
51,156, // `instanceof
106,122, // "<"
109,19, // "#"
116,480, // ">"
125,409, // "@"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 163
52,117, // `+
54,404, // `-
105,168, // "-"
121,396, // "+"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 164
7,217, // ID
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
  }
,
{ // state 165
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 168
2,263, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 171
0x80000000|335, // match move
0x80000000|70, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
0x80000000|26, // match move
0x80000000|517, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
0x80000000|3, // match move
0x80000000|51, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
0x80000000|3, // match move
0x80000000|245, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
127, // ID
175, // `{
-1, // <decl in class>*
169, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
45, // `(
-1, // `)
451, // <stmt>*
115, // <type>
401, // `int
458, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
24, // <stmt>
522, // `break
-1, // `;
38, // <assign>
162, // <if>
50, // <while>
446, // <callExp>
311, // `if
464, // <exp>
-1, // `else
329, // `while
34, // <local var decl>
-1, // `=
147, // `++
164, // `--
-1, // `||
382, // <exp2>
-1, // `&&
86, // <exp3>
-1, // `!=
269, // <exp4>
-1, // `==
-1, // `<
213, // <exp5>
-1, // `>
-1, // `<=
-1, // `>=
-1, // `instanceof
21, // `+
428, // <exp6>
476, // `-
-1, // `*
191, // <exp7>
-1, // `/
-1, // `%
54, // <cast exp>
320, // <unary exp>
485, // <exp8>
4, // `!
271, // INTLIT
152, // STRINGLIT
10, // CHARLIT
30, // `false
406, // `true
48, // `null
174, // `this
-1, // `.
495, // `new
-1, // <expList>?
265, // `super
-1, // <expList>
-1, // `,
14, // letter
167, // "a"
167, // "p"
167, // "s"
167, // "v"
167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
167, // "c"
167, // "f"
167, // "i"
167, // "l"
167, // "o"
167, // "r"
167, // "u"
167, // "b"
167, // "e"
167, // "h"
167, // "n"
167, // "t"
167, // "w"
2, // letter128
249, // {199..218 231..250}
249, // {193..198 225..230}
-1, // digit
275, // {"1".."9"}
185, // "0"
239, // digit128
1, // {176..185}
-1, // any
-1, // "["
168, // "-"
-1, // "<"
-1, // "|"
-1, // " "
126, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
136, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
293, // "("
396, // "+"
-1, // "."
-1, // "_"
-1, // "="
412, // "@"
-1, // {10}
229, // "}"
75, // "!"
398, // "'"
220, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 176
16,402, // `)
39,267, // `||
111,25, // ")"
125,349, // "@"
  }
,
{ // state 177
22,MIN_REDUCTION+76, // `[
104,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 178
22,MIN_REDUCTION+60, // `[
104,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 181
0x80000000|49, // match move
0x80000000|46, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 182
15,359, // `(
22,MIN_REDUCTION+59, // `[
104,MIN_REDUCTION+59, // "["
120,293, // "("
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 184
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 185
77,44, // "a"
78,44, // "p"
79,44, // "s"
80,44, // "v"
81,44, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,44, // "c"
83,44, // "f"
84,44, // "i"
85,44, // "l"
86,44, // "o"
87,44, // "r"
88,44, // "u"
89,44, // "b"
90,44, // "e"
91,44, // "h"
92,44, // "n"
93,44, // "t"
94,44, // "w"
97,81, // {193..198 225..230}
99,44, // {"1".."9"}
100,44, // "0"
102,81, // {176..185}
140,76, // hexDigit*
141,145, // $$2
146,282, // hexDigit
147,439, // hexDigit128
  }
,
{ // state 186
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 188
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 189
2,467, // ws*
  }
,
{ // state 190
0x80000000|3, // match move
0x80000000|496, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 192
22,MIN_REDUCTION+147, // `[
104,MIN_REDUCTION+147, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 193
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 194
0x80000000|146, // match move
0x80000000|47, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 195
15,109, // `(
120,293, // "("
  }
,
{ // state 196
130,228, // '"'
  }
,
{ // state 197
22,MIN_REDUCTION+181, // `[
104,MIN_REDUCTION+181, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 198
7,512, // ID
15,45, // `(
30,392, // <callExp>
47,11, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 199
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 200
16,380, // `)
39,267, // `||
111,25, // ")"
125,349, // "@"
  }
,
{ // state 201
16,388, // `)
111,125, // ")"
  }
,
{ // state 202
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 204
85,124, // "l"
  }
,
{ // state 205
149,MIN_REDUCTION+86, // $NT
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 206
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,158, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
74,68, // <expList>
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 207
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 208
2,355, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 209
22,MIN_REDUCTION+191, // `[
104,MIN_REDUCTION+191, // "["
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 210
7,513, // ID
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
  }
,
{ // state 211
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 212
0x80000000|3, // match move
0x80000000|123, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 213
52,117, // `+
54,404, // `-
105,168, // "-"
121,396, // "+"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 216
2,219, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 218
23,23, // `]
113,350, // "]"
  }
,
{ // state 219
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 220
77,300, // "a"
78,300, // "p"
79,300, // "s"
80,300, // "v"
81,300, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,300, // "c"
83,300, // "f"
84,300, // "i"
85,300, // "l"
86,300, // "o"
87,300, // "r"
88,300, // "u"
89,300, // "b"
90,300, // "e"
91,300, // "h"
92,300, // "n"
93,300, // "t"
94,300, // "w"
96,385, // {199..218 231..250}
97,385, // {193..198 225..230}
99,300, // {"1".."9"}
100,300, // "0"
102,385, // {176..185}
103,157, // any
104,300, // "["
105,300, // "-"
106,300, // "<"
107,300, // "|"
108,300, // " "
109,300, // "#"
110,300, // "&"
111,300, // ")"
112,300, // ","
113,300, // "]"
114,300, // "/"
115,300, // ";"
116,300, // ">"
117,300, // "{"
118,300, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
119,300, // "%"
120,300, // "("
121,300, // "+"
122,300, // "."
123,300, // "_"
124,300, // "="
125,300, // "@"
126,300, // {10}
127,300, // "}"
128,300, // "!"
129,300, // "'"
130,300, // '"'
131,300, // "*"
132,138, // any128
133,385, // {223}
134,385, // {128..175 186..192 219..222 224 251..255}
142,493, // any*
143,416, // $$3
  }
,
{ // state 221
16,340, // `)
39,267, // `||
111,25, // ")"
125,349, // "@"
  }
,
{ // state 222
76,166, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,453, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
98,20, // digit
99,319, // {"1".."9"}
100,319, // "0"
101,74, // digit128
102,27, // {176..185}
123,454, // "_"
133,284, // {223}
136,425, // idChar*
137,399, // $$0
144,312, // idChar
145,248, // idChar128
  }
,
{ // state 223
2,61, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 224
7,512, // ID
15,45, // `(
30,392, // <callExp>
59,71, // <cast exp>
61,427, // <exp8>
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
109,120, // "#"
120,293, // "("
125,196, // "@"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 225
86,82, // "o"
  }
,
{ // state 226
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 227
149,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 228
0x80000000|150, // match move
0x80000000|89, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 229
2,60, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 230
22,MIN_REDUCTION+218, // `[
104,MIN_REDUCTION+218, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 231
2,410, // ws*
22,MIN_REDUCTION+104, // `[
104,MIN_REDUCTION+104, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 232
0x80000000|3, // match move
0x80000000|346, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 233
0x80000000|3, // match move
0x80000000|151, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 234
0x80000000|323, // match move
0x80000000|251, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 235
2,324, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 236
7,127, // ID
8,175, // `{
15,45, // `(
18,115, // <type>
19,401, // `int
20,458, // `boolean
24,528, // <stmt>
25,522, // `break
27,38, // <assign>
28,162, // <if>
29,50, // <while>
30,446, // <callExp>
31,311, // `if
32,464, // <exp>
34,329, // `while
35,34, // <local var decl>
37,147, // `++
38,164, // `--
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,126, // "#"
117,136, // "{"
120,293, // "("
121,396, // "+"
125,412, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 237
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 239
0x80000000|253, // match move
0x80000000|73, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
2,364, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 241
0x80000000|35, // match move
0x80000000|57, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 242
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 243
22,MIN_REDUCTION+70, // `[
104,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 244
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 245
22,MIN_REDUCTION+67, // `[
104,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 246
0x80000000|199, // match move
0x80000000|352, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 247
2,105, // ws*
  }
,
{ // state 248
2,113, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 249
0x80000000|179, // match move
0x80000000|53, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 251
108,MIN_REDUCTION+202, // " "
126,MIN_REDUCTION+202, // {10}
135,MIN_REDUCTION+202, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 252
0x80000000|3, // match move
0x80000000|128, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 253
2,233, // ws*
  }
,
{ // state 254
0x80000000|478, // match move
0x80000000|231, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 255
7,512, // ID
15,45, // `(
30,392, // <callExp>
52,21, // `+
54,476, // `-
56,264, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 256
0x80000000|347, // match move
0x80000000|511, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 257
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
127, // ID
175, // `{
-1, // <decl in class>*
426, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
45, // `(
-1, // `)
418, // <stmt>*
115, // <type>
401, // `int
458, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
24, // <stmt>
522, // `break
-1, // `;
38, // <assign>
162, // <if>
50, // <while>
446, // <callExp>
311, // `if
464, // <exp>
-1, // `else
329, // `while
34, // <local var decl>
-1, // `=
147, // `++
164, // `--
-1, // `||
382, // <exp2>
-1, // `&&
86, // <exp3>
-1, // `!=
269, // <exp4>
-1, // `==
-1, // `<
213, // <exp5>
-1, // `>
-1, // `<=
-1, // `>=
-1, // `instanceof
21, // `+
428, // <exp6>
476, // `-
-1, // `*
191, // <exp7>
-1, // `/
-1, // `%
54, // <cast exp>
320, // <unary exp>
485, // <exp8>
4, // `!
271, // INTLIT
152, // STRINGLIT
10, // CHARLIT
30, // `false
406, // `true
48, // `null
174, // `this
-1, // `.
495, // `new
-1, // <expList>?
265, // `super
-1, // <expList>
-1, // `,
14, // letter
167, // "a"
167, // "p"
167, // "s"
167, // "v"
167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
167, // "c"
167, // "f"
167, // "i"
167, // "l"
167, // "o"
167, // "r"
167, // "u"
167, // "b"
167, // "e"
167, // "h"
167, // "n"
167, // "t"
167, // "w"
2, // letter128
249, // {199..218 231..250}
249, // {193..198 225..230}
-1, // digit
275, // {"1".."9"}
185, // "0"
239, // digit128
1, // {176..185}
-1, // any
-1, // "["
168, // "-"
-1, // "<"
-1, // "|"
-1, // " "
126, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
136, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
293, // "("
396, // "+"
-1, // "."
-1, // "_"
-1, // "="
412, // "@"
-1, // {10}
229, // "}"
75, // "!"
398, // "'"
220, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 258
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 260
2,325, // ws*
22,MIN_REDUCTION+148, // `[
104,MIN_REDUCTION+148, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 261
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,395, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 262
0x80000000|3, // match move
0x80000000|178, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 263
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 265
70,210, // `.
122,137, // "."
  }
,
{ // state 266
108,148, // " "
126,205, // {10}
135,337, // ws
149,MIN_REDUCTION+147, // $NT
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 267
7,512, // ID
15,45, // `(
30,392, // <callExp>
40,342, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 268
23,262, // `]
39,267, // `||
113,506, // "]"
125,349, // "@"
  }
,
{ // state 269
46,411, // `<
48,87, // `>
49,198, // `<=
50,277, // `>=
51,156, // `instanceof
106,122, // "<"
109,19, // "#"
116,480, // ">"
125,409, // "@"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 270
22,MIN_REDUCTION+111, // `[
104,MIN_REDUCTION+111, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 271
0x80000000|3, // match move
0x80000000|500, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 272
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 274
2,252, // ws*
22,MIN_REDUCTION+215, // `[
104,MIN_REDUCTION+215, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 275
98,315, // digit
99,319, // {"1".."9"}
100,319, // "0"
101,99, // digit128
102,1, // {176..185}
138,336, // digit*
139,212, // $$1
  }
,
{ // state 276
90,345, // "e"
  }
,
{ // state 277
7,512, // ID
15,45, // `(
30,392, // <callExp>
47,292, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 278
2,193, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 279
16,173, // `)
111,125, // ")"
  }
,
{ // state 280
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 281
0x80000000|94, // match move
0x80000000|461, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 282
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 285
22,MIN_REDUCTION+63, // `[
104,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 287
2,472, // ws*
  }
,
{ // state 288
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 289
39,267, // `||
125,349, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 290
0x80000000|3, // match move
0x80000000|140, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 291
108,37, // " "
126,462, // {10}
135,13, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 292
52,117, // `+
54,404, // `-
105,168, // "-"
121,396, // "+"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 293
2,443, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 294
91,483, // "h"
  }
,
{ // state 295
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 296
16,190, // `)
111,125, // ")"
  }
,
{ // state 297
2,360, // ws*
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 298
22,MIN_REDUCTION+212, // `[
104,MIN_REDUCTION+212, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 299
0x80000000|203, // match move
0x80000000|69, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 300
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 301
22,MIN_REDUCTION+105, // `[
104,MIN_REDUCTION+105, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 302
22,MIN_REDUCTION+74, // `[
104,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 304
7,512, // ID
15,45, // `(
30,392, // <callExp>
44,161, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 305
107,432, // "|"
110,466, // "&"
  }
,
{ // state 306
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 307
0x80000000|3, // match move
0x80000000|33, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 308
0x80000000|5, // match move
0x80000000|52, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 309
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,221, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 310
84,110, // "i"
89,160, // "b"
  }
,
{ // state 311
15,309, // `(
120,293, // "("
  }
,
{ // state 312
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 313
77,97, // "a"
  }
,
{ // state 314
7,512, // ID
15,45, // `(
16,133, // `)
30,392, // <callExp>
32,158, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
72,296, // <expList>?
73,265, // `super
74,214, // <expList>
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
111,125, // ")"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
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
{ // state 315
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 317
2,165, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 318
26,181, // `;
115,194, // ";"
  }
,
{ // state 319
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 321
2,188, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 322
0x80000000|92, // match move
0x80000000|452, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 323
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 324
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 325
0x80000000|3, // match move
0x80000000|192, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 326
22,MIN_REDUCTION+69, // `[
104,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 327
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 328
0x80000000|149, // match move
0x80000000|386, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 329
15,90, // `(
120,293, // "("
  }
,
{ // state 330
92,67, // "n"
  }
,
{ // state 331
80,225, // "v"
  }
,
{ // state 332
16,357, // `)
111,125, // ")"
  }
,
{ // state 333
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 334
22,MIN_REDUCTION+131, // `[
104,MIN_REDUCTION+131, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 336
98,183, // digit
99,319, // {"1".."9"}
100,319, // "0"
101,99, // digit128
102,1, // {176..185}
139,232, // $$1
  }
,
{ // state 337
149,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 338
22,MIN_REDUCTION+85, // `[
104,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 340
7,127, // ID
8,78, // `{
15,45, // `(
18,115, // <type>
19,401, // `int
20,458, // `boolean
24,93, // <stmt>
25,318, // `break
27,465, // <assign>
28,106, // <if>
29,484, // <while>
30,378, // <callExp>
31,101, // `if
32,464, // <exp>
34,356, // `while
35,96, // <local var decl>
37,147, // `++
38,164, // `--
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,126, // "#"
117,136, // "{"
120,293, // "("
121,396, // "+"
125,412, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 341
22,MIN_REDUCTION+70, // `[
26,226, // `;
104,MIN_REDUCTION+70, // "["
115,415, // ";"
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 342
41,134, // `&&
125,305, // "@"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 344
0x80000000|468, // match move
0x80000000|375, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 345
85,369, // "l"
  }
,
{ // state 346
22,MIN_REDUCTION+175, // `[
104,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 347
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 348
0x80000000|469, // match move
0x80000000|487, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 349
107,432, // "|"
  }
,
{ // state 350
2,266, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
149,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 351
2,407, // ws*
22,MIN_REDUCTION+219, // `[
104,MIN_REDUCTION+219, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 353
2,407, // ws*
  }
,
{ // state 354
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 355
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 356
15,413, // `(
120,293, // "("
  }
,
{ // state 357
0x80000000|3, // match move
0x80000000|326, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 358
2,211, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 359
7,512, // ID
15,45, // `(
16,479, // `)
30,392, // <callExp>
32,158, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
72,201, // <expList>?
73,265, // `super
74,214, // <expList>
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
111,125, // ")"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 360
0x80000000|280, // match move
0x80000000|29, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 361
0x80000000|15, // match move
0x80000000|393, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 362
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 363
22,MIN_REDUCTION+84, // `[
104,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 364
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 365
43,304, // `!=
45,80, // `==
125,28, // "@"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 366
52,117, // `+
54,404, // `-
105,168, // "-"
121,396, // "+"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 367
108,MIN_REDUCTION+201, // " "
126,MIN_REDUCTION+201, // {10}
135,MIN_REDUCTION+201, // ws
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 368
0x80000000|3, // match move
0x80000000|492, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 369
2,31, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
149,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 370
0x80000000|154, // match move
0x80000000|64, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 371
88,444, // "u"
90,235, // "e"
  }
,
{ // state 372
82,204, // "c"
  }
,
{ // state 373
22,MIN_REDUCTION+103, // `[
104,MIN_REDUCTION+103, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 375
22,MIN_REDUCTION+202, // `[
104,MIN_REDUCTION+202, // "["
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 376
33,519, // `else
109,276, // "#"
  }
,
{ // state 377
88,278, // "u"
  }
,
{ // state 378
0x80000000|3, // match move
0x80000000|108, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 379
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 380
7,127, // ID
8,175, // `{
15,45, // `(
18,115, // <type>
19,401, // `int
20,458, // `boolean
24,339, // <stmt>
25,522, // `break
27,38, // <assign>
28,162, // <if>
29,50, // <while>
30,446, // <callExp>
31,311, // `if
32,464, // <exp>
34,329, // `while
35,34, // <local var decl>
37,147, // `++
38,164, // `--
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,126, // "#"
117,136, // "{"
120,293, // "("
121,396, // "+"
125,412, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 381
0x80000000|3, // match move
0x80000000|459, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 382
41,134, // `&&
125,305, // "@"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 383
22,MIN_REDUCTION+62, // `[
104,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 384
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 385
0x80000000|417, // match move
0x80000000|363, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 386
22,MIN_REDUCTION+86, // `[
104,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 387
2,420, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 388
0x80000000|3, // match move
0x80000000|58, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 389
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 390
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 391
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 392
0x80000000|3, // match move
0x80000000|243, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 393
2,102, // ws*
22,MIN_REDUCTION+213, // `[
104,MIN_REDUCTION+213, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 395
16,482, // `)
39,267, // `||
111,25, // ")"
125,349, // "@"
  }
,
{ // state 396
2,521, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 397
22,MIN_REDUCTION+174, // `[
104,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 398
77,429, // "a"
78,429, // "p"
79,429, // "s"
80,429, // "v"
81,429, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,429, // "c"
83,429, // "f"
84,429, // "i"
85,429, // "l"
86,429, // "o"
87,429, // "r"
88,429, // "u"
89,429, // "b"
90,429, // "e"
91,429, // "h"
92,429, // "n"
93,429, // "t"
94,429, // "w"
99,429, // {"1".."9"}
100,429, // "0"
103,172, // any
104,429, // "["
105,429, // "-"
106,429, // "<"
107,429, // "|"
108,429, // " "
109,429, // "#"
110,429, // "&"
111,429, // ")"
112,429, // ","
113,429, // "]"
114,429, // "/"
115,429, // ";"
116,429, // ">"
117,429, // "{"
118,429, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
119,429, // "%"
120,429, // "("
121,429, // "+"
122,429, // "."
123,429, // "_"
124,429, // "="
125,429, // "@"
126,429, // {10}
127,429, // "}"
128,429, // "!"
129,429, // "'"
130,429, // '"'
131,429, // "*"
  }
,
{ // state 399
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 400
22,218, // `[
104,358, // "["
  }
,
{ // state 401
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 402
7,127, // ID
8,78, // `{
15,45, // `(
18,115, // <type>
19,401, // `int
20,458, // `boolean
24,246, // <stmt>
25,318, // `break
27,465, // <assign>
28,106, // <if>
29,484, // <while>
30,378, // <callExp>
31,101, // `if
32,464, // <exp>
34,356, // `while
35,96, // <local var decl>
37,147, // `++
38,164, // `--
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,126, // "#"
117,136, // "{"
120,293, // "("
121,396, // "+"
125,412, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 403
0x80000000|297, // match move
0x80000000|141, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 404
7,512, // ID
15,45, // `(
30,392, // <callExp>
52,21, // `+
53,104, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 405
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 406
0x80000000|3, // match move
0x80000000|55, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 407
0x80000000|3, // match move
0x80000000|230, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 408
2,308, // ws*
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 409
106,159, // "<"
107,432, // "|"
110,466, // "&"
116,119, // ">"
124,240, // "="
128,223, // "!"
  }
,
{ // state 410
0x80000000|3, // match move
0x80000000|373, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 411
7,512, // ID
15,45, // `(
30,392, // <callExp>
47,163, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 412
105,66, // "-"
121,42, // "+"
130,228, // '"'
  }
,
{ // state 413
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,176, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 414
33,236, // `else
109,276, // "#"
  }
,
{ // state 415
2,244, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 416
0x80000000|3, // match move
0x80000000|460, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 418
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
127, // ID
175, // `{
-1, // <decl in class>*
258, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
45, // `(
-1, // `)
-1, // <stmt>*
115, // <type>
401, // `int
458, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
374, // <stmt>
522, // `break
-1, // `;
38, // <assign>
162, // <if>
50, // <while>
446, // <callExp>
311, // `if
464, // <exp>
-1, // `else
329, // `while
34, // <local var decl>
-1, // `=
147, // `++
164, // `--
-1, // `||
382, // <exp2>
-1, // `&&
86, // <exp3>
-1, // `!=
269, // <exp4>
-1, // `==
-1, // `<
213, // <exp5>
-1, // `>
-1, // `<=
-1, // `>=
-1, // `instanceof
21, // `+
428, // <exp6>
476, // `-
-1, // `*
191, // <exp7>
-1, // `/
-1, // `%
54, // <cast exp>
320, // <unary exp>
485, // <exp8>
4, // `!
271, // INTLIT
152, // STRINGLIT
10, // CHARLIT
30, // `false
406, // `true
48, // `null
174, // `this
-1, // `.
495, // `new
-1, // <expList>?
265, // `super
-1, // <expList>
-1, // `,
14, // letter
167, // "a"
167, // "p"
167, // "s"
167, // "v"
167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
167, // "c"
167, // "f"
167, // "i"
167, // "l"
167, // "o"
167, // "r"
167, // "u"
167, // "b"
167, // "e"
167, // "h"
167, // "n"
167, // "t"
167, // "w"
2, // letter128
249, // {199..218 231..250}
249, // {193..198 225..230}
-1, // digit
275, // {"1".."9"}
185, // "0"
239, // digit128
1, // {176..185}
-1, // any
-1, // "["
168, // "-"
-1, // "<"
-1, // "|"
-1, // " "
126, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
136, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
293, // "("
396, // "+"
-1, // "."
-1, // "_"
-1, // "="
412, // "@"
-1, // {10}
229, // "}"
75, // "!"
398, // "'"
220, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 419
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 420
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 421
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 422
2,8, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 423
0x80000000|144, // match move
0x80000000|291, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 424
2,389, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 425
76,166, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,453, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
98,20, // digit
99,319, // {"1".."9"}
100,319, // "0"
101,74, // digit128
102,27, // {176..185}
123,454, // "_"
133,284, // {223}
137,103, // $$0
144,436, // idChar
145,248, // idChar128
  }
,
{ // state 426
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 427
0x80000000|3, // match move
0x80000000|463, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 428
55,91, // `*
57,255, // `/
58,455, // `%
114,208, // "/"
119,422, // "%"
131,317, // "*"
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 429
0x80000000|333, // match move
0x80000000|457, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 430
0x80000000|283, // match move
0x80000000|338, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 431
148,MIN_REDUCTION+0, // $
  }
,
{ // state 432
2,435, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 433
2,325, // ws*
  }
,
{ // state 434
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 435
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 436
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 437
86,424, // "o"
87,501, // "r"
  }
,
{ // state 438
2,308, // ws*
22,MIN_REDUCTION+172, // `[
104,MIN_REDUCTION+172, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 439
0x80000000|526, // match move
0x80000000|504, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 440
14,59, // `void
109,331, // "#"
  }
,
{ // state 441
2,88, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 443
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 444
0x80000000|490, // match move
0x80000000|153, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 445
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 446
0x80000000|3, // match move
0x80000000|341, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 448
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 449
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 450
7,MIN_REDUCTION+11, // ID
15,359, // `(
22,MIN_REDUCTION+59, // `[
37,295, // `++
38,273, // `--
77,MIN_REDUCTION+11, // "a"
78,MIN_REDUCTION+11, // "p"
79,MIN_REDUCTION+11, // "s"
80,MIN_REDUCTION+11, // "v"
81,MIN_REDUCTION+11, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,MIN_REDUCTION+11, // "c"
83,MIN_REDUCTION+11, // "f"
84,MIN_REDUCTION+11, // "i"
85,MIN_REDUCTION+11, // "l"
86,MIN_REDUCTION+11, // "o"
87,MIN_REDUCTION+11, // "r"
88,MIN_REDUCTION+11, // "u"
89,MIN_REDUCTION+11, // "b"
90,MIN_REDUCTION+11, // "e"
91,MIN_REDUCTION+11, // "h"
92,MIN_REDUCTION+11, // "n"
93,MIN_REDUCTION+11, // "t"
94,MIN_REDUCTION+11, // "w"
96,MIN_REDUCTION+11, // {199..218 231..250}
97,MIN_REDUCTION+11, // {193..198 225..230}
104,MIN_REDUCTION+59, // "["
120,293, // "("
125,503, // "@"
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 451
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
127, // ID
175, // `{
-1, // <decl in class>*
507, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
45, // `(
-1, // `)
-1, // <stmt>*
115, // <type>
401, // `int
458, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
374, // <stmt>
522, // `break
-1, // `;
38, // <assign>
162, // <if>
50, // <while>
446, // <callExp>
311, // `if
464, // <exp>
-1, // `else
329, // `while
34, // <local var decl>
-1, // `=
147, // `++
164, // `--
-1, // `||
382, // <exp2>
-1, // `&&
86, // <exp3>
-1, // `!=
269, // <exp4>
-1, // `==
-1, // `<
213, // <exp5>
-1, // `>
-1, // `<=
-1, // `>=
-1, // `instanceof
21, // `+
428, // <exp6>
476, // `-
-1, // `*
191, // <exp7>
-1, // `/
-1, // `%
54, // <cast exp>
320, // <unary exp>
485, // <exp8>
4, // `!
271, // INTLIT
152, // STRINGLIT
10, // CHARLIT
30, // `false
406, // `true
48, // `null
174, // `this
-1, // `.
495, // `new
-1, // <expList>?
265, // `super
-1, // <expList>
-1, // `,
14, // letter
167, // "a"
167, // "p"
167, // "s"
167, // "v"
167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
167, // "c"
167, // "f"
167, // "i"
167, // "l"
167, // "o"
167, // "r"
167, // "u"
167, // "b"
167, // "e"
167, // "h"
167, // "n"
167, // "t"
167, // "w"
2, // letter128
249, // {199..218 231..250}
249, // {193..198 225..230}
-1, // digit
275, // {"1".."9"}
185, // "0"
239, // digit128
1, // {176..185}
-1, // any
-1, // "["
168, // "-"
-1, // "<"
-1, // "|"
-1, // " "
126, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
136, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
293, // "("
396, // "+"
-1, // "."
-1, // "_"
-1, // "="
412, // "@"
-1, // {10}
229, // "}"
75, // "!"
398, // "'"
220, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 452
22,MIN_REDUCTION+190, // `[
104,MIN_REDUCTION+190, // "["
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 453
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 454
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 455
7,512, // ID
15,45, // `(
30,392, // <callExp>
52,21, // `+
54,476, // `-
56,207, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 456
5,448, // <class decl>
6,474, // `class
109,372, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 457
22,MIN_REDUCTION+83, // `[
104,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 459
22,MIN_REDUCTION+183, // `[
104,MIN_REDUCTION+183, // "["
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 460
22,MIN_REDUCTION+184, // `[
104,MIN_REDUCTION+184, // "["
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 461
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 462
0x80000000|186, // match move
0x80000000|98, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 463
22,509, // `[
70,473, // `.
104,358, // "["
122,137, // "."
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 464
36,116, // `=
39,267, // `||
124,321, // "="
125,349, // "@"
  }
,
{ // state 465
26,256, // `;
115,194, // ";"
  }
,
{ // state 466
2,327, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 467
0x80000000|3, // match move
0x80000000|334, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 468
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 470
0x80000000|272, // match move
0x80000000|209, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 471
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 472
0x80000000|3, // match move
0x80000000|62, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 473
7,36, // ID
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
  }
,
{ // state 474
7,486, // ID
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
  }
,
{ // state 475
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,139, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 476
7,512, // ID
30,392, // <callExp>
52,21, // `+
54,476, // `-
60,419, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 477
8,257, // `{
117,136, // "{"
  }
,
{ // state 478
2,410, // ws*
  }
,
{ // state 479
0x80000000|3, // match move
0x80000000|302, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 480
0x80000000|3, // match move
0x80000000|441, // no-match move
// T-test match for "=":
124,
  }
,
{ // state 481
76,166, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,322, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
98,20, // digit
99,319, // {"1".."9"}
100,319, // "0"
101,470, // digit128
102,1, // {176..185}
123,454, // "_"
133,171, // {223}
137,370, // $$0
144,436, // idChar
145,361, // idChar128
  }
,
{ // state 482
7,127, // ID
8,78, // `{
15,45, // `(
18,115, // <type>
19,401, // `int
20,458, // `boolean
24,505, // <stmt>
25,318, // `break
27,465, // <assign>
28,106, // <if>
29,484, // <while>
30,378, // <callExp>
31,101, // `if
32,464, // <exp>
34,356, // `while
35,96, // <local var decl>
37,147, // `++
38,164, // `--
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,126, // "#"
117,136, // "{"
120,293, // "("
121,396, // "+"
125,412, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 483
2,421, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 484
0x80000000|489, // match move
0x80000000|516, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 485
0x80000000|3, // match move
0x80000000|494, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 486
8,65, // `{
117,136, // "{"
  }
,
{ // state 487
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 488
0x80000000|85, // match move
0x80000000|397, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 489
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 490
2,121, // ws*
  }
,
{ // state 491
78,377, // "p"
  }
,
{ // state 492
22,MIN_REDUCTION+185, // `[
104,MIN_REDUCTION+185, // "["
108,430, // " "
126,328, // {10}
135,514, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 493
77,300, // "a"
78,300, // "p"
79,300, // "s"
80,300, // "v"
81,300, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,300, // "c"
83,300, // "f"
84,300, // "i"
85,300, // "l"
86,300, // "o"
87,300, // "r"
88,300, // "u"
89,300, // "b"
90,300, // "e"
91,300, // "h"
92,300, // "n"
93,300, // "t"
94,300, // "w"
96,385, // {199..218 231..250}
97,385, // {193..198 225..230}
99,300, // {"1".."9"}
100,300, // "0"
102,385, // {176..185}
103,447, // any
104,300, // "["
105,300, // "-"
106,300, // "<"
107,300, // "|"
108,300, // " "
109,300, // "#"
110,300, // "&"
111,300, // ")"
112,300, // ","
113,300, // "]"
114,300, // "/"
115,300, // ";"
116,300, // ">"
117,300, // "{"
118,300, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
119,300, // "%"
120,300, // "("
121,300, // "+"
122,300, // "."
123,300, // "_"
124,300, // "="
125,300, // "@"
126,300, // {10}
127,300, // "}"
128,300, // "!"
129,300, // "'"
130,300, // '"'
131,300, // "*"
132,138, // any128
133,385, // {223}
134,385, // {128..175 186..192 219..222 224 251..255}
143,381, // $$3
  }
,
{ // state 494
22,509, // `[
70,473, // `.
104,358, // "["
122,137, // "."
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 495
7,107, // ID
76,222, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,135, // letter128
96,286, // {199..218 231..250}
97,286, // {193..198 225..230}
  }
,
{ // state 496
22,MIN_REDUCTION+75, // `[
104,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 499
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 500
22,MIN_REDUCTION+61, // `[
104,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 501
2,184, // ws*
108,148, // " "
126,205, // {10}
135,227, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 502
22,MIN_REDUCTION+66, // `[
104,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 503
105,66, // "-"
106,159, // "<"
107,432, // "|"
110,466, // "&"
116,119, // ">"
121,42, // "+"
124,240, // "="
128,223, // "!"
  }
,
{ // state 504
2,290, // ws*
22,MIN_REDUCTION+217, // `[
104,MIN_REDUCTION+217, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 505
0x80000000|376, // match move
0x80000000|498, // no-match move
0x80000000|527, // NT-test-match state for `else
  }
,
{ // state 506
0x80000000|433, // match move
0x80000000|260, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 507
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 508
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 509
7,512, // ID
15,45, // `(
30,392, // <callExp>
32,268, // <exp>
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,120, // "#"
120,293, // "("
121,396, // "+"
125,196, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 510
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 512
0x80000000|3, // match move
0x80000000|182, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 513
15,314, // `(
120,293, // "("
  }
,
{ // state 514
0x80000000|18, // match move
0x80000000|63, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 515
3,238, // <program>
4,456, // <class decl>+
5,530, // <class decl>
6,474, // `class
108,148, // " "
109,372, // "#"
126,205, // {10}
135,337, // ws
  }
,
{ // state 516
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 517
2,368, // ws*
22,MIN_REDUCTION+186, // `[
104,MIN_REDUCTION+186, // "["
108,430, // " "
126,328, // {10}
135,344, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 519
7,127, // ID
8,78, // `{
15,45, // `(
18,115, // <type>
19,401, // `int
20,458, // `boolean
24,241, // <stmt>
25,318, // `break
27,465, // <assign>
28,106, // <if>
29,484, // <while>
30,378, // <callExp>
31,101, // `if
32,464, // <exp>
34,356, // `while
35,96, // <local var decl>
37,147, // `++
38,164, // `--
40,382, // <exp2>
42,86, // <exp3>
44,269, // <exp4>
47,213, // <exp5>
52,21, // `+
53,428, // <exp6>
54,476, // `-
56,191, // <exp7>
59,54, // <cast exp>
60,320, // <unary exp>
61,485, // <exp8>
62,4, // `!
63,271, // INTLIT
64,152, // STRINGLIT
65,10, // CHARLIT
66,30, // `false
67,406, // `true
68,48, // `null
69,174, // `this
71,495, // `new
73,265, // `super
76,14, // letter
77,167, // "a"
78,167, // "p"
79,167, // "s"
80,167, // "v"
81,167, // {"A".."Z" "d" "g" "j".."k" "m" "q" "x".."z"}
82,167, // "c"
83,167, // "f"
84,167, // "i"
85,167, // "l"
86,167, // "o"
87,167, // "r"
88,167, // "u"
89,167, // "b"
90,167, // "e"
91,167, // "h"
92,167, // "n"
93,167, // "t"
94,167, // "w"
95,2, // letter128
96,249, // {199..218 231..250}
97,249, // {193..198 225..230}
99,275, // {"1".."9"}
100,185, // "0"
101,239, // digit128
102,1, // {176..185}
105,168, // "-"
109,126, // "#"
117,136, // "{"
120,293, // "("
121,396, // "+"
125,412, // "@"
128,75, // "!"
129,398, // "'"
130,220, // '"'
  }
,
{ // state 520
87,130, // "r"
91,254, // "h"
  }
,
{ // state 521
108,148, // " "
126,205, // {10}
135,337, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 522
26,442, // `;
115,415, // ";"
  }
,
{ // state 523
36,475, // `=
124,321, // "="
  }
,
{ // state 524
0x80000000|3, // match move
0x80000000|197, // no-match move
0x80000000|400, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 525
22,MIN_REDUCTION+64, // `[
104,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 526
2,290, // ws*
  }
,
{ // state 527
109,276, // "#"
  }
,
{ // state 528
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 529
2,252, // ws*
  }
,
{ // state 530
MIN_REDUCTION+210, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[531][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(21<<16)+2,
// <stmt> ::= `break `;
(24<<16)+2,
// <stmt> ::= <assign> `;
(24<<16)+2,
// <stmt> ::= <if>
(24<<16)+1,
// <stmt> ::= <while>
(24<<16)+1,
// <stmt> ::= <callExp> `;
(24<<16)+2,
// <if> ::= `if `( <exp> `) <stmt> `else <stmt>
(28<<16)+7,
// <if> ::= `if `( <exp> `) <stmt> !`else
(28<<16)+5,
// <while> ::= `while `( <exp> `) <stmt>
(29<<16)+5,
// <stmt> ::= `{ <stmt>* `}
(24<<16)+3,
// <stmt> ::= `{ `}
(24<<16)+2,
// <stmt> ::= <local var decl> `;
(24<<16)+2,
// <assign> ::= <exp> `= <exp>
(27<<16)+3,
// <assign> ::= `++ ID
(27<<16)+2,
// <assign> ::= `-- ID
(27<<16)+2,
// <assign> ::= ID `++
(27<<16)+2,
// <assign> ::= ID `--
(27<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(35<<16)+4,
// <exp> ::= <exp> `|| <exp2>
(32<<16)+3,
// <exp> ::= <exp2>
(32<<16)+1,
// <exp2> ::= <exp2> `&& <exp3>
(40<<16)+3,
// <exp2> ::= <exp3>
(40<<16)+1,
// <exp3> ::= <exp3> `!= <exp4>
(42<<16)+3,
// <exp3> ::= <exp3> `== <exp4>
(42<<16)+3,
// <exp3> ::= <exp4>
(42<<16)+1,
// <exp4> ::= <exp4> `< <exp5>
(44<<16)+3,
// <exp4> ::= <exp4> `> <exp5>
(44<<16)+3,
// <exp4> ::= <exp4> `<= <exp5>
(44<<16)+3,
// <exp4> ::= <exp4> `>= <exp5>
(44<<16)+3,
// <exp4> ::= <exp4> `instanceof ID
(44<<16)+3,
// <exp4> ::= <exp5>
(44<<16)+1,
// <exp5> ::= <exp5> `+ <exp6>
(47<<16)+3,
// <exp5> ::= <exp5> `- <exp6>
(47<<16)+3,
// <exp5> ::= <exp6>
(47<<16)+1,
// <exp6> ::= <exp6> `* <exp7>
(53<<16)+3,
// <exp6> ::= <exp6> `/ <exp7>
(53<<16)+3,
// <exp6> ::= <exp6> `% <exp7>
(53<<16)+3,
// <exp6> ::= <exp7>
(53<<16)+1,
// <exp7> ::= <cast exp>
(56<<16)+1,
// <exp7> ::= <unary exp>
(56<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(59<<16)+4,
// <cast exp> ::= `( <type> `) <exp8>
(59<<16)+4,
// <unary exp> ::= `- <unary exp>
(60<<16)+2,
// <unary exp> ::= `+ <unary exp>
(60<<16)+2,
// <unary exp> ::= `! <unary exp>
(60<<16)+2,
// <unary exp> ::= <exp8>
(60<<16)+1,
// <exp8> ::= ID
(61<<16)+1,
// <exp8> ::= <exp8> !<empty bracket pair> `[ <exp> `]
(61<<16)+4,
// <exp8> ::= INTLIT
(61<<16)+1,
// <exp8> ::= STRINGLIT
(61<<16)+1,
// <exp8> ::= CHARLIT
(61<<16)+1,
// <exp8> ::= `false
(61<<16)+1,
// <exp8> ::= `true
(61<<16)+1,
// <exp8> ::= `null
(61<<16)+1,
// <exp8> ::= `this
(61<<16)+1,
// <exp8> ::= <exp8> `. ID
(61<<16)+3,
// <exp8> ::= `new ID `( `)
(61<<16)+4,
// <exp8> ::= <callExp>
(61<<16)+1,
// <callExp> ::= <exp8> `. ID `( <expList>? `)
(30<<16)+6,
// <callExp> ::= <exp8> `. ID `( `)
(30<<16)+5,
// <callExp> ::= ID `( <expList>? `)
(30<<16)+4,
// <callExp> ::= ID `( `)
(30<<16)+3,
// <callExp> ::= `super `. ID `( <expList>? `)
(30<<16)+6,
// <callExp> ::= `super `. ID `( `)
(30<<16)+5,
// <expList> ::= <exp>
(74<<16)+1,
// <expList> ::= <exp> `, <expList>
(74<<16)+3,
// letter ::= {"A".."Z" "a".."z"}
(76<<16)+1,
// letter128 ::= {193..218 225..250}
(95<<16)+1,
// digit ::= {"0".."9"}
(98<<16)+1,
// digit128 ::= {176..185}
(101<<16)+1,
// any ::= {0..127}
(103<<16)+1,
// any128 ::= {128..255}
(132<<16)+1,
// ws ::= " "
(135<<16)+1,
// ws ::= {10}
(135<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(20<<16)+4,
// `boolean ::= "#" "b" "o"
(20<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `while ::= "#" "w" "h" ws*
(34<<16)+4,
// `while ::= "#" "w" "h"
(34<<16)+3,
// `if ::= "#" "+" ws*
(31<<16)+3,
// `if ::= "#" "+"
(31<<16)+2,
// `else ::= "#" "e" "l" ws*
(33<<16)+4,
// `else ::= "#" "e" "l"
(33<<16)+3,
// `break ::= "#" "b" "r" ws*
(25<<16)+4,
// `break ::= "#" "b" "r"
(25<<16)+3,
// `this ::= "#" "t" "h" ws*
(69<<16)+4,
// `this ::= "#" "t" "h"
(69<<16)+3,
// `false ::= "#" "f" "a" ws*
(66<<16)+4,
// `false ::= "#" "f" "a"
(66<<16)+3,
// `true ::= "#" "t" "r" ws*
(67<<16)+4,
// `true ::= "#" "t" "r"
(67<<16)+3,
// `super ::= "#" "s" "u" ws*
(73<<16)+4,
// `super ::= "#" "s" "u"
(73<<16)+3,
// `null ::= "#" "n" "u" ws*
(68<<16)+4,
// `null ::= "#" "n" "u"
(68<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(51<<16)+4,
// `instanceof ::= "#" "i" "n"
(51<<16)+3,
// `new ::= "#" "n" "e" ws*
(71<<16)+4,
// `new ::= "#" "n" "e"
(71<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `! ::= "!" ws*
(62<<16)+2,
// `! ::= "!"
(62<<16)+1,
// `!= ::= "@" "!" ws*
(43<<16)+3,
// `!= ::= "@" "!"
(43<<16)+2,
// `% ::= "%" ws*
(58<<16)+2,
// `% ::= "%"
(58<<16)+1,
// `&& ::= "@" "&" ws*
(41<<16)+3,
// `&& ::= "@" "&"
(41<<16)+2,
// `* ::= "*" ws*
(55<<16)+2,
// `* ::= "*"
(55<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(54<<16)+2,
// `- ::= "-"
(54<<16)+1,
// `+ ::= "+" ws*
(52<<16)+2,
// `+ ::= "+"
(52<<16)+1,
// `= ::= "=" ws*
(36<<16)+2,
// `= ::= "="
(36<<16)+1,
// `== ::= "@" "=" ws*
(45<<16)+3,
// `== ::= "@" "="
(45<<16)+2,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `|| ::= "@" "|" ws*
(39<<16)+3,
// `|| ::= "@" "|"
(39<<16)+2,
// `< ::= "<" ws*
(46<<16)+2,
// `< ::= "<"
(46<<16)+1,
// `<= ::= "@" "<" ws*
(49<<16)+3,
// `<= ::= "@" "<"
(49<<16)+2,
// `, ::= "," ws*
(75<<16)+2,
// `, ::= ","
(75<<16)+1,
// `> ::= ">" !"=" ws*
(48<<16)+2,
// `> ::= ">" !"="
(48<<16)+1,
// `>= ::= "@" ">" ws*
(50<<16)+3,
// `>= ::= "@" ">"
(50<<16)+2,
// `. ::= "." ws*
(70<<16)+2,
// `. ::= "."
(70<<16)+1,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// `++ ::= "@" "+" ws*
(37<<16)+3,
// `++ ::= "@" "+"
(37<<16)+2,
// `-- ::= "@" "-" ws*
(38<<16)+3,
// `-- ::= "@" "-"
(38<<16)+2,
// `/ ::= "/" ws*
(57<<16)+2,
// `/ ::= "/"
(57<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(63<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(63<<16)+2,
// INTLIT ::= digit128 ws*
(63<<16)+2,
// INTLIT ::= digit128
(63<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(63<<16)+3,
// INTLIT ::= "0" $$2
(63<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(64<<16)+3,
// STRINGLIT ::= "@" '"'
(64<<16)+2,
// STRINGLIT ::= '"' any* $$3
(64<<16)+3,
// STRINGLIT ::= '"' $$3
(64<<16)+2,
// CHARLIT ::= "'" any ws*
(65<<16)+3,
// CHARLIT ::= "'" any
(65<<16)+2,
// idChar ::= letter
(144<<16)+1,
// idChar ::= digit
(144<<16)+1,
// idChar ::= "_"
(144<<16)+1,
// idChar128 ::= letter128
(145<<16)+1,
// idChar128 ::= digit128
(145<<16)+1,
// idChar128 ::= {223}
(145<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(146<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(147<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// any* ::= any* any
(142<<16)+2,
// any* ::= any
(142<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit* ::= digit* digit
(138<<16)+2,
// digit* ::= digit
(138<<16)+1,
// <expList>? ::= <expList>
(72<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(140<<16)+2,
// hexDigit* ::= hexDigit
(140<<16)+1,
// idChar* ::= idChar* idChar
(136<<16)+2,
// idChar* ::= idChar
(136<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// $$0 ::= idChar128 ws*
(137<<16)+2,
// $$0 ::= idChar128
(137<<16)+1,
// $$1 ::= digit128 ws*
(139<<16)+2,
// $$1 ::= digit128
(139<<16)+1,
// $$2 ::= hexDigit128 ws*
(141<<16)+2,
// $$2 ::= hexDigit128
(141<<16)+1,
// $$3 ::= any128 ws*
(143<<16)+2,
// $$3 ::= any128
(143<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
118, // 0
118, // 1
118, // 2
118, // 3
118, // 4
118, // 5
118, // 6
118, // 7
118, // 8
118, // 9
126, // 10
118, // 11
118, // 12
118, // 13
118, // 14
118, // 15
118, // 16
118, // 17
118, // 18
118, // 19
118, // 20
118, // 21
118, // 22
118, // 23
118, // 24
118, // 25
118, // 26
118, // 27
118, // 28
118, // 29
118, // 30
118, // 31
108, // " "
128, // "!"
130, // '"'
109, // "#"
118, // "$"
119, // "%"
110, // "&"
129, // "'"
120, // "("
111, // ")"
131, // "*"
121, // "+"
112, // ","
105, // "-"
122, // "."
114, // "/"
100, // "0"
99, // "1"
99, // "2"
99, // "3"
99, // "4"
99, // "5"
99, // "6"
99, // "7"
99, // "8"
99, // "9"
118, // ":"
115, // ";"
106, // "<"
124, // "="
116, // ">"
118, // "?"
125, // "@"
81, // "A"
81, // "B"
81, // "C"
81, // "D"
81, // "E"
81, // "F"
81, // "G"
81, // "H"
81, // "I"
81, // "J"
81, // "K"
81, // "L"
81, // "M"
81, // "N"
81, // "O"
81, // "P"
81, // "Q"
81, // "R"
81, // "S"
81, // "T"
81, // "U"
81, // "V"
81, // "W"
81, // "X"
81, // "Y"
81, // "Z"
104, // "["
118, // "\"
113, // "]"
118, // "^"
123, // "_"
118, // "`"
77, // "a"
89, // "b"
82, // "c"
81, // "d"
90, // "e"
83, // "f"
81, // "g"
91, // "h"
84, // "i"
81, // "j"
81, // "k"
85, // "l"
81, // "m"
92, // "n"
86, // "o"
78, // "p"
81, // "q"
87, // "r"
79, // "s"
93, // "t"
88, // "u"
80, // "v"
94, // "w"
81, // "x"
81, // "y"
81, // "z"
117, // "{"
107, // "|"
127, // "}"
118, // "~"
118, // 127
134, // 128
134, // 129
134, // 130
134, // 131
134, // 132
134, // 133
134, // 134
134, // 135
134, // 136
134, // 137
134, // 138
134, // 139
134, // 140
134, // 141
134, // 142
134, // 143
134, // 144
134, // 145
134, // 146
134, // 147
134, // 148
134, // 149
134, // 150
134, // 151
134, // 152
134, // 153
134, // 154
134, // 155
134, // 156
134, // 157
134, // 158
134, // 159
134, // 160
134, // 161
134, // 162
134, // 163
134, // 164
134, // 165
134, // 166
134, // 167
134, // 168
134, // 169
134, // 170
134, // 171
134, // 172
134, // 173
134, // 174
134, // 175
102, // 176
102, // 177
102, // 178
102, // 179
102, // 180
102, // 181
102, // 182
102, // 183
102, // 184
102, // 185
134, // 186
134, // 187
134, // 188
134, // 189
134, // 190
134, // 191
134, // 192
97, // 193
97, // 194
97, // 195
97, // 196
97, // 197
97, // 198
96, // 199
96, // 200
96, // 201
96, // 202
96, // 203
96, // 204
96, // 205
96, // 206
96, // 207
96, // 208
96, // 209
96, // 210
96, // 211
96, // 212
96, // 213
96, // 214
96, // 215
96, // 216
96, // 217
96, // 218
134, // 219
134, // 220
134, // 221
134, // 222
133, // 223
134, // 224
97, // 225
97, // 226
97, // 227
97, // 228
97, // 229
97, // 230
96, // 231
96, // 232
96, // 233
96, // 234
96, // 235
96, // 236
96, // 237
96, // 238
96, // 239
96, // 240
96, // 241
96, // 242
96, // 243
96, // 244
96, // 245
96, // 246
96, // 247
96, // 248
96, // 249
96, // 250
134, // 251
134, // 252
134, // 253
134, // 254
134, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<decl in class> ::= <method decl>", // 6
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 7
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 8
"<type> ::= # `int", // 9
"<type> ::= # `boolean", // 10
"<type> ::= # ID", // 11
"<type> ::= # <type> <empty bracket pair>", // 12
"<empty bracket pair> ::= `[ `]", // 13
"<stmt> ::= # `break `;", // 14
"<stmt> ::= <assign> `;", // 15
"<stmt> ::= <if>", // 16
"<stmt> ::= <while>", // 17
"<stmt> ::= # <callExp> `;", // 18
"<if> ::= # `if `( <exp> `) <stmt> `else <stmt>", // 19
"<if> ::= # `if `( <exp> `) <stmt> !`else", // 20
"<while> ::= # `while `( <exp> `) <stmt>", // 21
"<stmt> ::= # `{ <stmt>* `}", // 22
"<stmt> ::= # `{ <stmt>* `}", // 23
"<stmt> ::= <local var decl> `;", // 24
"<assign> ::= <exp> # `= <exp>", // 25
"<assign> ::= # `++ ID", // 26
"<assign> ::= # `-- ID", // 27
"<assign> ::= # ID `++", // 28
"<assign> ::= # ID `--", // 29
"<local var decl> ::= <type> # ID `= <exp>", // 30
"<exp> ::= <exp> # `|| <exp2>", // 31
"<exp> ::= <exp2>", // 32
"<exp2> ::= <exp2> # `&& <exp3>", // 33
"<exp2> ::= <exp3>", // 34
"<exp3> ::= <exp3> # `!= <exp4>", // 35
"<exp3> ::= <exp3> # `== <exp4>", // 36
"<exp3> ::= <exp4>", // 37
"<exp4> ::= <exp4> # `< <exp5>", // 38
"<exp4> ::= <exp4> # `> <exp5>", // 39
"<exp4> ::= <exp4> # `<= <exp5>", // 40
"<exp4> ::= <exp4> # `>= <exp5>", // 41
"<exp4> ::= <exp4> # `instanceof ID", // 42
"<exp4> ::= <exp5>", // 43
"<exp5> ::= <exp5> # `+ <exp6>", // 44
"<exp5> ::= <exp5> # `- <exp6>", // 45
"<exp5> ::= <exp6>", // 46
"<exp6> ::= <exp6> # `* <exp7>", // 47
"<exp6> ::= <exp6> # `/ <exp7>", // 48
"<exp6> ::= <exp6> # `% <exp7>", // 49
"<exp6> ::= <exp7>", // 50
"<exp7> ::= <cast exp>", // 51
"<exp7> ::= <unary exp>", // 52
"<cast exp> ::= # `( <type> `) <cast exp>", // 53
"<cast exp> ::= # `( <type> `) <exp8>", // 54
"<unary exp> ::= # `- <unary exp>", // 55
"<unary exp> ::= # `+ <unary exp>", // 56
"<unary exp> ::= # `! <unary exp>", // 57
"<unary exp> ::= <exp8>", // 58
"<exp8> ::= # ID", // 59
"<exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `]", // 60
"<exp8> ::= # INTLIT", // 61
"<exp8> ::= # STRINGLIT", // 62
"<exp8> ::= # CHARLIT", // 63
"<exp8> ::= # `false", // 64
"<exp8> ::= # `true", // 65
"<exp8> ::= # `null", // 66
"<exp8> ::= # `this", // 67
"<exp8> ::= # <exp8> `. ID", // 68
"<exp8> ::= # `new ID `( `)", // 69
"<exp8> ::= <callExp>", // 70
"<callExp> ::= # <exp8> `. ID `( <expList>? `)", // 71
"<callExp> ::= # <exp8> `. ID `( <expList>? `)", // 72
"<callExp> ::= # ID `( <expList>? `)", // 73
"<callExp> ::= # ID `( <expList>? `)", // 74
"<callExp> ::= # `super `. ID `( <expList>? `)", // 75
"<callExp> ::= # `super `. ID `( <expList>? `)", // 76
"<expList> ::= <exp>", // 77
"<expList> ::= <exp> `, <expList>", // 78
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 79
"letter128 ::= {193..218 225..250}", // 80
"digit ::= {\"0\"..\"9\"}", // 81
"digit128 ::= {176..185}", // 82
"any ::= {0..127}", // 83
"any128 ::= {128..255}", // 84
"ws ::= \" \"", // 85
"ws ::= {10} registerNewline", // 86
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 87
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 88
"`class ::= \"#\" \"c\" \"l\" ws*", // 89
"`class ::= \"#\" \"c\" \"l\" ws*", // 90
"`void ::= \"#\" \"v\" \"o\" ws*", // 91
"`void ::= \"#\" \"v\" \"o\" ws*", // 92
"`int ::= \"#\" \"i\" \"t\" ws*", // 93
"`int ::= \"#\" \"i\" \"t\" ws*", // 94
"`while ::= \"#\" \"w\" \"h\" ws*", // 95
"`while ::= \"#\" \"w\" \"h\" ws*", // 96
"`if ::= \"#\" \"+\" ws*", // 97
"`if ::= \"#\" \"+\" ws*", // 98
"`else ::= \"#\" \"e\" \"l\" ws*", // 99
"`else ::= \"#\" \"e\" \"l\" ws*", // 100
"`break ::= \"#\" \"b\" \"r\" ws*", // 101
"`break ::= \"#\" \"b\" \"r\" ws*", // 102
"`this ::= \"#\" \"t\" \"h\" ws*", // 103
"`this ::= \"#\" \"t\" \"h\" ws*", // 104
"`false ::= \"#\" \"f\" \"a\" ws*", // 105
"`false ::= \"#\" \"f\" \"a\" ws*", // 106
"`true ::= \"#\" \"t\" \"r\" ws*", // 107
"`true ::= \"#\" \"t\" \"r\" ws*", // 108
"`super ::= \"#\" \"s\" \"u\" ws*", // 109
"`super ::= \"#\" \"s\" \"u\" ws*", // 110
"`null ::= \"#\" \"n\" \"u\" ws*", // 111
"`null ::= \"#\" \"n\" \"u\" ws*", // 112
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 113
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 114
"`new ::= \"#\" \"n\" \"e\" ws*", // 115
"`new ::= \"#\" \"n\" \"e\" ws*", // 116
"`public ::= \"#\" \"p\" \"u\" ws*", // 117
"`public ::= \"#\" \"p\" \"u\" ws*", // 118
"`! ::= \"!\" ws*", // 119
"`! ::= \"!\" ws*", // 120
"`!= ::= \"@\" \"!\" ws*", // 121
"`!= ::= \"@\" \"!\" ws*", // 122
"`% ::= \"%\" ws*", // 123
"`% ::= \"%\" ws*", // 124
"`&& ::= \"@\" \"&\" ws*", // 125
"`&& ::= \"@\" \"&\" ws*", // 126
"`* ::= \"*\" ws*", // 127
"`* ::= \"*\" ws*", // 128
"`( ::= \"(\" ws*", // 129
"`( ::= \"(\" ws*", // 130
"`) ::= \")\" ws*", // 131
"`) ::= \")\" ws*", // 132
"`{ ::= \"{\" ws*", // 133
"`{ ::= \"{\" ws*", // 134
"`} ::= \"}\" ws*", // 135
"`} ::= \"}\" ws*", // 136
"`- ::= \"-\" ws*", // 137
"`- ::= \"-\" ws*", // 138
"`+ ::= \"+\" ws*", // 139
"`+ ::= \"+\" ws*", // 140
"`= ::= \"=\" ws*", // 141
"`= ::= \"=\" ws*", // 142
"`== ::= \"@\" \"=\" ws*", // 143
"`== ::= \"@\" \"=\" ws*", // 144
"`[ ::= \"[\" ws*", // 145
"`[ ::= \"[\" ws*", // 146
"`] ::= \"]\" ws*", // 147
"`] ::= \"]\" ws*", // 148
"`|| ::= \"@\" \"|\" ws*", // 149
"`|| ::= \"@\" \"|\" ws*", // 150
"`< ::= \"<\" ws*", // 151
"`< ::= \"<\" ws*", // 152
"`<= ::= \"@\" \"<\" ws*", // 153
"`<= ::= \"@\" \"<\" ws*", // 154
"`, ::= \",\" ws*", // 155
"`, ::= \",\" ws*", // 156
"`> ::= \">\" !\"=\" ws*", // 157
"`> ::= \">\" !\"=\" ws*", // 158
"`>= ::= \"@\" \">\" ws*", // 159
"`>= ::= \"@\" \">\" ws*", // 160
"`. ::= \".\" ws*", // 161
"`. ::= \".\" ws*", // 162
"`; ::= \";\" ws*", // 163
"`; ::= \";\" ws*", // 164
"`++ ::= \"@\" \"+\" ws*", // 165
"`++ ::= \"@\" \"+\" ws*", // 166
"`-- ::= \"@\" \"-\" ws*", // 167
"`-- ::= \"@\" \"-\" ws*", // 168
"`/ ::= \"/\" ws*", // 169
"`/ ::= \"/\" ws*", // 170
"ID ::= letter128 ws*", // 171
"ID ::= letter128 ws*", // 172
"ID ::= letter idChar* idChar128 ws*", // 173
"ID ::= letter idChar* idChar128 ws*", // 174
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 175
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 176
"INTLIT ::= digit128 ws*", // 177
"INTLIT ::= digit128 ws*", // 178
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 179
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 180
"STRINGLIT ::= \"@\" \'\"\' ws*", // 181
"STRINGLIT ::= \"@\" \'\"\' ws*", // 182
"STRINGLIT ::= \'\"\' any* any128 ws*", // 183
"STRINGLIT ::= \'\"\' any* any128 ws*", // 184
"CHARLIT ::= \"\'\" any ws*", // 185
"CHARLIT ::= \"\'\" any ws*", // 186
"idChar ::= letter", // 187
"idChar ::= digit", // 188
"idChar ::= \"_\"", // 189
"idChar128 ::= letter128", // 190
"idChar128 ::= digit128", // 191
"idChar128 ::= {223}", // 192
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 193
"hexDigit128 ::= {176..185 193..198 225..230}", // 194
"<stmt>* ::= <stmt>* <stmt>", // 195
"<stmt>* ::= <stmt>* <stmt>", // 196
"<decl in class>* ::= <decl in class>* <decl in class>", // 197
"<decl in class>* ::= <decl in class>* <decl in class>", // 198
"any* ::= any* any", // 199
"any* ::= any* any", // 200
"ws* ::= ws* ws", // 201
"ws* ::= ws* ws", // 202
"digit* ::= digit* digit", // 203
"digit* ::= digit* digit", // 204
"<expList>? ::= <expList>", // 205
"hexDigit* ::= hexDigit* hexDigit", // 206
"hexDigit* ::= hexDigit* hexDigit", // 207
"idChar* ::= idChar* idChar", // 208
"idChar* ::= idChar* idChar", // 209
"<class decl>+ ::= <class decl>", // 210
"<class decl>+ ::= <class decl>+ <class decl>", // 211
"", // 212
"", // 213
"", // 214
"", // 215
"", // 216
"", // 217
"", // 218
"", // 219
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 14: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 16: <stmt> ::= <if> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 17: <stmt> ::= <while> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 18: <stmt> ::= [#] <callExp> `; @newCallStatement(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <if> ::= [#] `if `( <exp> `) <stmt> `else <stmt> @newIfAndElseStatement(int,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <if> ::= [#] `if `( <exp> `) <stmt> !`else @newIfStatement(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 21: <while> ::= [#] `while `( <exp> `) <stmt> @newWhileStatement(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 22: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 23: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 26: <assign> ::= [#] `++ ID @incrementBefore(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <assign> ::= [#] `-- ID @decrementBefore(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 28: <assign> ::= [#] ID `++ @incrementAfter(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 29: <assign> ::= [#] ID `-- @decrementAfter(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 30: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 31: <exp> ::= <exp> [#] `|| <exp2> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 32: <exp> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp2> ::= <exp2> [#] `&& <exp3> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 34: <exp2> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp3> ::= <exp3> [#] `!= <exp4> @newNotEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 36: <exp3> ::= <exp3> [#] `== <exp4> @newEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 37: <exp3> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp4> ::= <exp4> [#] `< <exp5> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 39: <exp4> ::= <exp4> [#] `> <exp5> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 40: <exp4> ::= <exp4> [#] `<= <exp5> @newLessThanOrEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 41: <exp4> ::= <exp4> [#] `>= <exp5> @newGreaterThanOrEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 42: <exp4> ::= <exp4> [#] `instanceof ID @newInstanceOf(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 43: <exp4> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: <exp5> ::= <exp5> [#] `+ <exp6> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 45: <exp5> ::= <exp5> [#] `- <exp6> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 46: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: <exp6> ::= <exp6> [#] `* <exp7> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 48: <exp6> ::= <exp6> [#] `/ <exp7> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 49: <exp6> ::= <exp6> [#] `% <exp7> @newModulus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 50: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: <exp7> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 52: <exp7> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 53: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 54: <cast exp> ::= [#] `( <type> `) <exp8> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 55: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 56: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 57: <unary exp> ::= [#] `! <unary exp> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 58: <unary exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 59: <exp8> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 60: <exp8> ::= <exp8> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 61: <exp8> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 62: <exp8> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 63: <exp8> ::= [#] CHARLIT @newCharacterLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 64: <exp8> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 65: <exp8> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 66: <exp8> ::= [#] `null @newNullValue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 67: <exp8> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 68: <exp8> ::= [#] <exp8> `. ID @newInstanceVariableAccess(int,Exp,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 69: <exp8> ::= [#] `new ID `( `) @newCreation(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 70: <exp8> ::= <callExp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 71: <callExp> ::= [#] <exp8> `. ID `( <expList>? `) @newCallExp(int,Exp,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 72: <callExp> ::= [#] <exp8> `. ID `( [<expList>?] `) @newCallExp(int,Exp,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 73: <callExp> ::= [#] ID `( <expList>? `) @newCallWithOptionalArgs(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 74: <callExp> ::= [#] ID `( [<expList>?] `) @newCallWithOptionalArgs(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 75: <callExp> ::= [#] `super `. ID `( <expList>? `) @newSuperCallWithOptionalArgs(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 76: <callExp> ::= [#] `super `. ID `( [<expList>?] `) @newSuperCallWithOptionalArgs(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 77: <expList> ::= <exp> @newExpList(Exp)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 78: <expList> ::= <exp> `, <expList> @addToExpressionList(Exp,ExpList)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 79: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 80: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 81: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 82: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 83: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 84: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 85: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: ws ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `while ::= "#" "w" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 98: `if ::= "#" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 99: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `else ::= "#" "e" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `this ::= "#" "t" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `super ::= "#" "s" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `instanceof ::= "#" "i" "n" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `new ::= "#" "n" "e" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `! ::= "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 122: `!= ::= "@" "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 123: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 127: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 144: `== ::= "@" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 145: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 150: `|| ::= "@" "|" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 151: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `< ::= "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 154: `<= ::= "@" "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 155: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `, ::= "," [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `> ::= ">" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `>= ::= "@" ">" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `. ::= "." [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 166: `++ ::= "@" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 167: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 168: `-- ::= "@" "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 169: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 172: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 173: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 174: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 175: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 176: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 177: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 178: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 179: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 180: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 181: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 182: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 183: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 184: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 185: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 186: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 187: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 188: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 189: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 190: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 191: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 192: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 193: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 194: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 195: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 196: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 197: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 198: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 199: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 200: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 201: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 203: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 204: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 205: <expList>? ::= <expList> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 206: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 207: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 208: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 209: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 210: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 211: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 212: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 213: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 214: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 215: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 216: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 217: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 218: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 219: $$3 ::= any128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "<expList>? ::=", // <expList>?
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <expList>?
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCallStatement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newIfAndElseStatement(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newIfStatement(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhileStatement(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.incrementBefore(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.decrementBefore(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.incrementAfter(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.decrementAfter(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanOrEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThanOrEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newModulus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 39: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharacterLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullValue(parm0);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstanceVariableAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newCreation(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Exp result = actionObject.newCallExp(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Exp result = actionObject.newCallWithOptionalArgs(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Exp result = actionObject.newSuperCallWithOptionalArgs(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 52: {
      Exp parm0 = (Exp)si.popPb();
      ExpList result = actionObject.newExpList(parm0);
      si.pushPb(result);
    }
    break;
    case 53: {
      Exp parm0 = (Exp)si.popPb();
      ExpList parm1 = (ExpList)si.popPb();
      ExpList result = actionObject.addToExpressionList(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 55: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 56: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 57: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 58: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 59: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 60: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 61: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBreak(int)",
"Statement newCallStatement(int,Exp)",
"Statement newIfAndElseStatement(int,Exp,Statement,Statement)",
"Statement newIfStatement(int,Exp,Statement)",
"Statement newWhileStatement(int,Exp,Statement)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement incrementBefore(int,String)",
"Statement decrementBefore(int,String)",
"Statement incrementAfter(int,String)",
"Statement decrementAfter(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newNotEqual(Exp,int,Exp)",
"Exp newEqual(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newLessThanOrEqual(Exp,int,Exp)",
"Exp newGreaterThanOrEqual(Exp,int,Exp)",
"Exp newInstanceOf(Exp,int,String)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newModulus(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newUnaryNot(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newCharacterLiteral(int,int)",
"Exp newFalse(int)",
"Exp newTrue(int)",
"Exp newNullValue(int)",
"Exp newThis(int)",
"Exp newInstanceVariableAccess(int,Exp,String)",
"Exp newCreation(int,String)",
"Exp newCallExp(int,Exp,String,ExpList)",
"Exp newCallWithOptionalArgs(int,String,ExpList)",
"Exp newSuperCallWithOptionalArgs(int,String,ExpList)",
"ExpList newExpList(Exp)",
"ExpList addToExpressionList(Exp,ExpList)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
3,1,
1,1,
1,1,
2,1,
3,1,
1,1,
2,1,
4,1,
3,1,
3,1,
2,1,
3,1,
2,1,
2,1,
2,1,
2,1,
4,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
2,1,
2,1,
3,1,
2,1,
2,1,
2,1,
1,1,
1,1,
1,1,
1,1,
3,1,
2,1,
4,1,
3,1,
3,1,
1,1,
2,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
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
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    1,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    0,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    0,
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
    0,
    1,
    0,
    1,
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
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
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
    -1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
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
