package Tareas.Tarea7_U8;

public class Futbolista {
    private int id;
    private String nombre;
    private String equipo;
    private Estadisticas estadisticas;

    public Futbolista(int id, String nombre, String equipo, int goles, int pases, int faltas) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.estadisticas = new Estadisticas(goles,pases,faltas);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setId(int dorsal) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", " + estadisticas.toString() +
                '}';
    }
}
