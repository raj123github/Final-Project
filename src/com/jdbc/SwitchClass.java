package com.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class SwitchClass {
public void SwitchMethod() throws SQLException {
	UserRegistration user=new UserRegistration();
Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1 for login");
	System.out.println("Enter 2 for registration");
	
	int number=scan.nextInt();
	
	switch (number) {
	case 1:
		
		UserLogin ul1=new UserLogin();
		ul1.checklogin();
		user.selectProduct();
		break;
	case 2:
		
		user.userRegister();

		break;
	
	default: 
		System.out.println("Invalid selection");
}
}
}