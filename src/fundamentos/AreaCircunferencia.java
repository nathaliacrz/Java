package fundamentos;

public class AreaCircunferencia {

		public static void main(String[] args) {
			double raio = 3.4;
			final double PI = 3.14159;	// "final" define que a variavel nao vai mudar
			
			/* 
			 * "final" define que a variavel se torna uma constante
			 *  não sendo possível mudar ao longo do codigo;
			 */
			
			double area = PI * raio * raio;
					
			System.out.println(area);
			/* 
			 * Já as variaveis podem mudar seus valores ao longo
			 * do codigo;
			 */
			
			raio = 10;
			area = PI * raio * raio;
			System.out.println("Area = " + area + "m2.");
		}
}
