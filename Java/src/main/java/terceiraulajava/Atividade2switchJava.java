package terceiraulajava;
import java.util.Scanner;

public class Atividade2switchJava {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int mes;
        String mensagem;


        System.out.println("Entre com o mês");
        mes = entrada.nextInt();

        switch (mes){
            case 1: mensagem = "Janeiro";
            break;
            case 2: mensagem = "Fevereiro";
                break;
            case 3: mensagem = "Março";
                break;
            case 4: mensagem = "Abril";
                break;
            case 5: mensagem = "Maio";
                break;
            case 6: mensagem = "Junho";
                break;
            case 7: mensagem = "Julho";
                break;
            case 8: mensagem = "Agosto";
                break;
            case 9: mensagem = "Setembro";
                break;
            case 10: mensagem = "Outubro";
                break;
            case 11: mensagem = "Novembro";
                break;
            case 12: mensagem = "Dezembro";
                break;
            default: mensagem = "Não tem esse mês";
        }
        System.out.println("Mês selecionado: " + mensagem);
    }
}
