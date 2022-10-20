package com.example.exception;

public class AdminNotFoundException extends RuntimeException{

	public AdminNotFoundException(int id) {
		super("Admin with id " + id + " is not Found.Kindly re-check your Id!!!");
	}
}
