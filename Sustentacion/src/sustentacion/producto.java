/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class producto {
   private String nombre;
   private int cantidad,n;
   private double precio;
   int posicionEliminar =0;
   public void agregar_producto(){
		
			//Indicamos cada uno de los parametros del objeto
                        Scanner lector=new Scanner(System.in);
                        System.out.println(" escribe un nombre: ");
                        nombre = lector.next();
                        System.out.println(" escribe la cantidad de este producto  ");
                         cantidad = lector.nextInt();
                        System.out.println(" escribe el precio de este producto");
                        precio= lector.nextInt();
                        
		}
     public void mostrar_inventario(){
        
        
            System.out.println(" los productos son: ");
            System.out.println("Nombre: "+nombre+"\n"+
                "cantidad: "+cantidad+"\n"+
                "precio: "+precio+"\n");
    }  
   public void Buscar_producto(){
    
       System.out.println("  "+nombre + "  " +cantidad+ "   " +precio);
   
   }
   public void eliminar_producto(){
     System.out.println(" el producto ha sido eliminado ");  
}

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   
}
