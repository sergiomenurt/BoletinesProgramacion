package SegundaEvaluacion.Boletin21.Ejercicio4;

import javax.swing.*;

public class Dni {
    public static int pedirDni() {
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de tu dni sin la letra"));
        return dni;
    }

    public static int calcularResto(int dni) {
        int resto = dni % 23;
        return resto;
    }
    public static void calcularLetra(char[] letras, int resto) {

        System.out.println((letras[resto] + " Es la letra de tu DNI"));
    }
}