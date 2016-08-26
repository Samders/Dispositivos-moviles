/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long factorial=1;
        double def,cont=0,acum=0;
        int x,i,n1,n2,n3,n4,n,notas;
        System.out.println(" digite el numero");
        Scanner lector=new Scanner(System.in);
        n = lector.nextInt();
        int[] definitiva = new int[n];
           for (i=1;i<=n;i++){
             System.out.println(" digite la nota 1");
             n1=lector.nextInt();
             System.out.println(" digite la nota 2");
             n2=lector.nextInt();
             System.out.println(" digite la nota 3");
             n3=lector.nextInt();
             System.out.println(" digite la nota 4");
             n4=lector.nextInt();
             //notas=lector.nextInt();
             def=(n1*0.25)+(n2*0.3)+(n3*0.2)+(n4*0.25);
             //definitiva[i]=n1;
             acum=acum+def;
             if(def>=3){
            
             }
             else{
                 cont=cont+def; 
             }
           } 
           System.out.println(" las notas son:");
    for (i=1;i<=n;i++){
   //     System.out.println(definitiva[i] + " ");
    }
    System.out.println(" el promedio acumulado es: " + acum/n);
    System.out.println(" el procentaje de perdedores es " + (cont/n)*100);
    }
    
}
