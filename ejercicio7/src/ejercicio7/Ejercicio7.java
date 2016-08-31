/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double fecha,mascu=0, fe, ciudades,otras=0;
         double mas,reg,n,menor,cont=0,cond;
        Scanner lectorn=new Scanner(System.in);
         do{
        System.out.println("digite la fecha de nacimiento del conductor :");
        Scanner lector=new Scanner(System.in);
        fecha = lector.nextInt();
        if((2016-fecha)<25){
            cont=cont+1;
        }
        else{
            
        }
        System.out.println("ingrese el sexo del conductor 1 femenino, 2 masculino:");
       
        mas = lector.nextInt();
        if(mas==1){
         mascu=mascu+1;   
        }
        else{
            
        }
        System.out.println(" ingrese el lugar de registro del carro : 1 medellin, 2 otra ciudad");
        
        reg = lector.nextInt();
        if(reg==1){
          
        }
        else{
            otras=otras+1;
        }
        System.out.println("desea digitar otro dato: 1. si 2.no");
        n = lector.nextInt();
         }while(n!=2);
         
         cond=(cont/n)*100;
         fe=(mascu/n)*100;
         ciudades=(otras/n)*100;
        
                System.out.println("porcentaje de condcutores menores de 25 años es:" + cond );
               
                 System.out.println("porcentaje de conductores del sexo femenino es: " + fe);
                
                 System.out.println("El Porcentaje de conductores cuyos carros están registrados fuera de Medellín es: " + ciudades);
               
                 
              
        // TODO code application logic here
    }
    
}
