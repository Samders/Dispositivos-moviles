/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class cilindro extends circulo {
    private double altura;

    cilindro() {
        
    }
 
    public void cil(){
        System.out.println("ingrese la altura del cilindro:" );
         Scanner lector = new Scanner(System.in);
         altura=lector.nextDouble();
    }

    public double getAltura() {
        return altura;
    }


}
