package quartaaulajava;
import java.util.Scanner;

public class Atividade1Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String marca;
        String modelo ;
        String cor ;
        double preco = 0;
        boolean ligado =false;
            System.out.println("Qual a marca do seu celular? ");
            marca = input.nextLine();

            System.out.println("Qual é o modelo dele? ");
            modelo = input.nextLine();

            System.out.println("Qual a cor ? ");
            cor = input.nextLine();

            System.out.println("Quanto você pagou ");
            preco = input.nextDouble();

            System.out.println("Está ligando? (true ou false) ");
            ligado = input.nextBoolean();

        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Cor: " +cor);
        System.out.println("Preço: " +preco);
        System.out.println("Ligado? " +ligado);
    }
}