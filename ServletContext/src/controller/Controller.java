package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

  
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();
		String str=context.getInitParameter("adminname");
		out.println(str);
		
		ServletConfig config = getServletConfig();
		String str2=config.getInitParameter("adminname");
		out.println(str2);
		
		
		/*Integer hits = (Integer)context.getAttribute("hits");
		if (hits == null) {
			hits = 0;
		} else {
			hits++;
		}
		
		context.setAttribute("hits", hits);
		
		PrintWriter out = response.getWriter();
		
		out.println("Hits: " + hits);
		
		String adminName = context.getInitParameter("adminname");
		out.println("<p>" + adminName + "</p>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
