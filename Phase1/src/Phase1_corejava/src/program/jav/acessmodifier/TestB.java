package program.jav.acessmodifier;

public class TestB {

	public static void main(String args[]) {
		new TestA().methodPublic();
		new TestA().methodProtected();
		new TestA().methodDefault(); 
		System.out.println("Value of long"+ new TestA().k);		
	}

	public void methodPublic() {
		System.out.println("Class TestB: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class TestB: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class TestB: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class TestB: methodPrivate");
	}

}

