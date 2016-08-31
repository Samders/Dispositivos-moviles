/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class ventas extends publicacion{
    private int pag,año,precio,dura;
    public void libro(){
       System.out.println(" digite el numero de paginas");
       Scanner lector=new Scanner(System.in);
       pag = lector.nextInt();
       System.out.println(" digite el año de publicacion");
       año=lector.nextInt();
       System.out.println(" digite el precio");
       precio=lector.nextInt();
    }
    public void mostrar_libro(){
        System.out.println(" el numero de paginas es: " + pag);
      System.out.println(" el año de publicacion es: " + año); 
     System.out.println(" el precio es: " + precio);  
    }
    public void disco(){
      Scanner lector=new Scanner(System.in);
      System.out.println(" digite la duracion en minutos");
       dura=lector.nextInt();
       System.out.println(" digite el precio");
       precio=lector.nextInt();  
    }
    public void mostrar_disco(){
     System.out.println(" la duracion es en minutos: " + dura); 
     System.out.println(" el precio es: " + precio);
    }

    public int getPrecio() {
        return precio;
    }
    
}
