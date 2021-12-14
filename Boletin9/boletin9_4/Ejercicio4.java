/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio4 {
    
    public void calcularMultiplo(){
        
        String numero;
        
        numero = JOptionPane.showInputDialog("Introduce un número: ");
        int num1 = Integer.parseInt(numero);
        
        while(num1>0){
            
            for(int i=1;i<=1;i++){
                
                System.out.println(num1+" x "+i+"="+num1*i);
            }
            
            JOptionPane.showInputDialog("Introduce un número: ");
        }
            
        
    }
    
    
}
