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

  public List<Pessoa> getPessoas() {
    return pessoas;
  }
  public void setPessoas(List<Pessoa> pessoas) {
    this.pessoas = pessoas;
  }
  public String getCurriculos() {
    return curriculos;
  }
  public void setCurriculos(String curriculos) {
    this.curriculos = curriculos;
  }

@Override
  public void imprimirNomes(){
    for (Pessoa pessoa : pessoas) {
      pessoa.imprimirNomes();
    }
  }
  
  @Override
  public void imprimirCurriculos() {
    for (Pessoa pessoa : pessoas) {
      pessoa.imprimirCurriculos();

    }
  }
}
