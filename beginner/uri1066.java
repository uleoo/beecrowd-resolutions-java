package beginner;
import java.util.Scanner;

public class uri1066 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (n < 0) {
                negativos++;
            } else if (n > 0) {
                positivos++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }
}
