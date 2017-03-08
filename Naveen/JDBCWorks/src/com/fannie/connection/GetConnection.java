package com.fannie.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	
	// will have static methods which will return connection object 
	// of underlying DB 
	
	static Connection conn = null;
	public PreparedStatement ps = null;
	public PreparedStatement ps1 = null;
	public ResultSet rs = null;
	
	
	
	public static Connection mysqlCon(){
		
		// this line refers to the class which is in mysql-connector.jar 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sdet3", "root", "mysql");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	// this method will help us to get oracle connection 
	public static Connection oracleCon(){
		

		// this line refers to the class which is in mysql-connector.jar 
		try {
			Class.forName("");
			conn = DriverManager.getConnection("");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}