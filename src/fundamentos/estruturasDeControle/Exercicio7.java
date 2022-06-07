package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um numero: ");
		int num = sc.nextInt();
		
		int soma = 0;
		
		while(num > 0) {
			soma += num;
			System.out.println(soma);
			System.out.println("Insira um numero: ");
			num = sc.nextInt();
		}
		
		System.out.println("Programa encerrado.");
		

		sc.close();
	}
}
