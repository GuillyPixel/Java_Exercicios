package primeiraaulabasico;
import java.util.Scanner;


public class Atividade3Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja:");
        int numero = entrada.nextInt();

        for (int divi = 1; divi <= 10; divi++) {
            System.out.println(numero + "x" + divi + "=" + (numero * divi));
            }
        }

    }