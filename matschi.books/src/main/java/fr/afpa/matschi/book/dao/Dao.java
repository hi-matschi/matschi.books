package fr.afpa.matschi.book.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.afpa.matschi.book.model.Book;

public class Dao implements IDao {
	
	private String url = "jdbc:mysql://localhost:3306/java_book?useSSL=false&autoReconnect=true";
	private String login = "root";
	private String password = "root";
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet result = null;
	
	public Dao() {
		init();
	}
	
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Book> getAll(){
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
					result.getString("img")
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
	
	public Book getById() {
		return null;
	}
}

