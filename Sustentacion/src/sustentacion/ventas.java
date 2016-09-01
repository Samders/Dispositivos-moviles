/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Alberth Neerans
 */
public class ventas extends producto{

     private String nom;
     private int cant;
     double costo,coste;
    public void realizar_ventas(){
 
        Scanner lector=new Scanner(System.in);
        
        System.out.println(" digite la cantidad a vender "); 
        cant=lector.nextInt();
    }
    public void Mostrar_ganancias(){
        coste=costo+coste;
        System.out.println(" "+coste);
    }



    
        public int getCant() {
        return cant;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCoste() {
        return coste;
    }
    
    
}
