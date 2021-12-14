package Boletin6.Boletin6_3;

public class Circulo {

    private double radio;
    private static final double pi=3,14;

    public Circulo(){


    }

    public Circulo(double r){
        radio = r;
    }

    public void setRadio(double r){
        radio=r;
    }

    public double getRadio(){
        return radio;
    }

    public double calcularArea(){
        double area = pi*Math.pow(radio, (double)2);
        return area;
    }

    public double calcularLonxitude(){
         double lonxitude = 2*p1*radio;
         return lonxitude;
    }


}
