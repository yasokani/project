package com.JUnit;

public class Authentication {

	public boolean validate(String username ,String password) {
	
		if(username.equals("Kanimozhi")&& password.equals("Kanimozhi@1234")) {
			
			System.out.println("Authentication Succesful");
			return true;}
			
		else {
			System.out.println("Authentication failed");
			return false;
			
		}
	}
}
