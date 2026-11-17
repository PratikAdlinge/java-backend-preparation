package com.many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	private int project_Id;
	private String project_Name;
	@ManyToMany(mappedBy = "project")
	private List<Employees> emp;
	public int getProject_Id() {
		return project_Id;
	}
	public void setProject_Id(int project_Id) {
		this.project_Id = project_Id;
	}
	public String getProject_Name() {
		return project_Name;
	}
	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}
	public List<Employees> getEmp() {
		return emp;
	}
	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}
	public Projects(int project_Id, String project_Name, List<Employees> emp) {
		super();
		this.project_Id = project_Id;
		this.project_Name = project_Name;
		this.emp = emp;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
