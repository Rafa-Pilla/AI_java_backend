package modulo01_fundamentos.exercicio03_AreaRetangulo;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá, digite o valor da base do retângulo");
		int base = scanner.nextInt();
		
		System.out.println("Olá, digite o valor da altura do retângulo");
		int altura = scanner.nextInt();
		
		int area = base*altura;
		
		System.out.printf("A área do retângulo é %s\n", area);

        scanner.close();
}
}
