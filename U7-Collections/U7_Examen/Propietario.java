package com.jorge;

public class Propietario {

    private String nombre;
    private String apellidos;
    private String numSocio;
    private String pais;

    public Propietario(String nombre, String apellidos, String numSocio, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSocio = numSocio;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumSocio() {
        return numSocio;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numSocio='" + numSocio + '\'' +
                ", pais='" + pais + '\'' +
                "}}";
    }
}
