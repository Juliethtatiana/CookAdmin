/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cableado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Julie
 */
public interface IGestion {
    
    
    Connection getInstance();
    void conectarBasedeDatos();
    ResultSet gestionarInformaci√≥n(String id);
    ResultSet consultarMenu();
    
}
