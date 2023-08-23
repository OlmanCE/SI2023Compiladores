parser grammar AlphaParser2;

options {
  tokenVocab = AlphaScanner;
}

program : singleCommand EOF;
command : singleCommand (PyCOMA singleCommand)* ;
singleCommand : ID ( ASSIGN expression
                     | PIZQ expression PDER )
        | IF expression THEN singleCommand
                        ELSE singleCommand
        | WHILE expression DO singleCommand
        | LET declaration IN singleCommand
        | BEGIN command END ;
declaration  : singleDeclaration (PyCOMA singleDeclaration)* ;
singleDeclaration : CONST ID VIR expression
    	   | VAR ID DOSPUN typedenoter ;
typedenoter : ID ;
expression : primaryExpression (operator primaryExpression)* ;
primaryExpression : NUM | ID | PIZQ expression PDER ;
operator : SUM | SUB | MUL | DIV ;


