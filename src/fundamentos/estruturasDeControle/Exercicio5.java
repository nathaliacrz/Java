package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int contadorDeZero = 0;
		
		System.out.println("Insira um numero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 != 0) {
			contadorDeZero++;
		}
		
		switch(contadorDeZero) {
		case 1:
			System.out.println("Numero impar.");
			break;
		default:
			System.out.println("Numero nao e impar.");
		}
			

		sc.close();
	}
}
