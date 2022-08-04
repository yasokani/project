package map;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm = new HashMap();
		
        hm.put(1,"1");
        hm.put(2,"SECOND");
        hm.put(3,"THIRD");
		hm.put(4,null);
		hm.put("1", 4);
		hm.put(5,"FIFTH");
		
        System.out.println("hashmap is "+ hm);
        System.out.println("Value of 3 key: "+ hm.get("3"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        System.out.println( hm.equals(4));
        hm.remove("2");
        System.out.println("After removal process, the hashmap is "+hm);
        System.out.println("Size of the HashMap: "+hm.size());
        
        System.out.println(hm.containsValue("FIFTH"));
	}

}
