package com.jorge;

public class Avioneta extends Aereo{
    /**
     * Constructor de vehículo.
     *
     * @param nombre       = Nombre a asignar.
     * @param numCapacidad = Número de personas.
     * @param altitud
     * @param OACI
     */
    public Avioneta(String nombre, int numCapacidad, double altitud, String OACI) {
        super(nombre, numCapacidad, altitud, OACI);
    }
}
