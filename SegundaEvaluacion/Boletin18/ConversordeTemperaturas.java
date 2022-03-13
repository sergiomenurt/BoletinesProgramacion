package Boletin18;


public class ConversorTemperaturas {

    float Fharenheit;
    float Reamur;
    final float centigrados= 80;

    public float centigradosAFharenheit(float centigrados)throws TemperaturaErradaException{

        if(centigrados<80)
            throw new TemperaturaErradaException("Recuerda que la temperatura no puede ser menor a 80ºC");

        else
            Fharenheit= (float) (9.0/5.0*centigrados+32.4);

        System.out.println("La temperatura en fharenheit es de "+Fharenheit+"ºF");
        return Fharenheit;

    }


    public void centigradosAReamur(float centigrados)throws TemperaturaErradaException{

        if(centigrados<80)
            throw new TemperaturaErradaException("Recuerda que la temperatura no puede ser menor a 80ºC");

        else
            Reamur=(float) (4.0/5.0*centigrados);
        System.out.println("La temperatura en reamur es de "+Reamur+"ºRe");
    }
}