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
public class Libro extends Publicacion{
    
    private boolean prestado;

   

    public Libro(boolean prestado, int codigo, String titulo, String anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        prestado = false;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return super.toString()+ ", prestado=" + prestado;
    }
    
    @Override
    public int getCodigo(){
        
      return super.getCodigo();
       
    }
    

    @Override
    public String getAnio() {
        
        return super.getAnio();
    }
    
    

   
    
}
