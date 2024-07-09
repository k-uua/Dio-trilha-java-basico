
public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public int compareTo(Livro o) {
        return Integer.compare(anoPublicacao, o.getAnoPublicacao());
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
    }
    
}

