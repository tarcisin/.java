package classes;

public class Campeonato {

  private int idCamp;
  private int anoCamp;
  private String nomeCamp;
  private TipoCampeonato tipoC;

  public Campeonato(int idCamp, int anoCamp, String nomeCamp, TipoCampeonato tipoC) {
    this.idCamp = idCamp;
    this.anoCamp = anoCamp;
    this.nomeCamp = nomeCamp;
    this.tipoC = tipoC;
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

  
}
