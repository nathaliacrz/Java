package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Insira uma nota (ou -1 para sair): ");
			nota = sc.nextDouble();

			if(nota >= 0 && nota <= 10) {
			total += nota;
			quantidadeDeNotas++;	
		//	} else if (nota == -1){					outra opçao de quebrar o bug;
		//		break;
			} else if(nota != -1){
				System.out.println("Digite um numero valido.");
			}
		}
		
		double media = total / quantidadeDeNotas;
		
		System.out.println(media);
		
		sc.close();
	}


	}

