package Desafios.Desafio03_TransacaoValores;
import java.util.Scanner;

public class TransacaoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o saldo da conta e o valor da transação, separados por espaço:");

        int saldo = scanner.nextInt();
        int valorTransacao = scanner.nextInt();
        
        if (saldo >= valorTransacao) {
            System.out.println("Transacao aprovada");
        } else {
            System.out.println("Saldo insuficiente");
        }

        scanner.close();
    }
}
