package hr;

import java.util.ArrayList;

import administration.Course;
import administration.Department;

public class Student extends Person {

	private String studentID;
	
	private ArrayList<Course> courses = new ArrayList<>();
	
	public Student(String name, String surName, String phone, Department department, String studentID) {
		super(name, surName, phone, department);
		
		this.studentID = studentID;
		
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public ArrayList<Course> getCourse() {
		return courses;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(S) " + super.toString();
	}

	
}
