Algoritmo Ej1
	Definir sueldo,num_horas_trabajadas Como Entero;
	
	Escribir "Introduce el número de horas que has trabajado esta semana:";
	Leer num_horas_trabajadas;
	
	Si num_horas_trabajadas<=40 Entonces
		sueldo<-10*num_horas_trabajadas;
	SiNo
		sueldo<-(10*40)+((num_horas_trabajadas-40)*15);
	Fin Si
	
	Escribir "Tu sueldo de esta semana es: ",sueldo," Euros";
	
FinAlgoritmo
