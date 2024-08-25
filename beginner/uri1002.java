package beginner;

import java.util.Scanner;

public class uri1002 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

    }
}