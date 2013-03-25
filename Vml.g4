/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Vml;

fragment
DIGIT: [0-9];


fragment
FRACTION: ('.'DIGIT+);


fragment
LETTER: [a-zA-Z];


ID: LETTER (LETTER|DIGIT)* ;
    
NUMBER : INT FRACTION?;

INT: '-'? DIGIT+;

WS: [ \t\n\r] -> skip;

rank: '(' INT ')';
component: (':' ID); 

numberList: NUMBER (',' NUMBER)*;

expr:  
        '||' expr '||'  #magnitude
    |   expr '^'        #normalize
    |   expr '*' expr   #cross
    |   expr '.' expr   #dot
    |   expr '+' expr   #add
    |   expr '-' expr   #sub
    |   ID component?   #fetch
    |   pointLiteral    #point
    |   vectorLiteral   #vector
    |   '(' expr ')'    #parens
    ;

vectorLiteral : '[' numberList ']';
pointLiteral  : '(' numberList ')';

assignmentStmt: ID (rank | component)? '=' expr ';' #Assignment;


inspectStmt: expr ';' #Inspect;


file: (
            assignmentStmt 
        |   inspectStmt
      ) *;
