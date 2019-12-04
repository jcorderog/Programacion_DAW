### EJERCICIO 1
Realizar una función mediaVectores que:

Recibe dos vectores de enteros de una dimensión
Devuelve un único vector de float cuyos elementos serán las medias de los elementos de dicha posición en los vectores recibidos.
En caso de que uno de los dos vectores sea más largo, en las posiciones restantes se colocarán los valores del vector más largo.

Los vectores deberán ser rellenados por el usuario. Se le solicitará el tamaño y los valores de los dos.

##### Ejemplo:

Si v1 = {1,2,4} y v2 = {3,4,5,6,7,8}

mediaVectores(v1,v2) debe devolver {2,3,4.5,6,7,8}

### EJERCICIO 2

Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar una torre que se encuentra en esa posición. El tablero cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

![GitHub Logo](ajedrez.png)

##### Ejemplo:

Introduzca la posición de la torre: c5

La torre puede moverse a las siguientes posiciones: c8,c7,c6,c4,c3,c2,c1,a5,b5,d5,e5,f5,g5,h5

### EJERCICIO 3

Crear una librería para trabajar con cadenas que contenga las siguiente funciones:

 invertir

Recibe una cadena (String)
Devuelve esa cadena invertida y en mayúsculas pero colocada en un vector (una letra por posición)

##### Por ejemplo:

invertir("hola") debe devolver [ "A","L","O","H"]

desplazarVocales

Recibe una cadena (String) 
Devuelve esa misma cadena con las vocales desplazadas una posición a -> e , e -> i , i -> o, o -> u , u -> a y colocada en un vector (una letra por posición)
##### Por ejemplo:

desplazarVocales("hola") devuelve ["h","u","l","e"]
