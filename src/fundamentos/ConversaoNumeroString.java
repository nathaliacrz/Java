package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		Integer.toString(num1);
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		Long.toString(num2);
		
		System.out.println(("" + num2).length());
		
	}
}
