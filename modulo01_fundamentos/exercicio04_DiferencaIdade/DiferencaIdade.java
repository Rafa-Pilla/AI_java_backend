package modulo01_fundamentos.exercicio04_DiferencaIdade;
import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Olá, a seguir insira as informações do primeiro usuário?");
		System.out.println("Qual seu nome?");
		String nome1 = scanner.nextLine();
		System.out.println("Qual sua idade?");
		int idade1 = scanner.nextInt();
        scanner.nextLine();
		
        System.out.println("===================================================================");

		System.out.println("Olá, a seguir insira as informações do segundo usuário?");
		System.out.println("Qual seu nome?");
		String nome2 = scanner.nextLine();
		System.out.println("Qual sua idade?");
		int idade2 = scanner.nextInt();
        scanner.nextLine();
		
		System.out.printf("A diferença de idade entre %s e %s é %s\n", 
		nome1, nome2, Math.abs(idade1 - idade2));

        scanner.close();
}
}
