package beginner.uri1037.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        String intervalo = "Fora de intervalo";
        if (x >= 0 && x <= 25) {
            intervalo = "Intervalo [0,25]";
        } else if (x > 25 && x <= 50) {
            intervalo = "Intervalo (25,50]";
        } else if (x > 50 && x <= 75) {
            intervalo = "Intervalo (50,75]";
        } else if (x > 75 && x <= 100) {
            intervalo = "Intervalo (75,100]";
        }

        System.out.println(intervalo);

    }
}
