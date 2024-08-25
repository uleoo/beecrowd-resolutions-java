package beginner;
import java.util.Scanner;

public class uri1061 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        String diaString = scan.nextLine();
        String[] vet = diaString.split(" ");
        int diaInicial = Integer.parseInt(vet[1]);

        String horario = scan.nextLine();
        vet = horario.split(" ");

        int horaInicial = Integer.parseInt(vet[0]);
        int minutoInicial = Integer.parseInt(vet[2]);
        int segundoInicial = Integer.parseInt(vet[4]);

        diaString = scan.nextLine();
        vet = diaString.split(" ");
        int diaFinal = Integer.parseInt(vet[1]);

        horario = scan.nextLine();
        vet = horario.split(" ");

        int horaFinal = Integer.parseInt(vet[0]);
        int minutoFinal = Integer.parseInt(vet[2]);
        int segundoFinal = Integer.parseInt(vet[4]);

        int segundos = segundoFinal - segundoInicial;
        int minutos = minutoFinal - minutoInicial;
        int horas = horaFinal - horaInicial;
        int dias = diaFinal - diaInicial - 1;

        if(minutos < 0) {
            horas -= 1;
            minutos = 60 + minutos;
        } else if (horas == 0 && minutos == 0) {
            horas = 24;
        }
        if (dias < 0) {
            dias = 0;
        }
        if (segundos < 0) {
            minutos -= 1;
            segundos = 60 + segundos;
        }
        if (horas < 0) {
            horas = 24 + horas;
        }
        if (horas == 24) {
            dias++;
            horas = 0;
        }

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

    }
}
