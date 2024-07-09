import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {
    private List<Livro> livroList;
    
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    //Método para adicionar livros;
    public void adicionarLivros(String autor, String titulo, int anoPublicacao){
        livroList.add(new Livro(autor, titulo, anoPublicacao));
    }

    //Método para pesquisar por autor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Método para pesquisar em um intervalo de ano
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeANo =  new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro i : livroList){
                if(i.getAnoPublicacao() >= anoInicial && i.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeANo.add(i);
                }
            }
        }
        return livrosPorIntervaloDeANo;
    }

    //Método para pesquisar por titulo
    public Livro pesquisarPorTitulo(String titulo) throws LivroNaoEncrontradoException{
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro t : livroList){
                if(t.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = t;
                break;
                }
            }
        }
        if (livroPorTitulo == null) {
            throw new LivroNaoEncrontradoException(); 
        }
        return livroPorTitulo;
    }
    
}
