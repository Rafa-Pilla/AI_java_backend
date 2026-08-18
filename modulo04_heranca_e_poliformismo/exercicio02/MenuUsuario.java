package modulo04_heranca_e_poliformismo.exercicio02;

import java.util.Scanner;

public class MenuUsuario {
    private Scanner scanner;
    private boolean inMenuUsuario;

    public MenuUsuario() {

    }

    public MenuUsuario(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean inMenuUsuario(boolean inMenuUsuario) {
        return true;
    }

    public void exibirMenuUsuario(Scanner scanner){

        int opcao = 0;
        int option2 = 0;
        
        System.out.println("Olá! Você está na aba de login");
        System.out.println("1 - Realizar login:");
        System.out.println("2 - Voltar ao menu principal:");
        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {

            System.out.println("Email:");
            String email = scanner.nextLine();
            System.out.println("Senha:");
            String senha = scanner.nextLine();

        if (Main.listaGerentes.stream().anyMatch(g -> g.getEmail().equals(email) && g.getSenha().equals(senha))) {

            Gerente gerente = Main.listaGerentes.stream().filter((g -> g.getEmail().equals(email) && g.getSenha().equals(senha))).findFirst().orElse(null);

            if (gerente != null) {
                System.out.println("Login efetuado! \n");
                System.out.println("Olá " + gerente.getNome() + "\n");

            do {
                System.out.println("Olá Gerente! O que você deseja fazer?");
                System.out.println("1 - Gerar relatório financeiro");
                System.out.println("2 - Consultar vendas");
                System.out.println("3 - Alterar dados");
                System.out.println("4 - Alterar senha");
                System.out.println("5 - Realizar logout");
                option2 = scanner.nextInt();
                scanner.nextLine();

                switch (option2) {
                    case 1: Gerente.gerarRelatorioFinanceiro(Main.listaVendedores, Main.listaAtendentes);
                        break;

                    case 2:
                        System.out.println("O total de vendas é " );
                        Gerente.consultarVendas(Main.listaVendedores);
                        break;

                    case 3: 
                        System.out.println("Digite o novo nome:");
                        String novoNome = scanner.nextLine();
                        System.out.println("Digite o novo email:");
                        String novoEmail = scanner.nextLine();
                        gerente.alterarDados(novoNome, novoEmail);
                        System.out.println("Dados alterados com sucesso! \n");
                        System.out.println("Dados atuais: \n" + "Nome:" + novoNome + "\n Email: " + novoEmail);

                        break;

                    case 4:
                        System.out.println("Digite a nova senha:");
                        String novaSenha = scanner.nextLine();
                        gerente.alterarSenha(novaSenha);
                        System.out.println("Senha alterada com sucesso!");
                        System.out.println("Senha atual: " + novaSenha);
                        break;

                    case 5:    
                        break;

                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        break;
                }

        } while (option2 != 5); }

        } else if (Main.listaAtendentes.stream().anyMatch(a -> a.getEmail().equals(email) && a.getSenha().equals(senha))) {

            Atendente atendente = Main.listaAtendentes.stream().filter((g -> g.getEmail().equals(email) && g.getSenha().equals(senha))).findFirst().orElse(null);

            if (atendente != null) {
                System.out.println("Login efetuado! \n");
                System.out.println("Olá " + atendente.getNome() + "\n");


            do {
                System.out.println("Olá Atendente! O que você deseja fazer?");
                System.out.println("1 - Receber pagamento");
                System.out.println("2 - Fechar o caixa");
                System.out.println("3 - Alterar dados");
                System.out.println("4 - Alterar senha");
                System.out.println("5 - Realizar logout");
                option2 = scanner.nextInt();
                scanner.nextLine();

                switch (option2) {
                    case 1: 
                        System.out.print("Digite o valor do pagamento: ");
                        double pgt = scanner.nextDouble();
                        atendente.receberPgto(pgt);
                        System.out.println("Pagamento realizado com sucesso");
                        break;
                
                    case 2: 
                        System.out.println("Caixa feixado! \n Valor final: R$" + atendente.getVlCaixa());
                        break;

                    case 3: 
                        System.out.println("Digite o novo nome:");
                        String novoNome = scanner.nextLine();
                        System.out.println("Digite o novo email:");
                        String novoEmail = scanner.nextLine();
                        atendente.alterarDados(novoNome, novoEmail);
                        System.out.println("Dados alterados com sucesso!");
                        System.out.println("Dados atuais: \n Nome: " + novoNome + "\n Email: " + novoEmail);
                        break;

                    case 4: 
                        System.out.println("Digite a nova senha:");
                        String novaSenha = scanner.nextLine();
                        atendente.alterarSenha(novaSenha);
                        System.out.println("Senha alterada com sucesso!");
                        System.out.println("Senha atual: " + novaSenha);
                        break;

                    case 5:    
                        break;

                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        break;
                }

        } while (option2 != 5); }

        } else if (Main.listaVendedores.stream().anyMatch(v -> v.getEmail().equals(email) && v.getSenha().equals(senha))) {

            Vendedor vendedor = Main.listaVendedores.stream().filter((g -> g.getEmail().equals(email) && g.getSenha().equals(senha))).findFirst().orElse(null);

            if (vendedor != null) {
                System.out.println("Login efetuado! \n");
                System.out.println("Olá " + vendedor.getNome() + "\n");

            do {
                System.out.println("Olá Vendedor! O que você deseja fazer?");
                System.out.println("1 - Realizar venda");
                System.out.println("2 - Consultar vendas");
                System.out.println("3 - Alterar dados");
                System.out.println("4 - Alterar senha");
                System.out.println("5 - Realizar logout");
                option2 = scanner.nextInt();
                scanner.nextLine();

                switch (option2) {
                    case 1: 
                        vendedor.realizarVenda();
                        System.out.print("Venda realizada: \n Total de vendas: " + vendedor.getQtdVendas());
                        break;
                
                    case 2: 
                        System.out.println("Total de vendas é " + vendedor.getQtdVendas());
                        break;

                    case 3: 
                        System.out.println("Digite o novo nome:");
                        String novoNome = scanner.nextLine();
                        System.out.println("Digite o novo email:");
                        String novoEmail = scanner.nextLine();
                        vendedor.alterarDados(novoNome, novoEmail);
                        System.out.println("Dados alterados com sucesso!");
                        System.out.println("Dados atuais: \n Nome: " + novoNome + "\n Email: " + novoEmail);
                        break;

                    case 4: 
                        System.out.println("Digite a nova senha:");
                        String novaSenha = scanner.nextLine();
                        vendedor.alterarSenha(novaSenha);
                        System.out.println("Senha alterada com sucesso!");
                        System.out.println("Senha atual: " + novaSenha);
                        break;

                    case 5:    
                        break;

                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                        break;
                }

        } while (option2 != 5);

        }
        } else {
            System.out.println("Usuário não encontrado");
        }

        } else if (opcao == 2) { inMenuUsuario(false); }
        
    }
}
