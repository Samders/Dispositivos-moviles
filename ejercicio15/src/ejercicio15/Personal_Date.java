/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberth Neerans
 */
public class Personal_Date {
    private String nombre,apellidos,edad, cedula, fecha, direccion, tele;
       
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public void setTele(String tele) {
        this.tele = tele;
    }

   
    public void Loading_data(){
		
			//Indicamos cada uno de los parametros del objeto
                        Scanner lector=new Scanner(System.in);
                        System.out.println(" escribe un nombre: ");
                        nombre = lector.next();
                        System.out.println(" escribe un apellido ");
                         apellidos = lector.next();
                        System.out.println(" escribe una edad ");
                        edad = lector.next();
                        System.out.println(" escribe una cedula ");
                         cedula = lector.next();
                        System.out.println(" escribe la fecha de nacimiento ");
                        fecha = lector.next();
                        System.out.println(" escribe la direccion ");
                         direccion = lector.next();
                        System.out.println(" escribe un telefono ");
                        tele = lector.next();
			
		}

    
    public void Show_data(){
        
        
            System.out.println(" los datos del cliente son: ");
            System.out.println("Nombre: "+nombre+"\n"+
                "apellido: "+apellidos+"\n"+
                "edad: "+edad+"\n"+
                "cedula: "+cedula+"\n"+
                "fecha: "+fecha+"\n"+
                "dir: "+direccion+"\n"+
                "tel: "+tele+"\n");
    }   
}

