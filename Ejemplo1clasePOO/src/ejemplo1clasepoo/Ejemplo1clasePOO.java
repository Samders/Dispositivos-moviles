/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1clasepoo;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejemplo1clasePOO {
private String nombre; 
private int edad;

    public Ejemplo1clasePOO(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

public void cargardatos(){
    System.out.println("digite el nombre ");
    Scanner lector=new Scanner(System.in);
    nombre=lector.next();
    System.out.println("digite la edad ");
        edad = lector.nextInt();
}
public void mostrardatos(){
    System.out.println("el nombre es :" + nombre);
    System.out.println("la edad es :" + edad);
}
public void Mayordeedad(){
    if(edad>=18){
        System.out.println(nombre + "  es mayor de edad:");
    }
    else{
        System.out.println(nombre + "  es menor de edad:");
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo1clasePOO persona = new Ejemplo1clasePOO("manuel", 15);
        persona.cargardatos();
        persona.mostrardatos();
        persona.Mayordeedad();
    }
    
}
