package com.jorge;

public class Ej4 {
    public static String convierteArrayEnString(int[] v){
        String cadena = "";

        for (int i = 0;i<v.length;i++){
            cadena+=v[i];
        }
        return cadena;
    }
    public static void main(String[] args) {

        int [] v1 = {1,2,3,4,5,6,7,8,9};

        System.out.println("El vector en una cadena es: "+convierteArrayEnString(v1));

    }
}
