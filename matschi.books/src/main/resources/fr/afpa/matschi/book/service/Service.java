package fr.afpa.matschi.book.service;

import java.util.ArrayList;

import fr.afpa.matschi.book.dao.IDao;
import fr.afpa.matschi.book.model.Book;

public class Service implements IService {
	
	private IDao dao;
	
	public Service(IDao dao) {
		this.dao = dao;
	}
	
	public ArrayList<Book> getAll() {
		return dao.getAll();
	}
}

