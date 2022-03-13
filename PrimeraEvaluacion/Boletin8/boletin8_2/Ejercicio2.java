/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

import javax.swing.*;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {
    private float superficie;

    String figura = JOptionPane.showInputDialog("Ingresa el nombre de una figura: ");

   public ej2() {

       switch(float superficie) {

           case "Triangulo":

               public float base;
               public float altura;

           System.out.println(" Teclea la base: ");
           System.out.println(" Teclea la altura");

           public float setSuperficie() {
               superficie= base*altura/2;
           }

           public float getVelocidade() {
               return superficie;
           }

           break;

           case "Cuadrado":

               public float lado;

               System.out.println(" Teclea el lado");

               public float setSuperficie() {
               superficie= lado*lado;
           }

           public float getSuperficie() {
               return superficie;
           }

               break;

           case "Circulo":

               public float radio;


               System.out.println(" Teclea el radio");

               public float setSuperficie() {
               superficie=(radio*3.14);
           }

           public float getVelocidade() {
               return superficie;
           }

           break;

           default:
               System.out.println(" Opción incorrecta");

       }

   }



}


