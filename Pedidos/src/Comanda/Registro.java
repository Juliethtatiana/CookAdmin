/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comanda;

import pedidos.Plato;

/**
 *
 * @author admin2
 */
public abstract class Registro {
    private double montoTotal;
    
    public abstract void añadirPlato(Plato p);
    public abstract double calcularMonto();
    
}
