package segundaaulajava;
import java.util.Scanner;

public class Atividade6Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o numero:");
        int numero = entrada.nextInt();

        if (numero % 2 ==0){
            System.out.println("Numero par");
        }

        else {
            System.out.println("Numero Impar");
        }
    }
}
