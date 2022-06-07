package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero;
		int sorteado = 48;
		System.out.println("Tente acertar um numero de 0 a 100: ");
		
		for(int i = 10; i != 0; i--) {
			System.out.printf("Voce tem %d tentativas. Insira um numero: ", i);
			numero = sc.nextInt();
				if(numero == sorteado) {
					System.out.println("CARAI BRABAO MEU REI ACERTOU BOAAA");
					break;
				} else if(i == 1) {
					System.out.println("PERDEU MEU MANO VAI DE NOVO.");
				} else if(numero > sorteado) {
					System.out.println("Numero alto demais slc voa baixo urubu. ");
				} else if(numero < sorteado) {
					System.out.println("Qual foi cria ta com medo?? voa mlk ta baixin.");
				}
				}
		
		

			sc.close();
		}
}
