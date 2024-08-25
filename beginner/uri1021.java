package beginner;
import java.util.Scanner;

public class uri1021 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();

        int schedules = (int) input;

        int hundred = schedules / 100;
        int leftover = schedules % 100;
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
        int one = leftover;

        double coins = (input - schedules) * 100 + 0.6;

        int fiftyCents = (int) (coins/ 50);
        coins %= 50;
        int twentyFiveCents = (int) (coins / 25);
        coins %= 25;
        int tenCents = (int) (coins / 10);
        coins %= 10;
        int fiveCents = (int) (coins / 5);
        coins %= 5;
        int oneCent = (int) coins;

        System.out.println("NOTAS:");
        System.out.printf("%s nota(s) de R$ 100.00%n", hundred);
        System.out.printf("%s nota(s) de R$ 50.00%n", fifty);
        System.out.printf("%s nota(s) de R$ 20.00%n", twenty);
        System.out.printf("%s nota(s) de R$ 10.00%n", ten);
        System.out.printf("%s nota(s) de R$ 5.00%n", five);
        System.out.printf("%s nota(s) de R$ 2.00%n", two);
        System.out.println("MOEDAS:");
        System.out.printf("%s moeda(s) de R$ 1.00%n", one);
        System.out.printf("%s moeda(s) de R$ 0.50%n", fiftyCents);
        System.out.printf("%s moeda(s) de R$ 0.25%n", twentyFiveCents);
        System.out.printf("%s moeda(s) de R$ 0.10%n", tenCents);
        System.out.printf("%s moeda(s) de R$ 0.05%n", fiveCents);
        System.out.printf("%s moeda(s) de R$ 0.01%n", oneCent);

    }
}
