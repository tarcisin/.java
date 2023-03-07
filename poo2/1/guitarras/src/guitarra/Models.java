package guitarra;

public enum Models {
  STRATO("Stratocaster"),
  TELE("Telecaster"),
  SUPER("Superstratocaster"),
  FIRE("Firebird"),
  JAGUAR("Jaguar"),
  FLYV("Flying V"),
  WARLOCK("Warlock"),
  LESPAUL("Les Paul"),
  SEMIA("Semi Acoustic");

  private String modelName;

  Models(String modelName){
    this.modelName = modelName;
  }
}
