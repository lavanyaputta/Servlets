package com.javatpoint;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class A implements  Servlet{
	
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println(" i am init metod...........");
		
	}
	
	public void service(ServletRequest arg0, ServletResponse arg1) {
		System.out.println("i am service method..........");
		
	}
 
	public void destroy() {
		
		System.out.println("i am destroy method........");
		
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "version 3.0";
	}



}
