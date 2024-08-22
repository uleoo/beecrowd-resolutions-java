package beginner.uri1051.src;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double n = scan.nextDouble();
        double resultado = 0;

        while (n > 2000.00) {
            if(n > 4500.00) {
                resultado += (n - 4500) * .28;
                n = 4500.00;            } else if (n >= 3000.01) {
                resultado += (n - 3000) * .18;
                n = 3000.00;
            } else if (n >= 2000.01) {
                resultado += (n - 2000) * .08;
                n = 2000.00;
            }
        }
        if (resultado == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", resultado);
        }
    }
}
