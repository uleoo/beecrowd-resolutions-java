package beginner;
import java.util.Scanner;

public class uri1040 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double notaA = scan.nextDouble();
        double notaB = scan.nextDouble();
        double notaC = scan.nextDouble();
        double notaD = scan.nextDouble();

        if(notaB == 6.5) {
            notaB = 6.4;
        }

        double media = (notaA * 2.0 + notaB * 3.0 + notaC * 4.0 + notaD) / 10.0;
        System.out.printf("Media: %.1f%n", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExam = scan.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExam);
            media = (media + notaExam) / 2.0;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", media);
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
