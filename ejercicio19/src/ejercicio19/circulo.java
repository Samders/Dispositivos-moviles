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
public  class circulo {
    protected double are,cir,pi=3.1416,radio;


    public double getRadio() {
        return radio;
    }
 public void cir(){
     System.out.println("ingrese el radio del circulo:" );
         Scanner lector = new Scanner(System.in);
         radio=lector.nextDouble();
 }
    public void area(){
        are=pi*radio*radio;
        System.out.println("el area es: " + are);
    }
    public void circunferencia(){
        cir=2*pi*radio;
        System.out.println("la circunferencia es: " + cir);
    }  

    public double getAre() {
        return are;
    }

    public double getCir() {
        return cir;
    }
    
}
