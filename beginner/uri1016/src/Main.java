package beginner.uri1016.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // In 60 minutes the car covers 30 kilometers, so the time is twice the mileage
        int distance = scan.nextInt();
        System.out.printf("%s minutos%n", distance * 2);

    }
}
