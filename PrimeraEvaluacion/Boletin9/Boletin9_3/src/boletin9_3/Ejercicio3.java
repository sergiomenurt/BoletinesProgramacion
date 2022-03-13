/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {
    
    public void ej3() {
        
    int base;
    int altura;
    float area=0;
     
        do{
             base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base: "));
             altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura: "));
            
             
             
             if(base>0&&altura>0){
                 area= base*altura/2;
                 System.out.println("El área es "+area);
             }
             else
                  System.out.println("Los valores tienen que ser positivos");
             
        }while(base<0||altura<0);{
           
        
            
           
    }
}
}
