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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        libro libro1=new libro();
        disco disco1=new disco();
        Scanner lector=new Scanner(System.in);
      System.out.println(" digite si es libro o disco 1.libro, 2.disco");
       n=lector.nextInt();
       if(n==1){
         libro1.publica();
        libro1.libro();
        libro1.mostrar();
        libro1.mostrar_libro();   
       }
       else{
         disco1.publica();
        disco1.disco();
        disco1.mostrar();
        disco1.mostrar_disco();   
       }
       
    }
    
}
