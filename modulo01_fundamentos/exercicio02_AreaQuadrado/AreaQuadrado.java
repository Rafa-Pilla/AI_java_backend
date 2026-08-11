package modulo01_fundamentos.exercicio02_AreaQuadrado;
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá, digite o valor do lado do quadrado");
		double lado = scanner.nextInt();
		
		double area = Math.pow(lado, 2);
		
		System.out.printf("A área do quadrado é %s\n", area);

        scanner.close();
}
}
