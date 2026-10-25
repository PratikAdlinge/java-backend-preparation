package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pratik");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp; ");
			
			while(rs.next()) {
				int empid=rs.getInt(1);
				String empName=rs.getString(2);
				double empSal=rs.getDouble(3);
				
				System.out.println("Emp Id:"+empid);
				System.out.println("Emp Name:"+empName);
				System.out.println("Emp Salary:"+empSal);
				System.out.println("\n");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
