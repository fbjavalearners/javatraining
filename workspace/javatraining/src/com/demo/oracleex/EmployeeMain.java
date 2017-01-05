package com.demo.oracleex;

import java.util.List;

public class EmployeeMain { 
   public static void main(String[] args) throws EmployeesNotFoundException{
	   EmployeeDAO empDao = new EmployeDAOImpl();
	   List<EmployeesTo> empList =empDao.getEmployees();
	   
	   for(EmployeesTo emp: empList){
		   
		   System.out.println(emp);
	   }
	   
	   
	   
   }
	
	
	
}
