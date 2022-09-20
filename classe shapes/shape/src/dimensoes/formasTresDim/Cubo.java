package dimensoes.formasTresDim;

import java.util.Scanner;

import dimensoes.InterfaceShape;
import dimensoes.TresDimensoes;

public class Cubo extends TresDimensoes
{
  public float cubeArea;
  public float cubeVolumn;
  public float lining;

  public Cubo(String name, int xAxis, int yAxis, float pi, float volumn, float area, float cubeArea, float cubeVolumn, float lining) {
    super(name, xAxis, yAxis, pi, volumn, area);
  }

  Scanner sc = new Scanner(System.in);

  public float defineLine(float lining){
    System.out.println("Defina o valor da aresta do cubo: ");
    lining = sc.nextFloat();
    return lining;
  }

  public float shapeArea(float xAxis){
    cubeArea = (xAxis * xAxis) * 6;
    return cubeArea;
  }

  public float shapeVolumn(float xAxis){
    cubeVolumn = (xAxis * xAxis * xAxis);
    return cubeVolumn;
  }
}