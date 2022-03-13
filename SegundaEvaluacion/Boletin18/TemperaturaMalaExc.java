package Boletin18;


public class TemperaturaMalaExc extends Exception{
    public TemperaturaMalaExc(){
        super();
    }
    public TemperaturaMalaExc(String mensaje){
        super(mensaje);
    }
}