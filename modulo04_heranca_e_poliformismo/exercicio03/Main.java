package modulo04_heranca_e_poliformismo.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        RAmericano relogioAmericano = new RAmericano();
        RBrasileiro relogioBrasileiro = new RBrasileiro();
        
        int opcao = 0;

        do {
            System.out.println("\n Olá! Escolha o tipo de relógio que dejesa visualizar:");
            System.out.println("1 - Relógio Americano");
            System.out.println("2 - Relógio Brasilero");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                relogioAmericano.horario();
            } else if (opcao == 2) {
                relogioBrasileiro.horario();
            } else {
                System.out.println("Opção inválida");
            }

        } while (opcao != 3);

        scanner.close();
    }
    
}
