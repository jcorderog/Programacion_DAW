package com.jorge.PracticasClase.E_Clase_Biblioteca;

import java.util.Comparator;

public class Libro extends Publicacion implements Prestable, Comparable{

    /**
     *
     */

    private boolean prestado;

    /**
     * Constructor de Libro.
     * @param ISBN
     * @param titulo
     * @param añoPublicacion
     */
    public Libro(String ISBN, String titulo, int añoPublicacion) {
        super(ISBN, titulo, añoPublicacion);
        this.prestado = false;
    }

    /**
     * Sobre escribe el to string de Publicación y añade datos.
     * @return
     */

    @Override
    public String toString() {
        return "Libro: "+"\n"+super.toString()+"    Prestado: "+this.prestado;
    }

    @Override
    public void presta() {
        this.prestado = true;
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    /**
     * Compara dos libros mediante el Título, para despues poder ser ordenadas. Pertenece a la Interfaz COMPARABLE.
     * @param o = Otro libro introducido.
     * @return
     */

    @Override
    public int compareTo(Object o) {
        Libro l = (Libro)o;
        return getTitulo().compareTo(l.getTitulo());
    }
}
