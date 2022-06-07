package fundamentos.estruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = sc.nextInt();
		
		switch(nota) {
		case 10:case 9:case 8:
			conceito = "A";
			break;
		case 7:case 6:
			conceito = "B";
			break;
		case 5:
		case 4:
			conceito = "C";
			break;
		case 3:
		case 2:
			conceito = "D";
			break;
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = "Não encontrado.";
//opcional	break;
		}
		
		System.out.println("O conceito é " + conceito);
		sc.close();	
	}
}
