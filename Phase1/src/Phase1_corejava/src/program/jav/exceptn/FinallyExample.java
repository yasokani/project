package program.jav.exceptn;

public class FinallyExample{  
	public static void main(String args[]){  

		try{  
			int data=25/0;  
			System.out.println(data);  
		}  

		catch(NullPointerException e){
			System.out.println(e);
		}  

	  finally
	  {
		  System.out.println("finally block is always executed");
	  }  

	  System.out.println("rest of the code...");  
	  }  

	  // now change from NullPointerException to ArithmeticException and run the program
}  
