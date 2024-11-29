package intro;

public class VariablesEx {
	
	static int staticCounter;
	
	int instanceCounter;
	
	public void counter() {
		staticCounter++;
		
		instanceCounter = instanceCounter+1;
	}
	public void display() {
		System.out.println("Static Counter :- "+staticCounter);
		System.out.println("Instance Counter :- "+instanceCounter);
	}
	
	
	public static void main(String[] args) {
		
		VariablesEx obj1 = new VariablesEx(); 
		
		VariablesEx obj2 = new VariablesEx(); 
		
		VariablesEx obj3 = new VariablesEx(); 
		
		
		obj1.counter();//1,1
		
		obj2.counter();//2,1
		
		obj3.counter();
		
		obj3.counter();
		
		obj3.display();
	}

}
