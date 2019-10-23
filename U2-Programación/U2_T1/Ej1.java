package com.jorge;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int notaMedia;
        String recuperacion;


        System.out.println("Introduce la primera nota:");
        nota1 = sc.nextInt();

        System.out.println("Introduce la segunda nota:");
        nota2 = sc.nextInt();

        System.out.println("Introduce la tercera nota:");
        nota3 = sc.nextInt();

        notaMedia = (nota1+nota2+nota3)/3;
        if (notaMedia>=5){
            if (notaMedia>=5 && notaMedia<6){
                System.out.println("Tu nota de Programación es: "+notaMedia+" - "+"Suficiente");
            } else if (notaMedia>=6 && notaMedia<7){
                System.out.println("Tu nota de Programación es: "+notaMedia+" - "+"Bien");
            } else if (notaMedia>=7 && notaMedia<9){
                System.out.println("Tu nota de Programación es: "+notaMedia+" - "+"Notable");
            } else {
                System.out.println("Tu nota de Programación es: " + notaMedia + " - " + "Sobresaliente");
            }
        } else {
            System.out.println("¿Cuál a sido el resultado de la recuperación? (apto/no apto):");
            recuperacion = sc.next();
            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de Programación es: 5 - Suficiente");
            } else {
                System.out.println("Tu nota de Programación es: " + notaMedia + " - " + "Suspenso");
            }
        }
    }
}
