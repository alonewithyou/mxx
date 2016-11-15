grammar mxx;

compilationUnit
    :   translationUnit? EOF
    ;

indexExp
	:	'[]'							#emptyindex
	|	'[' expressionseq ']' 			#contentindex
	;
	
arrSufSeq	
	:	indexExp						#singleArrSuf
	|	indexExp arrSufSeq				#arrSufSeqs
	;

primaryExpression
    :   identifier                  #pr_id
    |   IntegerLiteral              #pr_intconst
    |   StringLiteral               #pr_strconst
    |   BoolLiteral                 #pr_boolconst
    |   '(' expressionseq ')'       #pr_exp
    |   Null                        #pr_null
    ;


postfixExpression2
    :   primaryExpression								#postfixToPrimary                                                            
    |   postfixExpression2 arrSufSeq							#postfix_exp
    |   postfixExpression2 '.' identifier (LeftParen parameterList? RightParen)?         #postfix_identi
    |   postfixExpression2 '(' argumentExpressionList? ')'                               #postfix_argu
    |   postfixExpression2 '++'								#postfix_add
    |   postfixExpression2 '--'								#postfix_dec
    ;

postfixExpression
    :  New typeSpecifier  #pr_new
    |  postfixExpression2 #pr_common
    ;

argumentExpressionList
    :   assignmentExpression							#arguToassign
    |   argumentExpressionList ',' assignmentExpression	#arguLinkAssign
    ;

unaryExpression
    :   postfixExpression								#unary_postfix
    |   '++' unaryExpression							#unary_inc
    |   '--' unaryExpression							#unary_dec
    |   unaryOperator unaryExpression					#unary_other
    ;

unaryOperator
    :   '+' | '-' | '~' | '!'
    ;

multiplicativeExpression
    :   unaryExpression										#multiToUnary
    |   multiplicativeExpression '*' unaryExpression		#multi_mult
    |   multiplicativeExpression '/' unaryExpression		#multi_div
    |   multiplicativeExpression '%' unaryExpression		#multi_modu
    ;

additiveExpression
    :   multiplicativeExpression						#addTomulti
    |   additiveExpression '+' multiplicativeExpression	#add_plus
    |   additiveExpression '-' multiplicativeExpression	#add_minus
    ;

shiftExpression
    :   additiveExpression								#shiftToAdd
    |   shiftExpression '<<' additiveExpression			#leftShift
    |   shiftExpression '>>' additiveExpression			#rightShift
    ;

relationalExpression
    :   shiftExpression                                         #relaToShift
    |   relationalExpression '<' shiftExpression		#rela_less
    |   relationalExpression '>' shiftExpression		#rela_greater
    |   relationalExpression '<=' shiftExpression		#rela_less_equ
    |   relationalExpression '>=' shiftExpression		#rela_greater_equ
    ;

equalityExpression
    :   relationalExpression							#equalToRela
    |   equalityExpression '==' relationalExpression	#equalSameRela
    |   equalityExpression '!=' relationalExpression	#equalDifRela
    ;

andExpression
    :   equalityExpression								#andToEqual
    |   andExpression '&' equalityExpression			#andLinkEqual
    ;

exclusiveOrExpression
    :   andExpression									#eOrtoAnd
    |   exclusiveOrExpression '^' andExpression			#eOrLinkAnd
    ;

inclusiveOrExpression
    :   exclusiveOrExpression							#iOrToeOr
    |   inclusiveOrExpression '|' exclusiveOrExpression	#iOrLinkeOr
    ;

logicalAndExpression
    :   inclusiveOrExpression							#logicAndToiOr
    |   logicalAndExpression '&&' inclusiveOrExpression	#logicAndLinkiOr
    ;

logicalOrExpression
    :   logicalAndExpression							#logicOrToAnd
    |   logicalOrExpression '||' logicalAndExpression	#logicOrLinkAnd
    ;
	
assignmentExpression
    :   logicalOrExpression							#assToLogicOr
    |   unaryExpression Assign assignmentExpression	#unaryLinkAss
    ;
	
expressionseq
    :   assignmentExpression						#expToAssign
    |   expressionseq ',' assignmentExpression		#expLinkAssign
    ;

typeSpecifier
    :   Void arrSufSeq?			#type_void
    |   Int arrSufSeq?                  #type_int
    |   Bool arrSufSeq? 		#type_bool
    |   String arrSufSeq?		#type_String
    |   identifier arrSufSeq?		#type_Other
    ;

statement
    :   compoundStatement		#to_comp_stmt
    |   expressionStatement		#to_exp_stmt
    |   selectionStatement		#to_select_stmt
    |   iterationStatement		#to_iter_stmt
    |   jumpStatement			#to_jump_stmt
    ;

compoundStatement
    :   LeftBrace blockItemList? RightBrace
    ;

blockItemList
    :   blockItem				#blck_single
    |   blockItemList blockItem                #blck_expand
    ;

blockItem
    :   declaration				#blckunit_declare
    |   statement				#blckunit_common
    ;

expressionStatement
    :   expressionseq? Semi		
    ;

selectionStatement
    :   If LeftParen expressionseq RightParen blockItem (Else blockItem)?
    ;

iterationStatement
    :   While LeftParen assignmentExpression RightParen blockItem														
    |   For LeftParen assignmentExpression? Semi assignmentExpression? Semi assignmentExpression? RightParen blockItem
    ;

jumpStatement
    :   Continue Semi
    |   Break Semi
    |   Return assignmentExpression? Semi
    ;

translationUnit
    :   externalDeclaration						#trans_unit
    |   translationUnit externalDeclaration		#trans_expand
    ;

externalDeclaration
    :   functionDefinition          #funcDef
    |   classDefinition             #classDef
    |   extraDeclaration            #varDef
    ;

declaration
    :   typeSpecifier identifier (Assign assignmentExpression)? Semi
    ;
	
extraDeclaration
    :   typeSpecifier identifier (Assign assignmentExpression)? Semi
    ;

functionDefinition
    :   typeSpecifier identifier LeftParen parameterList? RightParen  '{' blockItemList '}'
    ;

parameterList
    :   parameter							#para_unit
    |   parameter Comma parameterList		#para_expand
    ;

parameter
    :   typeSpecifier identifier
    ;

classDefinition
    :   Class identifier LeftBrace classDeclarationList RightBrace
    ;

classDeclarationList
    :   classdeclaration						#classdef_unit
    |   classdeclaration classDeclarationList 	#classdef_expand
    ;

classdeclaration
    :   typeSpecifier identifier Semi
    ;
        

Break : 'break';
Char: 'char';
Const : 'const';
Continue : 'continue';
Class : 'class';
Do : 'do';
Else : 'else';
For : 'for';
If : 'if';
Int : 'int';
New : 'new';
Return : 'return';
Static : 'static';
String : 'string';
Struct : 'struct';
Void : 'void';
While : 'while';
Null : 'null';
fragment True : 'true';
fragment False : 'false';
Bool : 'bool';
LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';
Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';
Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';
And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';
Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';
Assign : '=';
Equal : '==';
NotEqual : '!=';
Dot : '.';

BoolLiteral
	:	True
        |       False
	;

identifier
    :   Identifier
    ;

Identifier
    :   Nondigit (Nondigit|Digit)*
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

IntegerLiteral
    :   Digit+
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
Sign
    :   '+' | '-'
    ;

fragment
DigitSequence
    :   Digit+
    ;

fragment
CharacterConstant
    :   '\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

StringLiteral
    :   '"' SCharSequence? '"'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    ;
	
/*fragment
TrueOrFalse
	:	True
	|	False
	;*/

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;