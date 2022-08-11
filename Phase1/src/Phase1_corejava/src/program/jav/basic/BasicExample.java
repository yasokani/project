package program.jav.basic;

public class BasicExample {
	
    int result = 100;
	String name = "Demo";
	
	BasicExample(){
		System.out.println(" inside the constructor");
	}  // default constructor
	
	BasicExample(int result){ //var =1000
		System.out.println("inside the parameterized constructor..");
		this.result = result;
		System.out.println(" Value of result is:  "+this.result);
	}
	
	
	// int, String, float, double, long, booleProjectan
	
	

	public int area() {
		System.out.println(" Printing the area");
		return 0;
	}

	public static void main(String[] args) {

		BasicExample obj = new BasicExample();
		
		BasicExample objNew = new BasicExample(1000);
		
		System.out.println(" inside main method");
		obj.area();

	}

}
