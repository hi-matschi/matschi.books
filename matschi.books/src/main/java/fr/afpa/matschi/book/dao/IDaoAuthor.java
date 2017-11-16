package fr.afpa.matschi.book.dao;

import java.util.ArrayList;

import fr.afpa.matschi.book.model.Author;

public interface IDaoAuthor {

	public ArrayList<Author> findAll();
	public ArrayList<Author> findById(int id);
	public void create(Author author);
	public void update(Author author);
	public void removeById(int id);
}