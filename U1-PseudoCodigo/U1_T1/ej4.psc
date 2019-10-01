Algoritmo Ej4
	Definir num_aletorio,opcion_1_o_2 Como Entero;

	Dimension total[20];
	
	
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		num_aletorio<-Aleatorio(0,400)
		Escribir Sin Saltar num_aletorio," "
		total[i]<-num_aletorio;
		
	Fin Para
	Escribir " ";
	Escribir "Qué números quieres resaltar? (",1,"-Los múltiplos de 5, ",2,"-Los múltiplos de 7)";
	Leer opcion_1_o_2;
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		Si opcion_1_o_2=1 Entonces
			multiplo5<-total[i]%5=0
			Si multiplo5=Verdadero Entonces
				Escribir Sin Saltar "[",total[i],"] ";
			SiNo
				Escribir Sin Saltar total[i]," ";
			Fin Si
		SiNo
			Si opcion_1_o_2=2 Entonces
				multiplo7<-total[i]%7=0
				Si multiplo7=Verdadero Entonces
					Escribir Sin Saltar "[",total[i],"] ";
				SiNo
					Escribir Sin Saltar total[i]," ";
				Fin Si
			Fin Si
		Fin Si
	Fin Para
	
FinAlgoritmo
