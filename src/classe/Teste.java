package classe;

public class Teste {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;
		int c = 1;

		if (a < b) {
			if (b < c) {
				System.out.println(a + " " + b + " " + c);
			} else if (c < b) {
				System.out.println(a + " " + c + " " + b);
			}
		} else if (b < c) {
			if (a < c) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
		} else if (c < a) {
			if (a < b) {
				System.out.println(c + " " + a + " " + b);
			} else {
				System.out.println(c + " " + b + " " + a);
			}
		}

	}
}
