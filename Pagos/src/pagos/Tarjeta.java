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
public class Tarjeta extends FormaPago{
    public void aceptar (Visitador v){
        v.pagarPorTarjeta(this);
    }
    
    public tarjetaPago(){
    }
    
}

