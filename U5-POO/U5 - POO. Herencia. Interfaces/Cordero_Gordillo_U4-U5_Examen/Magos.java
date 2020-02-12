package com.jorge;

public class Magos extends Hombre implements Magia{

    private double longitudBarba;


    public Magos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, double lonBarba) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa,"Mago");
        this.longitudBarba = lonBarba;
    }

    @Override
    public String toString() {
        return super.toString()+"Magos{" +
                "longitudBarba=" + longitudBarba +
                '}'+'}'+'}';
    }
}
