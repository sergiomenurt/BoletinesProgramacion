package SegundaEvaluacion.Boletin21.Ejercicio3;

import javax.swing.*;

public class NomNotas {
    public static float[] generarArray(float[] notas, String[] nomes) {
        for (int j = 0; j < notas.length; j++) {
            notas[j] = (float) (Math.random() * 10);
            nomes[0] = "Laura";
            nomes[1] = "Hugo";
            nomes[2] = "Antonio";
            nomes[3] = "Alberto";
            nomes[4] = "Noelia";
            nomes[5] = "Santiago";
            nomes[6] = "Nuria";
            nomes[7] = "Celia";
            nomes[8] = "Carlos";
            nomes[9] = "Sofia";
            nomes[10] = "Sara";
            nomes[11] = "Manuel";
            nomes[12] = "María";
        }
        return notas;
    }

    public static void calcularAprobadosSuspensos(float[] notas) {
        int suspensos = 0;
        int aprobados = 0;
        for (int j = 0; j < notas.length; j++) {
            if (notas[j] < 5) {
                System.out.println(j + " Suspensos: " + notas[j]);
                suspensos++;
            } else {
                System.out.println(j + " Aprobados: " + notas[j]);
                aprobados++;
            }
        }
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
    }

    public static void calcularNotaMedia(float[] notas) {
        float sum = 0;
        for (int j = 0; j < notas.length; j++) {
            sum += notas[j];
        }
        System.out.println("Nota media = " + sum / notas.length);
    }

    public static float calcularNotaMasAlta(float[] notas) {
        float mayor = notas[0];
        for (int k = 1; k < notas.length; k++) {
            if (mayor < notas[k]) {
                mayor = notas[k];
            }
        }
        System.out.println("La nota mas alta es: " + mayor);
        return mayor;
    }

    public static float[] ordenarLista(float[] notas, String[] nomes) {
        float aux;
        String aux2;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = (float) notas[i];
                    aux2 = nomes[i];
                    nomes[i] = nomes[j];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    nomes[j] = aux2;
                }
            }
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nome: " + nomes[i] + " --> " + notas[i]);
        }
        return notas;
    }

    public static void calcularAprobados(float[] notas, String[] nomes) {
        int aprobados = 0;
        for (int j = 0; j < notas.length; j++) {
            if (notas[j] < 5) {
                aprobados++;
                System.out.println(j + " Aprobados: " + nomes[j] + notas[j]);
            }
        }
    }

    public static int amosarNotaTeclado(String[] nomes, float[] notas) {
        String nomeBuscar = JOptionPane.showInputDialog("Teclea alumno a buscar");
        int atopado = 0; //non está
        int posicion = 0;
        for (int i = 0; i < nomes.length; i++) {
            if (nomeBuscar.equals(nomes[i])) {
                System.out.println(("A nota de " + nomeBuscar + " é " + notas[i]));
                posicion = i;
                atopado = 1;
                break;
            }
        }
        if (atopado == 0) {
            System.out.println("non está");
            posicion = -1;
        }
        return posicion;
    }

    public static void salir() {
        System.exit(0);
    }
}