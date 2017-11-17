package fr.afpa.matschi.book.service;

import java.util.ArrayList;

import fr.afpa.matschi.book.dao.IDaoBook;
import fr.afpa.matschi.book.model.Book;

public class ServiceBook implements IServiceBook {
	
	private IDaoBook dao;
	
	public ServiceBook(IDaoBook dao) {
		this.dao = dao;
	}
	
	public ArrayList<Book> findAll() {
		return dao.findAll();
	}
	
	public Book findById(int id) {
		return dao.findById(id);
	}
	
	public void create(Book book) {
		dao.create(book);
	}
	
	public void update(Book book) {
		dao.update(book);
	}
	
	public void removeById(int id) {
		dao.removeById(id);
	}
	
}

