package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet 2</title>");

		out.println("</head>");

		out.println("<body>");
		
		//getting cookies
		
		Cookie[] cookies = request.getCookies();
		String name = null;

		if (cookies != null) {
		    for (Cookie c : cookies) {
		        if ("user_name".equals(c.getName())) {
		            name = c.getValue();
		            break;
		        }
		    }
		}

		out.println("<h1>Hello, " + (name == null ? "New User" : name)
		        + "! Welcome back to my website.</h1>");
		out.println("</body></html>");}
}