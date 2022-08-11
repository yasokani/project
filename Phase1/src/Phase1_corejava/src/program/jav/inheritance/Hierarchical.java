package program.jav.inheritance;

class Animal1{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  

class Dog1 extends Animal{  
	
	//bark(), eat()
	void bark()
	{
		System.out.println("barking...");
	}  
}  

class Cat extends Animal1{  
	
	//meow(), eat()
	void meow()
	{
		System.out.println("meowing...");
	}  
}  
	
	
public class Hierarchical{  
	public static void main(String args[]){  
	
	Cat c=new Cat();  
	c.meow();  
	c.eat(); 
	//c.bark();//C.T.Error  
}}  