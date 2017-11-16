package fr.afpa.matschi.book.service;

import java.util.ArrayList;

import fr.afpa.matschi.book.dao.IDaoAuthor;
import fr.afpa.matschi.book.model.Author;

public class ServiceAuthor implements IServiceAuthor {
	
	private IDaoAuthor dao;
	
	public ServiceAuthor(IDaoAuthor dao) {
		this.dao = dao;
	}
	
	public ArrayList<Author> findAll() {
		return dao.findAll();
	}
	
	public ArrayList<Author> findById(int id) {
		return dao.findById(id);
	}
	
	public void create(Author author) {
		dao.create(author);
	}
	
	public void update(Author author) {
		dao.update(author);
	}
	
	public void removeById(int id) {
		dao.removeById(id);
	}
	
}

