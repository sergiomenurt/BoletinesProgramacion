/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {
    
    private int j;
    private int k;
    private int l;
    
    public void ej1() {
        for(int i=0;i<10;i++){
            int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
            
           
            
            if(num>0){
                
              
                j++;
                
            }
            else
            if(num==0) {
                
              
                k++;
               
            }
            else
              
               l++;
            
                
            }
         System.out.println("Hay "+ j++ +" números negativos "+ k++ +" ceros y "+ l++ +" números positivos" );
        }
     
        
}
