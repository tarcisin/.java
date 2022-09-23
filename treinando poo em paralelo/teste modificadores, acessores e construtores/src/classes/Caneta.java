package classes;

public class Caneta {
  private String modelo;
  private float ponta;

  public Caneta(String m, float p){
    this.modelo = m;
    this.ponta = p;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public float getPonta() {
    return ponta;
  }

  public void setPonta(float ponta) {
    this.ponta = ponta;
  }
}
