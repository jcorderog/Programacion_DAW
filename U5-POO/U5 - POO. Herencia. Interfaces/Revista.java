package com.jorge.PracticasClase.E_Clase_Biblioteca;

public class Revista extends Publicacion implements Comparable {

    private int num;

    public Revista(String ISBN, String titulo, int añoPublicacion, int numRevista) {
        super(ISBN, titulo, añoPublicacion);
        this.num = numRevista;
    }

    /**
     * Sobre escribe el to string de Publicación y añade datos.
     * @return
     */

    @Override
    public String toString() {
        return "Revista: "+"\n"+super.toString()+"    Número Revista: "+this.num;
    }

    /**
     * Compara dos revistas mediante el ISBN, para despues poder ser ordenadas. Pertenece a la Interfaz COMPARABLE.
     * @param o = Otra Revista introducida.
     * @return
     */

    @Override
    public int compareTo(Object o) {
        return getISBN().compareTo(((Revista)o).getISBN());
    }
}
