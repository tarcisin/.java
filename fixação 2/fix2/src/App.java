import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double bMen, bMai, hAlt, areaCalc;

        System.out.println("*** Cálculo para Área de Trapézio ***");

        System.out.println("Insira o valor da base menor: ");
        bMen = sc.nextInt();

        System.out.println("Insira o valor da base maior: ");
        bMai = sc.nextInt();

        System.out.println("Insira o valor da altura: ");
        hAlt = sc.nextInt();

        areaCalc = bMen + bMai;
        areaCalc = areaCalc / 2;
        areaCalc = areaCalc * hAlt;

        sc.close();
        
        System.out.println("A área do trapézio definido é de " + areaCalc);
        
    }
}
