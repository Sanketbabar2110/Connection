package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {

		
			// url for MySQL database
		String url = "jdbc:mysql://localhost:3306/students";
			
			//username for mySQL database
		String username = "root";
			
			//password of mySQL database
		String password = "Sanket@2110";

	/**
	 * Five steps to create database connection 
	 * 
	 */

		try {
				//	1. Register the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

				//	2. Create connection object.
			Connection con = DriverManager.getConnection(url, username, password);

			if (con.isClosed())
				System.out.println("connetion failed");
			System.out.println("connected");

				//	3. Create Query
			String Qry = "Select * from student";
			
				//	4. Create statement Object
			Statement stmt = con.createStatement();

				
				//	5. Execute Query
			ResultSet set = stmt.executeQuery(Qry);

			while (set.next()) {
				System.out.println(set.getInt(1) + "\t" + set.getString(2) + "\t" + set.getString(3) + "\t" + set.getInt(4));		
			}

				//	6. close connection
			con.close();
			
		} catch (Exception e) {
			System.out.println("Execution of program id faild");
		}
	}
}
