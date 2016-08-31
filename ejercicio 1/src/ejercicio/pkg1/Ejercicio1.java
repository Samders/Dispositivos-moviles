/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado,area,volumen;
        System.out.println("digite el lado del cubo:");
        Scanner lector=new Scanner(System.in);
        lado = lector.nextInt();
        area=lado*lado*6;
        volumen=lado*lado*lado;
        System.out.println("el area del cubo es: " + area);
        System.out.println("el volumen del cubo es: " + volumen);
        // TODO code application logic here
    }
    
}
