package PruebaEntregable;

public class Ingrediente {
    private String nombre;
    private int calorias;

    public Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

    public Ingrediente(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalorias() {
        return calorias;
    }
}
