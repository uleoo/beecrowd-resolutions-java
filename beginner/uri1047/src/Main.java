package beginner.uri1047.src;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();
        int tempo = 0;
        int minutos = 0;

        minutos = minutoFinal - minutoInicial;
        tempo = horaFinal - horaInicial;
        if(minutos < 0) {
            tempo -= 1;
            minutos = 60 + minutos;
        } else if (tempo == 0 && minutos == 0) {
            tempo = 24;
        }
        if (tempo < 0) {
            tempo = 24 + tempo;
        }

        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)%n", tempo, minutos);

    }
}
