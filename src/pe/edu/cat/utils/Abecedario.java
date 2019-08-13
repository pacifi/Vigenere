package pe.edu.cat.utils;

import java.lang.reflect.Array;

public class Abecedario {


    public char[][] generaAbcMatriz() {
        int contador;
        char abcTemp[] = this.generarAbecedario();
        char abc[] = new char[abcTemp.length * 2];
        for (int c = 0; c < 26; c++) {
            abc[c] = abcTemp[c];
            abc[c + 26] = abcTemp[c];
        }
        char[][] matriz = new char[26][26];
        for (int i = 0; i < 26; i++) {
            contador = 0;
            for (int j = 0; j < 26; j++) {
                matriz[i][j] = abc[contador + i];
                contador++;
            }
        }
        return matriz;


    }

    public char[] generarAbecedario() {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',  'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};
        return abc;
    }



}
