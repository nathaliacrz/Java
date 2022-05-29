package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor em Celsius: ");
		double C = sc.nextDouble();

		double F = (C * 9 / 5) + 32;

		System.out.printf("O valor em Fahrenheit é de %.2f°F", F);

		sc.close();
	}
}
