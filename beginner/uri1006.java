package beginner;
import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double media = (a * 2 + b * 3 + c * 5) / 10;

        System.out.printf("MEDIA = %.1f%n", media);

    }
}
