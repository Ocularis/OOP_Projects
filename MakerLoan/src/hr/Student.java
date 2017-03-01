package hr;

import administration.Course;
import administration.Department;

public class Student extends Person {

	private String studentID;
	private Course course;
	
	public Student(String name, String surName, String phone, Department department, String studentID, Course course) {
		super(name, surName, phone, department);
		
		this.studentID = studentID;
		this.course = course;
		
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}