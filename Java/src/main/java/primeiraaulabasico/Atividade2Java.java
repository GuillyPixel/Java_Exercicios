package primeiraaulabasico;
import java.util.Scanner;
public class Atividade2Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a primeira nota:");
        int nota1 = entrada.nextInt();

        System.out.println("Entre com a segunda nota:");
        int nota2 = entrada.nextInt();

        System.out.println("Entre com a terceira nota:");
        int nota3 = entrada.nextInt();

        System.out.println("Entre com a quarta nota:");
        int nota4 = entrada.nextInt();

        int soma = nota1 + nota2 + nota3 + nota4;
        int media = soma/4;

        System.out.println("O valor das somas das notas é:" + soma);
        System.out.println("O valor das media das notas é:" + media);

        if(media >=7){
            System.out.println("Está aprovado!");
        } else if (media >=5){
            System.out.println("Está em recuperação");
        } else{
            System.out.println("Está reprovado");
        }
    }

}