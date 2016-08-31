/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // figuras figuras1 = new figuras();
       int opcion;
       figuras figura1=new figuras();
        do{
            System.out.println("1. circulo ");
            System.out.println("2. triangulo ");
            System.out.println("3. cuadrado ");
            System.out.println("4. rectangulo");
            System.out.println("5. salir");
            System.out.println(" elija una opcion ");
            Scanner lector=new Scanner(System.in);
            opcion = lector.nextInt();
            switch (opcion){
                case 1: 
                   figura1.circulo();
                   break;
                case 2:
                    figura1.triangulo();
                    break;
                case 3: 
                    figura1.cuadrado();
                    break;
                case 4:
                    figura1.rectangulo();
                    break;
                case 5:
                    System.out.println("adios");
                    break;
                default: 
                    System.out.println("elija una opcion correcta ");
            }
        }while(opcion!=5);
    }
    
}
