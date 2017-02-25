/**
 * Define a grammar called Hello
 */
grammar Icinga;

@header {
    package com.zycus.antlr.icinga;
}

icingaObj
:
	cfgType objType STRING obj
;

cfgType
:
	OBJECT
	| TEMPLATE
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

// str
// : STRING;

obj
:
	'{'
	(
		'import' STRING
	)* pair* '}'
;

pair
:
	var '='
	(
		TEXT
		| value
	)
;

array
:
	'[' value
	(
		',' value
	)* ']'
	| '[' ']'
;

var
:
	TEXT
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

// Anything that is not an escape. Need to revisit this

TEXT
:
	[0-9a-zA-Z_\-\.]+
	| NUMBER
;
//LSQBRACE: '[';
//RSQBRACE: ']';
//LCURLYBRACE: '{';
//RCURLYBRACE: '}';

WS
:
	[ \t\n\r\u000C]+ -> skip
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

STRING
:
	'"' .*? '"'
;

 
