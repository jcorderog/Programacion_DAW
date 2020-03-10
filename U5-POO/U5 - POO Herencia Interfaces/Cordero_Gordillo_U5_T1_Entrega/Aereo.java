package com.jorge;

public abstract class Aereo extends Vehiculo{

    private double altitud;
    private String OACI;

    /**
     * Constructor de vehículo.
     * @param nombre       = Nombre a asignar.
     * @param numCapacidad = Número de personas.
     */
    public Aereo(String nombre, int numCapacidad, double altitud, String OACI) {
        super(nombre, numCapacidad);
        this.altitud = altitud;
        this.OACI = OACI;
    }

    public double getAltitud() {
        return altitud;
    }

    public String getOACI() {
        return OACI;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public void setOACI(String OACI) {
        this.OACI = OACI;
    }

    /**
     * Devuelve la información de la Aereonave.
     * @return
     */

    @Override
    public String toString() {
        return super.toString() +'\''+
                ", altitud= " + altitud+ "m" +
                ", OACI='" + OACI ;
    }
}
