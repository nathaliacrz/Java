package fundamentos.exercicios;

import java.util.Scanner;

public class AoQuadradoAoCubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor: ");
		double num = sc.nextDouble();

		double aoQuadrado = Math.pow(num, 2);
		double aoCubo = Math.pow(num, 3);

		System.out.println("Valor inicial: " + num);
		System.out.println("Valor inicial ao quadrado: " + aoQuadrado);
		System.out.println("Valor inicial ao cubo: " + aoCubo);

		sc.close();

	}
}
