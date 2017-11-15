package fr.afpa.matschi.book.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.matschi.book.dao.Dao;
import fr.afpa.matschi.book.dao.IDao;
import fr.afpa.matschi.book.model.Album;
import fr.afpa.matschi.book.service.IService;
import fr.afpa.matschi.book.service.Service;

public class App {
	private static final long serialVersionUID = 1L;
	private IService service;
	
	public void init() throws ServletException {
		IDao dao = new Dao();
		service = new Service(dao);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		
		if(path != null) {
			if(path.equals("/list")) doList(req, resp);
			if(path.equals("/add")) doAdd(req, resp);
			//if(path.equals("/addValidate")) doAddValidate(req, resp);
		}
	}
	
	private void doList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ArrayList<Album> albums = service.getAll();

		//req.setAttribute("albums", albums);
		getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	private void doAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/add.jsp").forward(req, resp);
	}
	
	private void doAddValidate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ArrayList<Album> albums = service.getAll();
		getServletContext().getRequestDispatcher("/WEB-INF/views/add.jsp").forward(req, resp);
	}
	
	*/
}
