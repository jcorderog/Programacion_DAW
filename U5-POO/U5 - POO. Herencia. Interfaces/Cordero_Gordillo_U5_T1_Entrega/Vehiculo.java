package com.jorge;

import java.util.Objects;

public abstract class Vehiculo {

    private String nombre;
    private int numCapacidad;
    private int cantTransporta;

    /**
     * Constructor de vehículo.
     * @param nombre = Nombre a asignar.
     * @param numCapacidad = Número de personas.
     */

    public Vehiculo(String nombre, int numCapacidad) {
        this.nombre = nombre;
        this.numCapacidad = numCapacidad;
        this.cantTransporta = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPersonas() {
        return numCapacidad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPersonas(int numPersonas) {
        this.numCapacidad = numPersonas;
    }

    public int getCantTransporta() {
        return cantTransporta;
    }

    /**
     * Introduce una cantidad de personas al vehículo. si la capacidad es menor
     * que el número de personas que van a entrar devuelve False.
     * @param cantidad = Cantidad de personas que van a entrar.
     * @return
     */

    public boolean trasnportar(int cantidad){
        if (cantidad+cantTransporta <= numCapacidad){
            this.cantTransporta = cantidad;
            return true;
        }
        return false;
    }

    /**
     * Compara dos cehículos por su nombre.
     * @param o = vehículo a comparar.
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return getNombre().equals(vehiculo.getNombre());
    }

    /**
     * Devuelve una cadena con la información del vehículo.
     * @return
     */

    @Override
    public String toString() {
        return '\n'+"Tipo= "+getClass().getSimpleName()+'\''+
                ", nombre='" + nombre + '\'' +
                ", Capacidad=" + numCapacidad+'\''+
                ", Personas que Transporta=" + cantTransporta+'\'';
    }
}
