package com.jorge;

import java.util.Scanner;

public class U3Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] tablero = new String[8][8];
        int x=0;
        int y = 0;
        String posicion;

        System.out.println("Introduce la posición:");
        posicion=sc.next();

        for (int i = 0; i < posicion.length(); i++) {
            if (i==0){
                switch (posicion.charAt(i)){
                    case 'a':
                        x=0;
                        break;
                    case 'b':
                        x=1;
                        break;
                    case 'c':
                        x=2;
                        break;
                    case 'd':
                        x=3;
                        break;
                    case 'e':
                        x=4;
                        break;
                    case 'f':
                        x=5;
                        break;
                    case 'g':
                        x=6;
                        break;
                    case 'h':
                        x=7;
                        break;
                }
            } else {
                switch (posicion.charAt(i)){
                    case '1':
                        y=0;
                        break;
                    case '2':
                        y=1;
                        break;
                    case '3':
                        y=2;
                        break;
                    case '4':
                        y=3;
                        break;
                    case '5':
                        y=4;
                        break;
                    case '6':
                        y=5;
                        break;
                    case '7':
                        y=6;
                        break;
                    case '8':
                        y=7;
                        break;
                }
            }
        }


        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i==y-1 && j==x-1){
                    tablero[i][j]="X";
                } else if (j==x-1 || i==y-1){
                    tablero[i][j]="*";
                } else {
                    tablero[i][j]=" ";
                }
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        System.out.println("Puedes mover a las siguientes posiciones:");

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j]=="*"){
                    System.out.print("("+(i+1)+","+(j+1)+")");
                }
            }
        }
    }
}
