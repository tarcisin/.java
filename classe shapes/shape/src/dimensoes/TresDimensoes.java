package dimensoes;

public class TresDimensoes extends Forma {

  private float pi = 3.14f;
  private float volumn;
  private float area;

  public TresDimensoes(String name, int xAxis, int yAxis, float pi, float volumn, float area){
    super(name, xAxis, yAxis);
  }
  
  public float getPi(){
    return pi;
  }

  public void setPi(float pi){
    this.pi = pi;
  }

  public float getVolumn(){
    return volumn;
  }

  public void setVolumn(float volumn){
    this.volumn = volumn;
  }

  public float getArea(){
    return area;
  }

  public void setArea(float area){
    this.area = area;
  }
}
