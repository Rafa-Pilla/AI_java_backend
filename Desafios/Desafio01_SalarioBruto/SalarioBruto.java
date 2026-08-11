package Desafios.Desafio02_SalarioBruto;
import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
				
	/* Recebendo Informações */	
		System.out.println("Digite o seu salário bruto");
		double salarioBruto = scanner.nextDouble();
		scanner.nextLine();
				
		System.out.println("Digite o valor referente ao adicional de benefícios");
		double valorBeneficio = scanner.nextDouble();
		scanner.nextLine();
				
		double salario = 0.0;
				
	/* Calculando Salário */		
		if (salarioBruto > 0.00 && salarioBruto < 1100.00) {
			salario = (salarioBruto - (salarioBruto * 0.05)) + valorBeneficio;
		} else if (salarioBruto > 1100.01 && salarioBruto < 2500.00) {
			salario = (salarioBruto - (salarioBruto * 0.10)) + valorBeneficio;
		} else if (salarioBruto > 2500.00) {
			salario = (salarioBruto - (salarioBruto * 0.15)) + valorBeneficio;
		}
		
    /* Informando saída */
		System.out.println("O salário a ser transferido é de R$" + String.format("%.2f", salario));

        scanner.close();
	}
}
