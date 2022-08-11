package program.jav.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapExample {
    public static void main(String a[]){
		
    	HashMap hm = new HashMap();
		
        hm.put("1","1");
        hm.put("2","SECOND");
        hm.put("3","THIRD");
		hm.put("4",null);
		hm.put(1, 23);
		hm.put(null,"FIFTH");
		
        System.out.println("hashmap is "+ hm);
        System.out.println("Value of 3 key: "+ hm.get("3"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        
        hm.remove("2");
        System.out.println("After removal process, the hashmap is "+hm);
        System.out.println("Size of the HashMap: "+hm.size());
        
        System.out.println(hm.containsValue("FIFTH"));
        
    }
}