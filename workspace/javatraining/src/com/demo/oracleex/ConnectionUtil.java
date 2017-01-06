package com.demo.oracleex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	public static Connection getConnection() throws SQLException{ 
		
		Connection connection = null;
		try {
            Properties prop = PropertyUtil.getProperties();
			connection = DriverManager.getConnection(
					prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			throw e;
		}
		return connection;
		
	}
	
	
	
	
	

}
