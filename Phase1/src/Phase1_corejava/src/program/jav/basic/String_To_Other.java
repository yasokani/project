package program.jav.basic;

import java.util.Scanner;

public class String_To_Other {
	public static void main(String args[]){
		
		System.out.println("Please enter the input string:");
		Scanner sc = new Scanner(System.in);  
		String str= sc.nextLine();     //reads string  
		System.out.println("You have entered: "+ str);       
		
		int inum = 100;
		int inum2 = Integer.parseInt(str);  //conversion of string argument to integer primitive type
			
		int sum = inum + inum2;
		System.out.println("Result is: "+sum);
		
		float inum3 = Float.parseFloat(str);  //conversion of string argument to float primitive type
		
		float f = inum + inum3;      // adding the float with integer and integer gets auto typecast
		System.out.println("New Result is: "+ f);
	   }
}
