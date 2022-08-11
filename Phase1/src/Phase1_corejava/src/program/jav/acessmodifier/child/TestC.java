package program.jav.acessmodifier.child;

import program.jav.acessmodifier.TestB;

public class TestC {
	
	void defaultMethod(){
		System.out.println("inside the default method of class TestC");
	}

	public static void main(String[] args) {
		new TestB().methodPublic();
	}

}
