package beginner;
import java.util.Scanner;

public class uri1017 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double KM_L = 12.0;
        int hours = scan.nextInt();
        int averageSpeed = scan.nextInt();

        double formula = hours * averageSpeed / KM_L;

        System.out.printf("%.3f%n", formula);

    }
}
