/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {
    
    int num1;
    int numIntentos;
    int num2;
    
    
    public void ej1() {
        
        num1 = validarNum1() ;
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de intentos"));
        num2 = validarNum2();
        
        
        
        int i=0;
            
        while (num1!=num2) {
            
            
                i++;
            
            if(i>=numIntentos) {
                
                System.out.println("Se te acabaron los intentos");
                break;
          
            }
            else
                
                if(num1>num2){
                    
                    System.out.println("El número que buscamos es mayor");
                    num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                   
                }
                else{
                     System.out.println("El número que buscamos es menor");
                     num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                }
                
            
        }
           
           if(num1==num2) {
               System.out.println("Es el número que buscábamos");
           }     
            
    }
           
           public int validarNum1() {
               
               do{
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número a adivinar entre 1 y 50"));
                    
                    
               }while(num1>50||num1<0);
               return num1;
              
               
           }
            public int validarNum2() {
               
               do{
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número a adivinar entre 1 y 50"));
                    
                    
               }while(num2>50||num2<0);
               return num2;
              
               
           }
           
           
           
            
        

    
}
   
        
        
        

   
    

