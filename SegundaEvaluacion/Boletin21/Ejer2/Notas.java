package SegundaEvaluacion.Boletin21.Ejercicio2;

public class Notas {
    public static float[] generarArray(float[] notas) {
        for (int j = 0; j < notas.length; j++) {
            notas[j] = (float) (Math.random() * 10);
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
        for (float nota : notas) {
            sum += nota;
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
}