/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int metro = 1852;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Da la distancia en millas marinas: ");
        float millaMarina= sc.nextFloat();
        float distanciaMetros= metro*millaMarina;
        
        System.out.println(millaMarina+" millas marinas son "+distanciaMetros+" metros");
        
        
              
    }
    
}
