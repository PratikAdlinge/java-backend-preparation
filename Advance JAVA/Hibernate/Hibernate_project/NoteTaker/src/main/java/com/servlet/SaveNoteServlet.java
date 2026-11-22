package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.Factory_Provider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveNoteServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	    try {
	    	String title=request.getParameter("title");
	    	String content=request.getParameter("content");
	    	Note note=new Note( title, content, new Date());
	    	
	    	response.setContentType("text/html");
	    	PrintWriter out=response.getWriter();
	    	out.println(note.getId()+" : "+note.getTitle());
	    	System.out.println(note.getId()+" : "+note.getTitle());
	    	
	    	Session session=Factory_Provider.getFactory().openSession();
	    	Transaction transaction=session.beginTransaction();
	    	
	    	session.persist(note);
	    	transaction.commit();
	    	
	    	session.close();
	    	out.print("<h2>Note is added successfully</h1>");
	    	out.print("<h1 style='text-align:center;'><a href='all_notes.jsp'>View All Notes</a></h1>");
	    	
	    }
	    
	    catch (Exception e) {
			// TODO: handle exception
	    	e.printStackTrace();
	    	
	    	
	    	
		}
	}

}
