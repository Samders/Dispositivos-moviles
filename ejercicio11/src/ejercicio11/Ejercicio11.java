/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double numero;
        long factorial=1;
        int x,i;
        System.out.println(" digite el numero");
        Scanner lector=new Scanner(System.in);
        numero = lector.nextInt();
           for (i=1;i<=numero;i++){
               factorial = factorial * i;
               System.out.println("el factorial de: " + i + " es : " + factorial);
           } 
    }
    
}
