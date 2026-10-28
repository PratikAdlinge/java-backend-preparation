package com.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet 2</title>");
		out.println("</head>");
		out.println("<body>");
		
		//getting 
		
		String name=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		String password=request.getParameter("user_password");
		
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");

		    Connection con = DriverManager.getConnection(
		        "jdbc:mysql://localhost:3306/register",
		        "root",
		        "pratik"
		    );

		    String query =
		        "INSERT INTO register(username, password, email) VALUES (?, ?, ?)";

		    PreparedStatement pstmt = con.prepareStatement(query);

		    pstmt.setString(1, name);
		    pstmt.setString(2, password);
		    pstmt.setString(3, email);

		    int rows = pstmt.executeUpdate();

		    if (rows > 0) {
		        out.println("<h2>Registration successful!</h2>");
		    }

		    pstmt.close();
		    con.close();

		} catch (Exception e) {
		    e.printStackTrace();
		    out.println("<h3>Registration failed. Check Eclipse Console.</h3>");
		}
		out.print(name);
		out.print(password);
		out.print(email);
		
		out.println("</body></html>");}

}
