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
import java.util.ArrayList;
import vistapedidos.Ventana;
import vistapedidos.vistaPedido;


public class Pedidos implements IRegistro {
    
    private Ventana constructor = new vistaPedido();
    
  
    @Override
    public void registrarPedido() {
            
    }

    @Override
    public void construirMenu(ArrayList<String> p, ArrayList<String> id) {
        
        constructor.mostrarMenu(p, id);
        constructor.setVisible(true);
    }

}