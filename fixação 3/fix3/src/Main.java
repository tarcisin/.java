import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b, c, bSqr, delta, deltaSqrt, firRoot, secRoot;

        System.out.println("*** Cálculo para Fórmula de Bháskara ***");

        System.out.print("Insira o valor da incógnita 'a': ");
        a = sc.nextInt();
        
        if(a == 0)
        {
            System.out.println("Incógnita 'a' igual à 0. A equação não é considerada do segundo grau.");
            System.exit(0);
        }

        System.out.print("Insira o valor da incógnita 'b': ");
        b = sc.nextInt();

        System.out.print("Insira o valor da incógnita 'c': ");
        c = sc.nextInt();

        bSqr = b * b;
        delta = -4 * a * c;
        delta = bSqr +(delta);

        if(delta < 0)
        {
            System.out.println("Delta negativo. A equação não possui raízes reais.");
            System.exit(0);
        }


        if(delta == 0)
        {
            System.out.println("Delta igual à 0. As duas raízes da equação são iguais.");
        }
        deltaSqrt = Math.sqrt(delta);

        firRoot = -(b) + deltaSqrt;
        firRoot = firRoot / (2*a);

        secRoot = -(b) - deltaSqrt;
        secRoot = secRoot / (2*a);

        sc.close();
        
        System.out.println("As raízes da equação descrita obtidas por bháskara são " + firRoot + " e " + secRoot);
        
    }
}
