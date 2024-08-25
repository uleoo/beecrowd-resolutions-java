package beginner;
import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int bigger = a;

        if (b > bigger && b > c) {
            bigger = b;
        } else if (c > bigger && c > b) {
            bigger = c;
        }

        System.out.printf("%s eh o maior%n", bigger);

    }
}
