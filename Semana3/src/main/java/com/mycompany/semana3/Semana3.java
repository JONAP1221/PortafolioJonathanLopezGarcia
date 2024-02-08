
package com.mycompany.semana3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Semana3 {

    public static void main(String[] args) {
        
        Pila p = new Pila();
        Dato a = new Dato();
        Dato b = new Dato();
        Dato c = new Dato();
        Dato d = new Dato();
        p.apilar(a);
        p.apilar(b);
        p.apilar(c);
        p.apilar(d);
        JOptionPane.showMessageDialog(null, p);
        p.desapilar();
        JOptionPane.showMessageDialog(null, p);
        p.desapilar();
        JOptionPane.showMessageDialog(null, p);
        p.desapilar();
        JOptionPane.showMessageDialog(null, p);
        p.desapilar();
        JOptionPane.showMessageDialog(null, p);
        
    }//final main
}//final de la clase
