
package com.mycompany.semana3;

/**
 *
 * @author Jonathan
 */
public class Dato {
    //Atributos de la clase
    private String nombre;
    
    public Dato(){
        this.nombre=nombre;
    }//final constructor Dato
    
    //gets and sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//final gets and sets

    @Override
    public String toString() {
        return "nombre: " + nombre;
    }
    
    
    
    
    
    
    
}//final clase Dato
