package beginner.uri1041.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        String result;

        if (x == 0 && y == 0) {
            result = "Origem";
        } else if (x > 0 && y > 0) {
            result = "Q1";
        } else if (x > 0 && y < 0) {
            result = "Q4";
        } else if (x < 0 && y > 0) {
            result = "Q2";
        } else if (x < 0 && y < 0){
            result = "Q3";
        } else if (x == 0) {
            result = "Eixo Y";
        } else {
            result = "Eixo X";
        }

        System.out.println(result);
    }
}
