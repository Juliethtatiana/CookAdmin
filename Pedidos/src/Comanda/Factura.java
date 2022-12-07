/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comanda;

import java.util.ArrayList;
import pedidos.Plato;

/**
 *
 * @author admin2
 */
public class Factura extends Registro{
    private ArrayList<Plato> pedido;
    private double totalFactura=0.0;

    public Factura(){
        pedido=new ArrayList<Plato>();
    }
    @Override
    public void añadirPlato(Plato p) {
        pedido.add(p);
       
    }

    @Override
    public double calcularMonto() {
        int i=0;
        
        while(pedido.size()>0 ){
            this.totalFactura+=pedido.get(0).getPrecioAdicion();
            pedido.remove(0);
            
        }
        return totalFactura;
    }
    
}
