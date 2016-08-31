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
public class cilindro_hueco extends cilindro{
  private double radiom;  

    cilindro_hueco() {
        
    }

 public void chueco(){
        System.out.println("ingrese el radio menor del cilindro hueco: " );
         Scanner lector = new Scanner(System.in);
         radiom=lector.nextDouble();
  }

    public double getRadiom() {
        return radiom;
    }

  
}
