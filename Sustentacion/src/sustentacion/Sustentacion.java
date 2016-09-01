/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class Sustentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nota no fui capaz de usar la buscada con un string//
        //lo hice con codigo espero asi tambien sirva
        System.out.println("BIENVENIDO A LA TIENDA PELUCHITOS.COM" + "\n\n");
        int opcion,n,p,m,cant;
        double cost,costo=0;
        System.out.println("ingrese el numero de productos a registrar");
        Scanner lector=new Scanner(System.in);
            n = lector.nextInt();
      ventas [] ventas1 =new ventas[n];
        do{
            System.out.println("1. agregar producto ");
            System.out.println("2. buscar producto ");
            System.out.println("3. eliminar producto ");
            System.out.println("4. mostrar inventario ");
            System.out.println("5. realizar venta");
            System.out.println("6. mostrar ganancias totales ");
            System.out.println("7. salir");
            opcion = lector.nextInt();
            switch (opcion){
                case 1: 
                    for(int i=0;i<ventas1.length;i++){
                        ventas1[i]=new ventas();
                        ventas1[i].agregar_producto();
                    }
                   break;
                case 2: 
                    System.out.println(" ingrese el codigo del producto a buscar ");  
                         n = lector.nextInt(); 
                         for(int i=0;i<ventas1.length;i++){ 
                        if(n!=i){
                            //System.out.println(" el producto no existe");
                            
                        }
                        else{
                          ventas1[n].Buscar_producto();   
                        }
                    }
                    break;
                case 3:
                    System.out.println(" ingrese el codigo del producto a buscar ");  
                         p = lector.nextInt(); 
                     for(int i=0;i<ventas1.length;i++){
                       if (p!=i) {
                      
                      }else{
                       ventas1[p]=null;
                       ventas1[p].eliminar_producto();
                       }
                        }
                        if ( (p!=0) ) { 
                         }
                        else{
                        for (int j=p ; j<ventas1.length;j++) 
                         ventas1[ j ] = ventas1[ j+1 ] ;
                         n= n - 1 ;}

                    break;
                case 4:
                     for(int i=0;i<ventas1.length;i++){
                     //System.out.println( client1[i]);
                     ventas1[i].mostrar_inventario();
                    }
                    break;
                case 5:
                    System.out.println(" ingrese el codigo del producto a buscar ");  
                         m = lector.nextInt(); 
                         for(int i=0;i<ventas1.length;i++){ 
                        if(m!=i){
                            //System.out.println(" el producto no existe");  
                            
                        }
                        else{
                          ventas1[n].realizar_ventas();
                            cost=ventas1[n].getCant()*ventas1[n].getPrecio();
                            cant=ventas1[n].getCantidad()-ventas1[n].getCant();
                            ventas1[n].setCantidad(cant);
                           ventas1[n].setCosto(cost); 
                        }
                    }
                    break;
                case 6:
                    System.out.println("la ganancia por producto fue");
                    for(int i=0;i<ventas1.length;i++){
                     ventas1[i].Mostrar_ganancias();
                     ventas1[i].mostrar_inventario();
                     costo=costo+ventas1[i].getCoste();
                    }
                     System.out.println("la ganacia total fue" +costo);
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
