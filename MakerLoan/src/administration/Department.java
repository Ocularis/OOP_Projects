package administration;

import java.util.ArrayList;

public class Department {
	private String name;
	private String code; 
	
	public static ArrayList<Department> departments = new ArrayList<>();
	
	public Department(String name, String code) {
		this.name = name;
		this.code = code; 
		
		departments.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public static ArrayList<Department> getDepartments() {
		return departments;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " (" + code +  ")";
	}
	
}
