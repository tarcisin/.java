package Pessoas;

public class Comissario extends Pessoa{
  
  private int id;
  private int flightHours;
  private int acessFlights;
  private String cargo;

  public Comissario(String name, String nasc, String cpf, int id, int flightHours, int acessFlights, String cargo) {
    super(name, nasc, cpf);
    this.id = id;
    this.flightHours = flightHours;
    this.acessFlights = acessFlights;
    this.cargo = "Comissário de bordo";
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public int getFlightHours() {
    return flightHours;
  }
  public void setFlightHours(int flightHours) {
    this.flightHours = flightHours;
  }
  public int getAcessFlights() {
    return acessFlights;
  }
  public void setAcessFlights(int acessFlights) {
    this.acessFlights = acessFlights;
  }
  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String giveSnack(){
        return "\n*{Servindo lanche para os passageiros}*";
    }    

    public String passInstructions(){
        return "\n*{Repassando intruções de segurança}*";
    }
  
}
