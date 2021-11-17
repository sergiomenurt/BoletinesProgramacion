/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {
     public void ej3() {
         
      int num1 = lerEnteiro();
      
      
      if(num1>0) {
          System.out.println("+");
      }
      else if(num1 == 0) {
          System.out.println("0");
      }
      else{
          System.out.println("-");

      }
             
          
      
    }
    
    
    public int lerEnteiro () {
        
     String resposta= JOptionPane.showInputDialog(" Teclea número entero :");
     int num =Integer.parseInt(resposta);
     return num;
            
     
    }
}
    
    
    

