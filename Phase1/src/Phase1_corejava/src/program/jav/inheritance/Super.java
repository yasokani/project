package program.jav.inheritance;

import java.util.Scanner;

class Person {
	String name = "Viren";
	float salary =9000;

	Person(String example) { // constuctor of person
		this.name = example;  // overriding or replacing the class variable
	}

	Person() {
		System.out.println("i am inside the Person default consturctor");
	}

	public void show() {
		System.out.println(" Inside Person class show()");
	}

}

class Emp extends Person {
	
	float salary;
	int num = 10;
	String name = "Viren New";

	Emp(String name, float sal) {
		super(name); //reusing parent constructor // calling the parent class
		this.salary = sal;
		System.out.println(name + " " + salary);
	}

	Emp() {
		super(); // calling the parent class person default constructor
		System.out.println("num is " + this.num);
	}

	void display() {
		System.out.println(name + " " + salary);
	}
	
	public void show() {
		super.show();
		System.out.println(" Inside child class show()");
		System.out.println("Name of child class: "+ name);
		System.out.println("Parent class name: "+ super.name);
	}
}

class Super {
	public static void main(String[] args) {
		Emp e = new Emp();
		
		Emp e1 = new Emp("Vikram", 45000f);
		
		Emp obj = new Emp();
		obj.show();
		// e1.display();
		// e1.show();
	}
}
