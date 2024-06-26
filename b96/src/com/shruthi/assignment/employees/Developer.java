package com.shruthi.assignment.employees;

//creating a class of manager which includes of the attributes which used in employee class(extends)
public class Developer extends Employee{
	 private String programmingLanguage;
//creating getter and setter for attribute department
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}


}
