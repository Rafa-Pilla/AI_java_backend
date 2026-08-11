package modulo02_estrutura.exercicio03_Ordenacao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

		List<Integer> lista = new ArrayList<>();
		int i = 0;
		
		switch (tipo) {
			case "p" : {
				for (i=num1;  i <= num2; i++) {
				    if (i % 2 == 0)
                    lista.add(i);
                    } 
				lista.sort(reverseOrder());
				System.out.println(lista);
            } break;
			case "i" : { 
                for (i=num1; i <= num2; i++) {
				    if (i % 2 != 0)
                    lista.add(i);
                    } 
				lista.sort(reverseOrder());
				System.out.println(lista);
			} break;
		}

        scanner.close();
	}
}
