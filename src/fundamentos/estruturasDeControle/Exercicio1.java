package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um numero de 0 a 10: ");
		numero = sc.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.printf("O numero %d e par.", numero);
			} else {
				System.out.printf("O numero %d nao e par.", numero);
			}
		} else {
			System.out.println("Numero invalido.");
		}
				sc.close();

			}
}
