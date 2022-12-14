package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDetails {
	PreparedStatement ps=null;
	Connection con = null;
	
	public void insertProductDetails() throws SQLException {
		
		try {
			Connectivity connectivity = new Connectivity();
			con=connectivity.getConnection();
			ps = con.prepareStatement("select*from furniture");
			
		
		ResultSet set = ps.executeQuery();
		while(set.next()) {
			System.out.println("product_id= "+set.getString(1));
			System.out.println("product_name ="+set.getString(2));
			System.out.println("product_description ="+set.getString(3));
			System.out.println("product_qyt ="+set.getString(4));
			System.out.println("product_price ="+set.getInt(5));
			
		}
		set.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ps.close();
			con.close();
			
		}
	}
/*	public static void main(String[] args) throws SQLException {
		ProductDetails pro=new ProductDetails();
		pro.insertProductDetails();
		*/
	}

	



