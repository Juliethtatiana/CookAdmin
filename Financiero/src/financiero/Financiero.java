/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financiero;

/**
 *
 * @author Julie
 */
import javax.swing.JOptionPane;

import Cableado.IInforme;

public class Financiero implements IInforme {

    @Override
    public void generarInforme() {
        JOptionPane.showMessageDialog(null, "hola desde componente de Informe"); //To change body of generated methods, choose Tools | Templates.
    }

}
