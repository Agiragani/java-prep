package exceptions;

class Exception4 {
	public static void main(String args[]) {
		try {
			int c = 12 / 1;
			
			try {
				System.out.println("9.Division");
				int b = 30 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				int a[] = new int[3];
				a[4] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("19.array index problem");
			} 
			finally {
				System.out.println("21.always will execute finally block 	");
			}
			System.out.println("23.remaing try  statements");
		} catch(Exception e) {
			System.out.println("25.handeled");
		}
		System.out.println("27.normal execution..");
	}
}