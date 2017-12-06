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
public class Asignacion {

    //Atributos de la clase Asignacion
    Estudiante[] estudiantes;
    double[] notas_matematicas;
    double[] notas_sociales;

    //Constructor
    public Asignacion(Estudiante[] estudiantes, double[] notas_matematicas, double[] notas_sociales) {
        this.estudiantes = estudiantes;
        this.notas_matematicas = notas_matematicas;
        this.notas_sociales = notas_sociales;
    }

    //Utilizamos los Médotos Set y Get
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void SetEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }

    public void setNotas_matematicas(double[] notas_matematicas) {
        this.notas_matematicas = notas_matematicas;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }

    //Método para obtener el promedio de los estudiantes
    public double promEstudiante(int i) {

        double total = 0;
        total += getNotas_matematicas()[i];
        total += getNotas_sociales()[i];

        return total / 2;
    }
    
    //Método para obtener el promedio general de matemáticas
    public double PromGenMate(){
        
        double total = 0;
        for(int i =0; i < getNotas_matematicas().length; i++) {
            total += getNotas_matematicas()[i];
        }
        return total/this.getEstudiantes().length;
    }
    
    //Método para obtener el promedio general de Sociales
    public double PromGenSociales() {
        double total = 0;
        for (int i = 0; i < getNotas_sociales().length; i++) {
            total += getNotas_sociales()[i];
        }
        return total/this.getNotas_sociales().length;
    }
    
    //Sobreescribimos el método toString
    @Override
    public String toString () {
        String cadena = " ";
        for (int i = 0; i < getEstudiantes().length; i++) {
             cadena+=String.format("%s\n"
                    + "\tMatematica: %.2f\n"
                    + "\tSociales: %.2f\n"
                    + "\tPromedio: %.2f\n\n",estudiantes[i].toString(),notas_matematicas[i],notas_sociales[i],promEstudiante(i));
        }
        
        return String.format("%s\n"
                + "PROMEDIOS GENERALES: \n"
                + "Promedio Matematicas : %.2f\n"
                + "Promedio Sociales : %.2f\n", cadena,PromGenMate(),PromGenSociales());
                         
        }
    }

