package Aeronave;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {
  private int id;
  private String model;
  private Tipo type;
  private List<Assentos> seats = new ArrayList<Assentos>();
  private int seatsAmount;
  private String status;
  private String flightCompany;
  private boolean operant;

  public Aeronave(int id, String model, Tipo type, List<Assentos> seats, int seatsAmount, String status,
      String flightCompany, boolean operant) {
    this.id = id;
    this.model = model;
    this.type = type;
    this.seats = seats;
    this.seatsAmount = seatsAmount;
    this.status = status;
    this.flightCompany = flightCompany;
    this.operant = false;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Tipo getType() {
    return type;
  }

  public void setType(Tipo type) {
    this.type = type;
  }

  public List<Assentos> getSeats() {
    return seats;
  }

  public void setSeats(List<Assentos> seats) {
    this.seats = seats;
  }

  public int getSeatsAmount() {
    return seatsAmount;
  }

  public void setSeatsAmount(int seatsAmount) {
    this.seatsAmount = seatsAmount;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getFlightCompany() {
    return flightCompany;
  }

  public void setFlightCompany(String flightCompany) {
    this.flightCompany = flightCompany;
  }

  public boolean isOperant() {
    return operant;
  }

  public void setOperant(boolean operant) {
    this.operant = operant;
  }

  public void checkPilotPermission(ArrayList<String> pilot_aircrafts){
    for (String aircraft: pilot_aircrafts){
        if (this.getModel().equals(aircraft)){
            this.setOperant(true);
        }
    }
}

public String takeOff(){
    String msg;
    if(operant){
        msg = "\n*{Iniciando decolangem. Aeronave saindo do aeroporto}*";
    } else {
        msg = "\n*{Falha na decolagem}*";
    }
    return msg;
}

public String land(){
    this.setOperant(false);
    return "\n*{Aeronave pousando no aeroporto e seguindo para zona de desembarque}*";
}
  
  

  
}
