package com.many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Employees {
	@Id
	private int emp_Id;
	private String emp_Name;
	@ManyToMany 
	private List<Projects> project;
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public List<Projects> getProject() {
		return project;
	}
	public void setProject(List<Projects> project) {
		this.project = project;
	}
	public Employees(int emp_Id, String emp_Name, List<Projects> project) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.project = project;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
