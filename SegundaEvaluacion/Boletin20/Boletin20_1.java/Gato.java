package SegundaEvaluacion.Boletin20.Boletin20_1;


public class Gato extends Mamifero implements IPuedeCamina, IPuedeNada{
    @Override
    public void nadar(){
        System.out.println("El gato nada");
    }
}