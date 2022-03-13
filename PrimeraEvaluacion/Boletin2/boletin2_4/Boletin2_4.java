/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Indica un número: ");
        float num1 = sc.nextFloat();
        System.out.println("Indica otro número: ");
        float num2 = sc.nextFloat();
        
        float suma = num1 + num2;
        System.out.println("La suma de "+num1+" y "+num2+" es "+suma);
        
        float resta1 = num1 - num2;
        float resta2 = num2 - num1;
        System.out.println("La resta de "+num1+ " y "+num2+" es "+resta1+" o "+resta2);
        
        float multiplicacion = num1*num2;
        System.out.println("La multiplicación de "+num1+" y "+num2+" es "+multiplicacion);
        
        float division1 = num1/num2;
        float division2 = num2/num1;
        System.out.println("La division de "+num1+ " y "+num2+" es "+division1+" o "+division2);
        
    }
    
}
