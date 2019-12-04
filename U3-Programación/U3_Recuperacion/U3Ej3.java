package com.jorge;

import java.util.Scanner;

public class U3Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad1;

        System.out.println("Introduce una cadena:");
        cad1 = sc.nextLine();

        //Para la función invertir:
        String[] result = LibreriaVectores.invertir(cad1);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
        //para la función desplazarVocales:
        String[] resultado = LibreriaVectores.desplazarVocales(cad1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(resultado[i]);
        }
    }
}
