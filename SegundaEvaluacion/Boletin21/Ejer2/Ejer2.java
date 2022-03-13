package SegundaEvaluacion.Boletin21.Ejercicio2;

import Boletin21.Ejercicio3.NomNotas;

import javax.swing.*;

public class Ejer2 {
    public static void main(String[] args) {
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos de la lista"));
        float[] nota = new float[elementos];
        String nome[] = new String[elementos];
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Generar Array \n2. numero A/S \n3. Nota media \n4. Nota mas alta \n5. Salir"));
            switch (opcion) {
                case 1:
                    Notas.generarArray(nota);
                    break;
                case 2:
                    Notas.calcularAprobadosSuspensos(nota);
                    break;
                case 3:
                    Notas.calcularNotaMedia(nota);
                    break;
                case 4:
                    Notas.calcularNotaMasAlta(nota);
                    break;
                case 5:
                    NotasNomes.salir();
                    break;
                default:
                    System.out.println("***** Opcion incorrecta");


            }

        } while (opcion < 9);
    }
}