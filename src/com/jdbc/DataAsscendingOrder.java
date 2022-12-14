package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataAsscendingOrder {
	public static void AsscendinOrder() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");

			//select query PreparedStatement
			PreparedStatement ps=con.prepareStatement("select * from furniture order by product_price");
			ResultSet rs=ps.executeQuery();
			
			 
			while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
				/*System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));*/
		
		}
		}

			catch(Exception e) {
				e.printStackTrace();
			}

	

}




	}


