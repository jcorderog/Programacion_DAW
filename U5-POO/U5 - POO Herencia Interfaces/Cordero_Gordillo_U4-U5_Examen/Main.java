package com.jorge;

public class Main {

    public static void main(String[] args) {


        Personaje[] personajes = new Personaje[6];

        Orcos orco1 = new Orcos("Gumber",1000,50,80,150.2);
        Magos mago1 = new Magos("Merlín",500,60,80,5);
        Guerreros guerrero1 = new Guerreros("Mike",800,70,70,26);
        Enanos enano1 = new Enanos("Poppy",750,50,90,1.5);
        Elfos elfo1 = new Elfos("Toby",200,90,60,TipoElfo.BOSQUE);
        Enanos enano2 = new Enanos("Tristana",300,100,50,1.3);

        personajes[0] = orco1;
        personajes[1] = mago1;
        personajes[2] = guerrero1;
        personajes[3] = enano1;
        personajes[4] = elfo1;
        personajes[5] = enano2;

        RPG partida = new RPG(personajes);

        System.out.println("Cantidad de Personajes: "+partida.getCantidadPersonajes());

        System.out.println("Estado Actual: ");

        partida.mostrarEstado();

        System.out.println("------------------------------------------------------"+'\n'+"Ordenado por Capacidad de Ataque:");

        partida.mostrarxAtaque();

        System.out.println("------------------------------------------------------"+'\n'+"Ordenado por Capacidad de Defensa:");

        partida.mostrarxDefensa();

        System.out.println("------------------------------------------------------"+'\n'+"Ataques: ");

        enano2.atacarPersonaje(personajes[1]);
        guerrero1.atacarPersonaje(personajes[1]);
        enano2.atacarPersonaje(personajes[1]);
        enano2.atacarPersonaje(personajes[1]);
        enano2.atacarPersonaje(personajes[1]);
        guerrero1.atacarPersonaje(personajes[1]);
        guerrero1.atacarPersonaje(personajes[1]);
        guerrero1.atacarPersonaje(personajes[1]);

        partida.borrarMuertos(1);

        partida.mostrarEstado();





    }
}
