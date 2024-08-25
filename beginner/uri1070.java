package beginner;
import java.util.Scanner;

public class uri1070 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int impar = 0;

        for (int i = x; impar < 6; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                impar++;
            }
        }
    }
}
