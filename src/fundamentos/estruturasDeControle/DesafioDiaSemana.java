package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dias = sc.next();
		
		if(dias.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if(dias.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if(dias.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if(dias.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if(dias.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if(dias.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if(dias.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia inválido.");
		}
			
		
		
		
		sc.close();
	}
}
