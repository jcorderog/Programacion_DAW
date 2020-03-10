package com.jorge;

public abstract class Personaje implements Comparable{

    private String nombre;
    private int energia;
    private int capacidadAtaque;
    private int capacidadDefensa;
    private boolean encantado;
    private String tipoPersonaje;

    public Personaje(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, String tipoPersonaje) {
        this.nombre = nombre;
        if (energia<= 1000 && energia > 0) {
            this.energia = energia;
        }
        if (capacidadAtaque<= 100 && capacidadAtaque > 0) {
            this.capacidadAtaque = capacidadAtaque;
        }
        if (capacidadDefensa<= 100 && capacidadDefensa > 0) {
            this.capacidadDefensa = capacidadDefensa;
        }
        this.encantado = false;
        this.tipoPersonaje = tipoPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public int getCapacidadAtaque() {
        return capacidadAtaque;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public boolean isEncantados() {
        return encantado;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setEncantados(boolean encantado) {
        this.encantado = encantado;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public int compareTo(Object o) {
        Personaje p2 = (Personaje)o;
        return this.getEnergia() - p2.getEnergia();
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre= '" + nombre + '\'' +
                ", energia= " + energia +
                ", capacidadAtaque= " + capacidadAtaque +
                ", capacidadDefensa= " + capacidadDefensa +
                ", encantado= " + encantado+", ";
    }
}
