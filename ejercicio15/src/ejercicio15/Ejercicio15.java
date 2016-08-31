/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion,n,pos,p,po,pe;
        System.out.println("ingrese el numero de clientes a registrar");
        Scanner lector=new Scanner(System.in);
            n = lector.nextInt();
        Client [] client1=new Client[n];
        do{
            System.out.println("1. llenar datos ");
            System.out.println("2. mostar datos ");
            System.out.println("3. modificar datos ");
            System.out.println("4. hacer consignacion ");
            System.out.println("5. hacer retiro");
            System.out.println("6. consultar saldo ");
            System.out.println("7. salir");
            System.out.println(" elija una opcion ");
            opcion = lector.nextInt();
            switch (opcion){
                case 1: 
                    for(int i=0;i<client1.length;i++){
                        client1[i]=new Client();
                     client1[i].Loading_data();   
                    }
                   break;
                case 2:
                    for(int i=0;i<client1.length;i++){
                     //System.out.println( client1[i]);
                     client1[i].Show_data();
                    }
                   
                    break;
                case 3:
                  System.out.println(" ingrese el codigo del cliente a modificar ");  
                   pos = lector.nextInt();
                  client1[pos].Actualizar_datos();
                    break;
                case 4:
                    System.out.println(" ingrese el codigo del cliente para hacer consignacion ");  
                   po = lector.nextInt();
                    client1[po].consignacion();
                    break;
                case 5:
                    System.out.println(" ingrese el codigo del cliente para hacer retiro ");  
                   p = lector.nextInt();
                    client1[p].retiro();
                    break;
                case 6:
                    System.out.println(" ingrese el codigo del cliente para consultar saldo ");  
                   pe = lector.nextInt();
                    client1[pe].consultar();
                    break;
                case 7:
                    System.out.println("gracias por utilizar el servicio");
                    break;
                default: 
                    System.out.println("elija una opcion correcta ");
            }
        }while(opcion!=7);
        }
    }
