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
public class Client extends Personal_Date{
    private double saldo=0;
    
    public void Actualizar_datos(){
        
			Scanner lector=new Scanner(System.in);
                        System.out.println(" escribe un nombre: ");
                        setNombre(lector.next());
                        System.out.println(" escribe un apellido ");
                        setApellidos(lector.next());
                        System.out.println(" escribe una edad ");
                        setEdad(lector.next());
                        System.out.println(" escribe una cedula ");
                        setCedula(lector.next());
                        System.out.println(" escribe la fecha de nacimiento ");
                        setFecha(lector.next());
                        System.out.println(" escribe la direccion ");
                        setDireccion(lector.next());
                        System.out.println(" escribe un telefono ");
                        setTele(lector.next());

		
    }
    public void consignacion(){
     System.out.println(" ingrese el valor a consignar ");
     Scanner lector=new Scanner(System.in);
        saldo = lector.nextInt();
    }
public void retiro(){
    int ret;
    System.out.println(" ingrese el valor a retirar ");
     Scanner lector=new Scanner(System.in);
        ret = lector.nextInt();
        if (ret>saldo){
            System.out.println(" saldo insuficiente");
        }else{
        saldo=saldo-ret;  
}
}
public void consultar(){
  System.out.println(" el saldo es  "+ saldo);  
}

}
