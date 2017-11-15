package fr.afpa.matschi.book.dao;

import java.util.ArrayList;

import fr.afpa.matschi.model.Book;

public class Dao implements IDao {
	
	ArrayList<Book> books;
	
	public Dao() {
		init();
	}
	
	public void init() {
		books = new ArrayList<Book>();
		
		// books.add(new Book("Thriller", "M. Jackson"));
		// books.add(new Book("Simple Basic", "OrelSan"));
		// books.add(new Book("Fly high", "Boom Boom Satellites"));
	}
	
	public ArrayList<Book> getAll(){
		return books;
	}
}

