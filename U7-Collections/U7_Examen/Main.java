package com.jorge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Propietario p1 = new Propietario("Pepe","Marquez Muñoz","F2563J","España");
        Propietario p2 = new Propietario("Juan","Cordero Vazquez","D2343S","España");
        Propietario p3 = new Propietario("María","Gordillo Ortiz","P9565L","España");
        Propietario p4 = new Propietario("Toñi","Orta Muñoz","H5478K","España");

        Perro perro1 = new Perro("Larry",6,6.5,true,p1,"Labrador");
        Perro perro2 = new Perro("Toby",4,4.5,false,p1,"Galgo");
        Perro perro3 = new Perro("Karyn",5,4.7,true,p2,"Galgo");
        Perro perro4 = new Perro("Terry",8,7.5,true,p3,"Labrador");
        Perro perro5 = new Perro("Poppy",7,7.00,false,p4,"Labrador");
        Perro perro6 = new Perro("Moni",8,5.5,true,p4,"Galgo");

        List<Perro> perrosLabradores = new ArrayList<>();
        List<Perro> perrosGalgos = new ArrayList<>();

        perrosLabradores.add(perro1);
        perrosLabradores.add(perro4);
        perrosLabradores.add(perro5);
        perrosGalgos.add(perro2);
        perrosGalgos.add(perro3);

        Raza r1 = new Raza("Labrador",perrosLabradores);
        Raza r2 = new Raza("Galgo",perrosGalgos);
        Set<Raza> razaas = new HashSet<>();

        razaas.add(r1);
        razaas.add(r2);

        Concurso concurso1 = new Concurso(razaas);

        concurso1.addDog("Galgo",perro6);

        System.out.println(r2.toString());

        System.out.println("----------------------------------------------------------------------------------");

        concurso1.discualifyDog(perro6);

        System.out.println(r2.toString());

        System.out.println("----------------------------------------------------------------------------------");

        concurso1.ownerDogs("F2563J");

        System.out.println("----------------------------------------------------------------------------------");

        concurso1.perrosporPeso(r2);


    }

}
