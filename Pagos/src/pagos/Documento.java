/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos;

/**
 *
 * @author vramirez
 */
public interface Documento {
     
    public abstract void pagarPorTarjeta(Tarjeta t);

    public abstract void pagarPorEfectivo(Efectivo e);

}