/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cableado;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Julie
 */
public interface IGestion {
    void conectarBasedeDatos();
    void gestionarInformación();
    ResultSet consultarMenu() throws SQLException;
}
