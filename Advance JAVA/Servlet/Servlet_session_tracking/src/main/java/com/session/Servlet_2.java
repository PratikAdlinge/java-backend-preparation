package com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet_2")
public class Servlet_2 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Getting data from Servlet 1
        String name = request.getParameter("user");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet 2</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1 style='color:blue;'>Welcome to Servlet 2</h1>");

        if (name != null && !name.trim().isEmpty()) {
            out.println("<h2 style='color:red;'>Welcome back, "
                    + name + "!</h2>");
        } else {
            out.println("<h2>Please enter your name in Servlet 1.</h2>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}