/*
 * ResultSet.TYPE_FORWARD_ONLY
   ResultSet.TYPE_SCROLL_INSENSITIVE
   ResultSet.TYPE_SCROLL_SENSITIVE
 * 
 * 
 */
package com.demo.oracleex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample  {
 

	public static void main(String args[]) throws SQLException {
		//Fetching employees data
		
		Connection con = ConnectionUtil.getConnection();
		String sqlQuery = "SELECT * FROM employees  ";
		Statement st = null;
		ResultSet rs = null;
		
		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//st = con.createStatement();
		
		rs = st.executeQuery(sqlQuery);
		
	  /*
			while(rs.next())
		  System.out.println(rs.getInt(1)+ rs.getString("first_name"));
			*/
	
		
		//System.out.println("Iterating backwards ");
		/*if(rs.previous()){
			System.out.println(rs.getInt(1));
		}*/
		
	    rs.absolute(10000);
	    System.out.println(rs.getInt(1)+ rs.getString("first_name"));
	   
		
	}
	
	
}
