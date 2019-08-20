package pe.edu.cat;

import pe.edu.cat.utils.Abecedario;
import pe.edu.cat.utils.Vigenere;

import java.util.Scanner;


public class App {

    char[][] matriz;

    public static void main(String[] args) {
        Abecedario abc = new Abecedario();

        char[][] matriz;

        matriz = abc.generaAbcMatriz();

//        for (int k = 0; k < 26; k++)
//            System.out.println(matriz[k]);
//


        System.out.println("=========== Sistema Criptografico =====================");
        System.out.println("============ CAT ==============================");
        System.out.println("============ Vigenere ============================== \n\n\n");


        Scanner teclado;

        int opc;
        do {

            System.out.println("Ingrese una opción");
            System.out.println("0: Cifrar");
            System.out.println("1: Decifrar");
            System.out.println("Otro: Salir");
            System.out.print("Ingrese opción:   ");
            teclado = new Scanner(System.in);
            opc = teclado.nextInt();
            teclado.nextLine();

            if (opc == 0) {

                System.out.println("======== Cifrando ==============");
                System.out.print("Ingrese mensaje:");
                new Scanner(System.in);
                String mensaje = teclado.nextLine();

                System.out.println("\n");
                System.out.print("Ingrese clave:   ");
                new Scanner(System.in);
                String clave = teclado.nextLine();
                Vigenere vi = new Vigenere();
                vi.cifrar(mensaje, clave);
            }

            if (opc == 1) {
                System.out.println("======== Decifrando ==============");
                System.out.print("Ingrese mensaje:   ");
                String mensaje = teclado.nextLine();
                System.out.println("\n");
                System.out.print("Ingrese clave:   ");
                String clave = teclado.nextLine();
                Vigenere vi = new Vigenere();
                vi.decifrar(mensaje, clave);
            }


        } while (opc < 2);


    }

}
