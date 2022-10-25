package classes.Jogo;

import classes.Pessoas.Arbitro;
import classes.Pessoas.Equipe;

public class Jogo {

  private String data;
  private String local;
  private String resultado;
  private Arbitro arbitro;
  private boolean marcado = true;
  private Equipe visitante;
  private Equipe visitado;
  private int pontoVisitante = 0;
  private int pontoVisitada = 0;

  public Jogo(String data, String local, Arbitro arbitro, Equipe visitante, Equipe visitado) {
    this.data = data;
    this.local = local;
    this.arbitro = arbitro;
    this.visitante = visitante;
    this.visitado = visitado;
  }

  public void exibirEquipes(Equipe equipeVisitante, Equipe equipeVisitada){
    System.out.println("Equipe visitante  : " + equipeVisitante);
    System.out.println("Equipe visitada   : " + equipeVisitada);
  }

  public void marcarPontoVisitante(){
    this.pontoVisitante += 1;
    System.out.println("Gol do " + visitante.getNome());
  }

  public void marcarPontoVisitada(){
    this.pontoVisitada += 1;
    System.out.println("Gol do " + visitado.getNome());
  }
  
  public void exibirPlacar(){
    System.out.println();
    System.out.println("-=-=-=-=-= PLACAR =-=-=-=-=-");
    System.out.println(this.visitante.getNome() + ": " + this.pontoVisitante);
    System.out.println(this.visitado.getNome() + ": " + this.pontoVisitada);
    System.out.println();
  }
  
}
