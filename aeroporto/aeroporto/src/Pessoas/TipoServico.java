package Pessoas;

public enum TipoServico {

  FIRST("Primeira Classe"),
  ECONOMIC("Classe Econômica"),
  EXECUTIVE("Classe Executiva");

  private String type;

  TipoServico(String type){
    this.type = type;
  }

  public String getType(){
    return this.type;
  }
  
  public void setType(String type){
    this.type = type;
  }
}
