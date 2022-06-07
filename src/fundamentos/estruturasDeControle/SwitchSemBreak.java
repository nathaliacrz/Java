package fundamentos.estruturasDeControle;
/*
 * Este laço sem break é uma excessão!!!!!
 */
public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// if(bool) ...
		// while(bool) ...
		// for(;bool;) ...
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim!");
		/*
		 * Quando nao tem break se entrar em um mostra 
		 * todos os que estão abaixo;
		 */
		
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
		
		
	}
}
