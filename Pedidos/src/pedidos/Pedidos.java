/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author Julie
 */
import javax.swing.JOptionPane;

import Cableado.IRegistro;

public class Pedidos implements IRegistro {

    @Override
    public void registrarPedido() {
        JOptionPane.showMessageDialog(null, "hola desde componente de pedido"); //To change body of generated methods, choose Tools | Templates.
    }

}