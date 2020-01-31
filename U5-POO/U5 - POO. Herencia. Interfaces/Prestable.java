package com.jorge.PracticasClase.E_Clase_Biblioteca;

public interface Prestable {

    //Cuando no esta relleno de por si hay que implementarlo en el hijo,
    // por eso le pongo public y no default a estaPrestado, si no hay
    // que ponerle default para que sea obligatorio que lo implemente el hijo.

    default void presta(){
    }

    default void devuelve(){
    }

    public boolean estaPrestado();
}
