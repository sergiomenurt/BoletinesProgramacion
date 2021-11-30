/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author dam1
 */
public class Revista  extends Publicacion{
    
    private int numero;

    public Revista() {
    }

    public Revista(int numero, int codigo, String titulo, String anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + ", numero=" + numero;
    }
    
    
    
    

    
    
    
    
}
