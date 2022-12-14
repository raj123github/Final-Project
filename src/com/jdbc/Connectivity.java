package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {

	static Connection con = null;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

}



