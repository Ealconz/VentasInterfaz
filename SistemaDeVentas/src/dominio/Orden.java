/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Orden {
    static Scanner sc = new Scanner(System.in);
    private int idOrden;
    private ArrayList<Producto> Productos;
    private int ContadorOrdenes;
    private int MAX_PRODUCTOS = 10;

    public Orden() {
        ContadorOrdenes++;
        this.idOrden=ContadorOrdenes;
        ArrayList <Producto> list= new ArrayList<>();
        this.Productos= list;
    }

    public void agregarProducto(Producto p){
        if (this.Productos.size()<MAX_PRODUCTOS) {
        this.Productos.add(p);
        }else{
        System.out.println("Añade un producto");
        }
        
    }
    
    public double calcularTotal(){
        double total = 0.00;
        for(Producto i:this.Productos) {
        total= total+i.getPrecio();
        }
        System.out.println(total);
        return total;
    }
    public void mostrarOrden(){
        for (Producto i:this.Productos) {
            System.out.println(i.toString());
        }
    }
    
    
}
