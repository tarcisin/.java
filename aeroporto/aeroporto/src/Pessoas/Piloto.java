package Pessoas;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Pessoa{

  private int id;
  private boolean copilot;
  private int flightHours;
  private List<String> authPlaneModels = new ArrayList<String>();

  public Piloto(String name, String nasc, String cpf, int id, boolean copilot, int flightHours, List<String> authPlaneModels) {
    super(name, nasc, cpf);
    this.id = id;
    this.copilot = false;
    this.flightHours = flightHours;
    this.authPlaneModels = authPlaneModels;
  }
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public boolean isCopilot() {
    return copilot;
  }
  public void setCopilot(boolean copilot) {
    this.copilot = copilot;
  }
  public int getFlightHours() {
    return flightHours;
  }
  public void setFlightHours(int flightHours) {
    this.flightHours = flightHours;
  }
  public List<String> getAuthPlaneModels() {
    return authPlaneModels;
  }
  public void setAuthPlaneModels(List<String> authPlaneModels) {
    this.authPlaneModels = authPlaneModels;
  }

  public String warnPassengers(){
    return "\nPiloto: -Atenção senhores passageiros, preparar para o voo";
  }

  public String prepareAircraft(boolean operant){
      String msg = null;
      if (operant){
          msg = "\n*{Checando turbinas e painel de comando. Tirando aeronave do pátio e aguardando permissão de voo}*";
      } else {
          msg = "\n*{Aeronave com falhas. Enviando requisição de cancelamento de voo}*";
      }
      return msg;
}

}
