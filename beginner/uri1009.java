package beginner;
import java.util.Scanner;

public class uri1009 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double fixedSalary = scan.nextDouble();
        double salesAmount = scan.nextDouble();

        double commission = salesAmount * 0.15;
        double salary = fixedSalary + commission;

        System.out.printf("TOTAL = R$ %.2f%n", salary);


    }
}
