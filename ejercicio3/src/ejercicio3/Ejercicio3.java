/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado,area,altura,perimetro;
        System.out.println("digite el lado del triangulo:");
        Scanner lector=new Scanner(System.in);
        lado = lector.nextInt();
        perimetro=3*lado;
        altura=sqrt((lado*lado)-((lado*lado)/4));
        area=(lado*altura)/2;
        System.out.println("el area del trainagulo es: " + area);
        System.out.println("la altura del triangulo es: " + altura);
        System.out.println("el perimetro del triangulo es: " + perimetro);
        // TODO code application logic here
    }
    
}
