package com.springcore.lifecycle;

public class Samosa {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("Setting the price ");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("Init Method Called");
	}
	public void destroy() {
		System.out.println("Destroy Method is Called ");
	}

}
