package com.AutomationFramework.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConnection {

	protected Queries_Class queries_Class;

	public static void oktest(String query) throws ClassNotFoundException, SQLException {
		Connection conn = null;

		// Object of Statement. It is used to create a Statement to execute the
		
		Statement stmt = null;

		// Object of ResultSet => 'It maintains a cursor that points to the
		// current row in the result set'
		ResultSet resultSet = null;
		Class.forName("com.mysql.jdbc.Driver");

		// Open a connection
		conn = DriverManager.getConnection("jdbc:mysql://sql9.freesqldatabase.com:3306/sql9229682", "sql9229682",
				"qIk8FkyLnb");
		//your host:port/database,user,pass

		System.out.println("DB connect");

		// Execute a query
		stmt = conn.createStatement();

		resultSet = stmt.executeQuery(query);
		System.out.println(resultSet = stmt.executeQuery(query));
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3)
					+ "  " + resultSet.getString(4) + "  " + resultSet.getString(5));
		}

		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}
}
