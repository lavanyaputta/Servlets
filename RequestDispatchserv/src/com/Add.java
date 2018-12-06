package com.lavanya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Add extends HttpServlet
{
	
	 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		int i= Integer.parseInt(req.getParameter("name1"));
		int j= Integer.parseInt(req.getParameter("name2"));
		int k=i+j;
		
		 
		HttpSession session=req.getSession();
		
		session.setAttribute("k", k);
		
		req.setAttribute("k", k);
		
		res.sendRedirect("SqServlet?k="+k);
		
		//RequestDispatcher rd=req.getRequestDispatcher("SqServlet");
		//rd.forward(req, res);
		
	}
}
