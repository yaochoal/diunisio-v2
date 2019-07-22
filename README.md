# Proyecto Final DIUNISIO 2.0 

## Propósito

Realizar los re-diseños y adaptaciones necesarias para convertir el lenguaje imperativo  DiUNisio 1.0 en un lenguaje Orientado a Objetos DiUNisio 2.0.  

## Integrantes

|       Integrante      |                 Correo                       |
|-----------------------|-----------------------------------------------|
| Adriano Ramón Hernández|  <aramonh@unal.edu.co> |
| Liseth Yurany Arévalo Yaruro   |   <lyarevalo@unal.edu.co>  |
| Luis Alejandro Higuarán Serrano      |    <lahiguarans@unal.edu.co>    |
| Michael Tomás Velásquez Gordillo      |   <mtvelasquezg@unal.edu.co>     |
| Yesid Alberto Ochoa Luque      |    <yaochoal@unal.edu.co>     |

## 1. Introducción

### 1.1 Programacion Orientada a Objetos
La programación orientada a objetos es un paradigma de programación que viene a innovar la forma de obtener resultados. Los objetos manipulan los datos de entrada para la obtención de datos de salida específicos, donde cada objeto ofrece una funcionalidad especial. Está basada en varias técnicas: herencia, cohesión, abstracción, polimorfismo, acoplamiento y encapsulamiento.

### 1.2 Descripción general
Diunisio 2.0 es un lenguaje de programación orientado a objetos  en español desarrollado con la librería ANTLR;
que permite construir clases, interfases y algoritmos con sintaxis flexible, fácil de entender, de bajo tipado y con funcionalidades añadidas.


## 2. Descripción del nuevo modelo de programación
### 2.1. Clases
Una clase es una estructura para la creacion de objetos que puede tener en su interior atributos y métodos. Cada clase debe tener un tipo de acceso definido (público, privado o protegido), tambien debe tener un numbre que empiece con una letra mayuscula y puede extener o implementar otras clases.

### 2.2. Interfaces
Una interfaz es una lista de acciones que puede llevar a cabo un determinado objeto. Cada intrefaz empieza con la palabra "interfaz" seguido de un nombre con la primera letra mayuscula y una lista de métods que implementrán los objetos.

### 2.3. Metodos
Un método es un conjunto de instrucciones definidas dentro de una clase, que realizan una determinada tarea y a las que podemos invocar mediante un nombre.

### 2.4. Objeto
Un objeto el la instancia de una clase en particular.

### 2.5. Palabras reservadas
Una palabra reservada es una secuencia de caracteres alfabéticos y posiblemente un caracter especial.
Todas las palabras reservadas corresponden a una categoría: palabras reservadas, las cuales pueden ser
usadas como nombres de variables, y palabras no reservadas, las cuales son reconocidas por el contexto
y por eso pueden ser usadas como nombres de variables.
Las palabras reservadas son las siguientes:

publico | privado | protegido | estatico | final | abstracto | nuevo | esto | implementa | extiende | super | interfaz | clase | void 

## 3. ANTLR

### 3.1. Nuevos Tokens del lenguaje
|       Categoría léxica     |                 Expresión regular                  |
|-----------------------|-----------------------------------------------|
|  PUBLICO     |    'publico'   |
|  PRIVADO      |    'privado'     |
|  PROTEGIDO      |    'protegido'     |
|  ESTATICO      |    'estatico'     |
|  FINAL      |    'final'     |
|  ABSTRACTO      |    'abstracto'     |
|  NUEVO      |    'nuevo'     |
|  PUNTO      |    '.'     |
|  ESTO      |    'esto'     |
|  IMPLEMENTA      |    'implementa'     |
|  EXTIENDE      |    'extiende'     |
|  SUPERCLASE     |    'super'     |
|  INTERFAZ   |    'interfaz'     |
|  CLASE |    'clase'     |
|  VOID|    'void'     |
|  CLASEID |    [A-Z] [a-zA-Z_0-9]*     |

### 3.2. Gramática E-BNF y Diagramas de sintaxis
![Diagrama](/img/img1.png )
![Diagrama](/img/img2.png )
![Diagrama](/img/img3.png )
![Diagrama](/img/img4.png )
![Diagrama](/img/img5.png )
![Diagrama](/img/img6.png )
![Diagrama](/img/img7.png )
![Diagrama](/img/img8.png )
![Diagrama](/img/img9.png )
![Diagrama](/img/img10.png )
![Diagrama](/img/img12.png )
![Diagrama](/img/img13.png )
![Diagrama](/img/img14.png )
![Diagrama](/img/img15.png )
![Diagrama](/img/img16.png )
![Diagrama](/img/img17.png )
![Diagrama](/img/img18.png )
![Diagrama](/img/img19.png )
![Diagrama](/img/img20.png )
![Diagrama](/img/img21.png )
![Diagrama](/img/img22.png )
![Diagrama](/img/img23.png )
## 4. Ejemplos
### 4.1. Clases
```sh
publico clase Cajero implementa Persona {
    Cadena nombre;
    entero edad;
    Cadena identificacion;

    publico Cajero(Cadena nombre, entero edad, Cadena identificacion){
        esto.nombre = nombre;
        esto.edad = edad;
        esto.identificacion = identificacion;
    }
    
    publico Cadena decirNombre(){
        retornar nombre;
    }
    
    publico entero diferenciaDeEdad(Fecha nacimiento){
        retornar x;
    }
    
    publico void setNombre(Cadena nombre){
        esto.nombre = nombre;
    }
    
    publico void getNombre(Cadena nombre){
        retornar esto.nombre;
    } 
}
```

### 4.2. Interfaces
```sh
interfaz Personas {
    publico Cadena decirNombre();
    publico entero diferenciaDeEdad(Fecha nacimiento);
}
```

### 4.3. Metodos
```sh
publico Cajero(Cadena nombre, entero edad, Cadena identificacion){
    esto.nombre = nombre;
    esto.edad = edad;
    esto.identificacion = identificacion;
}
```

### 4.4. Objeto
```sh
Cajero cajero = nuevo Cajero(Cadena nombre, entero edad, Cadena identificacion);
```

