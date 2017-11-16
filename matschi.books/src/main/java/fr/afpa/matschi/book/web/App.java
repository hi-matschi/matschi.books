package fr.afpa.matschi.book.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.matschi.book.dao.Dao;
import fr.afpa.matschi.book.dao.IDao;
import fr.afpa.matschi.book.model.Book;
import fr.afpa.matschi.book.service.IService;
import fr.afpa.matschi.book.service.Service;

public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IService service;
	
	public void init() throws ServletException {
		IDao dao = new Dao();
		service = new Service(dao);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		
		if(path != null) {
			if(path.equals("/list/book")) doListBook(req, resp);
			if(path.equals("/list/user")) doListUser(req, resp);
			if(path.equals("/list/author")) doListAuthor(req, resp);
			if(path.equals("/add/book")) doAddBook(req, resp);
			if(path.equals("/add/author")) doAddAuthor(req, resp);
			if(path.equals("/add/user")) doAddUser(req, resp);
		}
	}
	
	private void doListBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Book> books = service.getAll();
		req.setAttribute("books", books);
		
		getServletContext().getRequestDispatcher("/WEB-INF/views/book/list.jsp").forward(req, resp);
	}
	
	private void doListAuthor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/author/list.jsp").forward(req, resp);
	}
	
	private void doListUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/user/list.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	private void doAddBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/book/add.jsp").forward(req, resp);
	}
	
	private void doAddAuthor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/author/add.jsp").forward(req, resp);
	}
	
	private void doAddUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/user/add.jsp").forward(req, resp);
	}
}
