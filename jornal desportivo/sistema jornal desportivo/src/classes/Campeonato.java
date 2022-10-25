package classes;

import java.util.ArrayList;
import java.util.List;

import classes.Rodada.Rodada;

public class Campeonato {

  private int idCamp;
  private int anoCamp;
  private String nomeCamp;
  private TipoCampeonato tipoC;
  private List<Rodada> rodadas = new ArrayList<Rodada>();

  
  public Campeonato(int idCamp, int anoCamp, String nomeCamp, TipoCampeonato tipoC, List<Rodada> rodadas) {
    this.idCamp = idCamp;
    this.anoCamp = anoCamp;
    this.nomeCamp = nomeCamp;
    this.tipoC = tipoC;
    this.rodadas = rodadas;
  }
  public int getIdCamp() {
    return idCamp;
  }
  public void setIdCamp(int idCamp) {
    this.idCamp = idCamp;
  }
  public int getAnoCamp() {
    return anoCamp;
  }
  public void setAnoCamp(int anoCamp) {
    this.anoCamp = anoCamp;
  }
  public String getNomeCamp() {
    return nomeCamp;
  }
  public void setNomeCamp(String nomeCamp) {
    this.nomeCamp = nomeCamp;
  }
  public TipoCampeonato getTipoC() {
    return tipoC;
  }
  public void setTipoC(TipoCampeonato tipoC) {
    this.tipoC = tipoC;
  }
  public List<Rodada> getRodadas() {
    return rodadas;
  }
  public void setRodadas(List<Rodada> rodadas) {
    this.rodadas = rodadas;
  }
  

  
}
