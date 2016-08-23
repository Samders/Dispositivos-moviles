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
        int n;
        int i;
        double n1,n2,n3,n4,prom=0, def, per=0;
        System.out.println("digite el numero de estudiantes: ");
        Scanner lectorn=new Scanner(System.in);
        n = lectorn.nextInt();
        for(i=1;i<=n;i++){
        System.out.println("digite la primer nota: ");
        Scanner lectorn1=new Scanner(System.in);
        n1 = lectorn1.nextInt();
        System.out.println("digite la segunda nota: ");
        Scanner lectorn2=new Scanner(System.in);
        n2 = lectorn2.nextInt();
        System.out.println("digite la tercer nota: ");
        Scanner lectorn3=new Scanner(System.in);
        n3 = lectorn3.nextInt();
        System.out.println("digite la cuarta nota: ");
        Scanner lectorn4=new Scanner(System.in);
        n4 = lectorn4.nextInt();
        def=n1*0.25+n2*0.2+n3*0.25+n4*0.3;
        System.out.println("La nota definitiva del estudiante: " + i + " es " + def);
        prom=prom+def;
        if(def<3){
            per=per+def;
        }
        }
       System.out.println("el promedio del grupo es:" + prom/n); 
       System.out.println("el porcentaje de perdedores es:" + (per/n)*100); 
    }
    
}
