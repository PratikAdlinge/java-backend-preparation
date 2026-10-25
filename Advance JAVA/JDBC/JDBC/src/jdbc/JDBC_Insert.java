package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","pratik");
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			 while(true) {
				 System.out.println("Enter  Emp Id:");
				 int empid=sc.nextInt();
				 System.out.println("Enter Emp Name:");
				 String name=sc.next();
				 System.out.println("Enter the Salary ");
				 double sal=sc.nextDouble();
				 
				 
				 pstmt.setInt(1, empid);
				 pstmt.setString(2, name);
				 pstmt.setDouble(3, sal);
				 int count=pstmt.executeUpdate();
				 
				 if(count>0) {
					 System.out.println("Records Inserted into Table..");
				 }
				 else {
					 System.out.println("No Record Inserted");
				 }
				 
				 System.out.println("Do you want insert record (Yes/No)");
				 String ch=sc.next();
				 if(ch.equalsIgnoreCase("no")){
					 break;
				 }
			 }
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
