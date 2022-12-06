/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos;

/**
 *
 * @author Julie
 */
import javax.swing.JOptionPane;

import Cableado.IRecaudo;

public class Pagos implements IRecaudo {

    @Override
    public void RecaudarPago() {
        JOptionPane.showMessageDialog(null, "hola desde componente de pagos"); //To change body of generated methods, choose Tools | Templates.
    }

}
