package Aeronave;

public class Assentos {
  
  private String id;
  private boolean occupied;
  
  public Assentos(String id, boolean occupied) {
    this.id = id;
    this.occupied = occupied;
  }
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public boolean isOccupied() {
    return occupied;
  }
  public void setOccupied(boolean occupied) {
    this.occupied = occupied;
  }
}
