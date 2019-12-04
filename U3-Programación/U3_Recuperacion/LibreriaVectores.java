package com.jorge;

public class LibreriaVectores {
    public static String[] invertir(String cad) {

        String[] resultado = new String[cad.length()];
        int cont = cad.length() - 1;

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = String.valueOf(cad.charAt(cont));
            resultado[i] = resultado[i].toUpperCase();
            cont--;
        }

        return resultado;
    }

    public static String[] desplazarVocales(String cad) {
        String[] resultado = new String[cad.length()];
        int cont = 0;

        for (int i = 0; i < resultado.length; i++) {
            switch (cad.charAt(cont)){
                case 'a':
                    resultado[i] = "e";
                    break;
                case 'e':
                    resultado[i] = "i";
                    break;
                case 'i':
                    resultado[i] = "o";
                    break;
                case 'o':
                    resultado[i] = "u";
                    break;
                case 'u':
                    resultado[i] = "a";
                    break;
                default:
                    resultado[i] = String.valueOf(cad.charAt(cont));
            }
            cont++;
        }
        return resultado;
    }
}
