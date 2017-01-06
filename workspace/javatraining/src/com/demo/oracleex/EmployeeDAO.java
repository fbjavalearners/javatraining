package com.demo.oracleex;

import java.util.List;

public interface EmployeeDAO { 

	
	public List<EmployeesTo> getEmployees() throws EmployeesNotFoundException;
	//public EmployeesTo getEmployeesByEmployeeId(int empId) throws EmployeesNotFoundException;

	public int addEmployee(EmployeesTo emp);
	//public void deleteEmployee(int empId);
	//public void updateEmployee(Employee emp);
	
}
