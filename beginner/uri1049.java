package beginner;
import java.util.Scanner;

public class uri1049 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        String palavraUm = scan.nextLine();
        String palavraDois = scan.nextLine();
        String palavraTres = scan.nextLine();
        String resposta = "";

        switch (palavraUm.charAt(0)) {
            case 'v':
                if (palavraDois.equals("ave")) {
                    resposta = palavraTres.equals("carnivoro") ? "aguia" : "pomba";
                } else {
                    resposta = palavraTres.equals("onivoro") ? "homem" : "vaca";
                }
                break;
            case 'i':
                if (palavraDois.equals("inseto")) {
                    resposta = palavraTres.equals("hematofago") ? "pulga" : "lagarta";
                } else {
                    resposta = palavraTres.equals("hematofago") ? "sanguessuga" : "minhoca";
                }
                break;
        }
        System.out.println(resposta);


    }
}
