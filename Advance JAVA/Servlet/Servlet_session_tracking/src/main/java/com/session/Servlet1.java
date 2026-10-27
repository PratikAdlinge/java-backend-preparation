package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h1>Hello, " + name
                + ", welcome to my website!</h1>");
        out.println("<h2><a href='servlet2'>Go to Servlet 2</a></h2>");
        
        //create cookie 
        
        String name1 = request.getParameter("name");

        Cookie c = new Cookie("user_name", name1);
        c.setPath(request.getContextPath());
        c.setMaxAge(3600);

        response.addCookie(c);
        //out.println("Cookie added: " + c.getName());
        
        out.println("</body></html>");
    }
}