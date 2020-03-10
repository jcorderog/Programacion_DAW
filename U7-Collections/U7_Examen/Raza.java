package com.jorge;

import java.util.*;

public class Raza {

    private String nombre;
    private List<Perro> perros = new ArrayList<>();

    public Raza(String nombre, List<Perro> perros) {
        this.nombre = nombre;
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    public void addPerro (Perro p) {
        this.perros.add(p);
    }

    public void removePerro (Perro p){
        this.perros.remove(p);
    }

    public Set<String> dueñosPerros (){
        Iterator it = perros.iterator();
        Set<String> numSocios = new HashSet<>();

        while (it.hasNext()){
            Perro p = (Perro) it.next();
            numSocios.add(p.getPropietario().getNumSocio());
        }
        return numSocios;
    }

    @Override
    public String toString() {
        String result = "";
        Iterator it = perros.iterator();
        while (it.hasNext()) {
            Perro p =(Perro) it.next();
            result += p.toString();
        }
        return "Raza{" +
                "nombre='" + nombre + '\'' +
                ", perros=" + result+'}';
    }
}
