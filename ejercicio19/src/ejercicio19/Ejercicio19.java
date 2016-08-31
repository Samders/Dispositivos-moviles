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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double areac,volc,areah,volh,pi=3.1416;
       
        circulo circulo1=new circulo();
        cilindro cilindro1=new cilindro();
        cilindro_hueco cilindro2=new cilindro_hueco();
        circulo1.cir();
        circulo1.area();
        circulo1.circunferencia();
        cilindro1.cil();
        areac=circulo1.getAre()*2+cilindro1.getAltura()*circulo1.getCir();
        System.out.println("el area del cilindro es:" + areac);
        volc=circulo1.getAre()*cilindro1.getAltura();
        System.out.println("el volumen del cilindro es:" +volc);
        cilindro2.chueco();
        areah=areac-2*pi*cilindro2.getRadiom()*cilindro2.getRadiom()+2*pi*cilindro2.getRadiom()*cilindro1.getAltura();
        System.out.println("el area del cilindro hueco es:" +areah);
        volh=volc-pi*cilindro2.getRadiom()*cilindro1.getAltura();
        System.out.println("el area del cilindro hueco es:" +volh);
        
    }
    
}
