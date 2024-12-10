package collection;

import java.util.ArrayList;

//(1)It is not fixed in size it is growable
//
//(2)It will both homogeneous and heterogeneous elements
//
//(3)Lots of utility methods.

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("Akhila");
		
		al.add(1);
		
		al.add(true);
		
		al.add(3.14f);
		
		al.add('a');
		
		System.out.println(al);
		
		al.add("SteveJobs");
		
		System.out.println(al);
		
	}

}
