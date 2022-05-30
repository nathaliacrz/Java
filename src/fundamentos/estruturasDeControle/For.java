package fundamentos.estruturasDeControle;

public class For {

	public static void main(String[] args) {
		
		int contador = 0;
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}
		
		for(int contador1 = 0; contador <= 20; contador += 2) {
			System.out.printf("i = %d\n", contador);
		}
		
		// int x= 2;
		// for(; x < 10; x++) {
		//	System.out.println("x = " + x);
		// }
		
	}
}
