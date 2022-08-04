package collection;

import java.util.TreeSet;
/*Create one object of treeset and add the any 6 programming languages in random order
- remove two languages
- add three more languages after removal
- Check if " Java" is part of your treeset or not
- remove all the elements from the treeset and display it*/
public class Sec_co {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tree=new TreeSet();
		tree.add("Java");
		tree.add("Python");
		tree.add("C");
		tree.add("SQL");
		tree.add("C++");
		tree.add("Dot Net");
		System.out.println("The languages present in the treeset are:"+tree);
		tree.remove("Java");
		tree.remove("Dot Net");
		System.out.println("The two languages after removal in the treeset are:"+tree);
		tree.add("PHP");
		tree.add("Devops");
		tree.add("Cloud");
		System.out.println("The three languages after added in the treeset are:"+tree);
		System.out.println("Check whether java is present or not:"+tree.contains("Java"));
		tree.removeAll(tree);
		
		System.out.println("After all languages removed:"+tree);
	}

}
