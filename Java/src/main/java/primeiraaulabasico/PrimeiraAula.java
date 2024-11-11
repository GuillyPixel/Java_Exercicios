package primeiraaulabasico; //pacote (pasta de organização das classes)
import java.util.Scanner; //referencia à biblioteca util do java

public class PrimeiraAula {
    public static void main(String[] args) {  //metodo principal para a execução
        Scanner entrada = new Scanner(System.in); // entrada de dados pelo teclado

        System.out.println("Entre com o primeito numero:"); //permite exibição em tela
        int numero = entrada.nextInt(); //instância da classe Scanner

        System.out.println("Entre com o segundo numero:");
        int numero2 = entrada.nextInt();

        int soma = numero+numero2; //instância que atribui o valor

        System.out.println("O valor do primeiro número é:" + numero); //saida de dados
        System.out.println("O valor do segundo número é:" + numero2);
        System.out.println("O valor das somas dos número é:" + soma);
    }

}
