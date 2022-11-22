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
}
