package com.jorge;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[4][5];
        int[][] medias = new int[numeros.length+1][numeros[0].length+1];
        int suma=0;
        int sumaTotal=0;

        System.out.println("Introduce 20 números:");

        for (int i=0;i<numeros.length;i++){
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("Los números introducidos son:");
        for (int i=0;i<numeros.length;i++){
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("|"+numeros[i][j]);
            }
            System.out.println();
        }
        System.out.println("_____________");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                medias[i][j]=numeros[i][j];
                suma+=numeros[i][j];
            }
            medias[i][numeros[i].length]=suma/numeros[i].length;
            sumaTotal+=suma;
            suma=0;
        }
        for (int j = 0; j <= numeros.length; j++) {
            for (int i = 0; i < numeros.length; i++) {
                suma=suma+numeros[i][j];
            }
            medias[numeros.length][j]=suma/numeros.length;
            suma=0;
        }
        medias[medias.length-1][medias[0].length-1]=sumaTotal/20;

        for (int i = 0; i < medias.length; i++) {
            for (int j = 0; j < medias[i].length; j++) {
                System.out.print("|"+medias[i][j]);
            }
            System.out.println();
        }


    }
}
