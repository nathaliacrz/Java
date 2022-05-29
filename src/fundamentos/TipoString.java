package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));  // .charAt(); pega letras específicas dentro de uma String
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.length());
		System.out.println(s.equals("BOA TARDE"));
		
		String nome = "Pedro";             // %s
		String sobrenome = "Santos";
		int idade = 33;					   // %d	
		double salario = 12345.987;		   // %2f	
		
		System.out.println("Nome: " + nome +  "\nSobrenome: " + sobrenome + "\nIdade: "
										+ idade + "\nSalario: " + salario +"\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f. ", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f. ", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 10));
		
		
	}
}
