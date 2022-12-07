/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

/**
 *
 * @author admin2
 */
public abstract class Plato {
    private String Nombre;
    private int Cantidad;
    private double PrecioAdicion;
    private String Tipo;
    
     public Plato(String n, int c, double p, String t ){
        
        this.Nombre=n;
        this.Cantidad=c;
        this.PrecioAdicion=p;
        this.Tipo=t;
    
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioAdicion() {
        return PrecioAdicion;
    }

    public void setPrecioAdicion(int PrecioAdicion) {
        this.PrecioAdicion = PrecioAdicion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
}
