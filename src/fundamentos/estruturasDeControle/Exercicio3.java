package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;
		
		System.out.println("Insira a primeira media: ");
		nota1 = sc.nextDouble();
		System.out.println("Insira a  segunda media: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Aluno Aprovado.");
		} else if(media >= 4) {
			System.out.println("Aluno em Recuperacao.");
		} else {
			System.out.println("Aluno Reprovado.");
		}

		sc.close();
		
	}
}
