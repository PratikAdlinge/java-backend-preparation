package com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet_1
 */
@WebServlet("/Servlet_1")
public class Servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet 1</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Servlet Servlet1 at "+request.getContentType());

		String name=request.getParameter("user_name");
		out.println("<h2> Your Name Is:"+name+"</h1>");
		out.println("<a href='" + request.getContextPath()
        + "/Servlet_2?user=" + name
        + "'>Go to second Servlet</a>");		out.println("</body>");
		out.println("</html>");
		
		
	}

}
