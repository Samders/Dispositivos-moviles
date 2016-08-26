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
     //int edad;
    public void Loading_data(){
        Client arrayObjetos[]=new Client[1];
		for (int i=0;i<arrayObjetos.length;i++){
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
			
			
			arrayObjetos[i]=new Client (nombre, apellidos,edad, cedula,fecha,direccion,tele);
		}

    }
    public void Show_data(){
        Client arrayObjetos[]=new Client[10];
        for (int i=0;i<arrayObjetos.length;i++) {
            System.out.println(" los datos del cliente son: ");
            System.out.println(arrayObjetos[i]);
        }
    }

  /*  public Personal_Date(String nombre, String apellidos, String edad, String cedula, String fecha, String direccion, String tele) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cedula = cedula;
        this.fecha = fecha;
        this.direccion = direccion;
        this.tele = tele;
    }*/


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tele;
    }

    public void setTel(String tel) {
        this.tele = tel;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}

