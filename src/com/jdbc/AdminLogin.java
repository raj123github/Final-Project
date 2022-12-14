package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminLogin {
	//public static void main(String[] args) throws SQLException {
	
	
		public void adminlogin() throws SQLException {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("If you are admin then enter password");
			String password = scanner.next();
			if(password.equals("pass@123")) {
				Connectivity connectivity=new Connectivity();
				Connection con = connectivity.getConnection();
				PreparedStatement ps = con.prepareStatement("select*from registrationtab");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println("firstName="+rs.getString(1));
					System.out.println("lastName="+rs.getString(2));
					System.out.println("address="+rs.getString(3));
					System.out.println("mailid="+rs.getString(4));
					System.out.println("mobileNumber="+rs.getString(5));
					
				}
				System.out.println("Enter product id:");
				String x=scanner.next();
				
				Connection con1 = connectivity.getConnection();
				PreparedStatement ps1 = con.prepareStatement("select product qty from furniture where product id=?;");
				 ps1.setString(1, x);
				 ResultSet rs1 = ps1.executeQuery();
				while(rs1.next()) {
					System.out.println("product quantity= "+rs1.getInt(1));
				}rs1.close();
			}else {
				System.out.println("Invalid password");
			}
			}
			

}
