package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num, maior = 0;
		
		System.out.println("Insira 10 numeros:");
		
		for(int i = 0; i != 10; i++) {
			num = sc.nextInt();
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior numero inserido foi o " + maior);
		

		sc.close();
	}
}
