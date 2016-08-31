/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,suma=0,n1;
    System.out.println(" ingrese el numero de articulos a vender");
        Scanner lector=new Scanner(System.in);
        n = lector.nextInt();
        ventas [] ventas1=new ventas[n];
		for (int i=0;i<ventas1.length;i++){
           System.out.println(" digite si es libro o disco 1. libro, 2. disco");
       n1=lector.nextInt();
       if(n==1){
           ventas1[i]=new ventas();
           ventas1[i].publica();
           ventas1[i].libro();
       }
       else{
           ventas1[i]=new ventas();
           ventas1[i].publica();
           ventas1[i].disco();  
       }
			
		}

		//Lo recorremos y sumamos de nuevo los salarios (600*10)
		for (int i=0;i<ventas1.length;i++){
			//Mostramos la direccion del objeto
			//System.out.println(ventas1[i]);
			suma+=ventas1[i].getPrecio();
                        ventas1[i].mostrar();
		}
		System.out.println("El total de costos "+suma);
    }
}

