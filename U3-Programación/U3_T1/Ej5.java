package com.jorge;

public class Ej5 {
    public static int aleatorioDeArray(int[] v){

        return v[(int)(Math.random()*v.length)];

    }

    public static void main(String[] args) {
        int[] v = {111,222,333,444};

        System.out.println("El número aleatorio del vector es: "+aleatorioDeArray(v));
    }
}
