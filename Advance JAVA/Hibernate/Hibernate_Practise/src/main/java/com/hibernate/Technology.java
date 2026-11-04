package com.hibernate;

import jakarta.persistence.Embeddable;

//@Embeddable
public class Technology {
	
	private String technology;
	private String experience;
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(String technology, String experience) {
		super();
		this.technology = technology;
		this.experience = experience;
	}
	
	

}
