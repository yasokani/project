package program.jav.collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
    	
        TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
        marks.put("Student1", 120);
        marks.put("Student5", 99);
        marks.put("Student6", 130);
        marks.put("Student2", 190);
        marks.put("Student3", 89);
        marks.put("Student4", 142);
        
        for(String key: marks.keySet()){
			System.out.println(key  +" : "+ marks.get(key));
        }
    }
}
