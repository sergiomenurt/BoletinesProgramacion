
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    float sueldoFijo, totalVentas, quilometros, diasDesplazados, sueldoBruto;
    
    System.out.println("Introduzca su sueldo fijo: ");
    sueldoFijo=sc.nextFloat();
    
    System.out.println("Introduzca el total de ventas: ");
    totalVentas=sc.nextFloat();
    
    System.out.println("Introduzca el total de kilómetros recorridos: ");
    quilometros=sc.nextFloat();
    
    System.out.println("Introduzca los días que se ha desplazado: ");
    diasDesplazados=sc.nextFloat();
    
    sueldoBruto=sueldoFijo+(5*totalVentas/100)+2*quilometraje+30*diasDesplazados;
    
    System.out.println("Su sueldo bruto es: "+sueldoBruto+"€, y su sueldo líquido es: "+(sueldoBruto-(sueldoBruto*18/100)-36));
    
    }
}
