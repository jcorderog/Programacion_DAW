package Tareas.Tarea8_U8;

public class Asignatura {
    private int id;
    private String nombre;
    private int alumnoId;

    public Asignatura(int id, String nombre, int alumnoId) {
        this.id = id;
        this.nombre = nombre;
        this.alumnoId = alumnoId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alumnoId=" + alumnoId +
                '}';
    }
}
