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
    private double saldo=2000000000,con,ret;
    //Personal_Date Client1=new Personal_Date();
   /*Client(String nombre, String Apellidos, String ed, String Cedula, String Fecha, String Direccion, String tele, double saldo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/


    Client(String nombre, String Apellidos, String ed, String Cedula, String Fecha, String Direccion, String tele) {
  
    }
    public void saldo(){
       Client arrayObjetos[]=new Client[1];
		for (int i=0;i<arrayObjetos.length;i++){
			//Indicamos cada uno de los parametros del objeto
			String nombre=JOptionPane.showInputDialog("Escribe un nombre");

			String Apellidos=JOptionPane.showInputDialog("Escribe un apellido");

			String ed=JOptionPane.showInputDialog("Escribe una edad");
			

			String Cedula=JOptionPane.showInputDialog("Escribe la cedula");
			
                        String Fecha=JOptionPane.showInputDialog("escribe la fecha de nacimiento");

			String Direccion=JOptionPane.showInputDialog("Escribe la direccion");

			String tele=JOptionPane.showInputDialog("Escribe un telefono");
			
			arrayObjetos[i]=new Client (nombre, Apellidos,ed, Cedula,Fecha,Direccion,tele);
		} 
    } 
    public void MOstrar(){
        Client arrayObjetos[]=new Client[10];
        for (int i=0;i<arrayObjetos.length;i++) {
            System.out.println(" los datos del cliente son: ");
            System.out.println(arrayObjetos[i]);
        }
    }
    public void Actualizar_datos(){
         Client arrayObjetos[]=new Client[10];
		for (int i=0;i<arrayObjetos.length;i++){
			//Indicamos cada uno de los parametros del objeto
			String nombre=JOptionPane.showInputDialog("Escribe el nuevo nombre");

			String Apellidos=JOptionPane.showInputDialog("Escribe el nuevo apellido");

			String ed=JOptionPane.showInputDialog("Escribe la nueva edad edad");
			

			String Cedula=JOptionPane.showInputDialog("Escribe la nueva cedula cedula");
			
                        String Fecha=JOptionPane.showInputDialog("escribe la nueva  fecha de nacimiento");

			String Direccion=JOptionPane.showInputDialog("Escribe la nueva direccion");

			String tele=JOptionPane.showInputDialog("Escribe un nuevo  telefono");
                        saldo=200000000;
			arrayObjetos[i]=new Client (nombre, Apellidos,ed, Cedula,Fecha,Direccion,tele);
		}
    }
    public void consignacion(){
     System.out.println(" ingrese el valor a consignar ");
     Scanner lector=new Scanner(System.in);
        con = lector.nextInt();
        saldo=saldo+con;
    }
public void retiro(){
    System.out.println(" ingrese el valor a retirar ");
     Scanner lector=new Scanner(System.in);
        ret = lector.nextInt();
        saldo=saldo+ret;  
}
public void consultar(){
  System.out.println(" el saldo es  "+ saldo);  
}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCon() {
        return con;
    }

    public void setCon(double con) {
        this.con = con;
    }

    public double getRet() {
        return ret;
    }

    public void setRet(double ret) {
        this.ret = ret;
    }
}
