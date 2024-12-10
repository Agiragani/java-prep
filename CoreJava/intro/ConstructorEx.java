package intro;

public class ConstructorEx {

	public ConstructorEx() {
		
		System.out.println("7.Iam from default constructor");

	}

	public ConstructorEx(String name) {
		System.out.println("12.Iam from parametrized constructor");
		
		System.out.println("14.My name is :-"+ name);
	}
	
	public static void main(String[] args) {

		ConstructorEx obj = new ConstructorEx("steve"); //constr calling
	}
}
