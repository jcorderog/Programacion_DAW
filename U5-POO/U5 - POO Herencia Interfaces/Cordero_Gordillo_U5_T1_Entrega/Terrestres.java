package com.jorge;

import java.util.Objects;

public abstract class Terrestres extends Vehiculo implements Comparable{

    private String matricula;
    private int añoFabricacion;
    private Color color;

    /**
     * Constructor de terrestre.
     * @param nombre = Nombre
     * @param numPersonas = Número de personas que caben
     * @param matricula = Matrícula
     * @param año = Año de Fabricación
     * @param c = Color
     */

    public Terrestres(String nombre, int numPersonas, String matricula, int año, Color c) {
        super(nombre, numPersonas);
        this.matricula = matricula;
        this.añoFabricacion = año;
        this.color = c;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public Color getColor() {
        return color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Compara dos vehículos terrestres por la matrícula.
     * @param o = vehículo a comparar.
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Terrestres that = (Terrestres) o;
        return matricula.equals(that.matricula);
    }

    /**
     * Devuelve la infromación del vehículo Terrestre.
     * @return
     */

    @Override
    public String toString() {
        return  super.toString()+'\''+
                ", matricula='" + matricula + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", color=" + color;
    }

    /**
     * Compara para ordenar los Vehículos Terrestres por Matrícula.
     * @param o
     * @return
     */

    @Override
    public int compareTo(Object o) {
        Terrestres l = (Terrestres) o;
        return getMatricula().compareTo(l.getMatricula());
    }
}
