package Voo;

import java.util.ArrayList;
import java.util.List;

import Aeronave.Aeronave;
import Pessoas.Comissario;
import Pessoas.Passageiro;
import Pessoas.Piloto;

public class Voo {

  private int id;
  private Piloto pilot;
  private Comissario flightAttendant;
  private List<Passageiro> passengers = new ArrayList<Passageiro>();
  private Aeronave airplane;
  private String placeDeparture;
  private String placeArrival;
  private String hourArrival;
  private String date;

}
