package com.shruthi.assignment.employees;
//creating a class of manager which includes of the attributes which used in employee class(extends)
public class Manager  extends Employee{
	 private String department;
//creating getter and setter for attribute department
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


}