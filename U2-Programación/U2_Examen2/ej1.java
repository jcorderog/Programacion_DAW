package com.jorge;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alt;

        System.out.println("Introduce la altura de los calcetines:");
        alt = sc.nextInt();

        if (alt < 4){
            System.out.println("La altura no puede ser menor que 4");
        } else {

            for (int i=0;i<alt;i++){
                for (int j=0;j<14;j++){
                    if (j>2 && j<8 && i<alt-2 || i>alt-3 && j>5 && j<8 || j>10 && i<alt-2){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        }
    }
}
