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
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BasesDeDatos implements IGestion {
    
    String user="root";
    String password="1234";
    String url= "jdbc:mysql://localhost:3306/cookadmindb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    Connection c;
    
    
    @Override
    public void gestionarInformación() {
            //To change body of generated methods, choose Tools | Templates.
        
    }
    
    public ResultSet consultarMenu() throws SQLException{
        
        java.sql.Statement st= c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs= st.executeQuery("select * from plato");
        //JOptionPane.showMessageDialog(null, "holi desde consultar menu");
        if(rs.next()){
            return rs;
        }
        return null;
    }

    @Override
    public void conectarBasedeDatos() {
         
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             c= DriverManager.getConnection(url, user, password);
            if(c!=null){
                 
                
            }else{
                System.out.print("fail");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BasesDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BasesDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet rs = consultarMenu();
            if(rs!=null){
                JOptionPane.showMessageDialog(null, "los platos a la carta son: " + rs.getString("Nombre"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BasesDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    

}
   
    



