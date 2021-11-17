package boletin4_1;

public class Libro {

    // atributos

    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    // constructores

    public Libro () {
        
    }

        public Libro(String titulo, String autor, int ano, short numPaginas, float valoracion) {
            
        
          this.titulo = titulo;
          this.autor = autor;
          this.ano = ano;
          this.numPaginas = numPaginas;
          this.valoracion = valoracion;
            
        }
        
        public String getTitulo() {
           return titulo;
        }
        
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        
        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getAutor() {
            return autor;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public int getAno() {
            return ano;
        }

        public void setNumPaginas(short numPaginas) {
            this.numPaginas = numPaginas;
        }

        public short getNumPaginas() {
            return this.numPaginas;
        }

        public void setValoracion(float valoracion) {
            this.valoracion = valoracion;
        }

        public float getValoracion() {
            return valoracion;
        }

        public void amosar(){
            
            System.out.println("titulo : "+ titulo + "\n autor : "+ autor+"\n ano : "+ano+"\n numPaginas : "+numPaginas+"\n valoracion : "+valoracion);

        }
         public void amosar2(String titulo, String autor){
            
            System.out.println("titulo : "+ titulo + "\n autor : "+ autor+"\n ano : "+ano+"\n numPaginas : "+numPaginas+"\n valoracion : "+valoracion);
}
}