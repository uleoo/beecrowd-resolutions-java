package beginner;
import java.util.Scanner;

public class uri1014 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distance = scan.nextInt();
        double fuel = scan.nextDouble();

        double formula = distance / fuel;

        System.out.printf("%.3f km/l%n", formula);


    }
}
