package com.jorge;

public interface Magia {
    static void encantar(Personaje p1){
        p1.setEncantados(true);
    }

    static void desencantar(Personaje p1){
        p1.setEncantados(false);
    }

}
