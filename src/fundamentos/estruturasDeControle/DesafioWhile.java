package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Insira uma nota: ");
			nota = sc.nextDouble();
			
			
			total += nota;
			quantidadeDeNotas++;	
		}
		
		double media = total / quantidadeDeNotas;
		
		System.out.println(media);
		
		sc.close();
	}


	}

