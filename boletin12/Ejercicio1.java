/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {
    
    private int numeroCoches;
    private int matricula;
    
    public void aparcar(){
        
        final float precioMinimo = 1.5f;
        final float precioExtra = 0.2f;
        final int cochesMaximos = 5;
        float precio;
        
        int tiempo;
        float tiempoExtra;
        float cartosDevoltos;
        float cartosRecibidos;
        
        numeroCoches = darNumeroCoches();
        
        while(numeroCoches<cochesMaximos){
            
            System.out.println("PLAZAS DISPOÑIBLES");
            numeroCoches++;
            
            matricula = darMatricula();
            
            tiempo = Integer.parseInt(JOptionPane.showInputDialog("Indique el tiempo que estuvo su coche en el estacionamiento"));
            
            if(tiempo<180){
                
                precio=precioMinimo;
            }
            
            else{
                
                tiempoExtra = (tiempo-180)/60;
                precio = precioMinimo + tiempoExtra*precioExtra;
                
                
            }
           
            
            
            System.out.println("Debe pagar "+precio+" euros");
            
            cartosRecibidos = Integer.parseInt(JOptionPane.showInputDialog("Indica el pago realizado"));
            
            cartosDevoltos = cartosRecibidos - precio;
            
            System.out.println("FACTURA \nMatricula del coche "+matricula+"\nTiempo en el garaje "+tiempo+"\nPrecio total "+precio+"\nCartos recibidos "+cartosRecibidos+"\nCartos devoltos "+cartosDevoltos+"\nGRAZAS POR USAR O NOSO APARCADOIRO");
                 
        }
        
        
        System.out.println("GARAXE COMPLETO");
    }
    
    
    public int darNumeroCoches(){
        
        numeroCoches = Integer.parseInt(JOptionPane.showInputDialog("Indique el número de coches estacionados en el garaje"));
        return numeroCoches;
    }
    
    public int darMatricula(){
        
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Indique la matrícula"));
        return matricula;
        
        
    }
    
}
