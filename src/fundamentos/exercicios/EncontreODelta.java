package fundamentos.exercicios;

import java.util.Scanner;

public class EncontreODelta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira valor de a: ");
		int a = sc.nextInt();
		
		System.out.println("Insira valor de b: ");
		int b = sc.nextInt();
		
		System.out.println("Insira valor de c: ");
		int c = sc.nextInt();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("Valor de delta: " + delta);
		
		sc.close();
	}
}
