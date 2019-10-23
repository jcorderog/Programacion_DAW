package com.jorge;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num;
        int num1;
        String binario="";

        System.out.println("Introduce un número positivo:");
        num = sc.nextInt();
        num1 =num;

        if (num>0){
            while (num>0){
                if (num%2==0){
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                num = num / 2;
            }
        } else if (num == 0){
            binario = "0";
        }else {
            System.out.println("El número introducido solo puede ser positivo.");
        }
        System.out.println("El número "+num1+" en binario es: "+binario);
    }
}
