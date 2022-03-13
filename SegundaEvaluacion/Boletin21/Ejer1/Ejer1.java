package SegundaEvaluacion.Boletin21.Ejercicio1;

public class Ejer1 {
    public static void main(String[] args) {
        int numeros[] = new int[6];
        int aleatorio = (int) (Math.random() * 50) + 1;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1;
        }

        System.out.println("Indice\tValor");
        for (
                int contador = 0;
                contador < numeros.length; contador++)
            System.out.println(contador + "\t" + numeros[contador]);


        System.out.println();
        System.out.println("Indice\tValor");
        for (
                int contador = numeros.length - 1;
                contador >= 0; contador--)
            System.out.println(contador + " \t" + numeros[contador]);
    }
}