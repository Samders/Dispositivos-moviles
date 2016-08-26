/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
         System.out.println(" digite el numero");
        Scanner lector=new Scanner(System.in);
        n = lector.nextInt();
        fibonacci fibonacci1 = new fibonacci( n);
        System.out.println(" la serie es: ");
        fibonacci1.fibo();
    }
    
}
