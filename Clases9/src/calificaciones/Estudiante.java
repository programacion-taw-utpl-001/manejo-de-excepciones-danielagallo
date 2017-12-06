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
public class Estudiante {
    
    private String nombres;
    private String apellidos;
    
     //Constructor
    public Estudiante(String n, String a) {
        setNombre(n);
        setApellido(a);
    }

    //Utilizamos los Médotos Set y Get
    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }
    
    //Sobreescribimos el método toString
}
