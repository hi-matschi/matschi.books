package fr.afpa.matschi.book.model;

/*
	INSERT INTO author (firstname, lastname) VALUES
	('Steve','McConnell'),
	('J.K.', 'Rowling'),
	('Mark', 'Yerger'),
	('Thierry', 'Courtin');
*/
public class Author extends Model {
	private int id;
	private String firstname;
	private String lastname;
	
	public Author() {
		
	}
	
	public Author(int id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Author(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}

