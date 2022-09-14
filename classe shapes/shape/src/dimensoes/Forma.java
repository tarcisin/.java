package dimensoes;

public class Forma {
  private String name;
  private int xAxis;
  private int yAxis;

  public Forma(String name, int xAxis, int yAxis)
  {
    this.name = name;
    this.xAxis = xAxis;
    this.yAxis = yAxis;
  }

  public String getName(){
    return name;
  }

  public void setName(){
    this.name = name;
  }

  public int getXAxis(){
    return xAxis;
  }

  public void setXAxis(){
    this.xAxis = xAxis;
  }

  public int getYAxis(){
    return yAxis;
  }

  public void setYAxis(){
    this.yAxis = yAxis;
  }

  public String toString()
  {
    return "Forma: " + getName() + "\nX: " + getXAxis() + "\nY: " + getYAxis();
  }
}
