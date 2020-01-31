package com.jorge.PracticasClase.E_Clase_Biblioteca;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("asdfasdf!21112","Los Tres Cerditos", 2001);
        Revista revista1 = new Revista("123ASDFG123","Hola!",2002,2);


        System.out.println(libro1.toString());
        System.out.println(revista1.toString());

        System.out.println("----------------------------------");
        libro1.presta();
        System.out.println("Libro1 Prestado: "+libro1.estaPrestado());
        libro1.devuelve();
        System.out.println("Libreo1 Prestado: "+libro1.estaPrestado());

        System.out.println("------------------------------------");

        //COMPARETOR: Ordena los libros o revistas. En este caso Revistas.

        Revista[] revistas = new Revista[3];

        revistas[0] = new Revista("1111111","C",2018,1);
        revistas[1] = new Revista("3333333","B",2018,1);
        revistas[2] = new Revista("2222222","A",2018,1);

        System.out.println("Ordena Revistas Por ISBN:");
        Arrays.sort(revistas);

        System.out.println(Arrays.deepToString(revistas));

        System.out.println("------------------------------------");

        System.out.println("Ordena Revistas Por Título: ");
        Arrays.sort(revistas, new Comparator<Revista>() {
            @Override
            public int compare(Revista revista, Revista t1) {
                return revista.getTitulo().compareTo(t1.getTitulo());
            }
        });

        System.out.println(Arrays.deepToString(revistas));
    }
}
