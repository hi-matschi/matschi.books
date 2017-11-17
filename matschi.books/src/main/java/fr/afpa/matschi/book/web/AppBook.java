package fr.afpa.matschi.book.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.matschi.book.dao.DaoAuthor;
import fr.afpa.matschi.book.dao.DaoBook;
import fr.afpa.matschi.book.dao.IDaoAuthor;
import fr.afpa.matschi.book.dao.IDaoBook;
import fr.afpa.matschi.book.model.Book;
import fr.afpa.matschi.book.model.Author;
import fr.afpa.matschi.book.service.IServiceAuthor;
import fr.afpa.matschi.book.service.IServiceBook;
import fr.afpa.matschi.book.service.ServiceAuthor;
import fr.afpa.matschi.book.service.ServiceBook;



public class AppBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IServiceBook serviceBook;
	private IServiceAuthor serviceAuthor;
	private String name = "book";
	private int idBook = 0;
	
	public void init() throws ServletException {
		IDaoBook daoBook = new DaoBook();
		serviceBook = new ServiceBook(daoBook);
		
		IDaoAuthor daoAuthor = new DaoAuthor();
		serviceAuthor = new ServiceAuthor(daoAuthor);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		String info = req.getPathInfo();
		
		//System.out.println(path);
		
		if(path != null) {
			if (info != null) {
				idBook = Integer.parseInt(req.getPathInfo().substring(1));
				if(path.equals("/" + name + "/edit")) doEdit(req,resp);
				if(path.equals("/" + name + "/remove")) doRemove(req,resp);
				if(path.equals("/" + name)) doListById(req,resp);
			}
			if(path.equals("/" + name + "/")) doList(req, resp);
			if(path.equals("/" + name + "/list")) doList(req, resp);
			if(path.equals("/" + name + "/add")) doAdd(req, resp);
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("addBook") != null) {
			Book book = new Book(
					req.getParameter("isbn"),
					req.getParameter("title"),
					req.getParameter("subtitle"),
					req.getParameter("img"),
					Integer.parseInt(req.getParameter("author"))
				);
			
			serviceBook.create(book);
			
			resp.sendRedirect("/matschi.books/book/");
		}
		
		if(req.getParameter("editBook") != null) {
			
			Book book = new Book(
					idBook,
					req.getParameter("isbn"),
					req.getParameter("title"),
					req.getParameter("subtitle"),
					req.getParameter("img"),
					Integer.parseInt(req.getParameter("author"))
				);
			
			serviceBook.update(book);
			
			resp.sendRedirect("/matschi.books/book/");
		}
		
	}
	
	private void doList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Book> books = serviceBook.findAll();
		req.setAttribute("books", books);
		ArrayList<Author> authors = serviceAuthor.findAll();
		req.setAttribute("authors", authors);
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/list.jsp").forward(req, resp);
	}
	
	private void doListById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book = serviceBook.findById(idBook);
		req.setAttribute("book", book);
		
		ArrayList<Author> authors = serviceAuthor.findAll();
		req.setAttribute("authors", authors);
		
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/listById.jsp").forward(req, resp);
	}
	
	private void doAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Author> authors = serviceAuthor.findAll();
		req.setAttribute("authors", authors);
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/add.jsp").forward(req, resp);
	}
	
	private void doEdit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book book = serviceBook.findById(idBook);
		req.setAttribute("book", book);
		
		ArrayList<Author> authors = serviceAuthor.findAll();
		req.setAttribute("authors", authors);
		
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/edit.jsp").forward(req, resp);
	}
	
	private void doRemove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		serviceBook.removeById(idBook);
		
		resp.sendRedirect("/matschi.books/book/");
	}
	
}
