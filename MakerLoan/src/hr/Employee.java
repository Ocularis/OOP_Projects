package hr;

import administration.Department;

public class Employee extends Person {

	private String employeeID;
	
	public Employee(String name, String surName, String phone, Department department, String employeeID) {
		super(name, surName, phone, department);
		this.employeeID = employeeID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	
	
}