package thread_example;

import java.util.Scanner;
class All{
	
 int a,b,n;
 

synchronized void fact(int n){
	int i,fact=1;  
	     
	  for(i=1;i<=n;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+n+" is: "+fact);    
}
synchronized void add(int a,int b){
	System.out.println("Addition of two number is:"+(a+b));
}
}
public class Sync_block {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sync_block f=new Sync_block();
		All all=new All();
	Scanner sc=new Scanner(System.in);
	int n,a,b;
	System.out.println("Enter n:");
	n=sc.nextInt();
	System.out.println("Enter a and b:");
	a=sc.nextInt();
	b=sc.nextInt();
	new Thread(){                 // anonymous class
		  public void run()
		  {
			all.fact(n);
		  }  
		}.start();  
	
		new Thread(){                 // anonymous class
			  public void run()
			  {
				all.add(a,b);
			  }  
			}.start(); 
	
	}

}
