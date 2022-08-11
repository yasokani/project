package program.jav.basic;

import java.util.Scanner;

public class StringToInt {
	
	public static void main(String args[]) { 
		
		System.out.println("Please enter any value"); 
		
		Scanner scnr = new Scanner(System.in); 
		String input = scnr.nextLine(); 
		
		int i = Integer.parseInt(input); 
		float y= Float.parseFloat(input);
		
		System.out.println("String converted to int : " + i); 
		System.out.println("String converted to float:  "+y);
		
		System.out.println("Please enter another integer number"); 
		String str = scnr.nextLine(); 	
		int j = Integer.valueOf(str); //un-wrapping
	}
}
