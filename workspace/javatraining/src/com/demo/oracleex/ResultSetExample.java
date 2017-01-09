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

public class ResultSetExample  extends Thread{
 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
		 
			myTest();
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void myTest() throws SQLException {
		Connection con = ConnectionUtil.getConnection();
		String sqlQuery = "SELECT * FROM employees where employee_id=1112 ";
		Statement st = null;
		ResultSet rs = null;
		
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		
		rs = st.executeQuery(sqlQuery);
		
	  
		  try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if(rs.next())
		  System.out.println(rs.getInt(1)+ rs.getString("first_name"));
			
	
		
		//System.out.println("Iterating backwards ");
		/*while(rs.previous()){
			System.out.println(rs.getInt(1));
		}*/
		
	    
	   
		
	}
	public static void main(String[] args) {
		new ResultSetExample().start();
	}
	
	
}
