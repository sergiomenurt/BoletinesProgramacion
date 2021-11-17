

package boletin4_1;

public class Main {

    public static void main(String[] args) {
 
      Libro objLi1 = new Libro ();
      objLi1.amosar();
      Libro unlibro = new Libro ();
      unlibro.setAutor("J. K. Rowling");
      unlibro.setTitulo ("Harry Potter y la piedra filosofal");
      unlibro.setAno(1997);
      unlibro.setValoracion(9.2f);
      unlibro.setNumPaginas((short) 233);
      unlibro.amosar();
    }
             
}
