package classes.Pessoas;

public class Jogador extends Pessoa {
  private String nacionalidade;
  private String posicaoString;
  private boolean titular;
  private int qtdCartao = 0;

  public Jogador(String nome, String nacionalidade, String posicaoString, boolean titular) {
    super(nome);
    this.nacionalidade = nacionalidade;
    this.posicaoString = posicaoString;
    this.titular = titular;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getPosicaoString() {
    return posicaoString;
  }

  public void setPosicaoString(String posicaoString) {
    this.posicaoString = posicaoString;
  }

  public boolean isTitular() {
    return titular;
  }

  public void setTitular(boolean titular) {
    this.titular = titular;
  }

  public int getQtdCartao() {
    return qtdCartao;
  }

  public void setQtdCartao(int qtdCartao) {
    this.qtdCartao = qtdCartao;
  }

  
}
