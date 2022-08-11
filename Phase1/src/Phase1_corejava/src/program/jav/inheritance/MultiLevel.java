package program.jav.inheritance;

class Animal
{  
	public void eat()
	{
		  System.out.println("eatinAny doubtg...");
    }  
}  


class Dog extends Animal
{  
	//bark(), eat()
	void bark()
	{
		System.out.println("barking...");
	}  
}  
	

class BabyDog extends Dog
{  
	//bark(), weep(), eat()
	void weep()
	{
		System.out.println("weeping...");
	}  
}  


public class MultiLevel{  
	public static void main(String args[]){  
	
	BabyDog d=new BabyDog();  
	
	d.weep();  
	d.bark();  
	d.eat();  
		
    }
}