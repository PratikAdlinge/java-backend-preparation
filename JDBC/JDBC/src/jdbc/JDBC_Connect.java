package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pratik");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table emp(empid int ,empname varchar(30),empsal int )");
			System.out.println("Table Creates Successfully...");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
