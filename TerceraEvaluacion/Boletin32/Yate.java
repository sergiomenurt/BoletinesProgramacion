package boletin32;

public class Yate extends Barco{

    float potencia;
    int camarotes;

    public Yate(String matricula, float eslora, float potencia, int camarotes) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public float calcularPrezo(int dias){
        return(10*this.eslora+((2*this.potencia)+(25*this.camarotes))*dias);
    }

}v