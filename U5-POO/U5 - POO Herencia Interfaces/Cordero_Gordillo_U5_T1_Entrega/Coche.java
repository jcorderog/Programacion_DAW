package com.jorge;

public class Coche extends Terrestres {

    /**
     * Extiendo terrestre y me llevo el constructor de Terrestre.
     * @param nombre
     * @param numPersonas
     * @param matricula
     * @param año
     * @param c
     */

    public Coche(String nombre, int numPersonas, String matricula, int año, Color c) {
        super(nombre, numPersonas, matricula, año, c);
    }
}
