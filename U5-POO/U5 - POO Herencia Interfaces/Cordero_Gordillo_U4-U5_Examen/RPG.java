package com.jorge;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {

    private Personaje[] personajes;
    private int cantidadPersonajes = 0;

    public RPG(Personaje[] personajes) {
        this.personajes = new Personaje[10];
        this.personajes = personajes;
        this.cantidadPersonajes = this.personajes.length;
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personaje[] personajes) {
        if (this.cantidadPersonajes < 10) {
            this.personajes = personajes;
        } else {
            System.out.println("No puedes crear más de 10 personajes.");
        }
    }

    public void borrarMuertos(int posicion){
        if (this.personajes[posicion].getEnergia() <= 0) {
            System.out.println("Borrando personaje...");
            for (int i = posicion; i < this.cantidadPersonajes-1; i++) {
                if (i != this.cantidadPersonajes-1){
                    this.personajes[i] = this.personajes[i+1];
                } else {
                    this.personajes[i] = null;
                }
            }
            cantidadPersonajes--;
            System.out.println("Personaje eliminado.");
        } else {
            System.out.println("El personaje tiene energía aún.");
        }
    }

    public void mostrarEstado(){
        Arrays.sort(this.personajes);

        System.out.println(Arrays.toString(this.personajes));
    }

    public void mostrarxAtaque(){
        Arrays.sort(this.personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadAtaque() - t1.getCapacidadAtaque();
            }
        });

        System.out.println(Arrays.toString(this.personajes));
    }

    public int getCantidadPersonajes() {
        return cantidadPersonajes;
    }

    public void mostrarxDefensa(){
        Arrays.sort(this.personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadDefensa() - t1.getCapacidadDefensa();
            }
        });
        System.out.println(Arrays.toString(this.personajes));
    }

    public void hayGanador (){
        if (cantidadPersonajes == 1){
            System.out.println("El ganador es:"+'\n'+this.personajes.toString());
        }
    }
}
