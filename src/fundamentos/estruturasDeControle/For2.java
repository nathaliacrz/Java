package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int contador;
		
		for(contador = 10; contador <= 0 ; contador -= 2)
		System.out.printf("Contador = %d\n", contador);
		sc.close();
	}
}
