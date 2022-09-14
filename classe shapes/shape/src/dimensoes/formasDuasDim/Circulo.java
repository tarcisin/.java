package dimensoes.formasDuasDim;

import java.util.Scanner;

import dimensoes.DuasDimensoes;

public class Circulo extends DuasDimensoes
{
  public float circleArea;
  public float circlePerim;

  public Circulo(String name, int xAxis, int yAxis, float pi, float perim, float area, float circleArea, float circlePerim) {
    super(name, xAxis, yAxis, pi, perim, area);
  }

  Scanner sc = new Scanner(System.in);

  public float definePi(float pi){
    System.out.println("Defina o valor de pi: ");
    pi = sc.nextFloat();
    return pi;
  }

  public float circleArea(float xAxis, float pi){
    circleArea = (xAxis * xAxis) * pi;
    return circleArea;
  }

  public float circlePerim(float xAxis, float pi){
    circlePerim = xAxis * 2 * pi;
    return circlePerim;
  }
}