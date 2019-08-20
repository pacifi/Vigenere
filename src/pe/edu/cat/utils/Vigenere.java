package pe.edu.cat.utils;

import javax.swing.*;

public class Vigenere {
    char[] mensaje;
    char[] clave;
    char[] resultado;
    char[][] matriz;

    public void cifrar(String msg, String clave) {

        //Genera el menasje cifrado


        System.out.println(msg + "  " + clave);

        this.mensaje = msg.toCharArray();
        char[] claveTemp = clave.toCharArray();

        this.clave = new char[this.mensaje.length];

        int cont = 0;
        for (int i = 0; i < mensaje.length; i++)//For mete la clave multiples veces en 1 arreglo
        {
            this.clave[i] = claveTemp[cont];
            cont++;
            if (cont == claveTemp.length)
                cont = 0;

        }
        Abecedario abecedario = new Abecedario();
        this.matriz = abecedario.generaAbcMatriz();

        int i;
        int j;
        char[] cifrado = new char[mensaje.length];

        for (int conta = 0; conta < mensaje.length; conta++) {
            i = (int) this.mensaje[conta] - 97; //restamos 97 para pasar de codigo ascii a un numero entero

            j = (int) this.clave[conta] - 97;

            cifrado[conta] = this.matriz[i][j];
        }
        this.resultado = cifrado;

        System.out.println("Su mensaje cifrado es  ");
        System.out.println("=====================");
        System.out.println(this.resultado);
        System.out.println("=====================");

    }

    public void decifrar(String msg, String clave) {
        System.out.println("======Decifrado========");

        Abecedario abecedario = new Abecedario();

        char[] abc = abecedario.generarAbecedario();
        char[][] matriz = abecedario.generaAbcMatriz();

        this.mensaje = msg.toCharArray();
        char[] claveTemp = clave.toCharArray();

        this.clave = new char[this.mensaje.length];

        int cont = 0;
        for (int i = 0; i < mensaje.length; i++)//For mete la clave multiples veces en 1 arreglo
        {
            this.clave[i] = claveTemp[cont];
            cont++;
            if (cont == claveTemp.length)
                cont = 0;

        }


        char[] decifrado = new char[mensaje.length];
        for (int j = 0; j < this.mensaje.length; j++) {
            int indiceClave = retornarIndiceAbc(abc, this.clave[j]);
            char[] vectorClave = generaVectorClave(matriz, indiceClave);
            decifrado[j] = abc[retornaIndiceCombinado(vectorClave, this.mensaje[j])];
        }

        System.out.println("su mensaje descifrado es:");
        System.out.println("=====================");
        System.out.println(decifrado);
        System.out.println("=====================");
    }

    public int retornaIndiceCombinado(char[] vectorClave, char caracter) {

        int dato = 0;
        for (int i = 0; i < vectorClave.length; i++) {

            if (vectorClave[i] == caracter) {
                dato = i;
            }
        }
        return dato;
    }


    public char[] generaVectorClave(char[][] matriz, int indiceClave) {
        char[] claveVector = new char[26];
        for (int i = 0; i < claveVector.length; i++) {
            claveVector[i] = matriz[i][indiceClave];
        }
        return claveVector;
    }

    public int retornarIndiceAbc(char[] abc, char caracter) {
        int dato = 0;
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] == caracter) {
                dato = i;
            }
        }
        return dato;

    }


}
