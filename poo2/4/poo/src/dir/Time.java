package dir;

import java.util.ArrayList;
import java.util.List;

public class Time implements Pessoa{

  private String nome;
  private List<Pessoa> pessoas = new ArrayList<>();
  private String curriculos;

  public Time(String nome, List<Pessoa> pessoas) {
    this.nome = nome;
    this.pessoas = pessoas;
  }
  public void adicionar(Pessoa pessoa){
    this.pessoas.add(pessoa);
  }
  public void apagar(int posicao){
    this.pessoas.remove(posicao);
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
@Override
  public String obterNomes(){
    String nomes = "";
    for (Pessoa pessoa : pessoas) {
      pessoa.obterNomes();
      nomes += pessoa.obterNomes();
    }
    return nomes;
  }
  
  @Override
  public String obterCurriculo() {
    for (Pessoa pessoa : pessoas) {
      curriculos += pessoa.obterCurriculo();
      curriculos += "\n";
    }
    return curriculos;
  }
}
