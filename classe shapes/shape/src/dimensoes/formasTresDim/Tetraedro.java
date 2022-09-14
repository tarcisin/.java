package dimensoes.formasTresDim;

import java.util.Scanner;

import dimensoes.TresDimensoes;

public class Tetraedro extends TresDimensoes{

  public float tetrahedronArea;
  public float tetrahedronVolumn;

  public Tetraedro(String name, int xAxis, int yAxis, float pi, float volumn, float area, float tetrahedronArea, float tetrahedronVolumn) {
    super(name, xAxis, yAxis, pi, volumn, area);
  }

  Scanner sc = new Scanner(System.in);

  public float tetrahedronArea(float xAxis){
    tetrahedronArea = (float) ((xAxis * xAxis) * Math.sqrt(3));
    return tetrahedronArea;
  }

  public float tetrahedronVolumn(float xAxis){
    tetrahedronVolumn = (float) (((xAxis * xAxis * xAxis) * Math.sqrt(2)) / 12);
    return tetrahedronVolumn;
  }
  
}
