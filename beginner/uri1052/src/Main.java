package beginner.uri1052.src;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String resposta = "";

        switch (n) {
            case 1:
                resposta = "January";
                break;
            case 2:
                resposta = "February";
                break;
            case 3:
                resposta = "March";
                break;
            case 4:
                resposta = "April";
                break;
            case 5:
                resposta = "May";
                break;
            case 6:
                resposta = "June";
                break;
            case 7:
                resposta = "July";
                break;
            case 8:
                resposta = "August";
                break;
            case 9:
                resposta =  "September";
                break;
            case 10:
                resposta = "October";
                break;
            case 11:
                resposta = "November";
                break;
            case 12:
                resposta = "December";
                break;
        }

        System.out.println(resposta);


    }
}
