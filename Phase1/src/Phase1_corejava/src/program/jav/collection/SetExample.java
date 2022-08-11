package program.jav.collection;

import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();  // object creation of LinkedHashSet generic
		lhs.add(3);
		lhs.add("Hello");
		lhs.add(4.5f);
		lhs.add(true);
		lhs.add('F');
		
		System.out.println("the linkedhasset is:" + lhs.getClass());
		
		LinkedHashSet<Integer> rhs = new LinkedHashSet<Integer>(); 
		rhs.add(3);
		rhs.add(89);
	}

}
