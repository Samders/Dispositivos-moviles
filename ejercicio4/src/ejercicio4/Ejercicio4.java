/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double seguimiento, parcial1, parcial2, definitiva;
        System.out.println("digite la nota de seguimiento :");
        Scanner lector=new Scanner(System.in);
        seguimiento = lector.nextInt();
        System.out.println("digite la nota del parcial1:");
        
        parcial1 = lector.nextInt();
        System.out.println("digite la nota del parcial2:");
        
        parcial2 = lector.nextInt();
        definitiva=(seguimiento*0.5)+(parcial1*0.25)+(parcial2*0.25);
        System.out.println("la nota definitiva es: " + definitiva);
        // TODO code application logic here
    }
    
}
