import java.util.Scanner;

import dimensoes.formasDuasDim.Quadrado;
import dimensoes.formasDuasDim.Triangulo;
import dimensoes.formasDuasDim.Circulo;
import dimensoes.formasTresDim.Cubo;
import dimensoes.formasTresDim.Esfera;
import dimensoes.formasTresDim.Tetraedro;;

public class App {
    public static void main(String[] args) throws Exception {
        float dimn, lado1 = 0, lado2;
        String formaEnt = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas dimensões tem a forma à ser calculada? (2/3)");
        dimn = sc.nextInt();
        if(dimn == 2){
            System.out.println("Qual forma será usada? (quadrado, triangulo, círculo)");
            formaEnt = sc.next();
            if(formaEnt.equals("quadrado"))
            {
                System.out.println("Qual o valor do lado do quadrado?");
                lado1 = sc.nextInt();
                Quadrado sqr = new Quadrado("Quadrado", 0, 0, 3.14f, 0, 0, 0, 0);
                float x, y;


                x = sqr.squareArea(lado1);
                y = sqr.squarePerim(lado1);
                System.out.println("O valor da área do quadrado é de " + x + " e o perímetro é de " + y);
            }
            if(formaEnt.equals("triangulo"))
            {
                System.out.println("Qual o valor do lado do triangulo?");
                lado1 = sc.nextInt();
                System.out.println("Qual o valor da altura do triangulo?");
                lado2 = sc.nextInt(); // neste caso a variável lado2 é usada como altura e não como lado, já que o triangulo calculado é isósceles e seus lados são iguais
                Triangulo trg = new Triangulo("Triangulo", 0, 0, 3.14f, 0, 0, 0, 0);
                float x, y;


                x = trg.triangArea(lado1, lado2);
                y = trg.triangPerim(lado1);
                System.out.println("O valor da área do triangulo é de " + x + " e o perímetro é de " + y);
            }
            if(formaEnt.equals("circulo"))
            {
                System.out.println("Qual o valor do raio do círculo?");
                lado1 = sc.nextInt(); // neste contexto, a variável lado é equivalente ao raio
                float z = 3.14f;
                Circulo crc = new Circulo("Circulo", 0, 0, z, 0, 0, 0, 0);
                float x, y = 0;

                x = crc.circleArea(lado1, z);
                y = crc.circlePerim(lado1, z);
                System.out.println("O valor da área do círculo é de " + x + " e o perímetro é de " + y);
            }
        }
        else if(dimn == 3){
            System.out.println("Qual forma será usada? (esfera, cubo, tetraedro)");
            formaEnt = sc.next();
            if(formaEnt.equals("esfera")){
                Esfera sph = new Esfera("Esfera", 0, 0, 3.14f, 0, 0, 0, 0);
                float pi = 3.14f, x, y;
                pi = sph.definePi(pi);
                System.out.println("Qual o valor do raio da esfera? ");
                lado1 = sc.nextInt();

                x = sph.sphereArea(lado1, pi);
                y = sph.sphereVolumn(lado1, pi);

                System.out.println("O valor da área da esfera é de " + x + " e o volume é de " + y);
            }
            if(formaEnt.equals("cubo")){
                Cubo cbe = new Cubo("Cubo", 0, 0, 3.14f, 0, 0, 0, 0, 0);
                float x, y;
                lado1 = cbe.defineLine(lado1);

                x = cbe.cubeArea(lado1);
                y = cbe.cubeVolumn(lado1);

                System.out.println("O valor da área do cubo é de " + x + " e o volume é de " + y);
            }
            if(formaEnt.equals("tetraedro")){
                Tetraedro ttd = new Tetraedro("Tetraedro", 0, 0, 3.14f, 0, 0, 0, 0);
                float x, y;
                System.out.println("Defina o tamanho da aresta do tetraedro: ");
                lado1 = sc.nextFloat();

                x = ttd.tetrahedronArea(lado1);
                y = ttd.tetrahedronVolumn(lado1);

                System.out.println("O valor da área do tetraedro é de " + x + " ou " + (lado1 * lado1) + "√3 e o volume é de " + y);
            }
        }
        sc.close();
    }
}