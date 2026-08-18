package modulo04_heranca_e_poliformismo.exercicio01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Bem-vindo ao sistema de venda de ingressos.");
        System.out.print("Qual filme você deseja assistir? \n");

        Ingresso.FILME.forEach(filme -> {
        System.out.println(filme.id() + " - " + filme.nome() + " - " + filme.tipo() + ": R$ " + filme.valor());
        });
        
        int option = scanner.nextInt();
        scanner.nextLine();

        Ingresso ingresso = new Ingresso(Ingresso.FILME.get(option - 1).valor(), Ingresso.FILME.get(option - 1).nome(), Ingresso.FILME.get(option - 1).tipo());

        System.out.println("Escolha o tipo de ingresso: ");
        System.out.println("1 - Meia Entrada ");
        System.out.println("2 - Ingresso Família ");

        int tipoIngresso = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantos ingressos você deseja comprar? ");

        int qtdIngresso = scanner.nextInt();
        scanner.nextLine();

        if (tipoIngresso == 1) {
            MeiaEntrada meiaEntrada = new MeiaEntrada(ingresso.getValor(), ingresso.getNomeFilme(), ingresso.getTipoFilme(), qtdIngresso);
            System.out.println("O valor total da sua compra é: R$ " + meiaEntrada.valorMeiaEntrada());
        } else if (tipoIngresso == 2) {
            Familia familia = new Familia(ingresso.getValor(), ingresso.getNomeFilme(), ingresso.getTipoFilme(), qtdIngresso);
            System.out.println("O valor total da sua compra é: R$ " + familia.valorFamilia());
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
