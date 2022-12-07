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
import java.util.ArrayList;
import utilidades.Cargador;

public class Administrador implements IModerador{

    ArrayList<String> nPlato= new ArrayList<String>();
    ArrayList<String> idPlato= new ArrayList<String>();
    
    

    @Override
    public void moderar() {
        Class cls1 = null;
    
        Cargador crg = new Cargador("front");
        Cargador crg2 = new Cargador("back");
        
        try {
			Class cls = crg2.getClase(IGestion.class.getName());
			IGestion com = (IGestion) cls.newInstance() ;
                        //JOptionPane.showMessageDialog(null, com.getInstance());
                        //JOptionPane.showMessageDialog(null, "los platos a la carta son: " + rs.getString("Nombre"));
                        
                        ResultSet rs= com.consultarMenu();
                        while(rs.next()){
                            nPlato.add(rs.getString("Nombre"));
                            idPlato.add(rs.getString("idPlato"));
            
                        }
                        
                       
                        
                        
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente bases de datos");
		}
        
        //para Pedido
        
        try {
			Class cls = crg.getClase(IRegistro.class.getName());
			IRegistro com = (IRegistro) cls.newInstance();
			com.construirMenu(nPlato,idPlato); // implementacion patron visitor
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente de pedido");
		}
        
        //para Financiero
        
        /*
        try {
			Class cls = crg.getClase(IInforme.class.getName());
			IInforme com = (IInforme) cls.newInstance();
			com.generarInforme();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente financiero");
		}
        */
        
        // Para back-end
			
		

		// Para traer bases de datos
                /*
		try {
			Class cls = crg2.getClase(IGestion.class.getName());
			IGestion com = (IGestion) cls.newInstance() ;
                        JOptionPane.showMessageDialog(null, com.getInstance());
                        ResultSet rs= com.consultarMenu();
                        JOptionPane.showMessageDialog(null, "los platos a la carta son: " + rs.getString("Nombre"));
                        
                        
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente bases de datos");
		}*/
                
                
                
                // Para traer pagos
                /*
		try {
			Class cls = crg2.getClase(IRecaudo.class.getName());
			IRecaudo com = (IRecaudo) cls.newInstance();
			com.RecaudarPago();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hay componente de pago");
		}
*/
        
    }
    
}
