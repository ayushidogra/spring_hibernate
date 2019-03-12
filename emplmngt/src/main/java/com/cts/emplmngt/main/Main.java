package com.cts.emplmngt.main;

import java.util.List;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.dao.CreateEmployeeDAO;
import com.cts.emplmngt.dao.CreateEmployeeDAOImpl;
import com.cts.emplmngt.service.CreateEmployeeService;
import com.cts.emplmngt.service.CreateEmployeeServiceImpl;

public class Main {
	public static void main(String args[]){
CreateEmployeeDAO createEmployeeDAO=new CreateEmployeeDAOImpl();
Employee emp=new Employee("1","nimit","gupta",6432.4f);
createEmployeeDAO.InsertEmployee(emp);
Employee emp2=new Employee("1","nim","gupta",6432.4f);
createEmployeeDAO.UpdateEmployee("1", emp2); 
createEmployeeDAO.InsertEmployee(new Employee("2", "aayushi", "dogra",90000.0f));
List<Employee> l=createEmployeeDAO.getAllEmployee();
//System.out.print(l);
//createEmployeeservice.InsertEmployee(em
Employee e=createEmployeeDAO.GetEmployeebyId("1");
System.out.print(e);
}}
