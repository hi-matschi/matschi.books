package fr.afpa.matschi.book.dao;

import java.util.ArrayList;

import fr.afpa.matschi.book.model.Book;

public interface IDaoBook {

	public ArrayList<Book> findAll();
	public ArrayList<Book> findById(int id);
	public void create(Book book);
	public void update(Book book);
	public void removeById(int id);
}