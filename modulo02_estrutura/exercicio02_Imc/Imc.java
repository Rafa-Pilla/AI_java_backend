package modulo02_estrutura.exercicio02_Imc;
import java.util.Scanner;

public class Imc {
    public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Informe seu nome");
		String name = scanner.nextLine();
			
		System.out.println("Informe sua altura em m");
		double altura = scanner.nextDouble();
		scanner.nextLine();
			
		System.out.println("Informe seu peso em kg");
		int peso = scanner.nextInt();
		scanner.nextLine();
			
		double imc = peso/(altura*altura);
			
		String message = "";
			if (imc <= 18.5) {
				message = "Abaixo do peso";
			} else if (18.6 > imc && imc < 24.9) {
				message = "Peso ideal";
			} else if (25 > imc && imc < 29.9) {
				message = "Levemente acima do peso";
			} else if (30 > imc && imc < 34.9) {
				message = "Obesidade I";
			} else if (35 > imc && imc < 39.9) {
				message = "Obesidade II (Severa)";
			} else if (imc >= 40) {
				message = "Obesidade III (Mórbida)";
			}
			
		System.out.println(name + ", seu IMC indica " + message);

        scanner.close();

	}
}
