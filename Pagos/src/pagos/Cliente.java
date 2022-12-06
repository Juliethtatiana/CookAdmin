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
public class Cliente {
        public static void main(String[] args) {
        Visitador vis1 = new VisitadorConcreto1();
        Elemento eleA = new tarjetaPago();
        Elemento eleB = new efectivoPago();
        eleA.aceptar(vis1);
        eleB.aceptar(vis2);
}
