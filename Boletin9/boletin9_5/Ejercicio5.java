/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio5 {
    
    public void contarSalarios(){
        
        int i = 0;
        int j = 0;
        int k = 0;
        float porcentaje = 0;
        float salario = pedirSalario();
        
        while(salario!=0){
            
            if(salario<0){
                
                
            }
            else{
                
                i++;
                if(salario>=1000&&salario<=1750){
                    k++;
                }
                
                else if(salario<1000){
                    
                    j++;
                    porcentaje = 100*i/j;

                }
 
            }
            
            salario = pedirSalario();
            
        }
        
        System.out.println(k+" trabajadores ganan entre 100 y 1750 euros y el "+porcentaje+"% cobran menos de 1000€");
        
    }

    private float pedirSalario() {
       float salario = Float.parseFloat(JOptionPane.showInputDialog("Introduce el salario: "));
       return salario;
    }
    
    
}
