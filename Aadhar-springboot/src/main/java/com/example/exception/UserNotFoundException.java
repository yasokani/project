package com.example.exception;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(int id) {
		super("User with id " + id + " is not found. Kindly re-check your Id!!");
	}

}
