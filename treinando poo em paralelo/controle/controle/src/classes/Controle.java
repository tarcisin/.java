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
    for(int i = 1; i <= this.getVolume(); i += 10){
      System.out.print("|");
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
    if(this.isLigado() && this.getVolume() > 0){
      this.setVolume(0);  
    }
    
    else{
      System.err.println("Erro: Aparelho já se encontra mudo ou desligado!");
    }
    
  }

  @Override
  public void desligarMudo() {
    if(this.isLigado() && this.getVolume() == 0){
      this.setVolume(50);  
    }
    
    else{
      System.err.println("Erro: Aparelho já se encontra fora do estado mudo ou desligado!");
    }
  }

  @Override
  public void play() {
    if(this.isLigado() && !this.isTocando()){
      this.setTocando(true);
    }
    else{
      System.out.println("Erro na reprodução de mídia.");
    }
  }

  @Override
  public void pause() {
    if(this.isLigado() && this.isTocando()){
      this.setTocando(false);
    }
    else{
      System.out.println("Erro ao pausar!");
    }
  }
}
