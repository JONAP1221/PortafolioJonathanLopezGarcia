
package com.mycompany.semana3;

/**
 *
 * @author Jonathan
 */
public class NodoPila {
    //atributos de la clase
    private Dato elemento;
    private NodoPila siguiente;

    public NodoPila() {
        this.siguiente = null;
    }//final constructor

    //gets and sets
    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }//final gets and sets

    @Override
    public String toString() {
        return ""+elemento;
    }
    
    
    
    
    
    
    
    
}//final de la clase
