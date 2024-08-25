package beginner;
import java.util.Scanner;

public class uri1064 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int positivos = 0;
        double media = 0;

        for (int i = 0; i < 6; i++) {
            double n = scan.nextDouble();
            if (n > 0) {
                positivos++;
                media += n;
            }
        }
        media /= positivos;
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f%n", media);

    }
}
