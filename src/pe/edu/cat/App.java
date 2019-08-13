package pe.edu.cat;

import pe.edu.cat.utils.Abecedario;
import pe.edu.cat.utils.Vigenere;

public class App {

    char[][] matriz;

    public static void main(String[] args) {
        Abecedario abc = new Abecedario();

        char[][] matriz;

        matriz = abc.generaAbcMatriz();

//        for (int k = 0; k < 26; k++)
//            System.out.println(matriz[k]);
//

        Vigenere vi = new Vigenere();
        vi.cifrar("hermoso", "cielo");



        vi.decifrar("jmvxcuw", "cielo");


    }

}
