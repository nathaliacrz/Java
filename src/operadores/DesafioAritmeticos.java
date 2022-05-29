package operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double A, B, C, D, E, F;
		double final1, sup1, sup11, sup12, sup2, sup21, sup22;
		
		A = 7;	B = 6;	C = 5; D = 3; E = 2; F = 1;
		
		sup1 = D + E;
		sup11 = Math.pow(sup1 * B, 2);
		sup12 = sup11 / (D * E);
		
		sup2 = ((F - C) * (E - A)) / E;
		sup21 = Math.pow(sup2, 2);
		sup22 =Math.pow(sup12 - sup21, 3);
		
		final1 = sup22 / Math.pow(10, D); 
		
		System.out.println(final1);	
			
		
		
	}
}
