/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2clasepoo;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */


public class Ejemplo2clasePOO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        estudiante estudiante1= new estudiante();
        Scanner lector=new Scanner(System.in);
    System.out.println("digite el nombre ");
    estudiante1.setNombre(lector.next());
    
    System.out.println("digite el apellido ");
    estudiante1.setApellido(lector.next());
    System.out.println("digite el DNI ");
    estudiante1.setDNI(lector.next());
    System.out.println("digite el numero de expediente ");
    estudiante1.setNumexpediente(lector.nextInt());
    estudiante1.mostrarnombre();
    estudiante1.MostrarDNI();
    estudiante1.mostrarexpediente();
    }
    
}
