package Aeronave;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {
  private int id;
  private String modelo;
  private String tipo;
  private List<Assentos> assentos = new ArrayList<Assentos>();
  private int seatsAmount;
  private String status;
  private String flightCompany;
}
