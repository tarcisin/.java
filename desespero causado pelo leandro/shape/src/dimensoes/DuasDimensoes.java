package dimensoes;

public class DuasDimensoes extends Forma {

  private float pi = 3.14f;
  private float perim;
  private float area;

  public DuasDimensoes(String name, int xAxis, int yAxis, float pi){
    super(name, xAxis, yAxis);
  }
  
  public float getPi(){
    return pi;
  }

  public void setPi(float pi){
    this.pi = pi;
  }

  public float getPerim(){
    return perim;
  }

  public void setPerim(float perim){
    this.perim = perim;
  }

  public float getArea(){
    return area;
  }

  public void setArea(float area){
    this.area = area;
  }
}
