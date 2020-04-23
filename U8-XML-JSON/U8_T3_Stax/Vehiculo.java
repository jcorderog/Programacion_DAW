package com.company.Tarea3_Uso_de_Stax;


public class Vehiculo {
    private int id;
    private String marca;
    private TipoVehiculo tipo;
    private Colores color;
    private String potencia;

    public Vehiculo(int id, TipoVehiculo tipo, String marca, Colores color, String potencia) {
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public Colores getColor() {
        return color;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
