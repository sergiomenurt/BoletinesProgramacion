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
    
    public Sueldos() {
        
        
    }
    
    public void calculos() {
        
        int nTrab=0, nSueldoRango=0, nMenorMil=0;
        float porcentaje=0;
        double sueldo=1;
    }
    while(sueldo!=0){
    
    
    sueldo=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un sueldo :"));
    
    nTrab++;
    if(sueldo!=0) {
        
        System.out.println(sueldo);
        if(sueldo>=1000&&sueldo<=1750) {
            nSueldoRango++;
            
        }else if(sueldo<1000) {
            
            nMenorMil++;
            porcetaje = (100/nTrab)*nMenorMil;
        }
    }
    
    
    
    
}
}
