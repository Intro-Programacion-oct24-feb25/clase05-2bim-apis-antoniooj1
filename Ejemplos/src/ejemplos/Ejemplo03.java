/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;
// import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeroElementos = 20;
        int limite = 100;
        int[] valores = obtenerValores(numeroElementos, limite);

        presentarDatos(valores);

    }

    public static void presentarDatos(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d\n", v[i]);
        }
    }

    public static int[] obtenerValores(int a, int b) {
        // objeto generador de números aleatorios
        int[] arreglo = new int[a];
        SecureRandom numerosAleatorios = new SecureRandom();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = obtenerNumero(b);
        }
        return arreglo;
    }

    public static int obtenerNumero(int milimite) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();

        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(milimite);
        return valorAleatorio;
    }

}

