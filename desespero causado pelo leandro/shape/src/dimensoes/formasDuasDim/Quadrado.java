package dimensoes.formasDuasDim;

import java.util.Scanner;

import dimensoes.DuasDimensoes;

public class Quadrado extends DuasDimensoes
{
  private float squareArea;
  private float squarePerim;

  public Quadrado(String name, int xAxis, int yAxis, float pi) {
    super(name, xAxis, yAxis, pi);
  }

  Scanner sc = new Scanner(System.in);
  
  public float getSquareArea() {
    return squareArea;
  }

  public void setSquareArea(float squareArea) {
    this.squareArea = squareArea;
  }

  public float getSquarePerim() {
    return squarePerim;
  }

  public void setSquarePerim(float squarePerim) {
    this.squarePerim = squarePerim;
  }

  public void axisIn(int xAxis){
    System.out.println("Defina o valor do lado do quadrado: ");
    int x = sc.nextInt();
    this.setXAxis(x);
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