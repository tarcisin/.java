package InstrumentosDeCorda;

import java.util.Scanner;

public class Electric implements Strings{

  private int strings;
  private String pickups;
  private String body;
  private String neck;

  Scanner sc = new Scanner(System.in);


  @Override
  public void play() {
    System.out.println("Insert a song to be played on the electric guitar:");
    String song;
    song = sc.next();
    System.out.println("Plays " + song);
  }

  @Override
  public void tune() {
    System.out.println("Insert a tuning to be tuned on the electric guitar:");
    String tune;
    tune = sc.next();
    System.out.println("The current tuning is " + tune);
  }

  @Override
  public void switchStrings() {
    System.out.println("Insert the strings that will be switched on the electric guitar: ");
    String newStrings;
    newStrings = sc.next();
    System.out.println("The new strings on the electric guitar are: " + newStrings);
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