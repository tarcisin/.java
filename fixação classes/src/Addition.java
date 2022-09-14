import java.util.Scanner;

public class Addition {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number1, number2, sum;

        System.out.println("Enter the first integer: ");
        number1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.println("The sum is: " + number1 + " + " + number2 + " = " + sum);
    }
}
