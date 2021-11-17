package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double Fahrenheit, gradosCelsius, Kelvin;
        
        System.out.println("Introduzca la cantidad de grados Celsius que desea convertir:");
        gradosCelsius =sc.nextDouble();
        Kelvin=Celsius+273;
        Fahrenheit=Celsius*1.8+32;
    
        
        System.out.println(Celsius+" grados celsius son : "+Fahrenheit+" grados Fahrenheit y "+Kelvin+" grados Kelvin");
    }
}
