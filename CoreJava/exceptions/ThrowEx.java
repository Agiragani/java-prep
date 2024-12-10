package exceptions;

public class ThrowEx {

	public static void valid(int age) {
		
		if(age>18) {
			System.out.println("you are eligible to vote....");
		}
		else {
			throw new ArithmeticException("you are not elgible to vote");
		}
	}
	
	public static void main(String[] args) {
		
		valid(2);
	}
}
