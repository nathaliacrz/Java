package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double C, F;

		System.out.println("Digite o valor em Fahrenheit: ");
		F = sc.nextDouble();

		C = (F - 32) * 5.0 / 9.0;

		System.out.println("O valor em Celsius é de: " + C + "°C.");
		
		sc.close();
	}
}


