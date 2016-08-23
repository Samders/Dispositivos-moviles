/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acum=0,b=1,i=1,m=0, numero,fi;
        System.out.println(" digite el numero");
        Scanner lectornumero=new Scanner(System.in);
        numero = lectornumero.nextInt();
	while (i<=numero) {
            //System.out.println(" serie: " + b);
		acum=acum+m;
		fi=m+b;
		m=b;
		b=fi;
		i=i+1;
                if (numero==b){
                    System.out.println(" coincidencia hallada");
                    System.out.println(" el numero pertenece a la serie fibonacci");
                }
                else{
             
                }
               
                }
                
	
    }
}    
