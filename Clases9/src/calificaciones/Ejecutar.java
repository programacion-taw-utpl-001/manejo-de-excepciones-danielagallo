/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Ejecutar {

    public static void main(String args[]) {

        int contador = 0;
        String nombre, apellido;

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        //Creamos una lista para los Estudiantes
        Estudiante estudiantes[] = new Estudiante[4];
        //Lista para guardar las notas de matemáticas
        double notasMate[] = new double[4];
        //Lista para guardar las notas de Sociales
        double notasSociales[] = new double[4];

        while (contador < 4) {
            try {
                //Datos Ingresados por teclado
                System.out.println("posición: " + contador);
                System.out.print("Ingrese el nombre del estudiante : ");
                nombre = teclado.next();
                System.out.print("Ingrese el apellido del estudiante : ");
                apellido = teclado.next();
                System.out.print("Ingrese la nota de Matemáticas: ");
                notasMate[contador] = Double.parseDouble(teclado.next());
                System.out.print("Ingrese la nota de Sociales: ");
                //Contador para las notas de Sociales
                notasSociales[contador] = Double.parseDouble(teclado.next());
                //Contador para los Estudiantes
                estudiantes[contador] = new Estudiante(nombre, apellido);
                contador++;

            } catch (NumberFormatException numberFormatException) {
                System.err.println("Solo se aceptan números");
            } catch (Exception e) {

            }
        }

        Asignacion a = new Asignacion(estudiantes, notasMate, notasSociales);

        //Para presentar los datos
        System.out.println(a);
    }
}
