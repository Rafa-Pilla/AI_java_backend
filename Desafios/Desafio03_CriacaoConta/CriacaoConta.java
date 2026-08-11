package Desafios.Desafio01_CriacaoConta;
import java.util.Scanner;

public class CriacaoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome e o tipo de conta que deseja criar (corrente, poupanca ou investimento), separados por espaço:");

        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        if (
            tipoConta.equalsIgnoreCase("corrente") || 
            tipoConta.equalsIgnoreCase("poupanca") || 
            tipoConta.equalsIgnoreCase("investimento")) {
                System.out.printf("Bem-vindo(a), %s! Sua conta %s está pronta para uso.", nome, tipoConta);
        } else {
            System.out.printf("Tipo de conta inválido.");
        }

        scanner.close();
    }
}
