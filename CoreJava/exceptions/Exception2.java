package exceptions;
class Exception2 {
	
	public static void main(String[] args) {
		try {
			
			int a1 =10;
			int c=a1/4;
		}catch (ArithmeticException ae) {
			System.out.println("11.dont enter zero as denominater");
		}
		
		try
		{
		int a[]=new int[5];//0,1,2,3,4    int a=123;    int a[]={1,2,3,4,5,6,5,7,.....};
		a[2]=1;																	
		a[6]=6;
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("20.array maximum size is 4");
		}
		
		System.out.println("23.remaining lines of code");
	}
}