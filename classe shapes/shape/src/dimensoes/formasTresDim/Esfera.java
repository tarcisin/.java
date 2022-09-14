package dimensoes.formasTresDim;

import java.util.Scanner;

import dimensoes.TresDimensoes;

public class Esfera extends TresDimensoes
{
  public float sphereArea;
  public float sphereVolumn;

  public Esfera(String name, int xAxis, int yAxis, float pi, float volumn, float area, float sphereArea, float sphereVolumn) {
    super(name, xAxis, yAxis, pi, volumn, area);
  }

  Scanner sc = new Scanner(System.in);

  public float definePi(float pi){
    System.out.println("Defina o valor de pi: ");
    pi = sc.nextFloat();
    return pi;
  }

  public float sphereArea(float xAxis, float pi){
    sphereArea = (xAxis * xAxis) * pi * 4;
    return sphereArea;
  }

  public float sphereVolumn(float xAxis, float pi){
    sphereVolumn = (xAxis * xAxis * xAxis) * pi * 4/3;
    return sphereVolumn;
  }
}