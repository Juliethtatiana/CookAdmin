/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrador;

/**
 *
 * @author Julie
 */

import javax.swing.JOptionPane;
import Cableado.IGestion;
import Cableado.IInforme;
import Cableado.IRecaudo;
import Cableado.IRegistro;
import Cableado.IModerador;
import java.sql.ResultSet;
import utilidades.Cargador;

public class Administrador implements IModerador{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Administrador().moderar();
    }

    @Override
    public void moderar() {
        Class cls1 = null;
    
        Cargador crg = new Cargador("front");

        
        //para Pedido
        try {
			Class cls = crg.getClase(IRegistro.class.getName());
			IRegistro com = (IRegistro) cls.newInstance();
			com.registrarPedido();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente de pedido");
		}
        //para Financiero
        try {
			Class cls = crg.getClase(IInforme.class.getName());
			IInforme com = (IInforme) cls.newInstance();
			com.generarInforme();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente financiero");
		}
        
        
        // Para back-end
			
		Cargador crg2 = new Cargador("back");

		// Para traer bases de datos
		try {
			Class cls = crg2.getClase(IGestion.class.getName());
			IGestion com = (IGestion) cls.newInstance();
			com.conectarBasedeDatos();
                        ResultSet rs= com.consultarMenu();
                        JOptionPane.showMessageDialog(null, "los platos a la carta son: " + rs.getString("Nombre"));
                        
                        
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente bases de datos");
		}
                
                // Para traer pagos
		try {
			Class cls = crg2.getClase(IRecaudo.class.getName());
			IRecaudo com = (IRecaudo) cls.newInstance();
			com.RecaudarPago();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente de pago");
		}

        
    }
    
}
