package dir;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements Pessoa{

  private String nome;
  private List<Pessoa> pessoas = new ArrayList<>();

  public Grupo(String nome, List<Pessoa> pessoas) {
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

  public List<Pessoa> getPessoas() {
    return pessoas;
  }
  public void setPessoas(List<Pessoa> pessoas) {
    this.pessoas = pessoas;
  }


@Override
  public void imprimirNomes(){
    System.out.println(nome + ":");
    for (Pessoa pessoa : pessoas) {
      pessoa.imprimirNomes();
    }
  }
  
}
