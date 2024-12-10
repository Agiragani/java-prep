package collection;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("Akhila");

		ll.add(1);

		ll.add(true);

		ll.add(3.14f);

		ll.add('a');

		System.out.println(ll);

		ll.add("SteveJobs");

		System.out.println(ll);

	}
}
