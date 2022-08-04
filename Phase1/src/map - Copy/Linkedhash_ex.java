package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhash_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Use LinkedHashMap
Add 10 fruits into it and do the following operations:
1) print map
2) get all keys and values
3) remove 4th fruit using value and 7th fruit using index
4) check if map contains "banana" and "apple" fruit
5) check if it contains 4th key or not
6) hashcode of map
7) clear map*/
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "Apple");
		lhm.put(2, "Mango");
		lhm.put(3, "Banana");
		lhm.put(4, "Kiwi");
		lhm.put(5, "Pineapple");
		lhm.put(6, "Jackfruit");
		lhm.put(7, "Guava");
		lhm.put(8, "Pomogranate");
		lhm.put(9, "Fig");
		lhm.put(10, "Grapes");
		System.out.println(lhm);
		  for (Integer key : lhm.keySet()) {
	            System.out.println(key + ":\t" + lhm.get(key));
	            
	        }
		    System.out.println("\nRemove entry for key 3 : " + lhm.remove(4));
		    System.out.println("\nRemove entry for key 7 : " + lhm.remove(7));
		    System.out.println("LinkedHashMap contains Banana as value? : " + lhm.containsValue("Banana"));
		    System.out.println("LinkedHashMap contains Apple as value? : " + lhm.containsValue("Apple"));
		    System.out.println("LinkedHashMap contains 4 as key? : " + lhm.containsKey(4));
		    System.out.println("LinkedHashMap hashcode? : " + lhm.hashCode());
		    //System.out.println(  lhm.clear());
		    lhm.clear();
		    System.out.println(lhm);
	}

}
