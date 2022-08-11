package program.jav.exceptn;

public class CustomException{  
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	        validate(17);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

//This class is created for your own defined exception message
class InvalidAgeException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	InvalidAgeException(String s){  //2
	  super(s);  
	 }  
}  
