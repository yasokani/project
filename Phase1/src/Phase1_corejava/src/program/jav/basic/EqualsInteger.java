package program.jav.basic;

public class EqualsInteger {  
    
	public static void main(String[] args) {          
        Integer obj1 = new Integer(43);  
        Integer obj2 = new Integer(78);  
        
        System.out.print("obj1 and obj2 are equal. True or False? = ");  
        System.out.println(obj1.equals(obj2));                    
        
        obj1 = new Integer(55);  
        obj2 = new Integer(55);  
        
        System.out.print("obj1 and obj2 are equal. True or false? = ");  
        System.out.println(obj1.equals(obj2));                 
    }  
}  
