/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

/**
 *
 * @author Daniela
 */
public class Ejecutar {

    public static void main(String args[]) {

        int numero_alumnos = 4;
        int contador = 1;
        Estudiante [] lista = new Estudiante[4];
        double [] notas_matematicas = new double[4];
        double [] notas_sociales = new double[4];
        while(contador < 4){
            try{
                
                contador = contador + 1;
            }catch(Exception e){
                System.err.println("Error en el ingreso de data");
            }
        }
    }

}

