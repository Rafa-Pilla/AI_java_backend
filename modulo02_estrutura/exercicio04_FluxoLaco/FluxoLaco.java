package modulo02_estrutura.exercicio04_FluxoLaco;
import java.util.Scanner;

public class FluxoLaco {
    public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int num1 = scanner.nextInt();
		scanner.nextLine();
		
        int num2 = 0;

		do {
			System.out.println("Informe outro número");
			num2 = scanner.nextInt();
			scanner.nextLine();
			
			if (num2 < 0) continue;
			
		} while (num2 % num1 != 0);
		
		System.out.println("A execução encerrou, o número escolhido não é divisível pelo primeiro número informado");

        scanner.close();
		
	}
}
