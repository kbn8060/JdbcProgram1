package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared {
	public static void main(String[] args) {
		try {

			// Loading the Driver Class
			Class.forName("com.mysql.jdbc.Driver");

			// Create The Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "badra");

			// Create the Statement
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?)");

			// Execute the Query
			ps.setInt(1, 101);
			ps.setString(2, "badra");
			int i = ps.executeUpdate();
			System.out.println(i + "records inserted");

			// Close the Connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
