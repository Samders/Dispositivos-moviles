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
         double mas,reg,x,n,menor,cont=0,cond;
         int opcion;
         System.out.println("digite el numero de conductores a resgistrar");
        Scanner lectorn=new Scanner(System.in);
        n = lectorn.nextInt();
        x=1;
         do{
        System.out.println("digite la fecha de nacimiento del conductor :");
        Scanner lectorfecha=new Scanner(System.in);
        fecha = lectorfecha.nextInt();
        menor=2016-fecha;
        if(menor<=25){
            cont=cont+1;
        }
        else{
            
        }
        System.out.println("ingrese el sexo del conductor :");
        Scanner lectormas=new Scanner(System.in);
        mas = lectormas.nextInt();
        if(mas<=1){
         mascu=mascu+1;   
        }
        else{
            
        }
        System.out.println(" ingrese el lugar de registro del carro :");
        Scanner lectorreg=new Scanner(System.in);
        reg = lectorreg.nextInt();
        if(reg<1){
          
        }
        else{
            otras=otras+1;
        }
        x=x+1;
         }while(x<=n);
         
         cond=(cont/n)*100;
         fe=(mascu/n)*100;
         ciudades=(otras/n)*100;
        System.out.println("1. porcentaje de condcutores menores de 25 años");
        System.out.println("2. porcentaje de conductores del sexo femenino");
        System.out.println("3. El Porcentaje de conductores cuyos carros están registrados fuera de Medellín.");
        System.out.println("elija una opcion");
        Scanner lectoropcion=new Scanner(System.in);
        opcion = lectoropcion.nextInt();
        switch(opcion){
            case 1: 
                System.out.println("porcentaje de condcutores menores de 25 años es:" + cond );
                break;
            case 2:
                 System.out.println("porcentaje de conductores del sexo femenino es: " + fe);
                 break;
            case 3:
                 System.out.println("El Porcentaje de conductores cuyos carros están registrados fuera de Medellín es: " + ciudades);
                 break;
            default: 
                 System.out.println("elija una opcion correcta ");
                 break;
        }
        // TODO code application logic here
    }
    
}
