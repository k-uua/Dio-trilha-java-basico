import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa(){
    this.pessoaList = new ArrayList<>();
  }
    

  public void adicionarPessoa(String nome, int idade, Boolean altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordernarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoaPorAltura = new ArrayList<>();
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
    return pessoaPorAltura;
  }
}
