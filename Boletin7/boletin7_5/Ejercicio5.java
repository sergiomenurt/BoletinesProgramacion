/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio5 {
    public void ej5() {
        
        
    int num1 = lerEnteiro();
    int num2 = lerEnteiro();
    int num3 = lerEnteiro();
           
      
      
      if(num1>num2) {
          
          
          
          if(num1>num3){
              System.out.println(num1+" es el mayor de los tres números");
          }
          else if(num1<num3) {
                System.out.println(num3+" es el mayor de los tres números");
            }
              
          
         
      }
         
    
      else if(num2>num1) {
         
          
          if(num2>num3){
              System.out.println(num2+" es el mayor de los tres números");
          }
              else if(num2<num3) {
                System.out.println(num3+" es el mayor de los tres números");
            }
          
      }
    

        
    }
    private int lerEnteiro() {
             
     String resposta= JOptionPane.showInputDialog(" Teclea número entero :");
     int num =Integer.parseInt(resposta);
     return num;
    }
          
      
    

    
}
