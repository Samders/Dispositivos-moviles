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
public class disco extends publicacion{
    private int precio2,dura;
     public void disco(){
      Scanner lector=new Scanner(System.in);
      System.out.println(" digite la duracion en minutos");
       dura=lector.nextInt();
       System.out.println(" digite el precio");
       precio2=lector.nextInt();  
    }
    public void mostrar_disco(){
     System.out.println(" la duracion es en minutos: " + dura); 
     System.out.println(" el precio es: " + precio2);
    }
}
