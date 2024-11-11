package segundaaulajava;
import java.util.Scanner;

public class Atividade5Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        int primeiro = entrada.nextInt();

        System.out.println("Entre com o segundo numero:");
        int segundo = entrada.nextInt();

        System.out.println("Entre com o terceiro numero");
        int terceiro = entrada.nextInt();

        int menor;

        if (primeiro<=segundo && primeiro<=terceiro){
            menor=primeiro;
        } else if (segundo<=primeiro && segundo<=terceiro){
            menor=segundo;
        }
        else {
            menor=terceiro;
        }

        System.out.println("o menor numero e:" +menor);
    }
}
