package com.jorge;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase;
        int contVocales = 0;

        System.out.println("Introduce una frase de la cual te diremos la cantidad de vocales que contiene:");
        frase = sc.nextLine();

        frase.toLowerCase();

        //Recorro la frase y comparo las letras, si son vocales sumo 1 en el contador y si no nada.
        for (int i = 0;i<frase.length();i++){
            if (frase.charAt(i)=='a' || frase.charAt(i)=='e' ||
                    frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u'){
                contVocales++;
            }
        }

        System.out.println("La frase contiene "+contVocales+" vocales");

    }
}
