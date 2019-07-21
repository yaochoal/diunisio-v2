//Nombre del lenguaje: Diunisio
grammar Diunisio;




//Símbolo inicial
algoritmo
 : diunisio10 | diunisio20
 ;
diunisio20
 : declaracionClase
 ;

declaracionClase
 : acceso (FINAL | ESTATICO)?  CLASE CLASEID (EXTIENDE CLASEID)? (IMPLEMENTA CLASEID)? bloque_clase
 ;
bloque_clase
 : LLAVEIZ clase_body* LLAVEDE
 | LLAVEIZ LLAVEDE
 ;
clase_body
 : proposicion
 | def_clase
 | objeto
 | metodo
 | asignacion_obj
 | constructor
 | llamada_metodo
 ;

def_clase
 : tipo (IDENTIFICADOR)?  PCOMA
 ;

llamada_metodo
 : IDENTIFICADOR PUNTO IDENTIFICADOR lista_parsv PCOMA
 | SUPERCLASE PUNTO IDENTIFICADOR lista_parsv PCOMA
 ;

constructor
  : acceso CLASEID lista_parsv LLAVEIZ bloque_constructor* LLAVEDE
  ;
  bloque_constructor
  :
    asignacion_esto
  |  superclase
  ;
superclase
  : SUPERCLASE lista_parsv PCOMA
  ;
asignacion_esto //asignar this en constructor
  : (ESTO PUNTO IDENTIFICADOR ASIGNAR expresion PCOMA)
  ;

asignacion_obj
  : IDENTIFICADOR PUNTO variable ASIGNAR expresion PCOMA
  ;

objeto
  : CLASEID IDENTIFICADOR ASIGNAR NUEVO CLASEID lista_parsv PCOMA //creacion objeto
  ;
metodo //creacion metodos
 : acceso? modificador? tipo IDENTIFICADOR lista_parsv bloque
 ;
 //modificadores metodos
modificador
 : ESTATICO | FINAL | ABSTRACTO
 ;

acceso //CONTROL DE ACCESO METODOS
 : PUBLICO | PRIVADO | PROTEGIDO
 ;


diunisio10
 : ALGORITMO IDENTIFICADOR (PAREN_AP lista_ids PAREN_CI)? DOSPUNTOS bloque TERMINA
 ;
//Lista de identificadores
lista_ids
 : IDENTIFICADOR (COMA IDENTIFICADOR)*
 |
 ;

//Expresiones simples
exp_simple
 : PAREN_AP exp_simple PAREN_CI
 | (op=(SUMA | MENOS))? termino (op2=(SUMA | MENOS | O) termino)*
 | termino
 ;

//Expresiones compuestas
expresion
 : PAREN_AP expresion PAREN_CI
 | exp_simple op=(IGUAL | DIFERENTE | MEN_IGUAL | MAY_IGUAL | MENOR | MAYOR) exp_simple
 | PAREN_AP exp_simple PAREN_CI
 | exp_simple
 | NO expresion
 ;

//Definición de variable
variable
 : IDENTIFICADOR conjunto
 | IDENTIFICADOR
 ;

//Definición de término
termino
 : PAREN_AP termino PAREN_CI
 | factor (op=(MULT | DIV | MOD | Y | O | POTENCIA) factor)*
 | NO termino
 | factor
 ;

//Definición de factor
factor
 : ENTERO
 | REAL
 | CADENA
 | COMPLEJO
 | NULO
 | variable
 | IDENTIFICADOR lista_parsv?
 | IDENTIFICADOR (ANGIZ factor ANGDE)+
 | IDENTIFICADOR
 | NO factor
 | VERDADERO
 | FALSO
 | conjunto
 | PAREN_AP expresion PAREN_CI
 ;

//Lista de parámetros
lista_parsv
 : PAREN_AP (expresion | variable | IDENTIFICADOR) (COMA (expresion | variable | IDENTIFICADOR ))* PAREN_CI
 | PAREN_AP PAREN_CI
 ;

//Definición de conjunto
conjunto
 : LLAVEIZ (expresion (COMA expresion)*)? LLAVEDE
 ;

//Identificador de tipo de retorno
tipo
 : INT | FLOAT | STRING | BOOL | MATRIZ | VECTOR | VOID | CLASEID;

//Bloque
bloque
 : LLAVEIZ LLAVEDE
 | LLAVEIZ sec_proposiciones LLAVEDE
 ;

//Secuenciación
sec_proposiciones
 : (proposicion)* proposicion
 ;

//Conjunto de posibles sentencias
proposicion
 : RETORNAR expresion PCOMA
 | fun_senten
 | proc_senten
 | si_senten
 | seleccionar_senten
 | mientras_senten
 | para_senten
 | hacer_mientras_senten
 | asignacion PCOMA
 | IDENTIFICADOR lista_parsv PCOMA //Llamar función o procedimiento
 | LLAVEIZ sec_proposiciones LLAVEDE
 | OTRO {System.err.println("Caracter desconocido: " + $OTRO.text);}
 ;

//Modo de asignación
asignacion
 : IDENTIFICADOR ASIGNAR expresion  #asigNum
 | IDENTIFICADOR ASIGNAR conjunto   #asigVec
 ;

//Selección IF
si_senten
 : SI bloque_condicional (SI_NO SI bloque_condicional)* (SI_NO ENTONCES? bloque)?
 ;

//Expresión a evaluar y bloque de sentencias a ejecutar
bloque_condicional
 : expresion ENTONCES? bloque
 ;

//Iteración WHILE
mientras_senten
 : MIENTRAS bloque_condicional
 ;

//Iteración DO WHILE
hacer_mientras_senten
 : HACER bloque MIENTRAS expresion
 ;

//Selección SWITCH
seleccionar_senten
 : SELECCIONAR IDENTIFICADOR LLAVEIZ casos LLAVEDE
 ;

//Bloque de casos del SWITCH
casos
 : CASO expresion DOSPUNTOS sec_proposiciones (ROMPER PCOMA)? casos     #casosGen
 | DEFECTO DOSPUNTOS sec_proposiciones                                  #casosDef
 ;

//Iteración FOR
para_senten
 : PARA asignacion (COMA asignacion)* PCOMA expresion PCOMA asignacion (COMA asignacion)* bloque
 | PARA PAREN_AP asignacion (COMA asignacion)* PCOMA expresion PCOMA asignacion (COMA asignacion)* PAREN_CI bloque
 ;

//Función
fun_senten
 : DEF tipo IDENTIFICADOR PAREN_AP lista_ids PAREN_CI bloque
 ;

//Procedimiento
proc_senten
 : DEF IDENTIFICADOR PAREN_AP lista_ids PAREN_CI bloque
 ;

//Sentencias de función
funcion
 : LLAVEIZ sec_proposiciones PCOMA LLAVEDE
 ;


PUBLICO : 'publico';//nuewo token
PRIVADO : 'privado';//nuewo token
PROTEGIDO : 'protegido';//nuewo token
ESTATICO : 'estatico';//nuewo token
FINAL : 'final';//nuewo token
ABSTRACTO : 'abstracto';//nuewo token
NUEVO : 'nuevo';//nuewo token
PUNTO : '.';//nuewo token
ESTO : 'esto';//nuewo token
IMPLEMENTA : 'implementa'; //nuewo token
EXTIENDE : 'extiende'; //nuewo token
SUPERCLASE : 'super'; //nuewo token
INTERFAZ: 'interfaz'; //nuevo token
CLASE: 'clase'; //nuevo token
VOID: 'void'; //nuevo token
//Expresiones regulares para tokens
COMENTARIO : ('#' ~[\r\n]*  | '/*' .*? '*/') -> skip;
ALGORITMO : 'ALGORITMO';
TERMINA : '..';
ENTONCES : 'entonces';
O : '||';
Y : '&&';
IGUAL : '==';
DIFERENTE : '!=';
MAYOR : '>';
MENOR : '<';
MAY_IGUAL : '>=';
MEN_IGUAL : '<=';
SUMA : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POTENCIA : '^';
NO : '!';
DEF : 'def';
RETORNAR : 'retornar';
INT : 'entero';
FLOAT : 'decimal';
STRING : 'cadena';
BOOL : 'booleano';
MATRIZ : 'matriz';
VECTOR : 'vector';
PCOMA : ';';
ASIGNAR : '=';
PAREN_AP : '(';
PAREN_CI : ')';
LLAVEIZ : '{';
LLAVEDE : '}';
ANGIZ : '[';
ANGDE : ']';
COMA : ',';
DOSPUNTOS : ':';
VERDADERO : 'verdadero';
FALSO : 'falso';
NULO : 'nulo';
SI : 'si';
SI_NO : 'si_no';
MIENTRAS : 'mientras';
SELECCIONAR : 'seleccionar';
CASO: 'caso';
ROMPER: 'romper';
HACER: 'hacer';
PARA : 'para';
DEFECTO : 'defecto';

CLASEID : [A-Z] [a-zA-Z_0-9]*;//nuewo token
IDENTIFICADOR : [a-zA-Z_] [a-zA-Z_0-9]*;
ENTERO : [0-9]+;
REAL : [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?;
COMPLEJO : (ENTERO|REAL) [+|-] (ENTERO|REAL)? 'i';
CADENA : '"' (~["\r\n] | '""')* '"';
ESPACIO : [ \t\r\n] -> skip;
OTRO : .;

