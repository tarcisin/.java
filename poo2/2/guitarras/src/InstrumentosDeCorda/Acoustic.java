package InstrumentosDeCorda;

public class Acoustic implements Strings{

  private int strings;
  private String pickups;
  private String body;
  private String neck;

  @Override
  public void play() {
    System.out.println("Plays 'Babe, im Gonna Leave You', by Led Zeppelin");
  }

  @Override
  public void tune() {
    System.out.println("Tune in standart tuning;");
  }

  @Override
  public void switchStrings() {
    System.out.println("Change the current strings by new ones;");
  }

  public int getStrings() {
    return strings;
  }

  public void setStrings(int strings) {
    this.strings = strings;
  }

  public String getPickups() {
    return pickups;
  }

  public void setPickups(String pickups) {
    this.pickups = pickups;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getNeck() {
    return neck;
  }

  public void setNeck(String neck) {
    this.neck = neck;
  }
  
  

}