package beginner.uri1065.src;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                pares++;
            }
        }

        System.out.println(pares + " valores pares");

    }
}
