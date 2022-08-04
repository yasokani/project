package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1st letter capital, 1 special symbol,4 numb/digits and 4 characters*/
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the password:");
		String password=sc.nextLine();
		Pattern sp = Pattern.compile("^[A-Z]{1}+[.@_-]{1}+[0-9]{4}+[a-zA-Z]{4}$");
		Matcher sm = sp.matcher(password);
		if(sm.matches()){
			 System.out.println("Entered password is valid");
			
		}
		else
			 System.out.println("Entered password is not valid");
	}

	}


