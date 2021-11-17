
package boletin3_1;

import java.util.Scanner;

public class Boletin3_1 {

    
    public static void main(String[] args){
       float precioPagado, original;
       Scanner sc=new Scanner(System.in);
       System.out.println("introduzca el precio pagado");
       precioPagado=sc.nextFloat();
       System.out.println("Introduzca el precio original ");
       original=sc.nextFloat();
       System.out.println("El descuento aplicado ha sido del"+ (100.0-(100*pagado/original))+"%");
    }
}
