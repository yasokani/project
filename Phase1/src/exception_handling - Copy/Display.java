package exception_handling;

import java.io.IOException;
import java.util.Scanner;

public class Display {
	int display(int l,int b) throws IOException{
		int area_rect;
		if(l>b)
		{
			throw new IOException("Length is greater than b");
		}
		else{
			area_rect=l*b;
		}
		return area_rect;
	}
	public static void main (String[]args){
		
		Display n=new Display();
		int l,b;
		//@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		
		try {
			n.display(l, b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled");
		}
	
		System.out.println("Hence the result is obtained");
	}
	
}
