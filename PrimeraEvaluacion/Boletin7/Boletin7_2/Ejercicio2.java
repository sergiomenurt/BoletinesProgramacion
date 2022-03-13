/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {
    public void ej2() {
        
        
        
    short num1 = lernum();
    short num2 = lernum();
    
    if(num1>=num2) {
        System.out.println("La resta da : "+(num1-num2)+ "\nY la suma : " +(num1+num2));
    }
    else {
        System.out.println("La suma da : "+(num1+num2));
    }
    
    }
    public short lernum() {
       short num = Short.parseShort(JOptionPane.showInputDialog("Teclea un número : "));
       return num;
    }
    
    
        
    }
    


