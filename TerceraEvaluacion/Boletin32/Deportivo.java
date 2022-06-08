package boletin32;

public class Deportivo extends Barco{

    float potencia;

    public Deportivo(String matricula, float eslora, float potencia) {
        super(matricula, eslora);
        this.potencia = potencia;
    }

    public float calcularPrezo(int dias){
        return(10*this.eslora+(2*this.potencia)*dias);
    }
}