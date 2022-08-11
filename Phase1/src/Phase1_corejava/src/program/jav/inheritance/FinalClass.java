package program.jav.inheritance;


// final--> final class, or final method, final variable



final class Parent{
	
	String name = "Demo";
	int number = 10;
	
	Parent(){
		System.out.println("inside default constructor");
	}
	
	Parent(int m){
		System.out.println("Inside parameterized constructor");
		this.number = m;
	}
	
	public void show(){
		System.out.println("Value of number is : "+this.number);
	}
}

public class FinalClass{
	

	public static void main(String[] args) {

		//Parent obj = new Parent();
		//obj.show();
		
		Parent objValue = new Parent(100);
		objValue.show();
	}

}
