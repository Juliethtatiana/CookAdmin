/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos;

import javax.swing.JOptionPane;

/**
 *
 * @author admin2
 */
public class Pago implements Documento{

    @Override
    public void pagarPorTarjeta(Tarjeta t) {
        JOptionPane.showMessageDialog(null, "Pagado por tarjeta"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pagarPorEfectivo(Efectivo e) {
        JOptionPane.showMessageDialog(null, "pagado en efectivo");//To change body of generated methods, choose Tools | Templates.
    }
    
}
