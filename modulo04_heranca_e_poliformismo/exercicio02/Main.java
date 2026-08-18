package modulo04_heranca_e_poliformismo.exercicio02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Gerente> listaGerentes = new ArrayList<>();
    public static List<Vendedor> listaVendedores = new ArrayList<>();
    public static List<Atendente> listaAtendentes = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MenuPrincipal menuCadastro = new MenuPrincipal();
        MenuUsuario menuUsuario = new MenuUsuario();
        
        int opcao = 0;
        
        while (opcao != 3) {

            if (opcao == 0) {
                menuPrincipal.exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine();
            } 

            switch (opcao) {
                case 1: 
                    menuCadastro.exibirMenuCadastro(scanner);
                    opcao = 2;
                    continue;
                case 2:
                    menuUsuario.exibirMenuUsuario(scanner);
                    if (menuUsuario.inMenuUsuario(false)) { opcao = 0; }
                    continue;
            }

        }

        scanner.close();
    }
}
