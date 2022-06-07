package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o ano: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("Este ano e bissexto.");
		} else { 
			System.out.println("Este ano nao e bissexto.");
		}

		sc.close();
	}
}
