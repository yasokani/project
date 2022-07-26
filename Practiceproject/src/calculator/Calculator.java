package calculator;
import java.util.Scanner;
public class Calculator {

	
	
	public static void main(String[] args) {
		double n1,n2;
		double s=0;
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		System.out.println("Enter the operator:");
		   char op = sc.next().charAt(0);
		   switch(op){
		   case '+':
			   s=n1+ n2;
			   break;
		   case '-':
			   s=n1- n2;
			   break;
			   case '/':
				   s=n1/n2;
				   break;
				   case '*':
					   s=n1* n2;
					   break;
				   default:
					   System.out.println("Entered operator is incorrect"); 
					   break;
		   }
		   
		System.out.println(n1+ " "+op+ " "+n2+"->"+s);   
	}

}
