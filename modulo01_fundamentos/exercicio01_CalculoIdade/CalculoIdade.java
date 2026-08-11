package modulo01_fundamentos.exercicio01_CalculoIdade;
import java.util.Scanner;

public class CalculoIdade {
	public static void main(String[]args){
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Em que ano você nasceu?");
		int anoNascimento = scanner.nextInt();
		
		int ano = java.time.Year.now().getValue();
		int idade = ano - anoNascimento;
		
		System.out.printf("Olá %s, você tem %s anos\n", nome, idade);

		scanner.close();
	}
}