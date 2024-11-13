package terceiraulajava;
import java.util.Scanner;

public class Atividade1switchJava {
    public static void main(String[] args) {
        int farol;
        String mensagem;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Entre com numero de 1 à 3");
        farol = entrada.nextInt();

        switch (farol){
            case 1: mensagem="Farol verde! Siga";
            break;
            case 2: mensagem="Farol amarelo! Cuidado";
            break;
            case 3: mensagem="Farol vermelho! Pare!";
            break;
            default: mensagem="Invalido";
        }
        System.out.println("Sinal: " + mensagem);

    }
}