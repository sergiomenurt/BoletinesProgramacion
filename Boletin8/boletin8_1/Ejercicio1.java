/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {
    public void ej1() {
        
        
    }
    
    private int cventas;
    private String nome;
    
    public Clasificacion(String a, int b) {
        
        cventas=b;
        
        
    String nomeArtigo = lerString();
  
    
    int vendasAnuais = lerEnteiro();
    
        
    if(vendasAnuais>) {
          
          
          
          if(vendasAnuais){
              System.out.println(num1+" es el mayor de los tres números");
          }
          else if(vendasAnuais) {
                System.out.println(num3+" es el mayor de los tres números");
            }
              
          
         
      }
         
    
      else if(vendasAnuais) {
         
          
          if(vendasAnuais){
              System.out.println(num2+" es el mayor de los tres números");
          }
              else if(vendasAnuais) {
                System.out.println(num3+" es el mayor de los tres números");
            }
          
    }


}

    private int lerEnteiro() {
        String  vendasAnuais = JOptionPane.showInputDialog("Teclea o número ed vendas anuais :");
        return vendasAnuais;
    }
        
    
    
    
}
