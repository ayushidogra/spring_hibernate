package com.cts.emplmngt.service;

import java.util.List;

import com.cts.emplmngt.bean.Employee;

public interface CreateEmployeeService {
	public String InsertEmployee(Employee employee);
	public String UpdateEmployee(String id , Employee employee);
	public String DeleteEmployeebyId(String id);
	public String GetEmployeebyId(String id);
	public List<Employee> getAllEmployee();
	public List<Employee> getEmployeeByName(String name);

}
