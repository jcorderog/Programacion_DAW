package com.company.Tarea2_Modificacion_DOM;

public class Vehiculo {

    private TipoVehiculo Tipo;
    private String Marca;
    private Colores Color;
    private String potencia;

    public Vehiculo(TipoVehiculo tipo, String marca, Colores color, String potencia) {
        this.Tipo = tipo;
        this.Marca = marca;
        this.Color = color;
        this.potencia = potencia;
    }

    public TipoVehiculo getTipo() {
        return Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public Colores getColor() {
        return Color;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setTipo(TipoVehiculo tipo) {
        Tipo = tipo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setColor(Colores color) {
        Color = color;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
