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
public class estudiante extends persona{
    private int numexpediente;
    public void mostrarexpediente(){
        System.out.println("el expediente es: "+ numexpediente);
    }

    public int getNumexpediente() {
        return numexpediente;
    }

    public void setNumexpediente(int numexpediente) {
        this.numexpediente = numexpediente;
    }
    
}
