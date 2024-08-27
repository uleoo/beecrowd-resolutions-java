package beginner;
import java.util.Scanner;

public class uri1073 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%s^2 = %s%n", i, i * i);
            }
        }

    }
}
