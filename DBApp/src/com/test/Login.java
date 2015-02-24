package com.test;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
        String name=request.getParameter("name");
        request.setAttribute("uname", name);
        
        String city=request.getParameter("city");
        request.setAttribute("ucity", city);
      int mobile=Integer.parseInt(request.getParameter("mobile"));
      request.setAttribute("mob", mobile);
      ServletContext context =getServletContext();
      String mailid=context.getInitParameter("mail");
      out.print(mailid);
      PrintWriter out1=response.getWriter();
		Enumeration<String> en=context.getInitParameterNames();
		while(en.hasMoreElements()){
			String pname=en.nextElement();
			out1.println(context.getInitParameter(pname));
		}
		
      if(name.equalsIgnoreCase("admin"))
      {
      out.print("<html><body>");
      out.print("welcome"+name+"<br>");
      out.print("city"+city+"<br>");
   
      out.print("</body></html>");
      out.flush();
      
     // response.sendRedirect("success.jsp");
       RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
        rd.include(request, response);
      	//
      }else
      {
    	  response.sendRedirect("success.jsp");
      }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}
