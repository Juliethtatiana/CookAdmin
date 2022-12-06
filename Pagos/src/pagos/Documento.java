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
public abstract class Documento {
      public abstract void pagarPorTarjeta(tarjetaPago elm);

    public abstract void pagarPorEfectivo(efectivoPago elm);

public  VisitadorConcreto1(){
}
}
