package com.jorge;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean esPrimo = false;

        System.out.println("Introduce un número entero positivo:");
        num = sc.nextInt();

        if (num<0){
            System.out.println("El número tiene que ser positivo");
        } else {
            for (int i=num;i<num+5;i++){
                for (int j=2;j<i;j++){
                     if (i%j!=0){
                         esPrimo=true;
                     } else {
                         esPrimo=false;
                         break;
                     }
                }
                if (esPrimo==false){
                    System.out.println(i+" No es primo");
                } else {
                    System.out.println(i+" Es primo ");
                }
                esPrimo=false;
            }
        }
    }
}
