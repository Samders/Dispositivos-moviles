/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class nombre {
    private String nombre, apellido1,apellido2;

public nombre() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }



    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public void leer(){
        Scanner lector=new Scanner(System.in);
      System.out.println(" digite su nombre");
       nombre=lector.next();
       System.out.println(" digite su primer apellido");
       apellido1=lector.next();
       System.out.println(" digite su segundo apellido");
       apellido2=lector.next();
    }
    public void mostrar(){
      System.out.println(" el nombre completo es: /n");  
       System.out.println(" " + nombre + "  " + apellido1 + "  " + apellido2);
    }
}
