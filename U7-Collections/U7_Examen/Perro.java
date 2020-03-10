package com.jorge;

public class Perro {

    private String nombre;
    private int edad;
    private double peso;
    private boolean todasVacunas;
    private Propietario propietario;
    private String raza;

    public Perro(String nombre, int edad, double peso, boolean todasVacunas, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.todasVacunas = todasVacunas;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isTodasVacunas() {
        return todasVacunas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTodasVacunas(boolean todasVacunas) {
        this.todasVacunas = todasVacunas;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", todasVacunas=" + todasVacunas +
                ", raza='" + raza +
                ", propietario=" + propietario.toString() + '\'';
    }
}
