package boletin32;

import javax.swing.JOptionPane;

public abstract class Barco {

    String matricula = "";
    float eslora= 0f;

    public Barco(String matricula, float eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
    }

    public abstract float calcularPrezo(int dias);


}