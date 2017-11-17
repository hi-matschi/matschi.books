package fr.afpa.matschi.book.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import fr.afpa.matschi.book.model.Book;

public class DaoBook extends Dao implements IDaoBook {
	
	public ArrayList<Book> findAll(){
		ArrayList<Book> books = new ArrayList<Book>();
		
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			String query = "SELECT * FROM book;";
			result = statement.executeQuery(query);
			
			while(result.next()) {
				Book book = new Book(
					result.getInt("id_book"),
					result.getString("isbn"),
					result.getString("title"),
					result.getString("subtitle"),
					result.getString("img"),
					result.getInt("id_author")
				);
				books.add(book);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
				statement.close();
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return books;
	}
	
	public Book findById(int id) {
		Book book = null;
		
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			String query = "SELECT * FROM book WHERE id_book = " + id + ";";
			result = statement.executeQuery(query);
			
			
			
			while(result.next()) {
				book = new Book(
					result.getInt("id_book"),
					result.getString("isbn"),
					result.getString("title"),
					result.getString("subtitle"),
					result.getString("img"),
					result.getInt("id_author")
				);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
				statement.close();
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return book;
	}
	
	public void create(Book book) {
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			
			String queryValues = StringUtils.join(new String[] {
					'"' + book.getIsbn() + '"' , 
					'"' + book.getTitle() + '"', 
					'"' + book.getSubtitle() + '"',
					'"' + book.getImg() + '"',
					String.valueOf(book.getIdAuthor())
			}, ",");
			
			String query = "INSERT INTO book (isbn, title, subtitle, img, id_author) "
							+ "VALUES (" + queryValues + ");";
			
			statement.executeUpdate(query);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Book book) {
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			
			String query = "UPDATE book "
						+ "SET isbn = '" + book.getIsbn() + "', "
						+ "title = '" + book.getTitle() +"', "
						+ "subtitle = '" + book.getSubtitle() +"', "
						+ "img = '" + book.getImg() + "', "
						+ "id_author = " + book.getIdAuthor() + " "
						+ "WHERE id_book = " + book.getId() +";";
			System.out.println(query);
			
			statement.executeUpdate(query);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void removeById(int id) {
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			
			String query = "DELETE FROM book WHERE id_book = " + id + ";";
			System.out.println(query);
			statement.execute(query);
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
