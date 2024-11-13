package terceiraulajava;
import java.util.Scanner;

public class Atividade4switchJava {
    public static void main(String[] args) {
        int numerocodigo;
        String mensagem;
        double SalarioA;
        double SalarioNovo = 0;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Qual seu Cargo (1 á 5)");
        numerocodigo = entrada.nextInt();

        switch (numerocodigo){
            case 1: mensagem="Estagiario";
            SalarioA = 1400;
            SalarioNovo = SalarioA*1.10;
                break;
            case 2: mensagem="Programador Junior";
                SalarioA = 3000;
                SalarioNovo = SalarioA*1.12;
                break;
            case 3: mensagem="Programador Pleno";
                SalarioA = 5500;
                SalarioNovo = SalarioA*1.13;
                break;
            case 4: mensagem="Programador Senior";
                SalarioA = 8000;
                SalarioNovo = SalarioA*1.15;
                break;
            case 5: mensagem="Programador Master";
                SalarioA = 12000;
                SalarioNovo = SalarioA*1.18;
                break;
            default: mensagem= "Codigo Incorreto";
        }
        System.out.printf("Olá Funcionario, você recebeu um aumento!!!");
        System.out.printf("Novo Salário: R$ %.2f", SalarioNovo); //ajuda do chat, % inicia o formato, .2 que a casa será duas casa decimais, f especifica o valor (float ou duble no caso).

    }
}