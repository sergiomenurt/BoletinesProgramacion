/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Euros para cambiar: ");
        float euro = sc.nextFloat();
        System.out.println("Valor de cambio: ");
        float cambioed = sc.nextFloat();
        float dolar = euro*cambioed;
        System.out.println("por " + euro+ " euros, recibes " + dolar+ " dólares");
        
        
    }
    
}
