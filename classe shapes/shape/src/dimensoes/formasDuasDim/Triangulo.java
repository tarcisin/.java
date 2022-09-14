package dimensoes.formasDuasDim;

import java.util.Scanner;

import dimensoes.DuasDimensoes;

public class Triangulo extends DuasDimensoes
{
  public float triangArea;
  public float triangPerim;

  public Triangulo(String name, int xAxis, int yAxis, float pi, float perim, float area, float squareArea, float squarePerim) {
    super(name, xAxis, yAxis, pi, perim, area);
  }

  Scanner sc = new Scanner(System.in);

  public float axisIn(float xAxis){
    System.out.println("Defina o valor do lado do quadrado: ");
    xAxis = sc.nextFloat();
    return xAxis;
  }

  public float triangArea(float xAxis, float yAxis){
    triangArea = (xAxis * yAxis) / 2;
    return triangArea;
  }

  public float triangPerim(float xAxis){
    triangPerim = xAxis * 3;
    return triangPerim;
  }
}