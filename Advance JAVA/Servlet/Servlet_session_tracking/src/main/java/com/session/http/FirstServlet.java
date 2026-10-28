package com.session.http;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		String name=request.getParameter("user_name");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1> Name:"+name+"</h1>");
		HttpSession session=request.getSession();
		session.setAttribute("user_name", name);
		out.println("<a href='Secondservlet'> go to Servlet 2</a>");
		
	}

}
