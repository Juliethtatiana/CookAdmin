/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cableado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Julie
 */
public interface IGestion {
    
    
    IGestion getInstance();
    void conectarBasedeDatos();
    void gestionarInformación();
    ArrayList<String> consultarMenu();
    
}
