package fr.afpa.matschi.book.model;

/*
	INSERT INTO user (login, password, nb_subscriber, id_grade) VALUES
	('root', 'root', '1234567890', 1),
	('sub', 'sub', '0987654321', 2),
	('sub2', 'sub2', '0987651234', 2);
*/
public class User extends Model {
	private int id;
	private String login;
	private String password;
	private int nbSubscriber;
	private int idGrade;
	
	public User() {
		
	}
	
	public User(int id, String login, String password, int nbSubscriber, int idGrade) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.nbSubscriber = nbSubscriber;
		this.idGrade = idGrade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getNbSubscriber() {
		return nbSubscriber;
	}
	
	public void setNbSubscriber(int nbSubscriber) {
		this.nbSubscriber = nbSubscriber;
	}
	
	public int getIdGrade() {
		return idGrade;
	}
	
	public void setIdGrade(int idGrade) {
		this.idGrade = idGrade;
	}
	
}

