package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class moviesearch
 */
public class moviesearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public moviesearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String lang=request.getParameter("movielanguage");
		Mymovies movies=new Mymovies();
		ArrayList<String> list=movies.getAllMovies(lang);
		request.setAttribute("mymovielist", list);
		ServletConfig config=getServletConfig();
		PrintWriter out=response.getWriter();
		Enumeration<String> en=config.getInitParameterNames();
		while(en.hasMoreElements()){
			String pname=en.nextElement();
			out.println(config.getInitParameter(pname));
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("final.jsp");
		rd.include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}
