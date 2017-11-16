package fr.afpa.matschi.book.model;

/*
	INSERT INTO copy (is_available, id_book, id_user) VALUES
	(0, 1, 2),
	(0, 1, 3),
	(1, 2, null),
	(1, 3, null);
*/
public class Copy {
	private int id;
	private int isAvailable;
	private int idBook;
	private int idUser;
	
	public Copy() {
		
	}
	
	public Copy(int id, int isAvailable, int idBook, int idUser) {
		this.id = id;
		this.isAvailable = isAvailable;
		this.idBook = idBook;
		this.idUser = idUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIsAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public int getIdBook() {
		return idBook;
	}
	
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
}

