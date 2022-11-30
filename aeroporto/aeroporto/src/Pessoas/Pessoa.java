package Pessoas;

public class Pessoa {
  
  private String name;
  private String nasc;
  private String cpf;

  public Pessoa(String name, String nasc, String cpf) {
    this.name = name;
    this.nasc = nasc;
    this.cpf = cpf;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getNasc() {
    return nasc;
  }
  public void setNasc(String nasc) {
    this.nasc = nasc;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
  
}
