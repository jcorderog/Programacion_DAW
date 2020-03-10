package com.jorge;

public class Enanos extends Personaje implements Atacar{

    private double altura;


    public Enanos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, double altura) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa,"Enano");
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString()+"Enanos{" +
                "altura=" + altura +
                '}'+'}';
    }

    @Override
    public void atacarPersonaje(Personaje p1) {
        System.out.println(this.getNombre()+" - ATACANDO A "+p1.getNombre());
        int energiaActual = p1.getEnergia();
        if (!this.getTipoPersonaje().equals(p1.getTipoPersonaje())){
            if (p1.isEncantados()){
                p1.setEnergia(energiaActual-((this.getCapacidadAtaque()-p1.getCapacidadDefensa()))*2);
                System.out.println(p1.getNombre()+" - -"+(energiaActual-(energiaActual-((this.getCapacidadAtaque()-p1.getCapacidadDefensa()))*2))+" De Energía");
            } else {
                p1.setEnergia(energiaActual-(this.getCapacidadAtaque()-p1.getCapacidadDefensa()));
                System.out.println(p1.getNombre()+" - -"+(energiaActual-(energiaActual-(this.getCapacidadAtaque()-p1.getCapacidadDefensa()))+" De Energía"));
            }
        } else {
            System.out.println("Es del mismo tipo: "+p1.getNombre()+" - -0 de Energía");
        }
    }
}
