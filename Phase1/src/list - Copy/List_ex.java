package list;

import java.util.ArrayList;

public class List_ex {
/*6 fruits
2 cities
2 hobbies
- print the arraylist
- remove one hobby
- search("cricket")
- remove 1 city & remove 1 fruit
- print 4th & 6th element
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Orange");
		a.add("Grapes");
		a.add("PineApple");
		a.add("JackFruit");
		a.add("Banana");
		a.add("Chennai");
		a.add("Kallakurichi");
		a.add("Cricket");
		a.add("Volleyball");
		
		System.out.println("The elements present in array lists are:"+a);
		a.remove("Volleyball");
		System.out.println("The elements present in array lists are:"+a);
		a.remove("Chennai");
		a.remove("Apple");
		System.out.println("The elements present in array lists are:"+a);
		System.out.println("The elements present in 4rth and 6th array lists are:"+a.get(4)+" "+a.get(6));
		
	}

}
