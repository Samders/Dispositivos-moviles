/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, hipotenusa;
        System.out.println("digite el lado a:");
        Scanner lectora=new Scanner(System.in);
        a = lectora.nextInt();
        System.out.println("digite el lado b:");
        Scanner lectorb=new Scanner(System.in);
        b = lectorb.nextInt();
        hipotenusa=sqrt((a*a)+(b*b));
        System.out.println("la hipotenusa es: " + hipotenusa);
        // TODO code application logic here
    }
   
    
}
