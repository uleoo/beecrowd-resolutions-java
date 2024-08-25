package beginner;
import java.util.Scanner;

public class uri1036 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double delta = Math.pow(b, 2) - (4.0 * a * c);

        if (a > 0 && b > 0 && c > 0 && delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);

        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
