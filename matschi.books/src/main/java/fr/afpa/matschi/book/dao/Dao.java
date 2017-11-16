package fr.afpa.matschi.book.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Dao {
	
	protected String url = "jdbc:mysql://localhost:3306/java_book?useSSL=false&autoReconnect=true";
	protected String login = "root";
	protected String password = "root";
	protected Connection connection = null;
	protected Statement statement = null;
	protected ResultSet result = null;
	
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
	
}

