package com.example.exception;

public class PeopleNotFoundException extends RuntimeException{
	
	public PeopleNotFoundException(int id) {
		super("Citizen with id " + id + " is not Found.Kindly re-check your Id!!");
	}

}

