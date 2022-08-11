package program.jav.inner.classes;

class Outer { 
	
	private int age=90;
	
	void dis(){
		System.out.println("inside dis method"); 
	}
	
    void outerMethod() { 
        System.out.println("inside outerMethod"); 
        
        // Inner class is local to outerMethod() 
        class Inner { 
            void innerMethod() { 
            	dis();
                System.out.println("inside innerMethod: " + age); 
            } 
        } 
        Inner y = new Inner();  //---> object creation of the local innerClass
        y.innerMethod();   // calling inner class method
    } 
    
    public void f() {}
} 

public class Method_Local_Inner { 
    public static void main(String[] args) { 
        Outer x = new Outer(); 
        x.outerMethod();   // calling uter class method
    } 
} 
