package com.jorge;

public class Elfos extends Personaje implements Atacar{

    private TipoElfo tipo;


    public Elfos(String nombre, int energia, int capacidadAtaque, int capacidadDefensa, TipoElfo tipo) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa,"Elfo");
        this.tipo = tipo;

    }

    @Override
    public String toString() {
        return super.toString()+"Elfos{" +
                "tipo=" + tipo +
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
