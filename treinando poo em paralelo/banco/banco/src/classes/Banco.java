package classes;

public class Banco {

  public int numConta;
  protected String tipoConta;
  private String dono;
  private float saldo;
  private boolean status;

  public void abrirConta(String t){
    this.setStatus(true);
    this.setTipoConta(t);
    if(t.equals("CC")){
      this.setSaldo(20);
    }
    else if(t.equals("CP")){
      this.setSaldo(150);
    }
  }

  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public String getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(String tipoConta) {
    this.tipoConta = tipoConta;
  }

  public String getDono() {
    return dono;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public boolean getStatus() {
    return status;
  }
  
  public void setStatus(boolean status) {
    this.status = status;
  }

  public void fecharConta(){
    if(this.getSaldo() != 0){
      System.out.println("A conta não pode ser fechada pois o saldo não está zerado!");
    }
    else{
      this.setStatus(false);
      System.out.println("Conta encerrada com sucesso!");
    }
  }

  public void depositar(float valDeposito){
    if(this.getStatus() == true){
      this.setSaldo(this.getSaldo() + valDeposito);
      System.out.println("Valor depositado com sucesso na conta de " + this.getDono() + "!");
    }
    else{
      System.out.println("Erro ao depositar: Conta não ativa.");
    }
  }

  public void sacar(float valSaque){
    if(this.getStatus() == true){
      if (valSaque <= this.getSaldo()){
        this.setSaldo(this.getSaldo() - valSaque);;
      }

      else{
        System.out.println("Saldo insuficiente!");
      }
    }
    else{
      System.out.println("Erro ao sacar: Conta não ativa.");
    }
  }

  public void pagarMensal(){
    int v = 0;
    if(this.getTipoConta().equals("CC")){
      v = 12;
    }
    else if(this.getTipoConta().equals("CP")){
      v = 20;
    }

    if(this.getStatus()){
      this.setSaldo(this.getSaldo() - v);
    }
    else{
      System.out.println("Erro! Conta desativada ou não existente.");
    }
  }
}
