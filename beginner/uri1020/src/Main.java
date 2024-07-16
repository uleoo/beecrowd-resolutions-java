package beginner.uri1020.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = scan.nextInt();

        int year = days / 365;
        int leftover = days % 365;
        int month = leftover / 30;
        leftover %= 30;

        System.out.printf("%s ano(s)%n", year);
        System.out.printf("%s mes(es)%n", month);
        System.out.printf("%s dia(s)%n", leftover);

    }
}
