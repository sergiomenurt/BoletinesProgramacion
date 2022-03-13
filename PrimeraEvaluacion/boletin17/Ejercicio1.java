/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {
    
    float probaPractica;
    
    private float resultado;
    
    private float probasTeoricas;
    private float probat1 ;
    private float probat2;
    
    private float boletins;
    private float notaBoletins;
    
    private float notaFinal;
    
    String buscarNuevaNota;
    
    public void darNota(){
        
        do{
            
            boletins = Float.parseFloat(JOptionPane.showInputDialog("Inserta el número de boletines entregados"));
            boletins = boletins*100/10;
            
            if(boletins>90){
                
                notaBoletins = 2;
                
            }
            else if(boletins<=90&&boletins>=70)
                
                notaBoletins=1;
            
            else
                notaBoletins=0;
            
            
            probat1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del primer examen teórico"));
            probat2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del segundo examen teórico"));
            
            probasTeoricas = (float) ((probat1+probat2)/2*0.4);
            
            probaPractica = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del exámen práctico"));
            
            probaPractica =(float) (probaPractica*0.4);
        

            notaFinal = probasTeoricas+probaPractica+notaBoletins;
            
            JOptionPane.showMessageDialog(null, "Tu nota final es: "+notaFinal);
            
            buscarNuevaNota = JOptionPane.showInputDialog("¿Quieres calcular otra nota?");
        
        
        }while(!buscarNuevaNota.equals("no"));
        
}

}
