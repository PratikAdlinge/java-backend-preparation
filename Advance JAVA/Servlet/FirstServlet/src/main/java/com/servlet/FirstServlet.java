package com.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	ServletConfig config;
	public void init (ServletConfig config) {
		this.config=config;
		System.out.println("Creating Objects.....");
	}
	
	public void service(ServletRequest request ,ServletResponse response) {
		System.out.println("Servicing...");
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Going to Destroy Servlet Object:");
		
	}
	public ServletConfig getServletConfig() {
		return this.config;
	}
	public String getServletInfo() {
		return "this servlet Created by Pratik";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	

	

	
	

}
