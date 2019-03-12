package com.cts.emplmngt.dao;

import com.cts.emplmngt.bean.Employee;

import java.util.List;

public interface CreateEmployeeDAO {
	
public String InsertEmployee(Employee employee);
public String UpdateEmployee(String id , Employee employee);
public String DeleteEmployeebyId(String id);
public Employee GetEmployeebyId(String id);
public List<Employee> getAllEmployee();
public List<Employee> getEmployeeByName(String name);



}
