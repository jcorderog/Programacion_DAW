Algoritmo ej2
	Definir num,pocision,nuevo_num,contador Como Entero;
	Definir num_texto Como Caracter;
	
	Escribir "Introduce un numero:"
	Leer num;
	
	Escribir "Introduce la pocicion que deseas cambiar:";
	Leer pocision;
	
	Escribir "Introduce el nuevo dígito:";
	Leer nuevo_num
	
	num_texto<-convertiratexto(num);
	
	Para contador<-0 Hasta Longitud(num_texto) Hacer
		Si contador=pocision-1 Entonces
			Escribir Sin Saltar nuevo_num;
		SiNo
			Escribir Sin Saltar subcadena(num_texto,contador,contador);
		Fin Si
	Fin Para
FinAlgoritmo
