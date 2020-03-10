package com.jorge;

public abstract class Hombre extends Personaje{
    public Hombre(String nombre, int energia, int capacidadAtaque, int capacidadDefensa,String tipoPersonaje) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa,tipoPersonaje);
    }


    @Override
    public String toString() {
        return super.toString()+"Hombre{";
    }
}
