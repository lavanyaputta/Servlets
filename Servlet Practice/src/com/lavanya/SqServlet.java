package com.lavanya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet
{
	
	 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{

		//int k=(int) req.getAttribute("k");
		
		
	//	int k=Integer.parseInt(req.getParameter("k"));
		
		HttpSession session=req.getSession();
		
		int k=(int) session.getAttribute("k");
		
		k=k*k;
		PrintWriter pw=res.getWriter();
		pw.println("Result is"+ k);
	}
}



//in-it--server

//service--doget depost


//destroy--







