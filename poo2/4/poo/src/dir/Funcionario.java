package dir;

import java.util.Scanner;

public class Funcionario implements Pessoa{

  private String nome;
  private String curriculo;
  private String cargo;


  public Funcionario(String nome) {
    this.nome = nome;
  }


  Scanner sc = new Scanner(System.in);

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCurriculo() {
    return curriculo;
  }
  public void setCurriculo(String curriculo) {
    this.curriculo = curriculo;
  }
  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public void adicionarCurriculo(){
    String probe = "";
    System.out.println("-----------------// Currículo // ------------------");
    System.out.println("Insira o nome:");
    probe = sc.next();
    curriculo += probe;
    nome = probe;
    probe = "";
    System.out.println("Ano de nascimento:");
    probe = sc.next();
    curriculo += probe;
    probe = "";
    System.out.println("Formações:");
    probe = sc.next();
    curriculo += probe;
    probe = "";
    System.out.println("Experiências profissionais:");
    probe = sc.next();
    curriculo += probe;
    probe = "";
  }

  @Override
  public String obterNomes(){
    System.out.println(nome);
    return nome;
  }


  @Override
  public String obterCurriculo() {
    return getCurriculo();
  }

}
