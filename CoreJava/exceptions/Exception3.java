package exceptions;

public class Exception3 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];// 0,1,2,3,4

			a[2] = 30 / 1;// ---->6

			String s = "hello";

			int x = Integer.parseInt(s,29);
			System.out.println(x);
			System.out.println(s.length());
			System.out.println("15.no error  " + a[3]);
		}catch (ArithmeticException e) {
			System.out.println("17.dont enter zero denominator");
		} catch (ArrayIndexOutOfBoundsException Ae) {
			System.out.println("19.index maximum size crossed");
		} catch (NumberFormatException e) {
			System.out.println("21.unable to convert string to number");
		}  catch (Exception ea) {
		System.out.println("23.not handled" + ea);
		
		}
		
		finally {// it will print in any case
			System.out.println("25.executes every time for closing connections");
		}
		System.out.println("27.remaining code  executed...");
		//
	}
}