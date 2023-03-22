package dir;

import java.util.Scanner;

public class Dualshock implements Prototype{

  private String cor;
  private int modelo;
  private String bateria;
  Scanner sc = new Scanner(System.in);
  
  public Dualshock(String cor, int modelo, String bateria) {
    this.cor = cor;
    this.modelo = modelo;
    this.bateria = bateria;
  }

  public void definirConfig(){
    String res;
    int probe = 0;
    int resInt;
    System.out.println("Insira a cor do controle: ");
    res = sc.next();
    setCor(res);
    System.out.println("Insira o modelo do controle");
    resInt = sc.nextInt();
    while(probe == 0){
      if(resInt == 1 || resInt == 2 || resInt == 3 || resInt == 4){
        setModelo(resInt);
        probe = 1;
      }
    }
    System.out.println("Defina a bateria que o controle utilizará: ");
    res = sc.next();
    setBateria(res);
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getModelo() {
    return modelo;
  }

  public void setModelo(int modelo) {
    this.modelo = modelo;
  }

  public String getBateria() {
    return bateria;
  }

  public void setBateria(String bateria) {
    this.bateria = bateria;
  }

  @Override
  public Dualshock clone(){
    Dualshock clone = new Dualshock(this.cor, this.modelo, this.bateria);
    return clone;
  }

  @Override
  public void reset() {
    new Dualshock(cor, modelo, bateria);
  }

  @Override
  public String toString() {
    return "Dualshock [cor=" + cor + ", modelo=" + modelo + ", bateria=" + bateria + "]";
  } 
  
}
