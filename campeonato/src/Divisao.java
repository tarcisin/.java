public abstract class Divisao {
  
  private String division;

  public Divisao(String division) {
    this.division = division;
  }

  public String getDivisao() {
    return division;
  }

  public void setDivisao(String division) {
    this.division = division;
  }

  public abstract void promotionTeam();
  public abstract void lowerTeam();
}
