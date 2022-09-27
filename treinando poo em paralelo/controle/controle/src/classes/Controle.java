package classes;

public class Controle implements InterfaceControle {
  private int volume;
  private boolean ligado;
  private boolean tocando;

  public Controle(){
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  } 

  private int getVolume() {
    return volume;
  }

  private boolean isLigado() {
    return ligado;
  }

  private boolean isTocando() {
    return tocando;
  }

  private void setVolume(int volume) {
    this.volume = volume;
  }

  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  @Override
  public void ligar(){
    this.setLigado(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    System.out.println("ESTADO: " + this.isLigado());
    System.out.println("REPRODUZINDO MIDIA? " + this.isTocando());
    System.out.println("VOLUME: " + this.getVolume());
    for(int i = 0; i <= this.getVolume(); i += 10){
      System.out.println("[]");
    }
  }

  @Override
  public void fecharMenu() {
    System.out.println("Encerrando menu!");
  }

  @Override
  public void maisVolume() {
    if(this.isLigado()){
        this.setVolume(this.getVolume() + 1);
    }

    else{
      System.out.println("Erro: Aparelho desligado!");
    }
  }

  @Override
  public void menosVolume() {
    if(this.isLigado()){
      this.setVolume(this.getVolume() - 1);
  }

  else{
    System.out.println("Erro: Aparelho desligado!");
  }
    
  }

  @Override
  public void ligarMudo() {
    
  }

  @Override
  public void desligarMudo() {
    
  }

  @Override
  public void play() {
    
  }

  @Override
  public void pause() {
    
  }
  
  
}
