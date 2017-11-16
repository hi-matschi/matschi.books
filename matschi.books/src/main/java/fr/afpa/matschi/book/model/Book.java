package fr.afpa.matschi.book.model;

/**
 * 
 * This class is a Java Bean:
 * - Has private attributes
 * - Has a constructor without argument
 * - Getters/setters for all attributes
 *
 */
public class Book {
	private int id;
	private String isbn;
	private String title;
	private String subtitle;
	private String img;
	
	public Book() {
		
	}
	
	public Book(int id, String isbn, String title, String subtitle, String img) {
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.subtitle = subtitle;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
}

