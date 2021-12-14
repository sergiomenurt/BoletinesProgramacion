/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public void juego(){

        int numero;
        int distanciaNumeros;
        int i = 0;

        Random objRandom = new Random();

        int numeroAleatorio = 1 + objRandom.nextInt(50-1);

        do{

            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de 1 a 50"));

            if(numero==numeroAleatorio){

                System.out.println("ACERTASTE EL NÚMERO");
            }

            else{

                i++;

                distanciaNumeros = Math.abs(numero-numeroAleatorio);

                if(distanciaNumeros>20){
                    System.out.println("Moi lonxe");
                }

                else if(distanciaNumeros<=20&&distanciaNumeros>=10){

                    System.out.println("Lonxe");
                }

                else if(distanciaNumeros<10&&distanciaNumeros>5){
                    System.out.println("Preto");
                }

                else{
                    System.out.println("Moi preto");
                }


            }

        }while(numero!=numeroAleatorio);

    }
}