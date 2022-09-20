package dimensoes.formasDuasDim;

import java.util.Scanner;

import dimensoes.DuasDimensoes;

public class Quadrado extends DuasDimensoes
{
  public float squareArea;
  public float squarePerim;

  public Quadrado(String name, int xAxis, int yAxis, float pi, float perim, float area, float squareArea, float squarePerim) {
    super(name, xAxis, yAxis, pi, perim, area);
  }

  Scanner sc = new Scanner(System.in);

  public float axisIn(float xAxis){
    System.out.println("Defina o valor do lado do quadrado: ");
    xAxis = sc.nextFloat();
    return xAxis;
  }

  public float shapeArea(float xAxis){
    squareArea = xAxis * xAxis;
    return squareArea;
  }

  public float shapePerim(float xAxis){
    squarePerim = xAxis * 4;
    return squarePerim;
  }
}