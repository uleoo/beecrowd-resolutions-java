package beginner;
import java.util.Scanner;

public class uri1072 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++) {
            int x = scan.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
