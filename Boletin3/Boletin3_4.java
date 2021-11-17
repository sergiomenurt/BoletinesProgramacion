
package boletin3_4;

import java.util.Scanner;

public class Boletin3_4 {

    
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int cantidadTotal, b100, b20, b5, m1;
    System.out.println("Introduzca la cantidad total: ");
    
    cantidadTotal=sc.nextint();
    
    b100=total/100;
    b20=(total%100)/20;
    b5=(total%20)/5;
    m1=(total%5)/1;
    
    System.out.println("Tiene "+b100+" billetes de 100€, "+b20+" billetes de 20€, "+b5+" billetes de 5€ y "+m1+" monedas de 1€");
   
    }
}
