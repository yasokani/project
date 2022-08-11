package program.jav.collection;

import java.util.*;

class ArrayListExample{
	public static void main(String[] args){
		
		ArrayList<String> al=new ArrayList<String>();  
		
		System.out.println("Initial size of Arraylist is "+ al.size());  // SIZE OF ARRAYLIST
		
		al.add("Hai");
		al.add("Hello");
		System.out.println("Arraylist is "+al);
		System.out.println("New size of Arraylist is "+al.size()); // UPDATED SIZE OF ARRAYLIST
		
		
		
		al.add(1,"How are you");
		System.out.println("New Arraylist is "+al);
		System.out.println("New size of Arraylist is "+al.size());
		
		System.out.println("element at position 1 is  : "+ al.get(1)); // GET ELEMENT AT POSITION
	
		Collections.reverse(al);   //Reversing order of arraylist
		System.out.println("Reversed arraylist is : "+ al);    // Printing arraylist after reversing
	
		al.set(2, "Bye"); //Setting Bye - Bye at position 6 (or) Replacing Hello by Bye at position 2
        System.out.println("ArrayList after setting/replacing element at position 2 is : " + al);
        
        al.remove(2);
        System.out.println("New Arraylist is "+al);
        
        al.remove("Hello");
        System.out.println("New Arraylist is "+al);
        
        System.out.println(al.contains("Hello"));
       
        
        
        
	}
}
