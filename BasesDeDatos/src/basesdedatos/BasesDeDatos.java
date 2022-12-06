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

    private IGestion instance=null;
    String user="root";
    String password="1234";
    String url= "jdbc:mysql://localhost:3306/cookadmindb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    Connection c =null;
    
    
    
    public BasesDeDatos(){
        this.conectarBasedeDatos();
    }
    
    /*aplicacion del patron singleton*/

    @Override
    public IGestion getInstance(){
        if(instance==null){
             instance = new BasesDeDatos();      
        }
        return instance;
    }
    @Override
    public void gestionarInformación() {
            //To change body of generated methods, choose Tools | Templates.
        
    }
    
    @Override
    public ResultSet consultarMenu() throws SQLException{
        JOptionPane.showMessageDialog(null, "holi desde consultar menu" + c);
        java.sql.Statement st= c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs= st.executeQuery("select * from plato");
        JOptionPane.showMessageDialog(null, "holi desde consultar menu x2");
        while(rs.next()){
            
            
        }
        return null;
    }

    @Override
    public void conectarBasedeDatos() {
         JOptionPane.showMessageDialog(null, "conectar base de datos");
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             c= DriverManager.getConnection(url, user, password);
             JOptionPane.showMessageDialog(null, "conectar base de datos" + c);
            if(c!=null){
                 
                
            }else{
                JOptionPane.showMessageDialog(null, "fallo al conectar");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BasesDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BasesDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        
    
    }
    

}
   
    



