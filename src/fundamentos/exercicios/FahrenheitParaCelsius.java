package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor em Fahrenheit: ");
		double F = sc.nextDouble();

		double C = (F - 32) * (5.0 / 9.0);

		System.out.printf("O valor em Celsius é de: %.2f°C.", C);

		sc.close();
	}

}
