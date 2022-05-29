package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		 
		double a = 1; 
		System.out.println(a); // conversão implicita, não tem perdas
		 
		float b = (float) 1.12345888888; // conversão explicita, voce está ciente que vai gerar perda de informação
		System.out.println(b);
		
		int c = 129;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);
		
	}
}
