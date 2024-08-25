package beginner;
import java.util.Scanner;

public class uri1048 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario = scan.nextDouble();
        double percentual = 4;
        double reajuste = 0;

        if (salario <= 400.0) percentual = .15;
        else if (salario <= 800.0) percentual = .12;
        else if (salario <= 1200.0) percentual = .10;
        else if (salario <= 2000) percentual = .07;
        else percentual = .04;
        reajuste = salario * percentual;
        salario += reajuste;
        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + (int) (percentual * 100) + " %");

    }
}
