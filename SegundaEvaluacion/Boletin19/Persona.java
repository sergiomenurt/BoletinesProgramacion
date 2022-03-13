package SegundaEvaluacion.Boletin19;

public class Persona implements IPuedeCantar{
    @Override
    public void cantar() {
        System.out.println("DO,RE,MI,FA,SOL,LA,SI");
    }
}