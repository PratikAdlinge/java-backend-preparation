package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empId;String empName;double empSal;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pratik");
			Statement stmt=con.createStatement();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Emp Id:");
			empId=sc.nextInt();
			
			System.out.println("Enter Emp Salary");
			empSal=sc.nextDouble();
			
			int count=stmt.executeUpdate("update emp  set empsal="+empSal+ "where empid="+empId);
			
			if(count>0) {
				System.out.println(count+"rows updated");
			}
			else {
				System.out.println("no record inserted");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
