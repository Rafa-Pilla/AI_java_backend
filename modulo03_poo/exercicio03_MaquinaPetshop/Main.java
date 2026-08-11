package modulo03_poo.exercicio03_MaquinaPetshop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Maquina maquina = new Maquina();

        int option = 0;

            do {

                System.out.println("Bem-vind@ ao PetShop CatDog");
                System.out.println("1 - Dar banho no pet");
                System.out.println("2 - Abastecer com água");
                System.out.println("3 - Abastecer com shampoo");
                System.out.println("4 - Verificar nível água");
                System.out.println("5 - Verificar nível shampoo");
                System.out.println("6 - Colocar pet na máquina");
                System.out.println("7 - Retirar pet da máquina");
                System.out.println("8 - Limpar máquina");
                System.out.println("9 - Sair");

                option = scanner.nextInt();
                scanner.nextLine();
                
                switch (option) {
                    case 1:
                        if (!maquina.getHavePet()) {
                            System.out.println("A máquina está em uso");
                        } else {
                            if (maquina.getQtdAgua() < 10 && maquina.getQtdShampoo() < 2) {
                                System.out.println("O banho não pode ser realizados pois não há quantidade adequada de produtos na máquina");
                            } else {
                                maquina.setQtdAgua(maquina.getQtdAgua() - 10);
                                maquina.setQtdShampoo(maquina.getQtdShampoo() - 2);
                                maquina.setPetClean(!maquina.getPetClean());
                                System.out.println("Banho finalizado!");
                            }
                        }
                        break;

                    case 2:
                        System.out.println("A reposição tem um limite de 2L!");
                        maquina.setQtdAgua(maquina.getQtdAgua() + 2);
                        System.out.println("Abastecimento realizado com sucesso! \n O nível da água está em " + maquina.getQtdAgua() + "L");
                        break;
                    
                    case 3:
                        System.out.println("A reposição tem um limite de 2L!");
                        maquina.setQtdShampoo(maquina.getQtdShampoo() + 2);
                        System.out.println("Abastecimento realizado com sucesso! \n O nível da água está em " + maquina.getQtdShampoo() + "L");
                        break;

                    case 4:
                        System.out.println("O nível da água está em " + maquina.getQtdAgua() + "L");
                        break;
                    
                    case 5:
                        System.out.println("O nível da água está em " + maquina.getQtdShampoo() + "L");
                        break;

                    case 6:
                        if (!maquina.getHavePet()) {
                            System.out.println("A máquina está em uso");
                        } else {
                            maquina.setHavePet(true);
                            System.out.println("O pet foi colocado na máquina!");
                        }
                        break;

                    case 7:
                        if (maquina.getHavePet()) {
                            System.out.println("Não há pet na máquina");
                        } else if (maquina.getPetClean()) {
                            System.out.println("O pet foi retirado sem estar limpo! Por favor realize a limpeza da máquina");
                        } else {
                            maquina.setHavePet(false);
                            System.out.println("O pet foi retirado da máquina!");
                        }
                        break;

                    case 8:
                        if (!maquina.getHavePet()) {
                            System.out.println("A máquina está em uso");
                        } else {
                            if (maquina.getQtdAgua() < 3 && maquina.getQtdShampoo() < 1) {
                                System.out.println("A limpeza não pode ser realizada pois não há quantidade adequada de produtos na máquina");
                            } else {
                                maquina.setQtdAgua(maquina.getQtdAgua() - 3);
                                maquina.setQtdShampoo(maquina.getQtdShampoo() - 1);
                                System.out.println("Limpeza finalizada finalizado!");
                            }
                        }
                        break;

                    case 9:
                        System.out.println("Execução encerrada");
                        break;
                
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                
            } while (option != 9);

        scanner.close();
    }
    
}
