package segundaaulajava;
import java.util.Scanner;
public class Atividade1Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com sua idade:");
        int idade = entrada.nextInt();

        if(idade >=18 && idade <=69){
            System.out.println("Seu voto é OBRIGATÓRIO");
        } else if(idade>=16 || idade >69){
            System.out.println("Seu voto não é OBRIGATÓRIO");
        } else{
            System.out.println("Você não pode votar");
        }
    }
}
