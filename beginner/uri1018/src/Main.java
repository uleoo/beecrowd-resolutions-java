package beginner.uri1018.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int hundred = input / 100;
        int leftover = input % 100;
        int fifty = leftover / 50;
        leftover %= 50;
        int twenty = leftover / 20;
        leftover %= 20;
        int ten = leftover / 10;
        leftover %= 10;
        int five = leftover / 5;
        leftover %= 5;
        int two = leftover / 2;
        leftover %= 2;

        System.out.println(input);
        System.out.printf("%s nota(s) de R$ 100,00%n", hundred);
        System.out.printf("%s nota(s) de R$ 50,00%n", fifty);
        System.out.printf("%s nota(s) de R$ 20,00%n", twenty);
        System.out.printf("%s nota(s) de R$ 10,00%n", ten);
        System.out.printf("%s nota(s) de R$ 5,00%n", five);
        System.out.printf("%s nota(s) de R$ 2,00%n", two);
        System.out.printf("%s nota(s) de R$ 1,00%n", leftover);

    }
}
