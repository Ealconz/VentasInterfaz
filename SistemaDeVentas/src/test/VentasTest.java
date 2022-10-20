/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import dominio.Orden;
import dominio.Producto;
import java.util.Scanner;
import datos.archivos;
/**
 *
 * @author elias
 */

public class VentasTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicio Ventas");
        System.out.println("");
        System.out.println("==========================");
        System.out.println("");
        Orden orden = new Orden();
        Producto p1 = new Producto(10,"Zanahorias",9.99);
        Producto p2 = new Producto(253,"Macarrones",449.99);
        Producto p3 = new Producto(666,"Choclo",1.99);
        Producto p4 = new Producto(14,"Milanesa",99.99);
        Producto p5 = new Producto(12,"Choripan",9.99);
        Producto p6 = new Producto(65,"Chococrispi",2.99);
        Producto p7 = new Producto(187,"Empanada",6.99);
        Producto p8 = new Producto(412,"Patata",0.99);
        System.out.println("Introduzca la id del producto:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Añada el nombre del producto: ");
        String nombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Añada el precio del producto: ");
        Double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca la id del segundo producto");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el nombre del segundo producto: ");
        String nombre2 = sc.nextLine();
        sc.nextLine();
        System.out.println("Añada el precio del segundo producto: ");
        Double precio2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("");
        Producto p9 = new Producto(id,nombre,precio);
        Producto p10 = new Producto(id2,nombre2,precio2);
        orden.agregarProducto(p1);
        orden.agregarProducto(p2);
        orden.agregarProducto(p3);
        orden.agregarProducto(p4);
        orden.agregarProducto(p5);
        orden.agregarProducto(p6);
        orden.agregarProducto(p7);
        orden.agregarProducto(p8);
        orden.agregarProducto(p9);
        orden.agregarProducto(p10);
        System.out.println("Productos: ");
        System.out.println("=========================================================================");
        orden.mostrarOrden();
        System.out.println("=========================================================================");
        System.out.println("");
        System.out.println("El precio total de todos los produztos es: ");
        orden.calcularTotal();
        String archivo="Archivos.txt";
        
        archivos.crearArchivo(archivo);
        archivos.agregarArchivo(archivo,p1.getIdProducto()+"|"+p1.getNombre()+"|"+p1.getPrecio());
        archivos.agregarArchivo(archivo,p2.getIdProducto()+"|"+p2.getNombre()+"|"+p2.getPrecio());
        archivos.agregarArchivo(archivo,p3.getIdProducto()+"|"+p3.getNombre()+"|"+p3.getPrecio());
        archivos.agregarArchivo(archivo,p4.getIdProducto()+"|"+p4.getNombre()+"|"+p4.getPrecio());
        archivos.agregarArchivo(archivo,p5.getIdProducto()+"|"+p5.getNombre()+"|"+p5.getPrecio());
        archivos.agregarArchivo(archivo,p6.getIdProducto()+"|"+p6.getNombre()+"|"+p6.getPrecio());
        archivos.agregarArchivo(archivo,p7.getIdProducto()+"|"+p7.getNombre()+"|"+p7.getPrecio());
        archivos.agregarArchivo(archivo,p8.getIdProducto()+"|"+p8.getNombre()+"|"+p8.getPrecio());
        archivos.agregarArchivo(archivo,p9.getIdProducto()+"|"+p9.getNombre()+"|"+p9.getPrecio());
        archivos.agregarArchivo(archivo,p10.getIdProducto()+"|"+p10.getNombre()+"|"+p10.getPrecio());
        
        String Orden="orden.txt";
        
        archivos.crearArchivo(Orden);
        archivos.agregarArchivo(Orden,p1.toString());
        archivos.agregarArchivo(Orden,p2.toString());
        archivos.agregarArchivo(Orden,p3.toString());
        archivos.agregarArchivo(Orden,p4.toString());
        archivos.agregarArchivo(Orden,p5.toString());
        archivos.agregarArchivo(Orden,p6.toString());
        archivos.agregarArchivo(Orden,p7.toString());
        archivos.agregarArchivo(Orden,p8.toString());
        archivos.agregarArchivo(Orden,p9.toString());
        archivos.agregarArchivo(Orden,p10.toString());
    }
    
}
