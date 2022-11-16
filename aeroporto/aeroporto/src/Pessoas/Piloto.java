package Pessoas;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Pessoa{

  private int id;
  private boolean copilot;
  private int flightHours;
  private List<String> authPlaneModels = new ArrayList<String>();
  
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

}
