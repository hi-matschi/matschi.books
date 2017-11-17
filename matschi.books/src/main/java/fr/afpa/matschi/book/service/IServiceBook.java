package fr.afpa.matschi.book.service;

import java.util.ArrayList;

import fr.afpa.matschi.book.model.Book;

public interface IServiceBook {
	public ArrayList<Book> findAll();
	public Book findById(int id);
	public void create(Book book);
	public void update(Book book);
	public void removeById(int id);
}
