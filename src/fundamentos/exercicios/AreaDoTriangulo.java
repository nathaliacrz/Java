package fundamentos.exercicios;

import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base do triangulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Altura do triangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("Area do triangulo: " + area);
		
		sc.close();
	}
}
