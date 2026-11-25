package com.springcore.ref;

public class A {
	private int x;
	private B ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getob() {
		return ob;
	}
	public void setob(B ob) {
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
	
}
