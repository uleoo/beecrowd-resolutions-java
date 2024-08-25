package beginner;
import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int hour = input / 3600;
        int leftover = input % 3600;
        int minute = leftover / 60;
        leftover = input % 60;

        System.out.printf("%s:%s:%s%n", hour, minute, leftover);

    }
}
