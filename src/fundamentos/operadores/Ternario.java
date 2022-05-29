package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 6.6;		
		String resultadoRec = media >= 5.0 ? "em recuperaçao" : "reprovado.";
		String resultado = media >= 7.0 ? "aprovado" : resultadoRec;
					    	// expressão  valor verdadeiro : valor falso;
		System.out.println("O aluno esta " + resultado);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto ? "sim" : "nao";
		
		System.out.println("Tem desconto? " + resultadoFinal);
	//	System.out.printf("Tem desconto? %s", resultadoFinal);
		
	}
}
