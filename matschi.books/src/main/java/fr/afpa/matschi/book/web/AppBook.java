package fr.afpa.matschi.book.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.matschi.book.dao.DaoBook;
import fr.afpa.matschi.book.dao.IDaoBook;
import fr.afpa.matschi.book.model.Book;
import fr.afpa.matschi.book.service.IServiceBook;
import fr.afpa.matschi.book.service.ServiceBook;

public class AppBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IServiceBook service;
	private String name = "book";
	
	public void init() throws ServletException {
		IDaoBook dao = new DaoBook();
		service = new ServiceBook(dao);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		
		if(path != null) {
			if(path.equals("/" + name + "/list")) doList(req, resp);
			if(path.equals("/" + name + "/add")) doAdd(req, resp);
		}
	}
	
	private void doList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Book> books = service.findAll();
		req.setAttribute("books", books);
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/list.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	private void doAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/add.jsp").forward(req, resp);
	}
	
}
