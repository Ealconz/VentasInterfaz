/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author elias
 */
public class Producto{
    private int idProducto;
    private String Nombre;
    private Double Precio;
    private static int contadorProductos = 1;

    public Producto(int idProducto, String Nombre, Double Precio) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public int getIdProducto() {
        return idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getContadorProductos() {

        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto Numero  " + contadorProductos++ + "   IdProducto:  " + idProducto + "   Nombre:  " + Nombre + "   Precio:  " + Precio ;
    }
    
    public static void reiniciar(){
        contadorProductos= 1;
    }
}
