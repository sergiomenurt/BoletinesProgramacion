package boletin32;

public class Velero extends Barco{

    int mastiles=0;

    public Velero(String matricula, float eslora, int mastiles) {
        super(matricula, eslora);

    }

    public float calcularPrezo(int dias){
        return (10*this.eslora+((8*this.mastiles)+(10*this.eslora))*dias);
    }



}