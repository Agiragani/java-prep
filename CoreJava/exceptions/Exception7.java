package exceptions;

import java.util.Scanner;

public class Exception7 {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter the first number:-");
		
		int firstnum=scan.nextInt();
		
		System.out.println("Enter the second number:-");
		
		int secondnum=scan.nextInt();
		try {
		
		int result=firstnum/secondnum;
		
		System.out.println(result);}
		
		
		catch(ArithmeticException e) {
			
			System.out.println("Don't enter 0 as the denominator");
		}
		
		finally {
			
			System.out.println("thankyou!!!");
		}
		
		System.out.println("Remaining 1000 lines of code");
	}

}
