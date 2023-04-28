import java_cup.runtime.*;

%%

%cup
%line

%eofval{
	return new Symbol( sym.EOF );
%eofval}

NUM = [0-9]
LETTER = [a-zA-Z]
WhiteSpace = [ \t\r\n]

%%

//Separators
"==" {return new Symbol(sym.EQUALS);}
"!=" {return new Symbol(sym.NOT_EQUALS);}
">" {return new Symbol(sym.MORE_THAN);}
"<" {return new Symbol(sym.LESS_THAN);}
">=" {return new Symbol(sym.MORE_EQUALS_THAN);}
"<=" {return new Symbol(sym.LESS_EQUALS_THAN);}
"👉" {return new Symbol(sym.ASSIGNMENT);}
"✅" {return new Symbol(sym.SEMI);}
")" {return new Symbol(sym.RPAR);}
"(" {return new Symbol(sym.LPAR);}
"{" {return new Symbol(sym.LBRACE);}
"}" {return new Symbol(sym.RBRACE);}

//Operators
"😂" {return new Symbol(sym.PLUSPLUS);}
"😭" {return new Symbol(sym.MINUSMINUS);}
"💯" {return new Symbol(sym.HUNDRED);}
"➕" {return new Symbol(sym.PLUS);}
"➖" {return new Symbol(sym.MINUS);}
"✖️" {return new Symbol(sym.TIMES);}
"➗" {return new Symbol(sym.DIVIDE);}
"%" {return new Symbol(sym.MOD);}

//Keywords
"if" {return new Symbol(sym.IF);}
"❓" {return new Symbol(sym.THEN);}
"else" {return new Symbol(sym.ELSE);}

//Constants
{NUM}+ {return new Symbol(sym.NUM, new Integer(yytext()));}
{LETTER}({LETTER}|{NUM}|_)* {return new Symbol(sym.ID, new String(yytext()));}

{WhiteSpace} { /* ignore white space. */ }
. { System.err.println("ERROR: "+yytext()+" at line "+yyline);}