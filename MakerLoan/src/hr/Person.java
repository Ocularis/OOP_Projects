package hr;

import java.util.ArrayList;

import administration.Department;

public abstract class Person {
	private String name;
	private String surName;
	private String phone; 
	private Department department;
	
	private static ArrayList<Person> persons = new ArrayList<>();
	
	public Person(String name, String surName, String phone, Department department) {
		this.name = name;
		this.surName = surName;
		this.phone = phone;
		this.department = department;
		
		persons.add(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getSurName() {
		return this.surName;
	}
	
	public void setDepartment(Department department) {
		this.department = department; 
	}
	
	public Department getDepartment() {
		return this.department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public static ArrayList<Person> getPersons() {
		return persons; 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + surName;
	}
	
	
}
