package SegundaEvaluacion.Boletin21.Ejercicio3;

import javax.swing.*;

public class Ejer3 {
    public static void main(String[] args) {
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos de la lista"));
        float[] nota = new float[elementos];
        String nome[] = new String[elementos];
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Generar Array \n2. numero A/S \n3. Nota media \n4. Nota mas alta \n5. Nota alumno \n6. Ordenar las notas \n7. Alumnos aprobados \n8. Nota alumno teclado \n9. Salir"));
            switch (opcion) {
                case 1:
                    NotasNomes.generarArray(nota, nome);
                    break;
                case 2:
                    NotasNomes.calcularAprobadosSuspensos(nota);
                    break;
                case 3:
                    NotasNomes.calcularNotaMedia(nota);
                    break;
                case 4:
                    NotasNomes.calcularNotaMasAlta(nota);
                    break;
                case 5:

                    break;
                case 6:
                    NotasNomes.ordenarLista(nota, nome);
                    break;
                case 7:
                    NotasNomes.calcularAprobados(nota, nome);
                    break;
                case 8:
                    NotasNomes.amosarNotaTeclado(nome, nota);
                case 9:
                    NotasNomes.salir();
                    break;
                default:
                    System.out.println("***** Opcion incorrecta");


            }

        } while (opcion < 9);
    }
}