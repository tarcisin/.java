package Pessoas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.event.PrintEvent;

import Aeronave.Assentos;

public class Passageiro extends Pessoa {

  private String seat;
  private TipoServico serviceType;
  private boolean embarked;
  
  public String getSeat() {
    return seat;
  }
  public void setSeat(String seat) {
    this.seat = seat;
  }
  public TipoServico getServiceType() {
    return serviceType;
  }
  public void setServiceType(TipoServico serviceType) {
    this.serviceType = serviceType;
  }
  public boolean isEmbarked() {
    return embarked;
  }
  public void setEmbarked(boolean embarked) {
    this.embarked = embarked;
  }

  public void autReserveSeat(ArrayList<Assentos> seats){
    String selected;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nAssentos Disponíveis: \n");
    for (Assentos seat : seats) {
      if(seat.isOccupied() == false){
        System.out.println(seat.getId());
      }
    }
    System.out.println("Qual assento deseja selecionar? ");
    selected = sc.next();
    toReserveSeat(selected, seats);
  }

  public void toReserveSeat(String idSeat, ArrayList<Assentos> seats){
    Map<String, Assentos> reserved = new HashMap<>();
    for (Assentos seat : seats) {
        reserved.put(seat.getId(), seat);
    }
    if (reserved.get(idSeat).isOccupied()){
        System.out.println("\nAssento ocupado");
    } else {
        reserved.get(idSeat).setOccupied(true);
    }
}
  

  
}
