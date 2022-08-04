package exception_handling;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] a=new int[4];
int a=9;
int i;
try{
	i=a+7;
	System.out.println("In try block");
	
}
catch(NullPointerException ae){
	ae.getMessage();
	System.out.println("In catch block");
	
}
catch(Exception ae1){
	System.out.println("you are in parent of Exceptionhandling!!!");
}

finally{
	System.out.println("In finally block");
	i=91;
	System.out.println(i);

}
System.out.println("Hii");


	}

}
