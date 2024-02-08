package com.mycompany.semana3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Pila {

    //atributos de la clase
    private NodoPila cima;

    public Pila() {
        this.cima = null;
    }//final constructor

    public boolean esVacia() {
        return cima == null;
    }//final metodo esVacia

    public void apilar(Dato x) {
        //Dato x = new Dato();
        x.setNombre(JOptionPane.showInputDialog("Digite su nombre: "));
        NodoPila nuevo = new NodoPila();
        nuevo.setElemento(x);
        if (esVacia()) {
            cima = nuevo;
        }//final if
        else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }//final else
    }//final metodo apilar

    public void desapilar() {
        if (!esVacia()) {
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento fue extraido!");
        }//final if
        else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, la pila está vacía.");
        }//final else
    }//final metodo desapilar

    @Override
    public String toString() {
        String s = "";
        NodoPila aux = cima;
        while (aux != null) {
            s = s + aux.getElemento().getNombre() + "\n";
            aux = aux.getSiguiente();
        }//final while
        return s;
    }

}//final pila
