package beginner;
import java.util.Scanner;

public class uri1005 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double media = (a * 3.5 + b * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n", media);


    }
}