package Exercicios3;
import java.util.Scanner;

public class At24Java {
    //Fiz com AJUDA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);

    }
}
