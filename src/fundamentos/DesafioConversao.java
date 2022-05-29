package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String salario1, salario2, salario3;
		double media;

		System.out.print("Digite o primeiro salario: ");
		salario1 = sc.nextLine().replace(",",".");

		System.out.print("\nDigite o segundo salario: ");
		salario2 = sc.nextLine().replace(",",".");;

		System.out.println("\nDigite o terceiro salario: ");
		salario3 = sc.nextLine().replace(",",".");;

		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		media = (valor1 + valor2 + valor3) / 3;

		System.out.println("Media salarial: " + media);

		sc.close();
	}
}
