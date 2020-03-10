package com.jorge;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    Coche[] coches = new Coche[3];
        Motocicleta[] motocicletas = new Motocicleta[3];
        Helicoptero helicoptero = new Helicoptero("Boing",10,1500.23,"UP-A300I");

	    coches[0] = new Coche("Renault",5,"5555ACF",2016,Color.AZUL);
        coches[1] = new Coche("Seat",5,"4444GSF",2015,Color.ROJO);
        coches[2] = new Coche("Opel",7,"6666KSL",2014,Color.VERDE);

        motocicletas[0] = new Motocicleta("Honda",2,"1111LAP",2016,Color.AMARILLO);
        motocicletas[1] = new Motocicleta("BMW",2,"2222JAS",2017,Color.AZUL);
        motocicletas[2] = new Motocicleta("YamaHa",2,"3333LAS",2018,Color.ROJO);

        //Ordenar por matricula.
        System.out.println("Están ordenador por Matrícula:");
        Arrays.sort(coches);
        Arrays.sort(motocicletas);

        System.out.println(Arrays.toString(coches));
        System.out.println(Arrays.toString(motocicletas));

        System.out.println("-------------------------------------------");
        System.out.println("Ordenado por el año de fabricación:");
        System.out.println();

        //Ordebar por Año de Fabricación.
        Arrays.sort(coches, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche, Coche t1) {
                return coche.getAñoFabricacion() - ((Coche) t1).getAñoFabricacion();
            }
        });

        System.out.println(Arrays.toString(coches));

        System.out.println("-------------------------------------------");
        System.out.println("Helicoptero: ");

        //Añado 9 personas al Helicoptero.
        helicoptero.trasnportar(9);

        System.out.println(helicoptero.toString());
    }
}
