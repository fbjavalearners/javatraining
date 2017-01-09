package com.demo.oracleex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataExample {
	
	
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionUtil.getConnection();
	    ResultSet rs = null;
	    Statement st =null;
	    String query = "SELECT * FROM employees ";
	 	
	 	st = con.createStatement();
	 	rs = st.executeQuery(query);
	    
	 	ResultSetMetaData md = rs.getMetaData();
	 	
	 	int colCount = md.getColumnCount();
	 	
	 	for(int i =1;i<=colCount;i++){
	 		
	 		System.out.println(md.getColumnName(i)+" "+md.getColumnTypeName(i)+" "+md.getTableName(i)+" "+md.getSchemaName(i));
	 		
	 		
	 	}
		
		
	}
	
	
	

}
