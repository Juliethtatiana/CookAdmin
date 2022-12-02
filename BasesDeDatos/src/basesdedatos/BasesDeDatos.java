/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdedatos;

/**
 *
 * @author Julie
 */

import javax.swing.JOptionPane;

import Cableado.IGestion;

public class BasesDeDatos implements IGestion {

    @Override
    public void gestionarInformación() {
        JOptionPane.showMessageDialog(null, "hola desde gestionando datos"); //To change body of generated methods, choose Tools | Templates.
    }

}

