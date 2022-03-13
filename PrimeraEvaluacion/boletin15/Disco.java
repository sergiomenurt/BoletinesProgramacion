/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author dam1
 */
public class Disco extends Multimedia{
    
    private String xenero;
    
    public Disco() {
       
    }

    public Disco(String xenero) {
        this.xenero = xenero;
    }

    public Disco(String xenero, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+", xenero=" + xenero ;
    }

    public String getXenero() {
        return xenero;
    }
    
}
