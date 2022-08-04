package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_phonenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*validate the phone number with country code +91 pattern mathing*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the phone number:");
		String phoneNumber=sc.nextLine();
		Pattern sp = Pattern.compile("^\\d{10}$");
		Matcher sm = sp.matcher(phoneNumber);
		if(sm.matches()){
			 System.out.println("Entered phone number is valid");
			
		}
		else
			 System.out.println("Entered phone number is not valid");
	}

}
