package quartaaulajava;
import java.util.Scanner;
public class Atividade2Java {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

         String tema;
        int convidados;
        String local;
         double custo ;
        String data ;
            System.out.println("Qual vai ser o tema?");
            tema = input.nextLine();

            System.out.println("Quatas pessoas terá?");
            convidados = input.nextInt();
            input.nextLine();

            System.out.println("Qual local?");
            local = input.nextLine();

            System.out.println("Custo da festa");
            custo = input.nextDouble();
            input.nextLine();

            System.out.println("Data da festa");
            data = input.nextLine();


        System.out.println("tema:" + tema);
        System.out.println("Convidados: " +convidados);
        System.out.println("Local:" +local);
        System.out.println("Custo: " + custo);
        System.out.println("Data: " +data);
}
}