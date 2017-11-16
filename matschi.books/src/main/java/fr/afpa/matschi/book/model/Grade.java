package fr.afpa.matschi.book.model;

/*
	INSERT INTO grade (name, is_admin) VALUES
	('admin', 1),
	('subscriber', 0);
*/
public class Grade extends Model {
	private int id;
	private String name;
	private int isAdmin;
	
	public Grade() {
		
	}
	
	public Grade(int id, String name, int isAdmin) {
		this.id = id;
		this.name = name;
		this.isAdmin = isAdmin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}

