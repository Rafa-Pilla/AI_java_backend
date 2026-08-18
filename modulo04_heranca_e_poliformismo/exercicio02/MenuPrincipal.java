package modulo04_heranca_e_poliformismo.exercicio02;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;

    public MenuPrincipal() {

    }

    public MenuPrincipal(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenu() {
        System.out.println("Bem-vind@ ao sistema de gerenciamento de usuários!");
        System.out.println("1 - Realizar Cadastro de Usuário");
        System.out.println("2 - Realizar Login");
        System.out.println("3 - Sair do sistema");
    }

    public void exibirMenuCadastro(Scanner scanner) {

        String mensagem = "Cadastro realizado com sucesso!";

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do usuário:");
        String email = scanner.nextLine();
        System.out.println("Digite a senha do usuário:");
        String senha = scanner.nextLine();
        System.out.println("Qual o seu cargo? (Gerente/Atendente/Vendedor):");
        String cargo = scanner.nextLine();

        switch (cargo.toLowerCase()) {
            case "gerente": 
                Gerente gerente = new Gerente(nome, email, senha);
                Main.listaGerentes.add(gerente);
                System.out.println(mensagem);
                break;
            case "atendente":
                Atendente atendente = new Atendente(nome, email, senha);
                Main.listaAtendentes.add(atendente);
                System.out.println(mensagem);
                break;
            case "vendedor":
                Vendedor vendedor = new Vendedor(nome, email, senha);
                Main.listaVendedores.add(vendedor);
                System.out.println(mensagem);
                break;
        } 
    }
}
