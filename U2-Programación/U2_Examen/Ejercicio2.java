package com.jorge;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int posicion;
        int longitudNum = 0;
        int aux = 0;

        System.out.println("Por favor, introduzca un número entero positivo:");
        num = sc.nextInt();

        aux=num;

        //Calculo la longitud del número introducido
        while (aux!=0){
            aux = aux/10;
            longitudNum++;
        }

        //Le he puesto las condiciones que me dice en el ejercicio.
        if (num<10){
            System.out.println("El número tieme menos de dos dígitos.");

            System.out.println("Por favor, introduzca un número entero positivo:");
            num = sc.nextInt();
        } else {
            System.out.println("Introduzca la posición a partir de la cual quiere partir el número:");
            posicion = sc.nextInt();
            posicion=posicion-1;

            if (posicion < 2 || posicion > longitudNum){
                System.out.println("La posición introducida no es correcta.");
            } else if (longitudNum==0){
                System.out.println(num);
            } else {
                aux=num;
                for (int i=0;i<longitudNum-posicion; i++){
                    aux = aux/10;
                }
                System.out.print("Los números partidos son el "+aux);
                for (int i=0;i<longitudNum-posicion;i++){
                    aux = aux*10;
                }
                System.out.println(" y el "+(num-aux));
            }
        }
    }
}
