package com.jorge.PracticasClase.E_Clase_Biblioteca;

public class Enciclopedia extends Publicacion{

    private int numTomos;

    /**
     * Constructor de la Clase Abstracta.
     *
     * @param ISBN           = Nuevo ISBN del libro o revista.
     * @param titulo         = Nuevo título del libro o revista.
     * @param añoPublicacion = Año de publicación del libro o revista.
     */
    public Enciclopedia(String ISBN, String titulo, int añoPublicacion, int tomos) {
        super(ISBN, titulo, añoPublicacion);
        this.numTomos = tomos;
    }


}
