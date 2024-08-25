package beginner;
import java.util.Scanner;

public class uri1046 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int tempo = 0;

        do {
            tempo++;
            horaInicial++;
            if (horaInicial == 24) {
                horaInicial = 0;
            }
        } while (horaInicial != horaFinal);

        System.out.printf("O JOGO DUROU %s HORA(S)%n", tempo);

    }
}
