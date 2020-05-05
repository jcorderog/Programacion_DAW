package Tareas.Tarea7_U8;

public class Estadisticas {
    private int goles;
    private int pases;
    private int faltas;

    public Estadisticas(int goles, int pases, int faltas) {
        this.goles = goles;
        this.pases = pases;
        this.faltas = faltas;
    }

    public int getGoles() {
        return goles;
    }

    public int getPases() {
        return pases;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "goles=" + goles +
                ", pases=" + pases +
                ", faltas=" + faltas +
                '}';
    }
}
