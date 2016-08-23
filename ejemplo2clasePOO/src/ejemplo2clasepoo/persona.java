/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2clasepoo;

/**
 *
 * @author Alberth Neerans
 */
public class persona {
        private String nombre,apellido, DNI;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
        
public void mostrarnombre(){
    System.out.println("el nombre es:" + nombre + "" +apellido);
}
public void MostrarDNI(){
    System.out.println("el DNI es:" + DNI);
}
}
