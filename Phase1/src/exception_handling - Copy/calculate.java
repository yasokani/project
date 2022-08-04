package exception_handling;

import java.util.Scanner;

public class calculate {
	static int add(int a, int b){
		if(a>b){
			throw new ArithmeticException("a is greater than b");//checked exception
		}
		else
		{
			System.out.println("b is greater than a");
		
		}
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
try{
	add(a,b);
}
catch(Exception ae){
	System.out.println("Arithmetic Exception is present");
}

System.out.println("End");
	}

}
