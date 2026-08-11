package modulo03_poo.exercicio01_ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);

            Conta conta = null;
            int option1 = 0;

            do {

            System.out.println("Olá! Seja bem-vindo(a) ao banco X");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Entrar");
            System.out.println("3 - Sair");
            
            option1 = scanner.nextInt();
            scanner.nextLine();

            
            switch (option1) {
                case 1: {
                    System.out.println("A seguir, insira seus dados");

                    System.out.println("Qual seu nome e quanto você deseja depositar na conta (Por favor separe as respostas por espaço)?");
                    String input = scanner.nextLine();
                    String[] partes = input.split(" ");
                    conta = new Conta(partes[0], Double.parseDouble(partes[1]));

                    System.out.println("Bem-vindo(a) " + conta.getName() + " \nSua conta foi criada com sucesso! \n" + "O valor do seu saldo é R$ " + conta.getSaldo() + " e o valor do seu cheque especial é R$ " + conta.chequeEspecial());
                    
                 } break;
            
                case 2: {
                    if (conta == null) {
                    System.out.println("Atenção: Nenhuma conta foi criada ainda. Crie uma conta primeiro!");
                    break;
                }

                int option2 = 0;

                do {
                    System.out.println("Escolha uma das opções a seguir");
                    System.out.println("1 - Consultar saldo");
                    System.out.println("2 - Consultar cheque especial");
                    System.out.println("3 - Depositar dinheiro");
                    System.out.println("4 - Sacar dinheiro");
                    System.out.println("5 - Pagar um boleto");
                    System.out.println("6 - Verificar se a conta está usando cheque especial");
                    System.out.println("7 - Sair");

                    option2 = scanner.nextInt();

                    switch (option2) {
                        case 1: System.out.println(conta.getSaldo()); break;
                        
                        case 2: System.out.println(conta.getChequeEspecial()); break;
                        
                        case 3: {
                            System.out.println("O seu saldo atual é R$" + conta.getSaldo() + "\n Quando você deseja depositar?");
                            double deposito = scanner.nextDouble();
                            if ((conta.getUseCheque()) == true) {
                                conta.setSaldo(deposito - (conta.getChequeEspecial())*0.2);
                                System.out.println("Seu valor de cheque especial havia atingido o limite, parte do valor depositado foi suado para pagamento");
                                System.out.println("Seu saldo foi atualizado para R$" + conta.getSaldo());
                            } else {
                                conta.setSaldo(conta.getSaldo() + deposito);
                                System.out.println("Seu saldo foi atualizado para R$" + conta.getSaldo());
                            }
                        } break;
                        
                        case 4: {
                            System.out.println("O seu saldo atual é R$" + conta.getSaldo() + "\n Quando você deseja sacar?");
                            double saque = scanner.nextDouble();

                            if (saque > conta.getSaldo()) {
                                if ((conta.getChequeEspecial() + conta.getSaldo()) > saque) {
                                    conta.setSaldo((conta.getChequeEspecial() + conta.getSaldo()) - saque);
                                } else if ((conta.getChequeEspecial() + conta.getSaldo()) == saque) {
                                    conta.setSaldo((conta.getChequeEspecial() + conta.getSaldo()) - saque);
                                    conta.setUseCheque(true);
                                }
                            } else { conta.setSaldo(conta.getSaldo() - scanner.nextDouble()); }
                            System.out.println("Seu saldo foi atualizado para R$" + conta.getSaldo());
                        } break;
                        
                        case 5: {
                            System.out.println("O seu saldo atual é R$" + conta.getSaldo() + "\n Qual o valor do boleto?");
                            conta.setSaldo(conta.getSaldo() - scanner.nextDouble());
                            System.out.println("Pagamento realizado com sucesso! Seu saldo fou atualizado para R$" + conta.getSaldo());
                        } break;
                        
                        case 6: System.out.println(conta.getUseCheque()); break;
                        
                        case 7: break;
                    
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                } while (option2 != 7);
                }
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (option1 !=3);

            scanner.close();
    }
    
}
