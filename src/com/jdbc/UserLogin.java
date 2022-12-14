package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserLogin  {

	public static Scanner scan=new Scanner(System.in);
	public  void checklogin() throws SQLException {
	//public static void userLogin() throws SQLException {
	//public void checklogin() {
		Connection con = null;
		PreparedStatement ps = null;
        String Password="GroupT";
		try {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("User Login");
			System.out.print("Enter Email id>> ");
			String email = scanner.next();
			System.out.print("Enter Pasword>> ");
			String password = scanner.next();
			
			
		
			if (password.equals("GroupT")) {
				System.out.println("sucessfully logged");
				//System.exit(0);
			}else {
				System.out.println("password incorrect");
			}
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			
			ps =  con.prepareStatement("insert into user (Emailid,Password)values(?,?)");
			ps.setString(1, email);
			ps.setString(2,password );

			
			ps.execute();
		
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			/*con.close();
			ps.close();		*/	
		}

	}
}
