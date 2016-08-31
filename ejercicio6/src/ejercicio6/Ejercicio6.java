/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigo;
        System.out.println("digite codigo de producto : 1 , 2, 3 o 4");
        Scanner lector=new Scanner(System.in);
        codigo = lector.nextInt();
        switch(codigo){
            case 1: 
                System.out.println("el precio es : $500");
                break;
            case 2:
                 System.out.println("el precio es: $800 ");
                 break;
            case 3:
                 System.out.println("el precio es: $300 ");
                 break;
            case 4:
                 System.out.println("el precio es: $900 ");
                 break;
            default: 
                 System.out.println("ingrese un codigo correcto ");
                 break;
        }
        // TODO code application logic here
    }
    
}
