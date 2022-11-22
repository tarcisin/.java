package Aeronave;

public enum Tipo {

  AIRBUS380("Airbus-380"),
  BOEING707("Boeing-707"),
  AIRBUS319("Airbus-319"),
  AIRBUS309("Airbus-309"),
  AIRBUS320("Airbus-320"),
  AIRBUS310("Airbus-310"),
  AIRBUS321("Airbus-321"),
  AIRBUS330("Airbus-330"),
  AIRBUS331("Airbus-331"),
  ATR42500("ATR 42-500"),
  ATR72("ATR 72-500"),
  EMBRAER175("EMBRAER-175"),
  EMBRAER190("EMBRAER-190"),
  EMBRAER195("EMBRAER-195"),
  BOEING727("Boeing-727"),
  BOEING767("Boeing-767"),
  BOEING767300ER("Boeing 767-300ER"),
  BOEING757("Boeing-757"),
  BOEING787("Boeing-787"),
  BOEING737("Boeing-737"),
  BOEING777("Boeing-777");
  
  private String type;

  Tipo(String type){
    this.type = type;
  }

  public void setType(String type){
    this.type = type;
  }

  public String getType() {
    return type;
  }
}