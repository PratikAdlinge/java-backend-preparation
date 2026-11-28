package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String>friends;
	
	private Map<String,String>Fees;
	

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	

	public Map<String, String> getFees() {
		return Fees;
	}

	public void setFees(Map<String, String> fees) {
		Fees = fees;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	

}
