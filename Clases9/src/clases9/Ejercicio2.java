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
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean pasar;
        
        do {
            try {
                System.out.print("Ingrese valor al numerador entero: ");
                int num = entrada.nextInt();
                System.out.print("Ingrese valor al dominador: ");
                int den = entrada.nextInt();

                int fin = num / den;
                System.out.printf("\nResultado: %d/%d = %d\n", num, den, fin);

                pasar = false;
            } catch (ArithmeticException e) {
                System.err.println(e);
                pasar = true;
            }
        } while (pasar);
    }
}
