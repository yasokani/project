package program.jav.acessmodifier;

class TestA {

	private int y= 10;   //private variable
	
	long k = 1000;       // default variable
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	
	private void methodPrivate(){     // private method
		System.out.println("Class TestA: methodProtected");
		System.out.println("Value of private valye y"+ y);
		System.out.println("Value of long"+ k);
	}
}
