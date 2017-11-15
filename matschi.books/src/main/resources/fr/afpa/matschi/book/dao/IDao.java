package fr.afpa.matschi.book.dao;

import java.util.ArrayList;

import fr.afpa.matschi.book.model.Book;

public interface IDao {

	public ArrayList<Book> getAll();
}