package com.jorge;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas;
        int minutos;
        int segundos;
        int segundosIncremen;

        System.out.println("Introduce Horas:");
        horas = sc.nextInt();
        System.out.println("Introduce Minutos:");
        minutos = sc.nextInt();
        System.out.println("Introduce Segundos:");
        segundos = sc.nextInt();
        System.out.println("Introduce los segundos a incrementar:");
        segundosIncremen = sc.nextInt();

        System.out.println("Aumentando la hora....");

        for (int i=0;i<segundosIncremen;i++){
            segundos+=1;
            if (segundos==60){
                minutos+=01;
                segundos=00;
                if (minutos==60){
                    horas+=01;
                    minutos=00;
                    if (horas==24){
                        horas=00;
                    }
                }
            }
            System.out.println(horas+":"+minutos+":"+segundos);
        }
    }
}
