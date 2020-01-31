package com.jorge.PracticasClase.E_Clase_Biblioteca;

import java.util.Objects;

public abstract class Publicacion {

    /**
     *
     */

    private String ISBN;
    private String titulo;
    private int añoPublicacion;

    /**
     * Constructor de la Clase Abstracta.
     * @param ISBN = Nuevo ISBN del libro o revista.
     * @param titulo = Nuevo título del libro o revista.
     * @param añoPublicacion = Año de publicación del libro o revista.
     */

    public Publicacion(String ISBN, String titulo, int añoPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * Muestra la información de la publicación del libro o Revista, los atributos comunes.
     * @return devuelve una cadena.
     */

    @Override
    public String toString() {
        return "    ISBN: "+this.ISBN+"\n"+"    Título: "+this.titulo+"\n"+
                "    Año Publicación: "+this.añoPublicacion+"\n";
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    /**
     * Compara dos publicaciones por el ISBN
     * @param o = Publicación a comparara con la actual.
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return getISBN().equals(that.getISBN());
    }
}
