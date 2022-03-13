/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio4 {
    public void ej4() {
    
    String nome1 = lerString();
    String nome2 = lerString();
  
    
    double peso1 = lernum();
    double peso2 = lernum();
        
    if(peso1>peso2) {
        System.out.println(nome1+" es la persona que más pesa de los dos y pesa "+peso1+" kilos");
          System.out.println("La diferencia de peso es de :"+(peso1-peso2) +" kilos");
      }
      else if(peso1<peso2) {
          System.out.println(nome2+" es la persona que más pesa de los dos y pesa "+peso2+" kilos");
          System.out.println("La diferencia de peso es de :"+ (peso2-peso1) +" kilos");
      }
      
    
    
    
    
    
    
    }

    private double lernum() {
        String resposta = JOptionPane.showInputDialog("Teclea un número :");
        Double num =Double.parseDouble(resposta);
        return num;
    }

    private String lerString() {
       String nome = JOptionPane.showInputDialog("Teclea un nome :");
        return nome;

   
}
}