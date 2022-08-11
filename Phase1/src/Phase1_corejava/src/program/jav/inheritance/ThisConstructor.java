package program.jav.inheritance;

class A{ 
	int value = 20;
	
	
	A()
	{
		System.out.println("hello a"); 
	}  
	
	A(int x)
	{  
		this();  // this is used to call the default constructor of the same class
		System.out.println(x);
		System.out.println(this.value);
	}
	
	
	
}  

public class ThisConstructor{  
	public static void main(String args[])
	{  
	    A a=new A(10);
	   
	    //System.out.println(" value is : "+ obj.value);
    }
}  
