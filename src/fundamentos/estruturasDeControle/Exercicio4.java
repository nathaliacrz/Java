package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Insira um valor: ");
	int numero = sc.nextInt();
	
	if(numero % 2 != 0) {
		System.out.println("Numero impar. ");
	} else {
		System.out.println("Numero nao e impar.");
	}

	sc.close();
	}
}
