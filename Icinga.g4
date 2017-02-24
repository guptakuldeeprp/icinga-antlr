/**
 * Define a grammar called Hello
 */
 grammar Icinga;

 @header {
    package com.zycus.antlr.icinga;
}
 icingaObj
 :
 	OBJECT
 	| TEMPLATE objType STRING obj
 ;

 objType
 :
 	(
 		'Service'
 		| 'Host'
 		| 'Notification'
 		| 'User'
 		| 'CheckCommand'
 		| 'Zone'
 	)
 ;

 obj
 :
 	'{'
 	(
 		'import' STRING
 	)* pair* '}'
 ;

 pair
 :
 	VAR '=' value
 ;

 array
 :
 	'[' value
 	(
 		',' value
 	)* ']'
 	| '[' ']'
 ;

 value
 :
 	STRING
 	| NUMBER
 	| obj
 	| array
 	| 'true'
 	| 'false'
 	| 'null'
 ;

 ICINGA_OBJ_TYPE
 :
 	'Service'
 	| 'Host'
 	| 'Notification'
 	| 'User'
 	| 'CheckCommand'
 	| 'Zone'
 ;

 OBJECT
 :
 	'object'
 ;

 TEMPLATE
 :
 	'template'
 ;


 APPLY
 :
 	'apply'
 ;

 VAR
 :
 	TEXT
 ;

 // Anything that is not an escape. Need to revisit this

 STRING
 :
 	'"'
 	(
 		~["\\]
 	)* '"'
 	| '""'
 ;

 TEXT
 :
 	[0-9a-zA-Z_\-""\.]+
 	| NUMBER
 ;
 //LSQBRACE: '[';
 //RSQBRACE: ']';
 //LCURLYBRACE: '{';
 //RCURLYBRACE: '}';
 WS
 :
 	[ \t\n\r]+ -> skip
 ;

 NUMBER
 :
 	'-'? INT '.' [0-9]+
 	| '-'? INT
 	| '-'? INT
 ;

 fragment
 INT
 :
 	'0'
 	| [1-9] [0-9]*
 ;

 COMMENT
 :
 	'//' -> skip
 ;

 BLOCKCOMMENT
 :
 	'/*' .*? '*/' -> skip
 ;