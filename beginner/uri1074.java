package beginner;
import java.util.Scanner;

public class uri1074 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String resposta = "";
        String resposta2 = "";

        for (int i = 0; i < n; i++) {
            int ent = scan.nextInt();
            if (ent < 0) {
                resposta2 = " NEGATIVE";
            } else {
                resposta2 = " POSITIVE";
            }
            if (ent == 0) {
                resposta = "NULL";
                resposta2 = "";
            } else if(ent % 2 == 0) {
                resposta = "EVEN";
            } else {
                resposta = "ODD";
            }
            resposta = resposta + resposta2;
            System.out.println(resposta);
        }
    }
}
