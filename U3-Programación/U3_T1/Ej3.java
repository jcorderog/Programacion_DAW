package com.jorge;

public class Ej3 {
    public static int[] filtrarCon7(int[] v){

        int cont=0;
        int aux=0;


        for (int i = 0; i < v.length; i++) {
            aux=v[i];
            while(aux!=0){
                if (aux%10==7){
                    cont++;
                }
                aux=aux/10;
            }
        }
        int[] numConSiete = new int[cont];
        int j=0;
        for (int i=0;i<v.length;i++){
            aux=v[i];
            while(aux!=0){
                if (aux%10==7){
                    numConSiete[j]=v[i];
                    j++;
                }
                aux=aux/10;
            }
        }

        return numConSiete;

    }
    public static void main(String[] args) {
        int[] numeros = {17,4,77,88,92,879,879};

        for (int i=0;i<filtrarCon7(numeros).length;i++){
            System.out.println(filtrarCon7(numeros)[i]);
        }

    }
}
