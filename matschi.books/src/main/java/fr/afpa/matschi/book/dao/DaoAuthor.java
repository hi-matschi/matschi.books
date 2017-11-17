package fr.afpa.matschi.book.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import fr.afpa.matschi.book.model.Author;

public class DaoAuthor extends Dao implements IDaoAuthor {
	
	public ArrayList<Author> findAll(){
		ArrayList<Author> authors = new ArrayList<Author>();
		
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			String query = "SELECT * FROM author;";
			result = statement.executeQuery(query);
			
			while(result.next()) {
				Author author = new Author(
					result.getInt("id_author"),
					result.getString("firstname"),
					result.getString("lastname")
				);
				authors.add(author);
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
		
		return authors;
	}
	
	public Author findById(int id) {
		Author author = null;
		
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			String query = "SELECT * FROM author WHERE id_author = " + id + ";";
			result = statement.executeQuery(query);
			
			while(result.next()) {
				author = new Author(
					result.getInt("id_author"),
					result.getString("firstname"),
					result.getString("lastname")
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
		
		return author;
	}
	
	public void create(Author author) {
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			
			String queryValues = StringUtils.join(new String[] {
					'"' + author.getFirstname() + '"' , 
					'"' + author.getLastname() + '"'
			}, ",");
			
			String query = "INSERT INTO author (firstname, lastname) "
							+ "VALUES (" + queryValues + ");";
			
			// System.out.println(query);
			
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
	
	public void update(Author author) {
		try {
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			
			String query = "UPDATE author "
						+ "SET firstname = '" + author.getFirstname() + "', "
						+ "lastname = '" + author.getLastname() +"', "
						+ "WHERE id_author = " + author.getId();
			
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
			
			String query = "REMOVE FROM author WHERE id_author = " + id;
			
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
