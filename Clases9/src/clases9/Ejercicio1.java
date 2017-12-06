/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases9;

import java.util.Scanner;
/**
 *
 * @author Daniela
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        Scanner entrada = new Scanner (System.in);
        
        System.out.print ("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print ("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        ////edad = entrada.nextInt();
        
        //muestro los datos
        System.out.printf("Su nombre es %s", nombre);
        System.out.printf("Su edad es %s", edad);
    }
    
}
