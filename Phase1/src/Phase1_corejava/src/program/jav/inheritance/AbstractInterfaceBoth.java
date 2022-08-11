package program.jav.inheritance;

interface C {
	void a();

	void b();

	void c();

	void d(); // declaration
}

abstract class B implements C {
	public void c() // defination
	{
		System.out.println("I am c");
	}
}

class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

public class AbstractInterfaceBoth {
	public static void main(String args[]) {

		C obj = new M(); // instantiation
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}