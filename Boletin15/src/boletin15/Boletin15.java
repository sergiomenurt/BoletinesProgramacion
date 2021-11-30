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
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Disco unDisco = new Disco("Rock alternativo","Nirvana", "Nevermind", "WAV", 42);
        System.out.println(unDisco.getXenero());
        System.out.println(unDisco);
        
        Pelicula unaPelicula = new Pelicula("Josh Hutcherson", "Jennifer Lawrence", "Los juegos del hambre", "Suzanne Collins", "35mm", 142);
        System.out.println(unaPelicula.getActrizPrincipal());
        System.out.println(unaPelicula);
    
}
}
