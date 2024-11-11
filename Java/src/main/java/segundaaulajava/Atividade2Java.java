package segundaaulajava;
import java.util.Scanner;

public class Atividade2Java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com seu peso:");
        float peso = entrada.nextFloat();

        System.out.println("Entre com sua altura");
        float altura = entrada.nextFloat();

        float imc = (peso/(altura*altura));

        System.out.println("O valor do seu IMC é?" +imc);

        if (imc <18.5){
            System.out.println("Muito abaixo do peso!");
        }
        else if (imc >=18.6 && imc<=24.9){
            System.out.println("Peso ideal (Parabéns)");
        }
        else if (imc >=25.0 && imc<=29.9){
            System.out.println("Levemente acima do peso");
        }
        else if (imc >=30.0 && imc<=34.9){
            System.out.println("Obesidade grau |");
        }
        else if (imc >=35.0 && imc<=39.9){
            System.out.println("Obesidade grau ||");
        }
        else if (imc >=40.0){
            System.out.println("Obesidade grau |||");
        }
    }
}
