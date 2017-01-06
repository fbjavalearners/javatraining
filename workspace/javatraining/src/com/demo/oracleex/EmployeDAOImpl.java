package com.demo.oracleex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeDAOImpl implements EmployeeDAO{ 

	@Override
	public List<EmployeesTo> getEmployees() throws EmployeesNotFoundException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement  empSt = null;
	    ResultSet rs = null;	
	    List<EmployeesTo> empList = new ArrayList<EmployeesTo>();
		try{
				
			   con=ConnectionUtil.getConnection();
		       String empQuery = "SELECT employee_id,first_name,last_name,email,phone_number "+
		                      " FROM employees ";
		       empSt = con.createStatement();
		       rs = empSt.executeQuery(empQuery);
		       while(rs.next()){
		    	   EmployeesTo emp = new EmployeesTo();
		    	   emp.setEmployeeId(rs.getInt("employee_id"));
		    	   emp.setFirstName(rs.getString("first_name"));
		    	   emp.setLastName(rs.getString("last_name"));
		    	   emp.setEmail(rs.getString("email"));
		    	   emp.setPhoneNumber(rs.getString("phone_number"));
		    	   empList.add(emp);
		    	   
		       }
		       
		
		}catch(SQLException sqe ){
			 sqe.printStackTrace();
			 System.out.println("Exception in getEmpList:: "+sqe.getMessage());
		}finally{
			 if(con !=null ){
				 try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
	
	     return empList;
	
      }

	@Override
	public int addEmployee(EmployeesTo emp) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement  empSt = null;
        int count=0;
	
		try{
				
			   con=ConnectionUtil.getConnection();
		       String empQuery = "insert into employees values ("+emp.getEmployeeId()+",'"+emp.getFirstName()+"','"+emp.getLastName()+"','"+emp.getEmail()+"','"+emp.getPhoneNumber()+"',sysdate,'"+emp.getJobId()+"',"+emp.getSalary()+",null,"+
		    		   " "+emp.getManagerId()+","+emp.getDepartmentId()+")";
		       empSt = con.createStatement();
		       count = empSt.executeUpdate(empQuery);
		      
		       
		
		}catch(SQLException sqe ){
			 sqe.printStackTrace();
			 System.out.println("Exception in getEmpList:: "+sqe.getMessage());
		}finally{
			 if(con !=null ){
				 try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
	
	     return count;
	}
}
