package fundamentos.estruturasDeControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5 ; i++) { 
			System.out.println(valor);
			valor += "#";
		}
		
	// Desafio
	// Refa�a o c�digo acima sem utilizar numeros
		
	for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
	}
	
	
	}
	
	
	
}
