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
        int opcion;
        Client client1=new Client("manuel","naranjo","19","1007402885","191192","avenida_industrial","3136933860");
        do{
            System.out.println("1. llenar datos ");
            System.out.println("2. mostar datos ");
            System.out.println("3. modificar datos ");
            System.out.println("4. hacer consignacion ");
            System.out.println("5. hacer retiro");
            System.out.println("6. consultar saldo ");
            System.out.println(" elija una opcion ");
            Scanner lector=new Scanner(System.in);
            opcion = lector.nextInt();
            switch (opcion){
                case 1: 
                   client1.Loading_data();
                   break;
                case 2:
                    client1.Show_data();
                    break;
                case 3: 
                    client1.Actualizar_datos();
                    break;
                case 4:
                    client1.consignacion();
                    break;
                case 5: 
                    client1.retiro();
                    break;
                case 6:
                    client1.consultar();
                    break;
                default: 
                    System.out.println("elija una opcion correcta ");
            }
        }while(opcion!=7);
        }
    }
