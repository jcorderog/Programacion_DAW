package com.jorge;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0;
        int[] mesa = new int[10];
        boolean mesaVacia= false;
        boolean sienta = false;

        for (int i=0;i<mesa.length;i++){
            mesa[i]=(int)(Math.random()*4+1);
        }
        System.out.println();

        while (num!=-1){
            for (int i=0;i<mesa.length;i++){
                System.out.print("| Mesa "+(i+1)+": "+mesa[i]+"|");
            }
            System.out.println();
            if (num<=4){
                System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
                num = sc.nextInt();
            } else {
                while (num>4){
                    System.out.println("Lo siento, no admitimos grupos de"+num+", haga grupos de 4 personas como máximo e intente de nuevo");
                    System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
                    num = sc.nextInt();
                }
            }
            if (num==-1){
                break;
            }
            for (int i=0;i<mesa.length;i++){
                if (mesa[i]==0){
                    mesaVacia=true;
                    System.out.println("Por favor, siéntense en la mesa número "+(i+1));
                    mesa[i]+=num;
                    break;
                }
            }
            if (!mesaVacia){
                for (int i=0;i<mesa.length;i++){
                    if (!mesaVacia && mesa[i]+num<=4){
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1)+".");
                        sienta=true;
                        mesa[i]+=num;
                        break;
                    }
                }
                if (!mesaVacia && !sienta){
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                }
            }
        }
        System.out.println("Gracias. Hasta pronto.");
    }
}
