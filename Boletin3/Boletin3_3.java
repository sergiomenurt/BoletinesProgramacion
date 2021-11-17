package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int b100, b20, b5, m1;
    
    System.out.println(" Introduzca los billetes de 100€ ");
    b100=sc.nextInt();
    
    System.out.println(" Introduzca los billetes de 20€ ");
    b20=sc.nextInt();
    
    System.out.println(" Introduzca los billetes de 5€ ");
    b5=sc.nextInt();
    
    System.out.println(" Introduzca los monedas de 1€ ");
    m1=sc.nextInt();
    
    System.out.println(" El total intoducido es de= "+(b100 "bielletes de 100"+b20 "billetes de 20"+b5 "billetes de 5"+m1 "monedas de 1")+"€");
    
    }
}
