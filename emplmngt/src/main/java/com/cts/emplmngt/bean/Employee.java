package com.cts.emplmngt.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Empl")
@Table(name="empl_table") 

public class Employee {
	@Id
	@Column(name="empid")
private String empid;
	@Column(name="firstName",nullable=false )
private String firstName;
	@Column(name="lastName")    
private String lastName;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", getEmpid()=" + getEmpid() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Column(name="salary",nullable=false)
private float salary;
	private Address address;
	
public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


public Employee() {
	// TODO Auto-generated constructor stub
}


public String getEmpid() {
	return empid;
}
public Employee(String empid, String firstName, String lastName, float salary) {
	super();
	this.empid = empid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}


}
