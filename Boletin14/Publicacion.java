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
public class Publicacion {
    
    private int codigo;
    private String titulo;
    private String anio;

    public Publicacion() {
    }

    public Publicacion(int codigo, String titulo, String anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }


    public String getAnio() {
        return anio;
    }


    @Override
    public String toString() {
        return  "codigo=" + codigo + ", titulo=" + titulo + ", anio=" + anio;
    }
    
    
    
}
