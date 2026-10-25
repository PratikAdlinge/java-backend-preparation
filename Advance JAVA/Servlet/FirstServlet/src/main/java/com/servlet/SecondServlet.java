 package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is my second Sevlet from Generic Servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>this is Second Servlet using Generic Servlet");
		
		
	}
	

	
}

 