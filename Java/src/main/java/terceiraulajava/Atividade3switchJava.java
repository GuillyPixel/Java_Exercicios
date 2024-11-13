package terceiraulajava;
import java.util.Scanner;

public class Atividade3switchJava {
    public static void main(String[] args) {
        int lanche;
        String mensagem;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Entre com o combo de 1 a 3");
        lanche = entrada.nextInt();

        switch (lanche){
            case 1: mensagem="Dois hambúrgueres (100% carne bovina), alface americana, queijo cheddar, maionese Big Mac, cebola, picles e pão com gergelim, acompanhamento, bebida";
                break;
            case 2: mensagem="Sanduiche composto por pão tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, molho sabor cheddar e fatias de bacon. Com acompanhamento e bebida";
                break;
            case 3: mensagem="Dois hambúrgueres (100% carne bovina), queijo cheddar, cebola, fatias de bacon, ketchup, mostarda e pão com gergelim, acompanhamento e bebida.";
                break;
            case 4: mensagem="Sanduíche no pão de brioche com hambúrguer de carne bovina grelhada, 2 fatias de queijo sabor cheddar, carne de costela bovina desfiada, chutney de cebola roxa, cebola crispy, 3 anéis de onion rings e maionese de alho.";
                break;
            case 5: mensagem="Dois hambúrgueres (100% carne bovina), queijo cheddar, cebola, fatias de bacon, ketchup, mostarda e pão com gergelim, acompanhamento e bebida.";
                break;

            default: mensagem="Combo Inválido";
        }
        System.out.println("Combo: " + mensagem);

    }
}