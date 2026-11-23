package com.springcore;

public class Student {
	
	private int student_Id;
	private String student_Name;
	private String address;
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int student_Id, String student_Name, String address) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", address=" + address + "]";
	}
	
	
}
