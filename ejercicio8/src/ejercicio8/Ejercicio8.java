/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n1, dig1,n2,dig2=0,N2, dig,may=0,men=0;
         double sum, resta,mul, div,divi,divisi,raiz;
        System.out.println("digite el primer numero de dos cifras: ");
        Scanner lectorn1=new Scanner(System.in);
        n1 = lectorn1.nextInt();
        if(n1>9 && n1<=99){
            dig2=n1%10;
            dig=n1-dig2;
            dig1=dig/10;
            System.out.println("dig2" + dig2);
        }
        else{
         System.out.println("ERROR ");
         System.out.println("digite un numero de dos cifras ");    
        }
        System.out.println("digite el segundo numero de dos cifras: ");
        Scanner lectorn2=new Scanner(System.in);
        n2 = lectorn2.nextInt();
        N2=0;
        if(n2>9 && n2<=99){
        }
        else{
         System.out.println("ERROR ");
         System.out.println("digite un numero de dos cifras ");   
        }
        if (n1>n2){
            n1=may;
        }
        else{
            n2=men;
        }
        sum=n1+n2;
        resta=n1-n2;
        mul=n1*n2;
        div=n1/n2;
        raiz=Math.sqrt(n1);
        switch(dig2){
            case 0:
               System.out.println("El numero mayor es: " + may);
                break; 
            case 1: 
                System.out.println("El numero menor es: " + men);
                break;
            case 2:
                 System.out.println("la suma es: " + sum);
                 break;
            case 3:
                 System.out.println("La resta es: " + resta);
                 break;
            case 4:
                 System.out.println("La multiplicacion es: " + mul);
                 break;
            case 5:
             System.out.println("la division es: " + div);
                break; 
            case 6: 
                if((n1/n2)>0){
                } else {
                System.out.println("n1 es divisible por n2" );
                }
                break;
            case 7:
                if((n2/n1)>0){
                } else {
                System.out.println("n2 es divisible por n1" );
                }
                 break;
            case 8:
                 System.out.println("la raiz cuaddrada es: " + raiz);
                 break;
            case 9:
                 System.out.println("Que punto tan facil parce ");
                 break;
            default: 
                 
                 break;
        }
        // TODO code application logic here
    }
    
}
