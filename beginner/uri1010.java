package beginner;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int code1 = scan.nextInt();
        int number1 = scan.nextInt();
        double value1 = scan.nextDouble();

        int code2 = scan.nextInt();
        int number2 = scan.nextInt();
        double value2 = scan.nextDouble();

        double result = number1 * value1 + number2 * value2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);

    }
}
