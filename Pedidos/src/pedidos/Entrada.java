/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import javax.swing.JOptionPane;

/**
 *
 * @author admin2
 */
public class Entrada extends Comida{
    public Entrada(String n, int c, double p, String t){
        
        super(n, c, p, t);
        JOptionPane.showMessageDialog(null,"holix2"+n);
    }
    
}
