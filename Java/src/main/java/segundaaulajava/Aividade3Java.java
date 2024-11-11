package segundaaulajava;

import java.util.Scanner;

public class Aividade3Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Saldo:");
        double saldoMedio = entrada.nextDouble();
        double credito = entrada.nextDouble();


        if (saldoMedio<= 500) {
            credito = 0;
            System.out.println("Você não tem credito.");
        } else if (saldoMedio<= 1000) {
            credito = saldoMedio * 0.30;
            System.out.println("Saldo medio: R$" + saldoMedio);
            System.out.println("Saldo do credito: R$ " + credito);
        }
        else if (saldoMedio<= 3000) {
            credito = saldoMedio * 0.40 ;
            System.out.println("Saldo medio: R$" + saldoMedio);
            System.out.println("Saldo do credito: R$ " + credito);
        }

        else {
            credito = saldoMedio * 0.50;
            System.out.println("Saldo medio: R$" + saldoMedio);
            System.out.println("Saldo do credito: R$ " + credito);
        }

    }
}