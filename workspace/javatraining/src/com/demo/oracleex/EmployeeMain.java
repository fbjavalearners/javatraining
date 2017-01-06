package com.demo.oracleex;

import java.util.List;

public class EmployeeMain { 
   public static void main(String[] args) throws EmployeesNotFoundException{
	   EmployeeDAO empDao = new EmployeDAOImpl();
	   List<EmployeesTo> empList =empDao.getEmployees();
	   
	   for(EmployeesTo emp: empList){
		   
		   System.out.println(emp);
	   }
	   
	   EmployeesTo emp = new EmployeesTo(400,"Test","Four","abcdef@gmail.com","123456789","19-OCT-1984","IT_PROG",10000.00,0,205,140);
	   
	   empDao.addEmployee(emp);
	   
   }
	
	
	
}
