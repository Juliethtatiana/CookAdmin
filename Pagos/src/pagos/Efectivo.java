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
public class Efectivo extends FormaPago{
    public void aceptar (Visitador v){
        v.pagarPorEfectivo(this);
    }
    public efectivoPago(){
        
    }

    private static class Visitador {

        public Visitador() {
        }

        private void pagarPorEfectivo(Efectivo aThis) {
            throw new UnsupportedOperationException("Not suppoort."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
