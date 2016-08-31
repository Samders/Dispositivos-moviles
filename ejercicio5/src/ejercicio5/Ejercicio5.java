/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double seguimiento, practica, exposicion, definitiva, proyecto,proyectoI;
        System.out.println("digite la nota de seguimiento :");
        Scanner lector=new Scanner(System.in);
        seguimiento = lector.nextInt();
        System.out.println("digite la nota del practica:");
       
        practica = lector.nextInt();
        System.out.println("digite la nota de la exposicion:");
      
        exposicion = lector.nextInt();
        System.out.println("digite la nota del proyecto:");
        
        proyecto = lector.nextInt();
        System.out.println("digite la nota del proyectoI:");
       
        proyectoI = lector.nextInt();
        definitiva=(seguimiento*0.2)+(practica*0.3)+(exposicion*0.1)+(proyecto*0.15)+(proyectoI*0.25);
        if(definitiva<=1){
        System.out.println("Estas en el lugar equivocado");
        }
        if  (1<definitiva && definitiva<2.1 ){
        System.out.println("Estas remal ");
        }
        if (2.1<=definitiva && definitiva<=3){
         System.out.println("Es posible recuperarse ");   
        }
        if (3.1<=definitiva && definitiva<=4){
         System.out.println("Normalito ");   
        }
        if (4.1<=definitiva && definitiva<=4.5){
         System.out.println("Muy bien ");
        }
        if (4.6<=definitiva && definitiva<=5){
         System.out.println("Excelente estudiante ");   
        }
        System.out.println("la nota definitiva es: " + definitiva);
        // TODO code application logic here
    }
    
}
