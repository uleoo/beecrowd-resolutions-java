package beginner;
import java.util.Scanner;

public class uri1045 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double maior = 0;
        double medio = 0;
        double menor = 0;

        if(a > b && a > c) {
            maior = a;
            if (b > c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b > c && b > a) {
            maior = b;
            if (c > a) {
                medio = c;
                menor = a;
            } else {
                medio = a;
                menor = c;
            }
        } else {
            maior = c;
            if (b > a) {
                medio = b;
                menor = a;
            } else {
                medio = a;
                menor = b;
            }
        }

        boolean teste = true;

        if(maior >= medio + menor) {
            System.out.println("NAO FORMA TRIANGULO");
            teste = false;
        } else if (maior * maior == medio * medio + menor * menor) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (maior * maior > medio * medio + menor * menor) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (teste) {
            if (maior == medio && medio == menor) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (maior == medio || medio == menor || maior == menor) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }


    }
}
