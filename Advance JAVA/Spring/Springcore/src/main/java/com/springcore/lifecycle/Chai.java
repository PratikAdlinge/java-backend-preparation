package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Chai {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Chai() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chai [price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Started ");
	}
    
	@PreDestroy
	public void end() {
		System.out.println("ending...");
	}
}
