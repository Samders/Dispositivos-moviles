/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author Alberth Neerans
 */
public class fibonacci {
    private  int numero,i=1,acum=0,m=0,b=1,fi;

    public fibonacci(int numero) {
        this.numero = numero;
    }
    
    public void fibo(){
    while (i<=numero) {
            //System.out.println(" serie: " + b);
		acum=acum+m;
		fi=m+b;
		m=b;
		b=fi;
		i=i+1;
                System.out.println(" " + m);
}
}
}
