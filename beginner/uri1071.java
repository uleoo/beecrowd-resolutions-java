package beginner;
import java.util.Scanner;

public class uri1071 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int impar = 0;

        for (int i = x - 1; i > y; i--) {
            if (i % 2 != 0) {
                impar += i;
            }
        }
        System.out.println(impar);

    }
}
