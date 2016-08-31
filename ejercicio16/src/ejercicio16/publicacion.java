/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class publicacion {
    private String titulo;
    private int costo;
    public void publica(){
         System.out.println(" digite el titulo");
        Scanner lector=new Scanner(System.in);
       titulo = lector.next();
        System.out.println(" digite el costo de publicacion");
        costo = lector.nextInt();
    }
    public void mostrar(){
        System.out.println(" el titulo es:" + titulo); 
         System.out.println(" el costo  de publicacion es: " + costo);
    }
}
