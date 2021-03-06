package administration;

import java.util.ArrayList;

public class Course {
	
	private String name; 
	private String courseID;
	private Department department; 
	
	private static ArrayList<Course> courses = new ArrayList<>();
	
	public Course(String name, String courseID, Department department) {
		this.name = name; 
		this.courseID = courseID;
		this.department = department; 
		
		courses.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static ArrayList<Course> getCourses() {
		return courses; 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return department.getCode() + ": " + name + " (" + courseID +")"; 
	}
	
}
