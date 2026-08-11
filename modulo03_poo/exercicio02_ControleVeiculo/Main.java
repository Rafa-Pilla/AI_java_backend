package modulo03_poo.exercicio02_ControleVeiculo;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro(false, 0, 0);

        int option = 0;
        do {

            System.out.println("Olá, o que você deseja fazer?");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar marcha");
            System.out.println("8 - Sair");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    carro.setIsOn(!carro.getIsOn());
                    System.out.println("O carro foi ligado!");
                    break;

                case 2:
                    if (carro.getIsOn()) {
                        System.out.println("O carro já está desligado");
                    } else if (carro.getVelocidade() != 0 && carro.getMarcha()!= 0) {
                        System.out.println("O carro não pode ser desligado pois não está em ponto morto e sua velocidade é diferente de zero!");
                    } else {
                        carro.setIsOn(carro.getIsOn());
                        System.out.println("O carro foi desligado!");
                    }
                    break;

                case 3:
                    LimiteMarcha limiteAceleracao = carro.getLimiteMarcha();

                    if (carro.getIsOn()) {
                        System.out.println("O carro não pode realizar esta tarefa pois está desligado");
                    } else {
                        if ((carro.getVelocidade() + 1) > limiteAceleracao.maxVelocidade()) {
                            System.out.println("A marcha " + carro.getMarcha() + " suporta o limite de " + limiteAceleracao.maxVelocidade() + "\n Por favor troque de marcha para continuar");
                        } else {
                            carro.setVelocidade(carro.getVelocidade() + 1);
                            System.out.println("Aceleração feita com sucesso! Sua velocidade atual é " + carro.getVelocidade());
                        }
                    }
                    break;

                case 4:
                    LimiteMarcha limite = carro.getLimiteMarcha();

                    if (carro.getIsOn()) {
                        System.out.println("O carro não pode realizar esta tarefa pois está desligado");
                    } else {
                        if ((carro.getVelocidade() - 1) < limite.minVelocidade()) {
                            System.out.println("A marcha " + carro.getMarcha() + " suporta o limite de " + limite.minVelocidade() + "\n Por favor troque de marcha para continuar");
                        } else {
                            carro.setVelocidade(carro.getVelocidade() - 1);
                            System.out.println("Desaceleração feita com sucesso! Sua velocidade atual é " + carro.getVelocidade());
                        }
                    }
                    break;

                case 5:
                    if (!carro.getIsOn() && (carro.getVelocidade() >= 1 && carro.getVelocidade() <= 40)) {
                        System.out.println("Você virou a direita/esquerda!");
                    } else {
                        System.out.println("O carro não pode realizar o desvio pois sua velocidade não está entre 1km e 40km ou desligado");
                    }
                    break;

                case 6:
                    System.out.println("Sua velocidade é " + carro.getVelocidade());
                    break;

                case 7:
                    if (carro.getIsOn()) {
                        System.out.println("O carro não pode realizar esta tarefa pois está desligado");
                    } else {
                        System.out.println("Escolha a marcha");
                        int marchaEscolhida = scanner.nextInt();
                        scanner.nextLine();

                        if (Math.abs(marchaEscolhida - carro.getMarcha()) > 1) {
                            System.out.println("Não é permitido pular uma marcha, sua marcha atual é " + carro.getMarcha() + "\n Por favor, escolha uma marcha válida");
                        } else {
                            carro.setMarcha(marchaEscolhida);
                            System.out.println("Marcha trocada com sucesso!" + "\n Sua marcha atual é " + carro.getMarcha());
                        }
                    }
                    break;

                case 8:
                    System.out.println("Execução encerrada");
                    break;
            
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        while (option != 8);

        scanner.close();
    }
}
