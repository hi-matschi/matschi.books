package fr.afpa.matschi.book.service;

import java.util.ArrayList;

import fr.afpa.matschi.book.model.Author;

public interface IServiceAuthor {
	public ArrayList<Author> findAll();
	public ArrayList<Author> findById(int id);
	public void create(Author Author);
	public void update(Author Author);
	public void removeById(int id);
}
