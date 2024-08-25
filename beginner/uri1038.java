package beginner;
import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int code = scan.nextInt();
        int quantity = scan.nextInt();
        double value = 0;

        switch (code) {
            case 1:
                value = 4.0;
                break;
            case 2:
                value = 4.5;
                break;
            case 3:
                value = 5.0;
                break;
            case 4:
                value = 2.0;
                break;
            case 5:
                value = 1.5;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", value * quantity);
    }
}
