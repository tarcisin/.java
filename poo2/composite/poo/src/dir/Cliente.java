package dir;

public class Cliente implements Pessoa{
  
  private String nome;
  private String produto;

  public Cliente(String nome, String produto) {
    this.nome = nome;
    this.produto = produto;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getProduto() {
    return produto;
  }
  public void setProduto(String produto) {
    this.produto = produto;
  }

  @Override
  public void imprimirNomes() {

    System.out.println(nome + ": " + produto);
    }
}
