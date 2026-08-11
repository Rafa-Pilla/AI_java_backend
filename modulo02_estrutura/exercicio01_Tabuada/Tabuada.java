package modulo02_estrutura.exercicio01_Tabuada;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Informe um número");
		int num = scanner.nextInt();
			
		for (int i=0; i < 11; i++) {
			System.out.println(num * i);
		}
    
        scanner.close();
	}
}
