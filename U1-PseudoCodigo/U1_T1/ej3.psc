Algoritmo Ej3
	Definir altura,ancho,asterisco,espacio Como Entero;
	
	Escribir "Escribe la altura del reloj de arena:";
	Leer altura;
	
	Si altura%2=1 y altura>=3 Entonces
		Escribir "Este es el Reloj:"
		Para ancho<-1 Hasta altura Hacer
			Para espacio<-altura-2 Hasta altura-ancho Con Paso -1 Hacer
				Escribir Sin Saltar " ";
			Fin Para
			Para asterisco<-altura Hasta ancho Con Paso -1 Hacer
				Escribir Sin Saltar "* ";
			Fin Para
			Escribir " ";
		Fin Para
		Para ancho<-1 Hasta altura  Hacer
			Para espacio<-1 Hasta altura-ancho Con Paso 1 Hacer
				Escribir Sin Saltar " ";
			Fin Para
			Para asterisco<-1 Hasta ancho Con Paso 1 Hacer
				Escribir Sin Saltar "* ";
			Fin Para
			Escribir " ";
		Fin Para
	SiNo
		Escribir "Solo puedes ser un número impar mayor o igual a 3"
	Fin Si
	
	
FinAlgoritmo
