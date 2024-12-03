package oops;


class GrandParent{
	
	public void hi() {
		System.out.println("Iam from the Grand Parent Class");
	}
	
	
}

class Parent extends GrandParent{
	
	public void display() {   //void -  dynamic ---------->obj
		System.out.println("Iam from the parent class");
	}
	
	public int add(int a,int b) { //int - dynamic --------->obj
		return (a+b);
	}
}

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.display();
		
		System.out.println(obj.add(4,7));
		
		obj.hi();
		
	}

}
