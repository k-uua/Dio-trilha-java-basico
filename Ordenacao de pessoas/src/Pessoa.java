import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private Boolean altura;

    public Pessoa(String nome, int idade, Boolean altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }    

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Boolean getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

}
class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Boolean.compare(o1.getAltura(), o2.getAltura());
    }


}
