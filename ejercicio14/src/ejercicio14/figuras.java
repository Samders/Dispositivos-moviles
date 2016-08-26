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
public class figuras {
    private double radio,base,altura,lado,lad,men,areac,areat,areal,arear;

    
    public void circulo(){
        System.out.println(" ingrese el radio del circulo ");
        Scanner lector=new Scanner(System.in);
        radio = lector.nextInt();
        areac=3.1416*radio*radio;
        System.out.println(" el area del circulo es " + areac);
    }
    public void triangulo(){
        System.out.println(" ingrese la base y altura del triangulo ");
         Scanner lector=new Scanner(System.in);
        base = lector.nextInt();
        altura = lector.nextInt();
        areat=(base*altura)/2;
        System.out.println(" el area del trangulo es: " + areat);
    }
    public void cuadrado(){
        System.out.println(" ingrese el lado del cuadrado: ");
         Scanner lector=new Scanner(System.in);
         lado=lector.nextInt();
        areal=lado*lado;
        System.out.println(" el area del cuadrado es: "+ areal);
    }
    public void rectangulo(){
        System.out.println(" ingrese la base y altura del rectangulo: ");
         Scanner lector=new Scanner(System.in);
         lad=lector.nextInt();
         men=lector.nextInt();
        arear=(lad*men)/2;
        System.out.println(" el area del rectangulo es: "+ arear);
    }
    
    
}
