package modulo02_estrutura.exercicio03_Ordenacao;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Informe um número");
		int num1 = scanner.nextInt();
		scanner.nextLine();
			
		System.out.println("Informe outro número maior do que o anterior");
		int num2 = scanner.nextInt();
		scanner.nextLine();
			
		System.out.println("Escolha entre par ou ímpar (p/i)");
		String tipo = scanner.nextLine();
		
		switch (tipo) {
			case "p" : {
				for (int i=num1;  i <= num2; i++) {
				    if (i % 2 == 0)
                    System.out.println(i);
                    } 
            } break;
			case "i" : { 
                for (int i=num1; i <= num2; i++) {
				    if (i % 2 != 0)
                    System.out.println(i);
                    } 
			} break;
		}

        scanner.close();
	}
}
