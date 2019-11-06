package com.jorge;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        boolean esPrimo=false;
        double aux = 0;
        int contNoPrimos = 0;
        int numMayor = 0;
        int numMenor = 0;

        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un " +
                "número primo:");

        while (!esPrimo) {

            Integer num = sc.nextInt();

            for (int i=2; i<num; i++) {
                if (num%i==0) {
                    esPrimo=false;

                    aux = aux + num;

                    if (contNoPrimos==0) {
                        numMayor = num;
                        numMenor = num;
                    } else {
                        if (num >= numMayor) {
                            numMayor = num;
                        }
                        if (num <= numMenor) {
                            numMenor = num;
                        }
                    }

                    contNoPrimos++;
                    break;
                } else {
                    esPrimo=true;
                }
            }
        }

        System.out.println("Ha introducido "+contNoPrimos+" números no primos.");
        System.out.println("Máximo: "+numMayor);
        System.out.println("Mínimo: "+numMenor);
        System.out.println("Media: "+aux/contNoPrimos);


    }
}
