package hr;

import administration.Department;

public class AdminEmployee extends Employee {

	public AdminEmployee(String name, String surName, String phone, Department department, String employeeID) {
		super(name, surName, phone, department, employeeID);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "[Admin]";
	}

}
