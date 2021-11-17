/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {
    
    private int S = 0;
    private double P = 1;
  
    public void ej2() {
        
       for(int contador=10;contador<90;contador++){
           S= S+contador;
           P=P*contador;
       }
           
           System.out.println("La suma de todos los números entre 10 y 90 es "+S+" y su producto sería igual a "+P);
       }
    
    

}
