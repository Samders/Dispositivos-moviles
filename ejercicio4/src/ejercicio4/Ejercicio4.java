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
        Scanner lectorseguimiento=new Scanner(System.in);
        seguimiento = lectorseguimiento.nextInt();
        System.out.println("digite la nota del parcial1:");
        Scanner lectorparcial1=new Scanner(System.in);
        parcial1 = lectorparcial1.nextInt();
        System.out.println("digite la nota del parcial2:");
        Scanner lectorparcial2=new Scanner(System.in);
        parcial2 = lectorparcial2.nextInt();
        definitiva=(seguimiento*0.5)+(parcial1*0.25)+(parcial2*0.25);
        System.out.println("la nota definitiva es: " + definitiva);
        // TODO code application logic here
    }
    
}
