package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pratik");
			Statement stmt=con.createStatement();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Emp id:");
			int empId=sc.nextInt();
			
			int count=stmt.executeUpdate("delete from emp where empid="+empId);
			if(count>0) {
				System.out.println(count+"record deleted");
			}
			else {
					System.out.println("No record Deleted");
				}
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
