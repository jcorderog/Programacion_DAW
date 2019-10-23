package com.jorge;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alt;

        System.out.println("Introduce la altura (número impar, mayor que 3):");
        alt = sc.nextInt();

        if ((alt%2!=0) && alt >= 3){
            for (int i=0;i<=(alt/2);i++){
                for (int j=0;j<=(alt/2)-i;j++){
                    System.out.print(" ");
                }
                System.out.println("*     *");
            }
            for (int i=0;i<=(alt/2)-1;i++){
                for (int j=0;j<=((alt/2)-2+i);j++){
                    System.out.print(" ");
                }
                System.out.println("*     *");
            }
        }

    }
}
