package program.jav.inheritance;

class Animal2{  
	int g=10;
	void eat()
	{
		System.out.println("eating inside parent...");
	}  
	Animal2(){
		System.out.println("Its a defualt constructor of parent class !!");
	}
}  
	
class Dog2 extends Animal2{  
	int g=9;
	
	void eat()
	{
		System.out.println("eating bread...");
	}  
	
	void bark()
	{   
		System.out.println("barking...");
	}  
	
	void work()
	{  
		super.eat();  // animal2 eat method
		eat();
		bark();  
		System.out.println(super.g);
	}  
	
	Dog2(){

		super();
	}
}  
	
public class SuperKeyword{  
	public static void main(String args[]){ 
		
	Dog2 d=new Dog2();
	d.work();  
	
    }
}  