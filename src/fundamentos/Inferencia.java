package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
	//	double ab; // variável declarada
		a = 12; // variável inicializada
		System.out.println(a); // variável usada
		
		/* 
		 * eclipse identifica variavel VAR pelo valou, ou seja
		 * valor da variavel VAR tem que ser declarada na hora
		 */
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto.";
		System.out.println(c);
		
		c = "Outro texto.";
		System.out.println(c);		
		
		
	}
}
