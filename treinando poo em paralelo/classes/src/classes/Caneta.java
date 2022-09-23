package classes;

public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;

  public void status(){
    System.out.println("Caneta de cor " + this.cor);
    System.out.println("Está tampada? " + this.tampada);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("A carga da caneta é " + this.carga);
  }

  public void rabiscar(){
    if(this.tampada == true){
      System.out.println("Não é possível escrever com a caneta tampada!");
    }
    else{
      System.out.println("Escrevendo...");
    }
  }

  protected void tampar(){
    this.tampada = true;
  }

  protected void destampar(){
    this.tampada = false;
  }
}
