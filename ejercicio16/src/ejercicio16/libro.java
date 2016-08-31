/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class libro extends publicacion {
    private int pag,año,precio1;
    public void libro(){
       System.out.println(" digite el numero de paginas");
       Scanner lector=new Scanner(System.in);
       pag = lector.nextInt();
       System.out.println(" digite el año de publicacion");
       año=lector.nextInt();
       System.out.println(" digite el precio");
       precio1=lector.nextInt();
    }
    public void mostrar_libro(){
        System.out.println(" el numero de paginas es: " + pag);
      System.out.println(" el año de publicacion es: " + año); 
     System.out.println(" el precio es: " + precio1);  
    }
}
