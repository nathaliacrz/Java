package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();

		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();

		double imc = peso / Math.pow(altura, 2);

		System.out.println("IMC: " + imc);

		sc.close();
	}
}
