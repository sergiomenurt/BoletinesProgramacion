package SegundaEvaluacion.Boletin21.Ejercicio4;

public class Ejer4 {
    public static void main(String[] args) {
        char letra[] = new char[22];
        char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int numeroResto=Dni.calcularResto(Dni.pedirDni());
        Dni.calcularLetra(letras, numeroResto);
    }
}