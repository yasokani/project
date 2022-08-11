package program.jav.inheritance;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run1(); // abstract method()

	void changeGear() // non-abstract method()
	{
		System.out.println("gear changed");
	}
}

abstract class Honda extends Bike {
	
	Honda(){
		System.out.println("honda is created");
	}
	// changeGear(), run1()	
	abstract void run();
	
	abstract void run1();
}
	

class Hello extends Honda {
	void run() {
		System.out.println("running safely..");
	}

	@Override
	void run1() {
		
		System.out.println("inside the run1 method");
	}	
}


public class AbtsractExample {
	public static void main(String args[]) {

		// Bike obj = new Hello(); //?
		Honda k = new Hello(); // reference of parent(Honda abstract class) and
								// object of Child(Hello) class
		k.run();
		k.run1();
		k.changeGear();
		
	}
}
