package beginner.uri1014.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distance = scan.nextInt();
        double fuel = scan.nextDouble();

        double formula = distance / fuel;

        System.out.printf("%.3f km/l%n", formula);


    }
}
