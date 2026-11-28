package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Autowired
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	
	

}
