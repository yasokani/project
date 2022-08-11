package program.jav.inheritance;

import java.io.*;
import java.util.*;

class Book {

	public String title;
	public String author;

	Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
}

//Libary class contains list of books.
class Library {

	// reference to refer to list of books.
	private final List<Book> books;

	Library(List<Book> books) 
	{ 
		this.books = books; 
	}

	// Getting total number of books
	public List<Book> getTotalBooksInLibrary()
	{
		return books;
	}
}

public class CompositionExample {
	public static void main(String[] args)
	{
		Book b1  = new Book("EffectiveJ Java", "Joshua Bloch");
		Book b2  = new Book("Thinking in Java", "Bruce Eckel");
		Book b3  = new Book("Java: The Complete Reference","Herbert Schildt");
		Book b4  = new Book("Head First" ,"Oreilly");
		Book b5  = new Book("Tninkingin C++", "Yashwant kanetkar");

		// Creating the list which contains the no. of books.
		List<Book> book = new ArrayList<Book>();
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		book.add(b5);

		Library library = new Library(book);

		List<Book> books = library.getTotalBooksInLibrary();
		for (Book bk : books) {
			System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);
		}
	}
}

