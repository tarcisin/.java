package guitarra;

public class Guitar {
  private int id;
  private String brand;
  private Models model;
  private int strings;
  private String wood;
  private int knobs;
  private String pickups;
  private String head;
  private boolean acoustic;
  private String bridge;
  private String color;
  private String neck;
  private String scales;
  

  public Guitar(int id, String brand, Models model, int strings, String wood, int knobs, String pickups, String head,
      boolean acoustic, String bridge, String color, String neck, String scales) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.strings = strings;
    this.wood = wood;
    this.knobs = knobs;
    this.pickups = pickups;
    this.head = head;
    this.acoustic = acoustic;
    this.bridge = bridge;
    this.color = color;
    this.neck = neck;
    this.scales = scales;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public Models getModel() {
    return model;
  }
  public void setModel(Models model) {
    this.model = model;
  }
  public int getStrings() {
    return strings;
  }
  public void setStrings(int strings) {
    this.strings = strings;
  }
  public String getWood() {
    return wood;
  }
  public void setWood(String wood) {
    this.wood = wood;
  }
  public int getKnobs() {
    return knobs;
  }
  public void setKnobs(int knobs) {
    this.knobs = knobs;
  }
  public String getPickups() {
    return pickups;
  }
  public void setPickups(String pickups) {
    this.pickups = pickups;
  }
  public String getHead() {
    return head;
  }
  public void setHead(String head) {
    this.head = head;
  }
  public boolean isAcoustic() {
    return acoustic;
  }
  public void setAcoustic(boolean acoustic) {
    this.acoustic = acoustic;
  }
  public String getBridge() {
    return bridge;
  }
  public void setBridge(String bridge) {
    this.bridge = bridge;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getNeck() {
    return neck;
  }
  public void setNeck(String neck) {
    this.neck = neck;
  }
  public String getScales() {
    return scales;
  }
  public void setScales(String scales) {
    this.scales = scales;
  }

  @Override
  public String toString() {
    return "Guitar [id=" + id + ", brand=" + brand + ", model=" + model + ", strings=" + strings + ", wood=" + wood
        + ", knobs=" + knobs + ", pickups=" + pickups + ", head=" + head + ", acoustic=" + acoustic + ", bridge="
        + bridge + ", color=" + color + ", neck=" + neck + ", scales=" + scales + "]";
  }

  
}
