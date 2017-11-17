package fr.afpa.matschi.book.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.matschi.book.dao.DaoAuthor;
//import fr.afpa.matschi.book.dao.DaoBook;
import fr.afpa.matschi.book.dao.IDaoAuthor;
//import fr.afpa.matschi.book.dao.IDaoBook;
//import fr.afpa.matschi.book.model.Book;
import fr.afpa.matschi.book.model.Author;
// import fr.afpa.matschi.book.model.Book;
import fr.afpa.matschi.book.service.IServiceAuthor;
//import fr.afpa.matschi.book.service.IServiceBook;
import fr.afpa.matschi.book.service.ServiceAuthor;
//import fr.afpa.matschi.book.service.ServiceBook;


public class AppAuthor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// private IServiceBook serviceBook;
	private IServiceAuthor serviceAuthor;
	private String name = "author";
	
	public void init() throws ServletException {
		//IDaoBook daoBook = new DaoBook();
		//serviceBook = new ServiceBook(daoBook);
		
		IDaoAuthor daoAuthor = new DaoAuthor();
		serviceAuthor = new ServiceAuthor(daoAuthor);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		
		//System.out.println(req.getPathInfo());
		
		if(path != null) {
			if(path.equals("/" + name + "/list")) doList(req, resp);
			if(path.equals("/" + name + "/add")) doAdd(req, resp);
			// if(path.equals("/" + name + "/edit")) doEdit(req,resp);
		}
	}
	
	private void doList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Author> authors = serviceAuthor.findAll();
		req.setAttribute("authors", authors);
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/list.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("addAuthor") != null) {

			Author author = new Author(
					req.getParameter("firstname"),
					req.getParameter("lastname")
				);
			
			serviceAuthor.create(author);

			resp.sendRedirect("http://localhost:8080/matschi.books/author/list");
		}
	}
	
	private void doAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/" + name + "/add.jsp").forward(req, resp);
	}
	
}
