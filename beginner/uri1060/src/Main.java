package beginner.uri1060.src;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int positivos = 0;

        for (int i = 0; i < 6; i++) {
            double n = scan.nextDouble();
            if(n > 0) {
                positivos++;
            }
        }

        System.out.println(positivos + "valores positivos");

    }
}
