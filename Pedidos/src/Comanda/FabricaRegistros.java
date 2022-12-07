/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comanda;

/**
 *
 * @author admin2
 */
public class FabricaRegistros {
    public static Registro generarRegistro(String tipo) {
 
        if (tipo.equals("factura")) {

        return new Factura();
        }
        else {
        return new Informe();
        }
 
 }
}
