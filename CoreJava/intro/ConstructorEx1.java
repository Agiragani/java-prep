package intro;

public class ConstructorEx1 {

	public ConstructorEx1() {
		this("apple");  //constructor calling
	}

	public ConstructorEx1(String name) {
		this("banana","cat");
		System.out.println(name);
	}

	public ConstructorEx1(String name,String name1) {
		this("den","egg","fish");
		System.out.println(name +"\t"+name1);
	}

	public ConstructorEx1(String name,String name1,String name2) {
		this("girl","hen","ice","jam");
		System.out.println(name +"\t"+ name1+"\t"+name2+"\t");
	}

	public ConstructorEx1(String name,String name1,String name2,String name3) {
		
		System.out.println(name+"\t"+name1+"\t"+name2+"\t"+name3);
	}

	
	public static void main(String[] args) {
		ConstructorEx1 obj = new ConstructorEx1();  //default const calling
	}
}
