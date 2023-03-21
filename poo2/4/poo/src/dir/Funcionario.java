package dir;

import java.util.Scanner;

public class Funcionario implements Pessoa{

  private String nome;
  private String cargo;


  public Funcionario(String nome, String cargo) {
    this.nome = nome;
    this.cargo = cargo;
  }


  Scanner sc = new Scanner(System.in);

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  @Override
  public void imprimirNomes(){
    System.out.println(nome + ": " + cargo);
  }

}
