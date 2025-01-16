/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;
import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;

/**
 *
 * @author utpl
 */
public class Imprimir {
    public static void imprimirMensaje(int a , int b , int sum , int mult){
        System.out.printf("La suma de %d + %d es igual a: %d\n"
                + "La multiplicacion de %d * %d es igual a: %d\n",
                a,b,
                sum,
                a, b,
                mult);
    
    }
    
}
