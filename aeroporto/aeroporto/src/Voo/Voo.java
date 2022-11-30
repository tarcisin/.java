package Voo;

import java.util.ArrayList;
import java.util.List;

import Aeronave.Aeronave;
import Pessoas.Comissario;
import Pessoas.Passageiro;
import Pessoas.Piloto;

public class Voo implements InterfaceVoo{

  private int id;
  private Piloto pilot;
  private Piloto copilot;
  private Comissario flightAttendant;
  private List<Passageiro> passengers = new ArrayList<Passageiro>();
  private Aeronave airplane;
  private String placeDeparture;
  private String placeArrival;
  private String hourDepature;
  private String hourArrival;
  private String date;
  private boolean flight_permit;

  public Voo(int id, Piloto pilot, Piloto copilot, Comissario flightAttendant, List<Passageiro> passengers,
      Aeronave airplane, String placeDeparture, String placeArrival, String hourDepature, String hourArrival,
      String date, boolean flight_permit) {
    this.id = id;
    this.pilot = pilot;
    this.copilot = copilot;
    this.flightAttendant = flightAttendant;
    this.passengers = passengers;
    this.airplane = airplane;
    this.placeDeparture = placeDeparture;
    this.placeArrival = placeArrival;
    this.hourDepature = hourDepature;
    this.hourArrival = hourArrival;
    this.date = date;
    this.flight_permit = false;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Piloto getPilot() {
    return pilot;
  }

  public void setPilot(Piloto pilot) {
    this.pilot = pilot;
  }

  public Piloto getCopilot() {
    return copilot;
  }

  public void setCopilot(Piloto copilot) {
    this.copilot = copilot;
  }

  public Comissario getFlightAttendant() {
    return flightAttendant;
  }

  public void setFlightAttendant(Comissario flightAttendant) {
    this.flightAttendant = flightAttendant;
  }

  public List<Passageiro> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Passageiro> passengers) {
    this.passengers = passengers;
  }

  public Aeronave getAirplane() {
    return airplane;
  }

  public void setAirplane(Aeronave airplane) {
    this.airplane = airplane;
  }

  public String getPlaceDeparture() {
    return placeDeparture;
  }

  public void setPlaceDeparture(String placeDeparture) {
    this.placeDeparture = placeDeparture;
  }

  public String getPlaceArrival() {
    return placeArrival;
  }

  public void setPlaceArrival(String placeArrival) {
    this.placeArrival = placeArrival;
  }

  public String getHourDepature() {
    return hourDepature;
  }

  public void setHourDepature(String hourDepature) {
    this.hourDepature = hourDepature;
  }

  public String getHourArrival() {
    return hourArrival;
  }

  public void setHourArrival(String hourArrival) {
    this.hourArrival = hourArrival;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public boolean isFlight_permit() {
    return flight_permit;
  }

  public void setFlight_permit(boolean flight_permit) {
    this.flight_permit = flight_permit;
  }

  @Override
  public String searchFlight() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String histFlight() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String confirmFlight() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String cancelFlight() {
    // TODO Auto-generated method stub
    return null;
  }

  
  
  

}
