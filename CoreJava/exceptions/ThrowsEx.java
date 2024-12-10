package exceptions;

public class ThrowsEx {
	
	public static void valid(int age) throws ArithmeticException{
		
		if(age >18) {
			
			System.out.println(18/0);
		}
		
	}
	
	public static void main(String[] args) {
		
		valid(90);
	}

}
