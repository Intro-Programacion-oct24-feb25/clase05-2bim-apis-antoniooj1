/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.DatoTrabajo;
import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direccionE;
        double[] misNotas;
        double promedio;
        double mejorNota;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        empresa = DatoTrabajo.obtenerEmpresa();
        direccionE = DatoTrabajo.obtenerDireccion();
                
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        mejorNota = DatoFinal.obtenerMejorNota(misNotas);
        
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Nombre de la empresa: %s\n"
                + "Direccion de la empresa: %s\n"
                + "Ciudad: %s\n"
                + "Promedio: %.2f\n"
                + "Mejor nota: %.2f\n",
                nombre,
                apellidoRetornado,
                empresa,
                direccionE,
                ciudad,
                promedio,
                mejorNota);
    }
    
}
