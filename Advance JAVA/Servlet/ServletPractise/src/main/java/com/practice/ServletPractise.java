package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletPractise extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		System.out.println("this is get method");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>this is Get() method of my servlet</h1>");
		out.println(new Date().toString());
	}

}
