package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		// Objetos são as possibilidades que temos de manipular tipo não primitivos
		String s = new String("texto");
		s.toUpperCase();

		// Wrappers são os objetos dos tipos primitivos;
		int a = 123;
		System.out.println(a);
	}
}
