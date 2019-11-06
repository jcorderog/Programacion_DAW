package com.jorge;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Long num;
        String numContiene = "";
        String numNoContiene = "";
        String numOriginal;

        System.out.println("Introduzca un número entero:");
        num = sc.nextLong();

        numOriginal = String.valueOf(num);

        for (int i=0;i<10;i++){
            if (numOriginal.contains(String.valueOf(i))){
                numContiene = numContiene + i + " ";
            } else {
                numNoContiene = numNoContiene + i + " ";
            }
        }

        System.out.println("Dígitos que aparecen en el número:"+numContiene);
        System.out.println("Dígitos que no aparecen:"+numNoContiene);

    }
}
