package com.jorge;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alt =5;

        System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5):");
        alt = sc.nextInt();

        if (alt%2!=0 && alt>=5){
            for (int i = 0;i < alt;i++){
                for (int j = 0;j < 6;j++){
                    if (i==0 || j==0 || i==alt-1 || j==5 || i==alt/2){
                        System.out.print("M");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("La altura introducida no es correcta");
        }
    }
}
