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
public class Pelicula extends Multimedia{
    
    private String actorPrincipal;
    private String actrizPrincipal;
    
    public Pelicula() {
        
    }

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString()+ "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal ;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

   
    
}
