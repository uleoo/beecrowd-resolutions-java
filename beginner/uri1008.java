package beginner;
import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfEmployee = scan.nextInt();
        int hours = scan.nextInt();
        double valueOfHours = scan.nextDouble();

        double salary = hours * valueOfHours;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numberOfEmployee, salary);

    }
}
