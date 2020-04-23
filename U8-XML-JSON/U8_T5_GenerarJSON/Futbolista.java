package Tareas.Tarea5_U8;

import java.util.ArrayList;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private ArrayList<String> pocisiones;
    private String equipo;

    public Futbolista(int dorsal, String nombre, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.pocisiones = new ArrayList<>();
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPocisiones() {
        return pocisiones;
    }

    public void addPosicion (String pos) {
        pocisiones.add(pos);
    }

    public String getEquipo() {
        return equipo;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPocisiones(ArrayList<String> pocisiones) {
        this.pocisiones = pocisiones;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", pocisiones=" + pocisiones +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
