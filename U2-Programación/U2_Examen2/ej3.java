package com.jorge;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contSuer = 0;
        int contNoSuer = 0;
        String num1;
        String num2;
        String num3;
        String numLoteria;


        System.out.println("Introduce tus tres números favoritos:");
        num1 = sc.next();
        num2 = sc.next();
        num3 = sc.next();

        System.out.println("Introduce el número de la lotería:");
        numLoteria = sc.next();



        for (int i=0;i<numLoteria.length();i++){
            if (num1.charAt(0)==numLoteria.charAt(i) || num2.charAt(0)==numLoteria.charAt(i) || num3.charAt(0)==numLoteria.charAt(i)){
                contSuer++;
            } else {
                contNoSuer++;
            }
        }

        if (contNoSuer>contSuer){
            System.out.println("Ese número no le va a dar suerte");
        } else {
            System.out.println("Ese número le va a dar suerte");
        }

    }
}
