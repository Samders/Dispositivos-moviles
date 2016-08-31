/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Alberth Neerans
 */
public class direccion extends nombre{
    private  String calle,ciudad,provincia,codigo;
    public void Dir(){
        Scanner lector=new Scanner(System.in);
      System.out.println(" digite su calle");
       calle=lector.next();
       System.out.println(" digite su ciudad");
       ciudad=lector.next();
       System.out.println(" digite su provincia");
       provincia=lector.next();
        System.out.println(" digite su codigo postal");
       codigo=lector.next();
    }
    public void nuevo_nombre(){
        Scanner lector=new Scanner(System.in);
      System.out.println(" digite su nuevo nombre");
        setNombre(lector.next());
       System.out.println(" digite su primer apellido");
        setApellido1(lector.next());
       System.out.println(" digite su segundo apellido");
        setApellido2(lector.next());
    }
    public void nueva_dir(){
      Scanner lector=new Scanner(System.in);
      System.out.println(" digite su nueva calle");
       calle=lector.next();
       System.out.println(" digite su nueva ciudad");
       ciudad=lector.next();
       System.out.println(" digite su nueva provincia");
       provincia=lector.next();
        System.out.println(" digite su nuevo codigo postal");
       codigo=lector.next();
    }
    public void mostrare(){
       System.out.println(""+ calle );
       System.out.println(""+ ciudad );
       System.out.println(""+ provincia );
       System.out.println(""+ codigo);
    }
}

