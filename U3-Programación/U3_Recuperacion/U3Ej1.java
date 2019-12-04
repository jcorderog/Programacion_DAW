package com.jorge;

import java.util.Scanner;

public class U3Ej1 {
    public static float[] mediaVectores(int[] v1, int[] v2) {

        int cont = 0;

        if (v1.length == v2.length) {
            for (int i = 0; i < v1.length; i++) {
                cont++;
            }
        } else if (v1.length > v2.length) {
            for (int i = 0; i < v1.length; i++) {
                cont++;
            }
        } else {
            for (int i = 0; i < v2.length; i++) {
                cont++;
            }
        }

        float[] resultado = new float[cont];
        cont = 0;

        if (v1.length == v2.length) {
            for (int i = 0; i < v1.length; i++) {
                resultado[cont] = (float) (v1[i] + v2[i]) / 2;
                cont++;
            }
        } else if (v1.length > v2.length) {
            for (int i = 0; i < v2.length; i++) {
                resultado[cont] = (float) (v1[i] + v2[i]) / 2;
                cont++;
            }
            for (int i = cont; i < v1.length; i++) {
                resultado[cont] = v1[i];
                cont++;
            }
        } else {
            for (int i = 0; i < v1.length; i++) {
                resultado[cont] = (float) (v1[i] + v2[i]) / 2;
                cont++;
            }
            for (int i = cont; i < v2.length; i++) {
                resultado[cont] = v2[i];
                cont++;
            }
        }

        return resultado;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lon1;
        int lon2;

        System.out.println("Introduce la longitud del primer vector:");
        lon1 = sc.nextInt();
        System.out.println("Introduce la longitud del segundo vector:");
        lon2 = sc.nextInt();

        int[] vector1 = new int[lon1];
        int[] vector2 = new int[lon2];

        System.out.println("Introduce los datos del primer vector:");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = sc.nextInt();
        }
        System.out.println("Introduce los datos del segundo vector:");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = sc.nextInt();
        }

        float[] result = mediaVectores(vector1, vector2);

        System.out.println("El resultado es:");
        for (int i = 0; i < result.length; i++) {
            System.out.print("(" + result[i] + ")");
        }
    }
}
