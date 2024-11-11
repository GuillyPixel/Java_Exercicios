package segundaaulajava;
import java.util.Scanner;
public class Atividade4Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        int primeiro = entrada.nextInt();

        System.out.println("Entre com o segundo numero:");
        int segundo = entrada.nextInt();

        if (primeiro>segundo){
            System.out.println("O maior é:" +primeiro);
        }
        else if (segundo>primeiro){
            System.out.println("O maior é:" +segundo);
        }
    }
}
