package beginner;
import java.util.Scanner;

public class uri1011 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ray = scan.nextDouble();

        double formula = (4.0 / 3.0) * 3.14159 * Math.pow(ray, 3);

        System.out.printf("VOLUME = %.3f%n", formula);

    }
}
