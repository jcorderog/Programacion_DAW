package com.jorge;

import java.util.*;

public class Concurso {

    private Set<Raza> razas = new HashSet<>();

    public Concurso(Set<Raza> razas) {
        this.razas = razas;
    }

    public void addDog(String raza, Perro perro){
        if (!raza.equals(perro.getRaza())) {
            System.out.println("El perro no es de raza: "+raza);
        } else {
            Iterator it= razas.iterator();

            while (it.hasNext()){
                Raza r = (Raza) it.next();
                if (r.getNombre().equals(raza)){
                    r.addPerro(perro);
                    break;
                }
            }

            System.out.println("Se añadio correctamente.");
        }
    }

    public void discualifyDog(Perro perro) {

        Iterator it= razas.iterator();
        boolean inscrito = false;

        while (it.hasNext()) {
            Raza r = (Raza) it.next();
            if (!r.getPerros().contains(perro)) {
                inscrito = false;
            } else {
                inscrito = true;
                r.removePerro(perro);
            }
        }
        if (!inscrito) {
            System.out.println("Perro no inscrito.");
        } else {
            System.out.println("Se elimino correctamente.");
        }
    }

    public void ownerDogs(String numSocio){

        Iterator it= razas.iterator();
        boolean tienePerro = false;

        while (it.hasNext()) {
            Raza r = (Raza) it.next();
            if (!r.dueñosPerros().contains(numSocio)) {
                tienePerro = false;
            } else {
                tienePerro = true;
                break;
            }
        }

        if (!tienePerro){
            System.out.println("Este socio no tiene perros inscritos");
        } else {
            Iterator it2 = razas.iterator();
            while (it2.hasNext()){
                Raza r = (Raza) it2.next();
                Iterator it3 = r.getPerros().iterator();
                while (it3.hasNext()){
                    Perro p = (Perro) it3.next();
                    if (p.getPropietario().getNumSocio().equals(numSocio)){
                        System.out.println("Propietario: "+numSocio+" "+p.toString());
                    }
                }
            }
        }
    }

    public void perrosporPeso(Raza r){
        Iterator it = razas.iterator();

        while (it.hasNext()){
            Raza r2 = (Raza) it.next();
            if (r2.getNombre().equals(r)){
                List<Perro> perross = r2.getPerros();
                perross.sort(new Comparator<Perro>() {
                    @Override
                    public int compare(Perro perro, Perro t1) {
                        return perro.getEdad() - t1.getEdad();
                    }
                });

                r2.setPerros(perross);
                System.out.println(r2.toString());
                break;
            }
        }


    }

}
