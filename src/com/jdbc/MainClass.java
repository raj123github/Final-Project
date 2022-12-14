package com.jdbc;

import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		/*UserLogin ul=new UserLogin();
		ul.checklogin();*/
		SwitchClass sw=new SwitchClass();
		sw.SwitchMethod();
		
		DataAsscendingOrder data=new DataAsscendingOrder();
		data.AsscendinOrder();
		
		
	}

}
