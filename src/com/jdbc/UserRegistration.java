package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRegistration {

	//public static void main(String[] args) throws SQLException {
		/*UserLogin user=new UserLogin(); 
		user.userLogin();*/
		
		public static void userRegister() throws SQLException {
			UserLogin user=new UserLogin(); 
			user.userLogin();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName>>");
		String name = sc.next();
		System.out.println("Enter lastName");
		String lastname = sc.next();
		System.out.println("Enter address");
		String address=sc.next();
		System.out.println("Enter mailid");
		String mailid= sc.next();
		System.out.println("Enter mobileNumber");
		String mobilenumber= sc.next();
		
		
		try{
			Connectivity connectivity = new Connectivity();
		Connection con = connectivity.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into registrationtab(firstName,lastName,address,mailid, mobileNumber)values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, lastname);
		ps.setString(3, address);
		ps.setString(4, mailid);
		ps.setString(5, mobilenumber);
		
		int register=ps.executeUpdate();
		System.out.println("User registration completed successfully"+register);
		/*AdminLogin login = new AdminLogin();
		login.adminlogin();*/
		con.close();
		ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		ProductDetails pd = new ProductDetails();
		pd.insertProductDetails();
		System.out.println("enter product number");
		int i=sc.nextInt();
		int a=0;
		int j;
		for(a=i;a>0;a--) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter productid>>");
			int productid=sc.nextInt();
			System.out.println("Enter quantity you want");
			int quantity=sc.nextInt();
			j=quantity;
		
			
			try {
			
				Connectivity connectivity = new Connectivity();
					Connection con = connectivity.getConnection();
					if(productid==1) {
					
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='C01'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='C01'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					ps2.setString(1, "C01");
					ps2.setString(2, "Chairs");
					ps2.setInt(3, j);
					ps2.setString(4, "4200");
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if(productid==2) {
					
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='T02'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='T02'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					
					ps2.setString(1, "T02");
					ps2.setString(2, "Table");
					ps2.setInt(3, j);
					ps2.setString(4, "6000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if(productid==3) {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='B03'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='B03'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					ps2.setString(1, "B03");
					ps2.setString(2, "Bed");
					ps2.setInt(3, j);
					ps2.setString(4, "20000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
				}else if (productid==4) {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='CB04'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='CB04'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					ps2.setString(1, "CB04");
					ps2.setString(2, "Cupboard");
					ps2.setInt(3,j);
					ps2.setString(4, "16000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if (productid==5) {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='TP05'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='TP05'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					ps2.setString(1, "TP05");
					ps2.setString(2, "Teapoy");
					ps2.setInt(3, j);
					ps2.setString(4, "3000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if (productid==6) {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='D06'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='D06'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
				
					ps2.setString(1, "D06");
					ps2.setString(2, "Dining Table");
					ps2.setInt(3, j);
					ps2.setString(4, "17000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if(productid==7) {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='DT07'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='DT07'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					ps2.setString(1, "DT07");
					ps2.setString(2, "Dressing Table");
					ps2.setInt(3, j);
					ps2.setString(4, "10000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if(productid==8) {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='S08'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='S08'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					
					ps2.setString(1, "S08");
					ps2.setString(2, "Sofa");
					ps2.setInt(3, j);
					ps2.setString(4, "19000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if(productid==9) {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='DS09'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='DS09'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					
					ps2.setString(1, "DS09");
					ps2.setString(2, "Desk");
					ps2.setInt(3, j);
					ps2.setString(4, "11000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else {
					PreparedStatement ps = con.prepareStatement("select product_price from furniture where product_id='CP10'");
					PreparedStatement ps1 = con.prepareStatement("select product_name from furniture where product_id='CP10'");
					PreparedStatement ps2 = con.prepareStatement("insert into addtocart(productid,productname,quantity,price)"
							+ "values(?,?,?,?)");
					ps2.setString(1, "CP10");
					ps2.setString(2, "Shelf");
					ps2.setInt(3, j);
					ps2.setString(4, "2000");
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
				
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	    }
		
	AdminLogin login = new AdminLogin();
		login.adminlogin();
			
	}

}






